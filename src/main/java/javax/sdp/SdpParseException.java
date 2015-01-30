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

public class SdpParseException extends SdpException {

	private int mLineNumber;
	private int mCharOffset;

	public SdpParseException(int lineNumber, int charOffset, String message,
			Throwable rootCause) {
		super(message, rootCause);
		this.mLineNumber = lineNumber;
		this.mCharOffset = charOffset;
	}

	public SdpParseException(int lineNumber, int charOffset, String message) {
		super(message);
		this.mLineNumber = lineNumber;
		this.mCharOffset = charOffset;
	}

	public int getLineNumber() {
		return mLineNumber;
	}

	public int getCharOffset() {
		return mCharOffset;
	}

	public String getMessage() {
		return super.getMessage();
	}

}
