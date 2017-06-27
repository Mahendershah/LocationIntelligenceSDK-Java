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
import pb.locationintelligence.model.DirectionGeometry;


/**
 * Cost
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-27T20:36:01.060+05:30")
public class Cost   {
  @SerializedName("cost")
  private BigDecimal cost = null;

  @SerializedName("costUnit")
  private String costUnit = null;

  @SerializedName("geometry")
  private DirectionGeometry geometry = null;

  public Cost cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public Cost costUnit(String costUnit) {
    this.costUnit = costUnit;
    return this;
  }

   /**
   * Get costUnit
   * @return costUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCostUnit() {
    return costUnit;
  }

  public void setCostUnit(String costUnit) {
    this.costUnit = costUnit;
  }

  public Cost geometry(DirectionGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public DirectionGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(DirectionGeometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cost cost = (Cost) o;
    return Objects.equals(this.cost, cost.cost) &&
        Objects.equals(this.costUnit, cost.costUnit) &&
        Objects.equals(this.geometry, cost.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, costUnit, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cost {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    costUnit: ").append(toIndentedString(costUnit)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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
