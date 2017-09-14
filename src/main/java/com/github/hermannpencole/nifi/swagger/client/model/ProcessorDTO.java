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


package com.github.hermannpencole.nifi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlType;
import java.util.*;

/**
 * ProcessorDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T23:49:37.943+02:00")
public class ProcessorDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  /**
   * The state of the processor
   */
  @XmlType(name = "processorState")
  public enum StateEnum {
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    
    @SerializedName("STOPPED")
    STOPPED("STOPPED"),
    
    @SerializedName("DISABLED")
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("style")
  private Map<String, String> style = new HashMap<String, String>();

  @SerializedName("relationships")
  private List<RelationshipDTO> relationships = new ArrayList<RelationshipDTO>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("supportsParallelProcessing")
  private Boolean supportsParallelProcessing = false;

  @SerializedName("supportsEventDriven")
  private Boolean supportsEventDriven = false;

  @SerializedName("supportsBatching")
  private Boolean supportsBatching = false;

  @SerializedName("persistsState")
  private Boolean persistsState = false;

//  @SerializedName("restricted")
//  private Boolean restricted = false;

  @SerializedName("inputRequirement")
  private String inputRequirement = null;

  @SerializedName("config")
  private ProcessorConfigDTO config = null;

  @SerializedName("validationErrors")
  private List<String> validationErrors = new ArrayList<String>();

  public ProcessorDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessorDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(example = "null", value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ProcessorDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ProcessorDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the processor.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the processor.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessorDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the processor.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of the processor.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProcessorDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the processor
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The state of the processor")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ProcessorDTO style(Map<String, String> style) {
    this.style = style;
    return this;
  }

  public ProcessorDTO putStyleItem(String key, String styleItem) {
    this.style.put(key, styleItem);
    return this;
  }

   /**
   * Styles for the processor (background-color => #eee).
   * @return style
  **/
  @ApiModelProperty(example = "null", value = "Styles for the processor (background-color => #eee).")
  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> style) {
    this.style = style;
  }

  public ProcessorDTO relationships(List<RelationshipDTO> relationships) {
    this.relationships = relationships;
    return this;
  }

  public ProcessorDTO addRelationshipsItem(RelationshipDTO relationshipsItem) {
    this.relationships.add(relationshipsItem);
    return this;
  }

   /**
   * The available relationships that the processor currently supports.
   * @return relationships
  **/
  @ApiModelProperty(example = "null", value = "The available relationships that the processor currently supports.")
  public List<RelationshipDTO> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<RelationshipDTO> relationships) {
    this.relationships = relationships;
  }

  public ProcessorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the processor.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the processor.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProcessorDTO supportsParallelProcessing(Boolean supportsParallelProcessing) {
    this.supportsParallelProcessing = supportsParallelProcessing;
    return this;
  }

   /**
   * Whether the processor supports parallel processing.
   * @return supportsParallelProcessing
  **/
  @ApiModelProperty(example = "null", value = "Whether the processor supports parallel processing.")
  public Boolean getSupportsParallelProcessing() {
    return supportsParallelProcessing;
  }

  public void setSupportsParallelProcessing(Boolean supportsParallelProcessing) {
    this.supportsParallelProcessing = supportsParallelProcessing;
  }

  public ProcessorDTO supportsEventDriven(Boolean supportsEventDriven) {
    this.supportsEventDriven = supportsEventDriven;
    return this;
  }

   /**
   * Whether the processor supports event driven scheduling.
   * @return supportsEventDriven
  **/
  @ApiModelProperty(example = "null", value = "Whether the processor supports event driven scheduling.")
  public Boolean getSupportsEventDriven() {
    return supportsEventDriven;
  }

  public void setSupportsEventDriven(Boolean supportsEventDriven) {
    this.supportsEventDriven = supportsEventDriven;
  }

  public ProcessorDTO supportsBatching(Boolean supportsBatching) {
    this.supportsBatching = supportsBatching;
    return this;
  }

   /**
   * Whether the processor supports batching. This makes the run duration settings available.
   * @return supportsBatching
  **/
  @ApiModelProperty(example = "null", value = "Whether the processor supports batching. This makes the run duration settings available.")
  public Boolean getSupportsBatching() {
    return supportsBatching;
  }

  public void setSupportsBatching(Boolean supportsBatching) {
    this.supportsBatching = supportsBatching;
  }

  public ProcessorDTO persistsState(Boolean persistsState) {
    this.persistsState = persistsState;
    return this;
  }

   /**
   * Whether the processor persists state.
   * @return persistsState
  **/
  @ApiModelProperty(example = "null", value = "Whether the processor persists state.")
  public Boolean getPersistsState() {
    return persistsState;
  }

  public void setPersistsState(Boolean persistsState) {
    this.persistsState = persistsState;
  }

