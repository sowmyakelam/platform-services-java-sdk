/*
 * (C) Copyright IBM Corp. 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.iam_identity.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getAccountSettingsAssignment options.
 */
public class GetAccountSettingsAssignmentOptions extends GenericModel {

  protected String assignmentId;
  protected Boolean includeHistory;

  /**
   * Builder.
   */
  public static class Builder {
    private String assignmentId;
    private Boolean includeHistory;

    /**
     * Instantiates a new Builder from an existing GetAccountSettingsAssignmentOptions instance.
     *
     * @param getAccountSettingsAssignmentOptions the instance to initialize the Builder with
     */
    private Builder(GetAccountSettingsAssignmentOptions getAccountSettingsAssignmentOptions) {
      this.assignmentId = getAccountSettingsAssignmentOptions.assignmentId;
      this.includeHistory = getAccountSettingsAssignmentOptions.includeHistory;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assignmentId the assignmentId
     */
    public Builder(String assignmentId) {
      this.assignmentId = assignmentId;
    }

    /**
     * Builds a GetAccountSettingsAssignmentOptions.
     *
     * @return the new GetAccountSettingsAssignmentOptions instance
     */
    public GetAccountSettingsAssignmentOptions build() {
      return new GetAccountSettingsAssignmentOptions(this);
    }

    /**
     * Set the assignmentId.
     *
     * @param assignmentId the assignmentId
     * @return the GetAccountSettingsAssignmentOptions builder
     */
    public Builder assignmentId(String assignmentId) {
      this.assignmentId = assignmentId;
      return this;
    }

    /**
     * Set the includeHistory.
     *
     * @param includeHistory the includeHistory
     * @return the GetAccountSettingsAssignmentOptions builder
     */
    public Builder includeHistory(Boolean includeHistory) {
      this.includeHistory = includeHistory;
      return this;
    }
  }

  protected GetAccountSettingsAssignmentOptions() { }

  protected GetAccountSettingsAssignmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assignmentId,
      "assignmentId cannot be empty");
    assignmentId = builder.assignmentId;
    includeHistory = builder.includeHistory;
  }

  /**
   * New builder.
   *
   * @return a GetAccountSettingsAssignmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assignmentId.
   *
   * ID of the Assignment Record.
   *
   * @return the assignmentId
   */
  public String assignmentId() {
    return assignmentId;
  }

  /**
   * Gets the includeHistory.
   *
   * Defines if the entity history is included in the response.
   *
   * @return the includeHistory
   */
  public Boolean includeHistory() {
    return includeHistory;
  }
}

