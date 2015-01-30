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

public interface TimeDescription extends Serializable, Cloneable {

	public static final long NTP_CONST = 2208988800L;

	public Time getTime() throws SdpParseException;

	public void setTime(Time t) throws SdpException;

	public Vector getRepeatTimes(boolean create);

	public void setRepeatTimes(Vector repeatTimes) throws SdpException;

}
