/**
 * Amberdata Web3API for Gas Predictions
 * This is an OpenAPI document for Amberdata Gas Predictions https://docs.amberdata.io/reference#get-gas-predictions
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ericglau@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo.models;

import com.example.demo.models.GasPredictions;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class Payload  {
  
  private GasPredictions payload;
  
 /**
   * Get payload
   * @return payload
  **/
  @JsonbProperty("payload")
  public GasPredictions getPayload() {
    return payload;
  }

  /**
    * Set payload
  **/
  public void setPayload(GasPredictions payload) {
    this.payload = payload;
  }

  public Payload payload(GasPredictions payload) {
    this.payload = payload;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
