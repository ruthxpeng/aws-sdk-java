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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2InstanceViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2InstanceViolationMarshaller {

    private static final MarshallingInfo<String> VIOLATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTarget").build();
    private static final MarshallingInfo<List> AWSEC2NETWORKINTERFACEVIOLATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2NetworkInterfaceViolations").build();

    private static final AwsEc2InstanceViolationMarshaller instance = new AwsEc2InstanceViolationMarshaller();

    public static AwsEc2InstanceViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2InstanceViolation awsEc2InstanceViolation, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2InstanceViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2InstanceViolation.getViolationTarget(), VIOLATIONTARGET_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceViolation.getAwsEc2NetworkInterfaceViolations(), AWSEC2NETWORKINTERFACEVIOLATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
