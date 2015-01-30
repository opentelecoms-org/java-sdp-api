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

import java.io.Serializable;
import java.util.Vector;

public interface MediaDescription extends Serializable, Cloneable {

	public Media getMedia();

	public void setMedia(Media media) throws SdpException;

	public Info getInfo();

	public void setInfo(Info i) throws SdpException;

	public Connection getConnection();

	public void setConnection(Connection conn) throws SdpException;

	public Vector getBandwidths(boolean create);

	public void setBandwidths(Vector bandwidths) throws SdpException;

	public int getBandwidth(String name) throws SdpParseException;

	public void setBandwidth(String name, int value) throws SdpException;

	public void removeBandwidth(String name);

	public Key getKey();

	public void setKey(Key key) throws SdpException;

	public Vector getAttributes(boolean create);

	public void setAttributes(Vector Attributes) throws SdpException;

	public String getAttribute(String name) throws SdpParseException;

	public void setAttribute(String name, String value) throws SdpException;

	public void removeAttribute(String name);

	public Vector getMimeTypes() throws SdpException;

	public Vector getMimeParameters() throws SdpException;

	public void addDynamicPayloads(Vector payloadNames, Vector payloadValues)
			throws SdpException;

}
