/**
 Copyright 2018 Micro Focus International plc

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.microfocus.performancecenter.plugins.common.pcEntities;

import com.microfocus.performancecenter.plugins.common.rest.PcRestProxy;
import com.thoughtworks.xstream.XStream;

public class ReleaseTimeslot {

	@SuppressWarnings("unused")
	private String xmlns = PcRestProxy.PC_API_XMLNS;

	private boolean ReleaseTimeslot;

	private String PostRunAction;

	public ReleaseTimeslot(boolean releaseTimeslot, String postRunAction) {
		ReleaseTimeslot = releaseTimeslot;
		PostRunAction = postRunAction;
	}

	public String objectToXML() {
		XStream obj = new XStream();
		obj.alias("PostRunActions", com.microfocus.performancecenter.plugins.common.pcEntities.ReleaseTimeslot.class);
		obj.useAttributeFor(com.microfocus.performancecenter.plugins.common.pcEntities.ReleaseTimeslot.class, "xmlns");
		return obj.toXML(this);
	}

	public boolean isReleaseTimeslot() {
		return ReleaseTimeslot;
	}

	public String getPostRunAction() {
		return PostRunAction;
	}

	
}