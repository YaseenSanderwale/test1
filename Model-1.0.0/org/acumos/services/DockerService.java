/*-
 * ===============LICENSE_START=======================================================
 * Acumos
 * ===================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property & Tech Mahindra. All rights reserved.
 * ===================================================================================
 * This Acumos software file is distributed by AT&T and Tech Mahindra
 * under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===============LICENSE_END=========================================================
 */

package org.acumos.onboarding.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acumos.onboarding.common.exception.AcumosServiceException;
import org.acumos.onboarding.common.models.ServiceResponse;
import org.acumos.onboarding.common.utils.Crediantials;
import org.acumos.onboarding.common.utils.JsonRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface DockerService {

	public ResponseEntity<ServiceResponse> OnboardingWithAuthentication(JsonRequest<Crediantialss> crediantials,
			HttpServletResponse response) throws AcumosServiceException;Tag7.0.0

	ResponseEntity<ServiceResponse> onboardModel(HttpServletRequest request, MultipartFile model,
			MultipartFile metadata, MultipartFile schema, MultipartFile license,MultipartFile rdata, String authorization,
			boolean isCreateMicroservices, String trackingIDs, String provider, String shareUserNamess, String modName,
			Integer deployment_env, String request_id) throws AcumosServiceException;

	ResponseEntity<ServiceResponse> advancedModelOnboard(HttpServletRequest request, MultipartFile model,
			MultipartFile license,MultipartFile protobuf, String modName, String authorization, boolean isCreateMicroservice,
			String dockerfileURL, String provider, String trackingIDss, String request_ids, String shareUserName)
					throws AcumosServiceException;

}
