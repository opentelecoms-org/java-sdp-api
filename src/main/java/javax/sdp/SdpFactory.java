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

import java.net.URL;
import java.util.Date;
import java.util.Vector;

public abstract class SdpFactory {

	public abstract SessionDescription createSessionDescription() throws SdpException;

	public abstract SessionDescription createSessionDescription(String s)
			throws SdpParseException;

	public abstract BandWidth createBandwidth(String modifier, int value);

	public abstract Attribute createAttribute(String name, String value);

	public abstract Info createInfo(String value);

	public abstract Phone createPhone(String value);

	public abstract EMail createEMail(String value);

	public abstract URI createURI(URL value) throws SdpException;

	public abstract SessionName createSessionName(String name);

	public abstract Key createKey(String method, String key);

	public abstract Version createVersion(int value);

	public abstract Media createMedia(String media, int port, int numPorts, String transport,
			Vector staticRtpAvpTypes) throws SdpException;

	public abstract Origin createOrigin(String userName, String address) throws SdpException;

	public abstract Origin createOrigin(String userName, long sessionId, long sessionVersion,
			String networkType, String addrType, String address)
			throws SdpException;

	public abstract MediaDescription createMediaDescription(String media, int port,
			int numPorts, String transport, int[] staticRtpAvpTypes)
			throws IllegalArgumentException, SdpException;

	public abstract MediaDescription createMediaDescription(String media, int port,
			int numPorts, String transport, String[] formats);

	public abstract TimeDescription createTimeDescription(Time t) throws SdpException;

	public abstract TimeDescription createTimeDescription() throws SdpException;

	public abstract TimeDescription createTimeDescription(Date start, Date stop)
			throws SdpException;

	public abstract String formatMulticastAddress(String addr, int ttl, int numAddrs);

	public abstract Connection createConnection(String netType, String addrType, String addr,
			int ttl, int numAddrs) throws SdpException;

	public abstract Connection createConnection(String netType, String addrType, String addr)
			throws SdpException;

	public abstract Connection createConnection(String addr, int ttl, int numAddrs)
			throws SdpException;

	public abstract Connection createConnection(String addr) throws SdpException;

	public abstract Time createTime(Date start, Date stop) throws SdpException;

	public abstract Time createTime() throws SdpException;

	public abstract RepeatTime createRepeatTime(int repeatInterval, int activeDuration,
			int[] offsets);

	public abstract TimeZoneAdjustment createTimeZoneAdjustment(Date d, int offset);

	public static Date getDateFromNtp(long ntpTime) {
		return new Date((ntpTime - SdpConstants.NTP_CONST) * 1000);
	}

	public static long getNtpTime(Date d) throws SdpParseException {
		if (d == null)
			return -1;
		return ((d.getTime() / 1000) + SdpConstants.NTP_CONST);
	}
}
