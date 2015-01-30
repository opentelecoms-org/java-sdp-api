/**
 * Copyright (C) 2015, The Open Telecoms Project, http://opentelecoms.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.sdp;

public interface Origin extends Field {

	public String getUsername() throws SdpParseException;

	public void setUsername(String user) throws SdpException;

	public long getSessionId() throws SdpParseException;

	public void setSessionId(long id) throws SdpException;

	public long getSessionVersion() throws SdpParseException;

	public void setSessionVersion(long version) throws SdpException;

	public String getAddress() throws SdpParseException;

	public String getAddressType() throws SdpParseException;

	public String getNetworkType() throws SdpParseException;

	public void setAddress(String addr) throws SdpException;

	public void setAddressType(String type) throws SdpException;

	public void setNetworkType(String type) throws SdpException;
}
