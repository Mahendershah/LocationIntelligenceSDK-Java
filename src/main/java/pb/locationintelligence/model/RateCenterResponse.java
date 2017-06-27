/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import pb.locationintelligence.model.Address;
import pb.locationintelligence.model.AreaCodeInfo;
import pb.locationintelligence.model.County;
import pb.locationintelligence.model.Geometry;
import pb.locationintelligence.model.Match;


/**
 * RateCenterResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-27T20:36:01.060+05:30")
public class RateCenterResponse   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("alternateName")
  private String alternateName = null;

  @SerializedName("areaName1")
  private String areaName1 = null;

  @SerializedName("geometry")
  private Geometry geometry = null;

  @SerializedName("areaCodeInfoList")
  private List<AreaCodeInfo> areaCodeInfoList = new ArrayList<AreaCodeInfo>();

  @SerializedName("matchedAddress")
  private Address matchedAddress = null;

  @SerializedName("match")
  private Match match = null;

  @SerializedName("county")
  private County county = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("product_code")
  private String productCode = null;

  public RateCenterResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RateCenterResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RateCenterResponse alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * Get alternateName
   * @return alternateName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public RateCenterResponse areaName1(String areaName1) {
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName1() {
    return areaName1;
  }

  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }

  public RateCenterResponse geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public RateCenterResponse areaCodeInfoList(List<AreaCodeInfo> areaCodeInfoList) {
    this.areaCodeInfoList = areaCodeInfoList;
    return this;
  }

   /**
   * Get areaCodeInfoList
   * @return areaCodeInfoList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AreaCodeInfo> getAreaCodeInfoList() {
    return areaCodeInfoList;
  }

  public void setAreaCodeInfoList(List<AreaCodeInfo> areaCodeInfoList) {
    this.areaCodeInfoList = areaCodeInfoList;
  }

  public RateCenterResponse matchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
  }

  public RateCenterResponse match(Match match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @ApiModelProperty(example = "null", value = "")
  public Match getMatch() {
    return match;
  }

  public void setMatch(Match match) {
    this.match = match;
  }

  public RateCenterResponse county(County county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @ApiModelProperty(example = "null", value = "")
  public County getCounty() {
    return county;
  }

  public void setCounty(County county) {
    this.county = county;
  }

  public RateCenterResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RateCenterResponse productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCenterResponse rateCenterResponse = (RateCenterResponse) o;
    return Objects.equals(this.id, rateCenterResponse.id) &&
        Objects.equals(this.name, rateCenterResponse.name) &&
        Objects.equals(this.alternateName, rateCenterResponse.alternateName) &&
        Objects.equals(this.areaName1, rateCenterResponse.areaName1) &&
        Objects.equals(this.geometry, rateCenterResponse.geometry) &&
        Objects.equals(this.areaCodeInfoList, rateCenterResponse.areaCodeInfoList) &&
        Objects.equals(this.matchedAddress, rateCenterResponse.matchedAddress) &&
        Objects.equals(this.match, rateCenterResponse.match) &&
        Objects.equals(this.county, rateCenterResponse.county) &&
        Objects.equals(this.count, rateCenterResponse.count) &&
        Objects.equals(this.productCode, rateCenterResponse.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alternateName, areaName1, geometry, areaCodeInfoList, matchedAddress, match, county, count, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCenterResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    areaCodeInfoList: ").append(toIndentedString(areaCodeInfoList)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

