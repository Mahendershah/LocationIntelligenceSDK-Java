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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import pb.locationintelligence.model.TravelCostMatrixResponseEndPointCrs;


/**
 * TravelCostMatrixResponseEndPoint
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-27T20:36:01.060+05:30")
public class TravelCostMatrixResponseEndPoint   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("coordinates")
  private List<BigDecimal> coordinates = new ArrayList<BigDecimal>();

  @SerializedName("crs")
  private TravelCostMatrixResponseEndPointCrs crs = null;

  public TravelCostMatrixResponseEndPoint type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TravelCostMatrixResponseEndPoint coordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<BigDecimal> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
  }

  public TravelCostMatrixResponseEndPoint crs(TravelCostMatrixResponseEndPointCrs crs) {
    this.crs = crs;
    return this;
  }

   /**
   * Get crs
   * @return crs
  **/
  @ApiModelProperty(example = "null", value = "")
  public TravelCostMatrixResponseEndPointCrs getCrs() {
    return crs;
  }

  public void setCrs(TravelCostMatrixResponseEndPointCrs crs) {
    this.crs = crs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelCostMatrixResponseEndPoint travelCostMatrixResponseEndPoint = (TravelCostMatrixResponseEndPoint) o;
    return Objects.equals(this.type, travelCostMatrixResponseEndPoint.type) &&
        Objects.equals(this.coordinates, travelCostMatrixResponseEndPoint.coordinates) &&
        Objects.equals(this.crs, travelCostMatrixResponseEndPoint.crs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates, crs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelCostMatrixResponseEndPoint {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    crs: ").append(toIndentedString(crs)).append("\n");
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
