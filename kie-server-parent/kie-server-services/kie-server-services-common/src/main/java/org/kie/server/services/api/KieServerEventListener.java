/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.server.services.api;

public interface KieServerEventListener {

    void beforeServerStarted(KieServer kieServer);

    void afterServerStarted(KieServer kieServer);

    void beforeServerStopped(KieServer kieServer);

    void afterServerStopped(KieServer kieServer);

    void beforeContainerStarted(KieServer kieServer, KieContainerInstance containerInstance);

    void afterContainerStarted(KieServer kieServer, KieContainerInstance containerInstance);

    void beforeContainerStopped(KieServer kieServer, KieContainerInstance containerInstance);

    void afterContainerStopped(KieServer kieServer, KieContainerInstance containerInstance);
    
    void beforeContainerActivated(KieServer kieServer, KieContainerInstance containerInstance);

    void afterContainerActivated(KieServer kieServer, KieContainerInstance containerInstance);
    
    void beforeContainerDeactivated(KieServer kieServer, KieContainerInstance containerInstance);

    void afterContainerDeactivated(KieServer kieServer, KieContainerInstance containerInstance);
}
