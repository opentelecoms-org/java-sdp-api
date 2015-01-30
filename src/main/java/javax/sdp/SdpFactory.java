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

public interface SdpFactory {

	SessionDescription createSessionDescription() throws SdpException;

	SessionDescription createSessionDescription(String s)
			throws SdpParseException;

	BandWidth createBandwidth(String modifier, int value);

	Attribute createAttribute(String name, String value);

	Info createInfo(String value);

	Phone createPhone(String value);

	EMail createEMail(String value);

	URI createURI(URL value) throws SdpException;

	SessionName createSessionName(String name);

	Key createKey(String method, String key);

	Version createVersion(int value);

	Media createMedia(String media, int port, int numPorts, String transport,
			Vector staticRtpAvpTypes) throws SdpException;

	Origin createOrigin(String userName, String address) throws SdpException;

	Origin createOrigin(String userName, long sessionId, long sessionVersion,
			String networkType, String addrType, String address)
			throws SdpException;

	MediaDescription createMediaDescription(String media, int port,
			int numPorts, String transport, int[] staticRtpAvpTypes)
			throws IllegalArgumentException, SdpException;

	MediaDescription createMediaDescription(String media, int port,
			int numPorts, String transport, String[] formats);

	TimeDescription createTimeDescription(Time t) throws SdpException;

	TimeDescription createTimeDescription() throws SdpException;

	TimeDescription createTimeDescription(Date start, Date stop)
			throws SdpException;

	String formatMulticastAddress(String addr, int ttl, int numAddrs);

	Connection createConnection(String netType, String addrType, String addr,
			int ttl, int numAddrs) throws SdpException;

	Connection createConnection(String netType, String addrType, String addr)
			throws SdpException;

	Connection createConnection(String addr, int ttl, int numAddrs)
			throws SdpException;

	Connection createConnection(String addr) throws SdpException;

	Time createTime(Date start, Date stop) throws SdpException;

	Time createTime() throws SdpException;

	RepeatTime createRepeatTime(int repeatInterval, int activeDuration,
			int[] offsets);

	TimeZoneAdjustment createTimeZoneAdjustment(Date d, int offset);

	Date getDateFromNtp(long ntpTime);

	long getNtpTime(Date d) throws SdpParseException;

}
