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

import java.util.Vector;

public interface Media extends Field {

	public String getMediaType() throws SdpParseException;

	public void setMediaType(String mediaType) throws SdpException;

	public int getMediaPort() throws SdpParseException;

	public void setMediaPort(int port) throws SdpException;

	public int getPortCount() throws SdpParseException;

	public void setPortCount(int portCount) throws SdpException;

	public String getProtocol() throws SdpParseException;

	public void setProtocol(String protocol) throws SdpException;

	public Vector getMediaFormats(boolean create) throws SdpParseException;

	public void setMediaFormats(Vector mediaFormats) throws SdpException;

	public String toString();

}
