/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.6.0
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
import pb.locationintelligence.model.Census;
import pb.locationintelligence.model.IPDTaxJurisdiction;
import pb.locationintelligence.model.Ipd;
import pb.locationintelligence.model.LatLongFields;


/**
 * TaxDistrictResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-13T02:57:26.849+05:30")
public class TaxDistrictResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("jurisdiction")
  private IPDTaxJurisdiction jurisdiction = null;

  @SerializedName("numOfIpdsFound")
  private Integer numOfIpdsFound = null;

  @SerializedName("ipds")
  private List<Ipd> ipds = new ArrayList<Ipd>();

  @SerializedName("matchedAddress")
  private Address matchedAddress = null;

  @SerializedName("census")
  private Census census = null;

  @SerializedName("latLongFields")
  private LatLongFields latLongFields = null;

  public TaxDistrictResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public TaxDistrictResponse confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public TaxDistrictResponse jurisdiction(IPDTaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(example = "null", value = "")
  public IPDTaxJurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(IPDTaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public TaxDistrictResponse numOfIpdsFound(Integer numOfIpdsFound) {
    this.numOfIpdsFound = numOfIpdsFound;
    return this;
  }

   /**
   * Get numOfIpdsFound
   * @return numOfIpdsFound
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNumOfIpdsFound() {
    return numOfIpdsFound;
  }

  public void setNumOfIpdsFound(Integer numOfIpdsFound) {
    this.numOfIpdsFound = numOfIpdsFound;
  }

  public TaxDistrictResponse ipds(List<Ipd> ipds) {
    this.ipds = ipds;
    return this;
  }

   /**
   * Get ipds
   * @return ipds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Ipd> getIpds() {
    return ipds;
  }

  public void setIpds(List<Ipd> ipds) {
    this.ipds = ipds;
  }

  public TaxDistrictResponse matchedAddress(Address matchedAddress) {
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

  public TaxDistrictResponse census(Census census) {
    this.census = census;
    return this;
  }

   /**
   * Get census
   * @return census
  **/
  @ApiModelProperty(example = "null", value = "")
  public Census getCensus() {
    return census;
  }

  public void setCensus(Census census) {
    this.census = census;
  }

  public TaxDistrictResponse latLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
    return this;
  }

   /**
   * Get latLongFields
   * @return latLongFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public LatLongFields getLatLongFields() {
    return latLongFields;
  }

  public void setLatLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDistrictResponse taxDistrictResponse = (TaxDistrictResponse) o;
    return Objects.equals(this.objectId, taxDistrictResponse.objectId) &&
        Objects.equals(this.confidence, taxDistrictResponse.confidence) &&
        Objects.equals(this.jurisdiction, taxDistrictResponse.jurisdiction) &&
        Objects.equals(this.numOfIpdsFound, taxDistrictResponse.numOfIpdsFound) &&
        Objects.equals(this.ipds, taxDistrictResponse.ipds) &&
        Objects.equals(this.matchedAddress, taxDistrictResponse.matchedAddress) &&
        Objects.equals(this.census, taxDistrictResponse.census) &&
        Objects.equals(this.latLongFields, taxDistrictResponse.latLongFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, confidence, jurisdiction, numOfIpdsFound, ipds, matchedAddress, census, latLongFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDistrictResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    numOfIpdsFound: ").append(toIndentedString(numOfIpdsFound)).append("\n");
    sb.append("    ipds: ").append(toIndentedString(ipds)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    census: ").append(toIndentedString(census)).append("\n");
    sb.append("    latLongFields: ").append(toIndentedString(latLongFields)).append("\n");
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

