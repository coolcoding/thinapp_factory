/* ***********************************************************************
 * VMware ThinApp Factory
 * Copyright (c) 2009-2013 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ***********************************************************************/

package com.vmware.thinapp.common.workpool.dto;

/**
 * A workpool whose instances are full OS installations.
 */
public class FullWorkpool extends Workpool {
   private VmPattern vmPattern;

   public VmPattern getVmPattern() {
      return vmPattern;
   }

   public void setVmPattern(VmPattern vmPattern) {
      this.vmPattern = vmPattern;
   }

   @Override
   public OsType getOsType() {
      return (vmPattern == null)? null : vmPattern.getOsType();
   }
}