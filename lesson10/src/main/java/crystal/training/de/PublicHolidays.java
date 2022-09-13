package crystal.training.de;

import crystal.training.de.api.client.ApiClient;
import crystal.training.de.api.client.ApiException;
import crystal.training.de.api.client.api.PublicHolidayApi;
import crystal.training.de.api.client.model.PublicHolidayV3Dto;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class PublicHolidays {
    @Builder(toBuilder = true)
    @Data
    static class CountryInfo {
        private String name;
        private String code;
        private int numberOfHolidays;
    }

    public static void main(String[] args) throws IOException, ApiException {
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
        InputStream is = PublicHolidays.class.getResourceAsStream("/cc.csv");


        List<PublicHolidayV3Dto> res;

        List<CountryInfo> countries;

        try (CSVParser csvParser = new CSVParser(new InputStreamReader(is, StandardCharsets.UTF_8), CSVFormat.DEFAULT)) {
            countries = csvParser.stream()
                                    .map(csvRecord -> {
                                        return CountryInfo.builder()
                                                            .name(csvRecord.get(0))
                                                            .code(csvRecord.get(1))
                                                            .build();})
                                    .collect(Collectors.toList());
        }


        System.out.println("Collect all ISO country code: \n");
        countries.forEach(System.out::println);


        System.out.println("For each country we ask for public holidays : \n");
        for (CountryInfo cRecord : countries) {
            res = publicHolidayApi.publicHolidayPublicHolidaysV3(2022, cRecord.code);
            try {
                cRecord.setNumberOfHolidays(res.size());
            } catch (NullPointerException e) {
                cRecord.setNumberOfHolidays(-1);
            }

        }
        countries.removeIf(country -> country.numberOfHolidays == -1);


        countries.forEach(System.out::println);

        System.out.println("\n Number of Countries :" +countries.size());


        //Select country(s) with min num of PH

        OptionalInt min = countries.parallelStream()
                                    .filter(e -> e.numberOfHolidays >= 0)
                                    .mapToInt(c -> c.numberOfHolidays)
                                    .min();
        OptionalInt max = countries.parallelStream()
                                    .filter(e -> e.numberOfHolidays >= 0)
                                    .mapToInt(c -> c.numberOfHolidays)
                                    .max();

        int minH= min.getAsInt();
        int maxH= max.getAsInt();
        System.out.println("Minimum Holidays Countries  : " );
                countries.parallelStream()
                        .filter(c -> c.numberOfHolidays==minH )
                        .collect(Collectors.toList())
                        .forEach((e)->{
                            System.out.println("Name: "+e.name);
                            System.out.println("Code: "+e.code);
                            System.out.println("Number Of Holidays: "+e.numberOfHolidays+"\n");
                        });


//Select country(s) with max num of PH
        System.out.println("Maximum Holidays Countries : ");


                countries.parallelStream()
                        .filter(c -> c.numberOfHolidays==maxH )
                        .collect(Collectors.toList())
                        .forEach((e)->{
                            System.out.println("Name: "+e.name);
                            System.out.println("Code: "+e.code);
                            System.out.println("Number Of Holidays: "+e.numberOfHolidays);
                        });

    }
}