//  public ProcessorDTO restricted(Boolean restricted) {
//    this.restricted = restricted;
//    return this;
//  }

   /**
   * Whether the processor requires elevated privileges.
   * @return restricted
  **/
//  @ApiModelProperty(example = "null", value = "Whether the processor requires elevated privileges.")
//  public Boolean getRestricted() {
//    return restricted;
//  }
//
//  public void setRestricted(Boolean restricted) {
//    this.restricted = restricted;
//  }
//
//  public ProcessorDTO inputRequirement(String inputRequirement) {
//    this.inputRequirement = inputRequirement;
//    return this;
//  }

   /**
   * The input requirement for this processor.
   * @return inputRequirement
  **/
  @ApiModelProperty(example = "null", value = "The input requirement for this processor.")
  public String getInputRequirement() {
    return inputRequirement;
  }

  public void setInputRequirement(String inputRequirement) {
    this.inputRequirement = inputRequirement;
  }

  public ProcessorDTO config(ProcessorConfigDTO config) {
    this.config = config;
    return this;
  }

   /**
   * The configuration details for the processor. These details will be included in a response if the verbose flag is included in a request.
   * @return config
  **/
  @ApiModelProperty(example = "null", value = "The configuration details for the processor. These details will be included in a response if the verbose flag is included in a request.")
  public ProcessorConfigDTO getConfig() {
    return config;
  }

  public void setConfig(ProcessorConfigDTO config) {
    this.config = config;
  }

  public ProcessorDTO validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ProcessorDTO addValidationErrorsItem(String validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started.
   * @return validationErrors
  **/
  @ApiModelProperty(example = "null", value = "The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started.")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorDTO processorDTO = (ProcessorDTO) o;
    return Objects.equals(this.id, processorDTO.id) &&
        Objects.equals(this.parentGroupId, processorDTO.parentGroupId) &&
        Objects.equals(this.position, processorDTO.position) &&
        Objects.equals(this.name, processorDTO.name) &&
        Objects.equals(this.type, processorDTO.type) &&
        Objects.equals(this.state, processorDTO.state) &&
        Objects.equals(this.style, processorDTO.style) &&
        Objects.equals(this.relationships, processorDTO.relationships) &&
        Objects.equals(this.description, processorDTO.description) &&
        Objects.equals(this.supportsParallelProcessing, processorDTO.supportsParallelProcessing) &&
        Objects.equals(this.supportsEventDriven, processorDTO.supportsEventDriven) &&
        Objects.equals(this.supportsBatching, processorDTO.supportsBatching) &&
        Objects.equals(this.persistsState, processorDTO.persistsState) &&
//        Objects.equals(this.restricted, processorDTO.restricted) &&
        Objects.equals(this.inputRequirement, processorDTO.inputRequirement) &&
        Objects.equals(this.config, processorDTO.config) &&
        Objects.equals(this.validationErrors, processorDTO.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentGroupId, position, name, type, state, style, relationships, description, supportsParallelProcessing, supportsEventDriven, supportsBatching, persistsState, inputRequirement, config, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supportsParallelProcessing: ").append(toIndentedString(supportsParallelProcessing)).append("\n");
    sb.append("    supportsEventDriven: ").append(toIndentedString(supportsEventDriven)).append("\n");
    sb.append("    supportsBatching: ").append(toIndentedString(supportsBatching)).append("\n");
    sb.append("    persistsState: ").append(toIndentedString(persistsState)).append("\n");
//    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    inputRequirement: ").append(toIndentedString(inputRequirement)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

