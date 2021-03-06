/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An item in a group configuration. A group configuration can have one or more items.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupConfigurationItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupConfigurationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     * </p>
     * <p>
     * You can specify the following string values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code>
     * </p>
     * <p>
     * For more information about EC2 capacity reservation groups, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     * >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource groups of
     * any type.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * A collection of parameters for this group configuration item.
     * </p>
     */
    private java.util.List<GroupConfigurationParameter> parameters;

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     * </p>
     * <p>
     * You can specify the following string values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code>
     * </p>
     * <p>
     * For more information about EC2 capacity reservation groups, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     * >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource groups of
     * any type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>
     *        .</p>
     *        <p>
     *        You can specify the following string values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::EC2::CapacityReservationPool</code>
     *        </p>
     *        <p>
     *        For more information about EC2 capacity reservation groups, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     *        >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource
     *        groups of any type.
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     * </p>
     * <p>
     * You can specify the following string values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code>
     * </p>
     * <p>
     * For more information about EC2 capacity reservation groups, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     * >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource groups of
     * any type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>
     *         .</p>
     *         <p>
     *         You can specify the following string values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS::EC2::CapacityReservationPool</code>
     *         </p>
     *         <p>
     *         For more information about EC2 capacity reservation groups, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     *         >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource
     *         groups of any type.
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>.
     * </p>
     * <p>
     * You can specify the following string values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::EC2::CapacityReservationPool</code>
     * </p>
     * <p>
     * For more information about EC2 capacity reservation groups, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     * >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource groups of
     * any type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies the type of group configuration item. Each item must have a unique value for <code>type</code>
     *        .</p>
     *        <p>
     *        You can specify the following string values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::EC2::CapacityReservationPool</code>
     *        </p>
     *        <p>
     *        For more information about EC2 capacity reservation groups, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/capacity-reservations-using.html#create-cr-group"
     *        >Working with capacity reservation groups</a> in the <i>EC2 Users Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ResourceGroups::Generic</code> - Supports parameters that configure the behavior of resource
     *        groups of any type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfigurationItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item.
     * </p>
     * 
     * @return A collection of parameters for this group configuration item.
     */

    public java.util.List<GroupConfigurationParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item.
     * </p>
     * 
     * @param parameters
     *        A collection of parameters for this group configuration item.
     */

    public void setParameters(java.util.Collection<GroupConfigurationParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<GroupConfigurationParameter>(parameters);
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A collection of parameters for this group configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfigurationItem withParameters(GroupConfigurationParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<GroupConfigurationParameter>(parameters.length));
        }
        for (GroupConfigurationParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of parameters for this group configuration item.
     * </p>
     * 
     * @param parameters
     *        A collection of parameters for this group configuration item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfigurationItem withParameters(java.util.Collection<GroupConfigurationParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupConfigurationItem == false)
            return false;
        GroupConfigurationItem other = (GroupConfigurationItem) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public GroupConfigurationItem clone() {
        try {
            return (GroupConfigurationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupConfigurationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
