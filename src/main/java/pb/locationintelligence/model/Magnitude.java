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


/**
 * Magnitude
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-27T20:36:01.060+05:30")
public class Magnitude   {
  @SerializedName("value")
  private Double value = null;

  @SerializedName("scale")
  private String scale = null;

  @SerializedName("bodyWave")
  private Double bodyWave = null;

  @SerializedName("surfaceWave")
  private Double surfaceWave = null;

  public Magnitude value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Magnitude scale(String scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
  }

  public Magnitude bodyWave(Double bodyWave) {
    this.bodyWave = bodyWave;
    return this;
  }

   /**
   * Get bodyWave
   * @return bodyWave
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getBodyWave() {
    return bodyWave;
  }

  public void setBodyWave(Double bodyWave) {
    this.bodyWave = bodyWave;
  }

  public Magnitude surfaceWave(Double surfaceWave) {
    this.surfaceWave = surfaceWave;
    return this;
  }

   /**
   * Get surfaceWave
   * @return surfaceWave
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSurfaceWave() {
    return surfaceWave;
  }

  public void setSurfaceWave(Double surfaceWave) {
    this.surfaceWave = surfaceWave;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Magnitude magnitude = (Magnitude) o;
    return Objects.equals(this.value, magnitude.value) &&
        Objects.equals(this.scale, magnitude.scale) &&
        Objects.equals(this.bodyWave, magnitude.bodyWave) &&
        Objects.equals(this.surfaceWave, magnitude.surfaceWave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, scale, bodyWave, surfaceWave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Magnitude {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    bodyWave: ").append(toIndentedString(bodyWave)).append("\n");
    sb.append("    surfaceWave: ").append(toIndentedString(surfaceWave)).append("\n");
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
