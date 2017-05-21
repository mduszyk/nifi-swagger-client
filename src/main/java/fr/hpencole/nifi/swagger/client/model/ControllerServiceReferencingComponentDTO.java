/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.hpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import fr.hpencole.nifi.swagger.client.model.PropertyDescriptorDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ControllerServiceReferencingComponentDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-21T18:12:37.188+02:00")
public class ControllerServiceReferencingComponentDTO {
  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("properties")
  private Map<String, String> properties = new HashMap<String, String>();

  @SerializedName("descriptors")
  private Map<String, PropertyDescriptorDTO> descriptors = new HashMap<String, PropertyDescriptorDTO>();

  @SerializedName("validationErrors")
  private List<String> validationErrors = new ArrayList<String>();

  /**
   * The type of reference this is.
   */
  public enum ReferenceTypeEnum {
    @SerializedName("Processor")
    PROCESSOR("Processor"),
    
    @SerializedName("ControllerService")
    CONTROLLERSERVICE("ControllerService"),
    
    @SerializedName("or ReportingTask")
    OR_REPORTINGTASK("or ReportingTask");

    private String value;

    ReferenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("referenceType")
  private ReferenceTypeEnum referenceType = null;

  @SerializedName("activeThreadCount")
  private Integer activeThreadCount = null;

  @SerializedName("referenceCycle")
  private Boolean referenceCycle = false;

  @SerializedName("referencingComponents")
  private Set referencingComponents = null;

  public ControllerServiceReferencingComponentDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id for the component referencing a controller service. If this component is another controller service or a reporting task, this field is blank.
   * @return groupId
  **/
  @ApiModelProperty(example = "null", value = "The group id for the component referencing a controller service. If this component is another controller service or a reporting task, this field is blank.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ControllerServiceReferencingComponentDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component referencing a controller service.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component referencing a controller service.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ControllerServiceReferencingComponentDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the component referencing a controller service.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the component referencing a controller service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ControllerServiceReferencingComponentDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the component referencing a controller service.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of the component referencing a controller service.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ControllerServiceReferencingComponentDTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of a processor or reporting task referencing a controller service. If this component is another controller service, this field is blank.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The state of a processor or reporting task referencing a controller service. If this component is another controller service, this field is blank.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ControllerServiceReferencingComponentDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public ControllerServiceReferencingComponentDTO putPropertiesItem(String key, String propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties for the component.
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The properties for the component.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public ControllerServiceReferencingComponentDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
    return this;
  }

  public ControllerServiceReferencingComponentDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * The descriptors for the component properties.
   * @return descriptors
  **/
  @ApiModelProperty(example = "null", value = "The descriptors for the component properties.")
  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }

  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }

  public ControllerServiceReferencingComponentDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ControllerServiceReferencingComponentDTO addValidationErrorsItem(String validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors for the component.
   * @return validationErrors
  **/
  @ApiModelProperty(example = "null", value = "The validation errors for the component.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public ControllerServiceReferencingComponentDTO referenceType(ReferenceTypeEnum referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * The type of reference this is.
   * @return referenceType
  **/
  @ApiModelProperty(example = "null", value = "The type of reference this is.")
  public ReferenceTypeEnum getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(ReferenceTypeEnum referenceType) {
    this.referenceType = referenceType;
  }

  public ControllerServiceReferencingComponentDTO activeThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the referencing component.
   * @return activeThreadCount
  **/
  @ApiModelProperty(example = "null", value = "The number of active threads for the referencing component.")
  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }

  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }

  public ControllerServiceReferencingComponentDTO referenceCycle(Boolean referenceCycle) {
    this.referenceCycle = referenceCycle;
    return this;
  }

   /**
   * If the referencing component represents a controller service, this indicates whether it has already been represented in this hierarchy.
   * @return referenceCycle
  **/
  @ApiModelProperty(example = "null", value = "If the referencing component represents a controller service, this indicates whether it has already been represented in this hierarchy.")
  public Boolean getReferenceCycle() {
    return referenceCycle;
  }

  public void setReferenceCycle(Boolean referenceCycle) {
    this.referenceCycle = referenceCycle;
  }

  public ControllerServiceReferencingComponentDTO referencingComponents(Set referencingComponents) {
    this.referencingComponents = referencingComponents;
    return this;
  }

   /**
   * If the referencing component represents a controller service, these are the components that reference it.
   * @return referencingComponents
  **/
  @ApiModelProperty(example = "null", value = "If the referencing component represents a controller service, these are the components that reference it.")
  public Set getReferencingComponents() {
    return referencingComponents;
  }

  public void setReferencingComponents(Set referencingComponents) {
    this.referencingComponents = referencingComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceReferencingComponentDTO controllerServiceReferencingComponentDTO = (ControllerServiceReferencingComponentDTO) o;
    return Objects.equals(this.groupId, controllerServiceReferencingComponentDTO.groupId) &&
        Objects.equals(this.id, controllerServiceReferencingComponentDTO.id) &&
        Objects.equals(this.name, controllerServiceReferencingComponentDTO.name) &&
        Objects.equals(this.type, controllerServiceReferencingComponentDTO.type) &&
        Objects.equals(this.state, controllerServiceReferencingComponentDTO.state) &&
        Objects.equals(this.properties, controllerServiceReferencingComponentDTO.properties) &&
        Objects.equals(this.descriptors, controllerServiceReferencingComponentDTO.descriptors) &&
        Objects.equals(this.validationErrors, controllerServiceReferencingComponentDTO.validationErrors) &&
        Objects.equals(this.referenceType, controllerServiceReferencingComponentDTO.referenceType) &&
        Objects.equals(this.activeThreadCount, controllerServiceReferencingComponentDTO.activeThreadCount) &&
        Objects.equals(this.referenceCycle, controllerServiceReferencingComponentDTO.referenceCycle) &&
        Objects.equals(this.referencingComponents, controllerServiceReferencingComponentDTO.referencingComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, id, name, type, state, properties, descriptors, validationErrors, referenceType, activeThreadCount, referenceCycle, referencingComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceReferencingComponentDTO {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    referenceCycle: ").append(toIndentedString(referenceCycle)).append("\n");
    sb.append("    referencingComponents: ").append(toIndentedString(referencingComponents)).append("\n");
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
