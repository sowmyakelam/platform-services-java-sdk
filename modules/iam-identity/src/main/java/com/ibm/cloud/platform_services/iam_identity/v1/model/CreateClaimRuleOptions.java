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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createClaimRule options.
 */
public class CreateClaimRuleOptions extends GenericModel {

  protected String profileId;
  protected String type;
  protected List<ProfileClaimRuleConditions> conditions;
  protected ResponseContext context;
  protected String name;
  protected String realmName;
  protected String crType;
  protected Long expiration;

  /**
   * Builder.
   */
  public static class Builder {
    private String profileId;
    private String type;
    private List<ProfileClaimRuleConditions> conditions;
    private ResponseContext context;
    private String name;
    private String realmName;
    private String crType;
    private Long expiration;

    /**
     * Instantiates a new Builder from an existing CreateClaimRuleOptions instance.
     *
     * @param createClaimRuleOptions the instance to initialize the Builder with
     */
    private Builder(CreateClaimRuleOptions createClaimRuleOptions) {
      this.profileId = createClaimRuleOptions.profileId;
      this.type = createClaimRuleOptions.type;
      this.conditions = createClaimRuleOptions.conditions;
      this.context = createClaimRuleOptions.context;
      this.name = createClaimRuleOptions.name;
      this.realmName = createClaimRuleOptions.realmName;
      this.crType = createClaimRuleOptions.crType;
      this.expiration = createClaimRuleOptions.expiration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param profileId the profileId
     * @param type the type
     * @param conditions the conditions
     */
    public Builder(String profileId, String type, List<ProfileClaimRuleConditions> conditions) {
      this.profileId = profileId;
      this.type = type;
      this.conditions = conditions;
    }

    /**
     * Builds a CreateClaimRuleOptions.
     *
     * @return the new CreateClaimRuleOptions instance
     */
    public CreateClaimRuleOptions build() {
      return new CreateClaimRuleOptions(this);
    }

    /**
     * Adds a new element to conditions.
     *
     * @param conditions the new element to be added
     * @return the CreateClaimRuleOptions builder
     */
    public Builder addConditions(ProfileClaimRuleConditions conditions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(conditions,
        "conditions cannot be null");
      if (this.conditions == null) {
        this.conditions = new ArrayList<ProfileClaimRuleConditions>();
      }
      this.conditions.add(conditions);
      return this;
    }

    /**
     * Set the profileId.
     *
     * @param profileId the profileId
     * @return the CreateClaimRuleOptions builder
     */
    public Builder profileId(String profileId) {
      this.profileId = profileId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateClaimRuleOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the conditions.
     * Existing conditions will be replaced.
     *
     * @param conditions the conditions
     * @return the CreateClaimRuleOptions builder
     */
    public Builder conditions(List<ProfileClaimRuleConditions> conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Set the context.
     *
     * @param context the context
     * @return the CreateClaimRuleOptions builder
     */
    public Builder context(ResponseContext context) {
      this.context = context;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateClaimRuleOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the realmName.
     *
     * @param realmName the realmName
     * @return the CreateClaimRuleOptions builder
     */
    public Builder realmName(String realmName) {
      this.realmName = realmName;
      return this;
    }

    /**
     * Set the crType.
     *
     * @param crType the crType
     * @return the CreateClaimRuleOptions builder
     */
    public Builder crType(String crType) {
      this.crType = crType;
      return this;
    }

    /**
     * Set the expiration.
     *
     * @param expiration the expiration
     * @return the CreateClaimRuleOptions builder
     */
    public Builder expiration(long expiration) {
      this.expiration = expiration;
      return this;
    }
  }

  protected CreateClaimRuleOptions() { }

  protected CreateClaimRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.profileId,
      "profileId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.conditions,
      "conditions cannot be null");
    profileId = builder.profileId;
    type = builder.type;
    conditions = builder.conditions;
    context = builder.context;
    name = builder.name;
    realmName = builder.realmName;
    crType = builder.crType;
    expiration = builder.expiration;
  }

  /**
   * New builder.
   *
   * @return a CreateClaimRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the profileId.
   *
   * ID of the trusted profile to create a claim rule.
   *
   * @return the profileId
   */
  public String profileId() {
    return profileId;
  }

  /**
   * Gets the type.
   *
   * Type of the claim rule, either 'Profile-SAML' or 'Profile-CR'.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the conditions.
   *
   * Conditions of this claim rule.
   *
   * @return the conditions
   */
  public List<ProfileClaimRuleConditions> conditions() {
    return conditions;
  }

  /**
   * Gets the context.
   *
   * Context with key properties for problem determination.
   *
   * @return the context
   */
  public ResponseContext context() {
    return context;
  }

  /**
   * Gets the name.
   *
   * Name of the claim rule to be created or updated.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the realmName.
   *
   * The realm name of the Idp this claim rule applies to. This field is required only if the type is specified as
   * 'Profile-SAML'.
   *
   * @return the realmName
   */
  public String realmName() {
    return realmName;
  }

  /**
   * Gets the crType.
   *
   * The compute resource type the rule applies to, required only if type is specified as 'Profile-CR'. Valid values are
   * VSI, IKS_SA, ROKS_SA.
   *
   * @return the crType
   */
  public String crType() {
    return crType;
  }

  /**
   * Gets the expiration.
   *
   * Session expiration in seconds, only required if type is 'Profile-SAML'.
   *
   * @return the expiration
   */
  public Long expiration() {
    return expiration;
  }
}

