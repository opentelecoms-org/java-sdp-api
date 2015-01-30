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

public interface RepeatTime extends Field {

	public int getRepeatInterval() throws SdpParseException;

	public void setRepeatInterval(int repeatInterval) throws SdpException;

	public int getActiveDuration() throws SdpParseException;

	public void setActiveDuration(int activeDuration) throws SdpException;

	public int[] getOffsetArray() throws SdpParseException;

	public void setOffsetArray(int[] offsets) throws SdpException;

	public boolean getTypedTime() throws SdpParseException;

	public void setTypedTime(boolean typedTime);
}
