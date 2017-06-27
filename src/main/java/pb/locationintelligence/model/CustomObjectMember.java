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
import pb.locationintelligence.model.InputParameter;
import pb.locationintelligence.model.OutputParameter;


/**
 * CustomObjectMember
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-27T20:36:01.060+05:30")
public class CustomObjectMember   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("input")
  private InputParameter input = null;

  @SerializedName("output")
  private OutputParameter output = null;

  public CustomObjectMember name(String name) {
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

  public CustomObjectMember input(InputParameter input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "null", value = "")
  public InputParameter getInput() {
    return input;
  }

  public void setInput(InputParameter input) {
    this.input = input;
  }

  public CustomObjectMember output(OutputParameter output) {
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(example = "null", value = "")
  public OutputParameter getOutput() {
    return output;
  }

  public void setOutput(OutputParameter output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomObjectMember customObjectMember = (CustomObjectMember) o;
    return Objects.equals(this.name, customObjectMember.name) &&
        Objects.equals(this.input, customObjectMember.input) &&
        Objects.equals(this.output, customObjectMember.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, input, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomObjectMember {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

