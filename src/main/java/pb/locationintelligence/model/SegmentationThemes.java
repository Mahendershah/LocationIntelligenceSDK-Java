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
import pb.locationintelligence.model.LifeStyleTheme;


/**
 * SegmentationThemes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-27T20:36:01.060+05:30")
public class SegmentationThemes   {
  @SerializedName("lifeStyleTheme")
  private LifeStyleTheme lifeStyleTheme = null;

  public SegmentationThemes lifeStyleTheme(LifeStyleTheme lifeStyleTheme) {
    this.lifeStyleTheme = lifeStyleTheme;
    return this;
  }

   /**
   * Get lifeStyleTheme
   * @return lifeStyleTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public LifeStyleTheme getLifeStyleTheme() {
    return lifeStyleTheme;
  }

  public void setLifeStyleTheme(LifeStyleTheme lifeStyleTheme) {
    this.lifeStyleTheme = lifeStyleTheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentationThemes segmentationThemes = (SegmentationThemes) o;
    return Objects.equals(this.lifeStyleTheme, segmentationThemes.lifeStyleTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeStyleTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentationThemes {\n");
    
    sb.append("    lifeStyleTheme: ").append(toIndentedString(lifeStyleTheme)).append("\n");
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

