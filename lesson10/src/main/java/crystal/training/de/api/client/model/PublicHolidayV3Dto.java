/*
 * Nager.Date API - V3
 * Nager.Date is open source software and is completely free for commercial use. If you would like to support the project you can award a GitHub star ⭐ or even better <a href='https://github.com/sponsors/nager'>actively support us</a>
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package crystal.training.de.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * Public Holiday
 */
@Schema(description = "Public Holiday")
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-09T09:45:58.094Z[GMT]")
public class PublicHolidayV3Dto {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("localName")
  private String localName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("fixed")
  private Boolean fixed = null;

  @SerializedName("global")
  private Boolean global = null;

  @SerializedName("counties")
  private List<String> counties = null;

  @SerializedName("launchYear")
  private Integer launchYear = null;

  @SerializedName("types")
  private List<PublicHolidayType> types = null;

  public PublicHolidayV3Dto date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date
   * @return date
  **/
  @Schema(description = "The date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public PublicHolidayV3Dto localName(String localName) {
    this.localName = localName;
    return this;
  }

   /**
   * Local name
   * @return localName
  **/
  @Schema(description = "Local name")
  public String getLocalName() {
    return localName;
  }

  public void setLocalName(String localName) {
    this.localName = localName;
  }

  public PublicHolidayV3Dto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * English name
   * @return name
  **/
  @Schema(description = "English name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublicHolidayV3Dto countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO 3166-1 alpha-2
   * @return countryCode
  **/
  @Schema(description = "ISO 3166-1 alpha-2")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PublicHolidayV3Dto fixed(Boolean fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Is this public holiday every year on the same date
   * @return fixed
  **/
  @Schema(description = "Is this public holiday every year on the same date")
  public Boolean isFixed() {
    return fixed;
  }

  public void setFixed(Boolean fixed) {
    this.fixed = fixed;
  }

  public PublicHolidayV3Dto global(Boolean global) {
    this.global = global;
    return this;
  }

   /**
   * Is this public holiday in every county (federal state)
   * @return global
  **/
  @Schema(description = "Is this public holiday in every county (federal state)")
  public Boolean isGlobal() {
    return global;
  }

  public void setGlobal(Boolean global) {
    this.global = global;
  }

  public PublicHolidayV3Dto counties(List<String> counties) {
    this.counties = counties;
    return this;
  }

  public PublicHolidayV3Dto addCountiesItem(String countiesItem) {
    if (this.counties == null) {
      this.counties = new ArrayList<String>();
    }
    this.counties.add(countiesItem);
    return this;
  }

   /**
   * ISO-3166-2 - Federal states
   * @return counties
  **/
  @Schema(description = "ISO-3166-2 - Federal states")
  public List<String> getCounties() {
    return counties;
  }

  public void setCounties(List<String> counties) {
    this.counties = counties;
  }

  public PublicHolidayV3Dto launchYear(Integer launchYear) {
    this.launchYear = launchYear;
    return this;
  }

   /**
   * The launch year of the public holiday
   * @return launchYear
  **/
  @Schema(description = "The launch year of the public holiday")
  public Integer getLaunchYear() {
    return launchYear;
  }

  public void setLaunchYear(Integer launchYear) {
    this.launchYear = launchYear;
  }

  public PublicHolidayV3Dto types(List<PublicHolidayType> types) {
    this.types = types;
    return this;
  }

  public PublicHolidayV3Dto addTypesItem(PublicHolidayType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<PublicHolidayType>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * A list of types the public holiday it is valid
   * @return types
  **/
  @Schema(description = "A list of types the public holiday it is valid")
  public List<PublicHolidayType> getTypes() {
    return types;
  }

  public void setTypes(List<PublicHolidayType> types) {
    this.types = types;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicHolidayV3Dto publicHolidayV3Dto = (PublicHolidayV3Dto) o;
    return Objects.equals(this.date, publicHolidayV3Dto.date) &&
        Objects.equals(this.localName, publicHolidayV3Dto.localName) &&
        Objects.equals(this.name, publicHolidayV3Dto.name) &&
        Objects.equals(this.countryCode, publicHolidayV3Dto.countryCode) &&
        Objects.equals(this.fixed, publicHolidayV3Dto.fixed) &&
        Objects.equals(this.global, publicHolidayV3Dto.global) &&
        Objects.equals(this.counties, publicHolidayV3Dto.counties) &&
        Objects.equals(this.launchYear, publicHolidayV3Dto.launchYear) &&
        Objects.equals(this.types, publicHolidayV3Dto.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, localName, name, countryCode, fixed, global, counties, launchYear, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHolidayV3Dto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    counties: ").append(toIndentedString(counties)).append("\n");
    sb.append("    launchYear: ").append(toIndentedString(launchYear)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
