package crystal.training.de;

import com.opencsv.CSVWriter;
import crystal.training.de.api.client.ApiClient;
import crystal.training.de.api.client.ApiException;
import crystal.training.de.api.client.api.PublicHolidayApi;
import crystal.training.de.api.client.model.PublicHolidayV3Dto;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.charset.StandardCharsets;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class PublicHolidays extends Thread {
    @Builder(toBuilder = true)
    @Data
    static class CountryInfo {
        private String name;
        private String code;
        private int numberOfHolidays;
    }


    public static void main(String[] args) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        // Common pattern in java IS
        // 1 Open resource (FILE, SOCKET, STREAM)
        // Use it
        // CLOSE IT
        // Res r1 = openRes();
        // try {
        //    r1.xx();
        //    ..
        // } finally {
        //   r1.close();
        // }
        // try (Res r1=openRes()) {
        //  ... use r1
        // }
        ApiClient apiClient = new ApiClient();
        PublicHolidayApi publicHolidayApi = new PublicHolidayApi(apiClient);
        apiClient.setBasePath("https://date.nager.at");
        InputStream is = PublicHolidays.class.getResourceAsStream("/cc1.csv");


        List<CountryInfo> countries;

        try (CSVParser csvParser = new CSVParser(new InputStreamReader(is, StandardCharsets.UTF_8), CSVFormat.DEFAULT)) {
            countries = csvParser
                    .stream()
                    .parallel()
                    .map(csvRecord -> {
                        return CountryInfo.builder()
                                .name(csvRecord.get(0))
                                .code(csvRecord.get(1))
                                .build();
                    })
                    .collect(Collectors.toList());
        }


        System.out.println("Collect all ISO country code: \n");
//        printForEach(countries);


        System.out.println("For each country we ask for public holidays : \n");
        countries.stream()
                .parallel()
                .forEach(e->{
                try {
                    List<PublicHolidayV3Dto> res = publicHolidayApi.publicHolidayPublicHolidaysV3(2022, e.code);
                    e.setNumberOfHolidays(res.size());
                } catch (ApiException | NullPointerException ex) {
                    throw new RuntimeException(ex);
                }
        });

//        for (CountryInfo cRecord : countries) {
//
//            res = publicHolidayApi.publicHolidayPublicHolidaysV3(2022, cRecord.code);
//            try {
//                cRecord.setNumberOfHolidays(res.size());
//            } catch (NullPointerException e) {
//                cRecord.setNumberOfHolidays(-1);
//            }
//
//        }
//        countries.removeIf(country -> country.numberOfHolidays == -1);

//        countries.forEach(System.out::println);
//        printForEach(countries);


        System.out.println("\n Number of Countries :" + countries.size());

//        writeCsv(countries);
        //Select country(s) with min num of PH
        System.out.println("Minimum Holidays Countries  : ");

        int minH = countries
                .stream()
                .parallel()
                .filter(e -> e.numberOfHolidays >= 0)
                .mapToInt(c -> c.numberOfHolidays)
                .min().getAsInt();

        countries
                .stream()
                .parallel()
                .filter(c -> c.numberOfHolidays == minH)
                .forEach((e) -> {
                    System.out.print(countries.indexOf(e) + 1);
                    System.out.print(" , Name: " + e.name);
                    System.out.print(", Code: " + e.code);
                    System.out.println(", Number Of Holidays: " + e.numberOfHolidays + "\n");
                });

        int maxH = countries
                .stream()
                .parallel()
                .filter(e -> e.numberOfHolidays >= 0)
                .mapToInt(c -> c.numberOfHolidays)
                .max().getAsInt();


//Select country(s) with max num of PH
        System.out.println("Maximum Holidays Countries : ");


        countries.stream()
                .parallel()
                .filter(c -> c.numberOfHolidays == maxH)
                .forEach((e) -> {
                    System.out.print(countries.indexOf(e) + 1);
                    System.out.print(" , Name: " + e.name);
                    System.out.print(", Code: " + e.code);
                    System.out.println(", Number Of Holidays: " + e.numberOfHolidays + "\n");
                });

//        writeAllLines(countries, "D:/crystal/Data Engeenering/DE_PROJECTS/StefanRuciDE/lesson10/src/main/resources/cc.csv");
        System.out.println("Duration "+(System.currentTimeMillis()-currentTimeMillis));    }

    public static void printForEach(List<CountryInfo> countries) {
        countries.forEach((e) -> {
            System.out.print(countries.indexOf(e) + 1);
            System.out.print(", Name: " + e.name);
            System.out.print(", Code: " + e.code);
            System.out.println(", Number Of Holidays: " + e.numberOfHolidays);
        });
    }

//    public void writeLineByLine(List<String[]> lines, Path path) throws Exception {
//        try (CSVWriter writer = new CSVWriter(new FileWriter(path.toFile()))) {
//            for (String[] line : lines) {
//                writer.writeNext(line);
//            }
//        }
//    }
//
//    public static void writeAllLines(List<CountryInfo> lines, String path) throws Exception {
//        try (CSVWriter writer = new CSVWriter(new FileWriter(String.valueOf(path)))) {
//            for (CountryInfo e : lines) {
//                try {
//                    String[] a={e.name,e.code,String.valueOf(e.numberOfHolidays)};
//                    writer.writeNext(a);
//                }
//                catch (NullPointerException ignored)
//                {
//
//                }
//
//            }
//        }
//    }
//
//    public static void writeCsv(List<CountryInfo> countries, String path) throws IOException {
////        File csvOutputFile = new File(path);
//        FileWriter out = new FileWriter(path);
//        try (CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT)) {
//            countries.forEach(e -> {
//                try {
//                    printer.printRecord(e.name, e.code, e.numberOfHolidays);
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            });
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
