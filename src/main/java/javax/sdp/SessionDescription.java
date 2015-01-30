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

public interface SessionDescription extends Serializable, Cloneable {

	public Object clone() throws CloneNotSupportedException;

	public Version getVersion();

	public void setVersion(Version v) throws SdpException;

	public Origin getOrigin();

	public void setOrigin(Origin origin) throws SdpException;

	public SessionName getSessionName();

	public void setSessionName(SessionName sessionName) throws SdpException;

	public Info getInfo();

	public void setInfo(Info i) throws SdpException;

	public URI getURI();

	public void setURI(URI uri) throws SdpException;

	public Vector getEmails(boolean create) throws SdpParseException;

	public void setEmails(Vector emails) throws SdpException;

	public Vector getPhones(boolean create) throws SdpException;

	public void setPhones(Vector phones) throws SdpException;

	public Vector getTimeDescriptions(boolean create) throws SdpException;

	public void setTimeDescriptions(Vector times) throws SdpException;

	public Vector getZoneAdjustments(boolean create) throws SdpException;

	public void setZoneAdjustments(Vector zoneAdjustments) throws SdpException;

	public Connection getConnection();

	public void setConnection(Connection conn) throws SdpException;

	public Vector getBandwidths(boolean create);

	public void setBandwidths(Vector bandwidths) throws SdpException;

	public int getBandwidth(String name) throws SdpParseException;

	public void setBandwidth(String name, int value) throws SdpException;

	public void removeBandwidth(String name);

	public Key getKey();

	public void setKey(Key key) throws SdpException;

	public String getAttribute(String name) throws SdpParseException;

	public Vector getAttributes(boolean create);

	public void removeAttribute(String name);

	public void setAttribute(String name, String value) throws SdpException;

	public void setAttributes(Vector Attributes) throws SdpException;

	public Vector getMediaDescriptions(boolean create) throws SdpException;

	public void setMediaDescriptions(Vector mediaDescriptions)
			throws SdpException;
}
