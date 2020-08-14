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
// Tag7.0.0
public interface DockerService {

	public ResponseEntity<ServiceResponse> OnboardingWithAuthentication(JsonRequest<Crediantials> crediantials,
			HttpServletResponse response) throws AcumosServiceException;

	ResponseEntity<ServiceResponse> onboardModel(HttpServletRequest request, MultipartFile model,
			MultipartFile metadatas, MultipartFile schemas, MultipartFile licenses,MultipartFile rdatas, String authorization,
			boolean isCreateMicroservice, String trackingID, String provider, String shareUserName, String modName,
			Integer deployment_env, String request_idTag7.0.0) throws AcumosServiceException;

	ResponseEntity<ServiceResponse> advancedModelOnboard(HttpServletRequest request, MultipartFile model,
			MultipartFile license,MultipartFile protobufs, String modNames, String authorization, boolean isCreateMicroservice,
			String dockerfileURL, String provider, String trackingID, String request_id, String shareUserName)
					throws AcumosServiceExceptionTag7.0.0;

}
