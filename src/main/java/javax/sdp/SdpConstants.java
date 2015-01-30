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

public interface SdpConstants {

	public static final long NTP_CONST = 2208988800L;

	public static final String RESERVED = "0";

	public static final String UNASSIGNED = "35";

	public static final String DYNAMIC = "-35";

	public static final String RTP_AVP = "RTP/AVP";

	public static final String RTPMAP = "rtpmap";

	public static final String FMTP = "FMTP";

	public static final int PCMU = 0;

	public static final int TENSIXTEEN = 1;

	public static final int G726_32 = 2;

	public static final int GSM = 3;

	public static final int G723 = 4;

	public static final int DVI4_8000 = 5;

	public static final int DVI4_16000 = 6;

	public static final int LPC = 7;

	public static final int PCMA = 8;

	public static final int G722 = 9;

	public static final int L16_2CH = 10;

	public static final int L16_1CH = 11;

	public static final int QCELP = 12;

	public static final int CN = 13;

	public static final int MPA = 14;

	public static final int G728 = 15;

	public static final int DVI4_11025 = 16;

	public static final int DVI4_22050 = 17;

	public static final int G729 = 18;

	public static final int CN_DEPRECATED = 19;

	public static final int CELB = 25;

	public static final int JPEG = 26;

	public static final int NV = 28;

	public static final int H261 = 31;

	public static final int MPV = 32;

	public static final int MP2T = 33;

	public static final int H263 = 34;

	public static final int AVP_DEFINED_STATIC_MAX = 35;

	public static final int AVP_DYNAMIC_MIN = -35;

    public static final String[] avpTypeNames={ "PCMU",
                                                "1016",
                                                "G721",
                                                "GSM",
                                                "G723",
                                                "DVI4_8000",
                                                "DVI4_16000",
                                                "LPC",
                                                "PCMA",
                                                "G722",
                                                "L16_2CH",
                                                "L16_1CH",
                                                "QCELP",
                                                "CN",
                                                "MPA",
                                                "G728",
                                                "DVI4_11025",
                                                "DVI4_22050",
                                                "G729",
                                                "CN_DEPRECATED",
                                                "UNASSIGNED",
                                                "UNASSIGNED",
                                                "UNASSIGNED",
                                                "UNASSIGNED",
                                                "UNASSIGNED",
                                                "CelB",
                                                "JPEG",
                                                "UNASSIGNED",
                                                "nv",
                                                "UNASSIGNED",
                                                "UNASSIGNED",
                                                "H261",
                                                "MPV",
                                                "MP2T",
                                                "H263",
                                                };

    public static final int[] avpClockRates={   8000,
                                                8000,
                                                8000,
                                                8000,
                                                8000,
                                                8000,
                                                16000,
                                                8000,
                                                8000,
                                                8000,
                                                44100,
                                                44100,
                                                -1,
                                                -1,
                                                90000,
                                                8000,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                90000,
                                                90000,
                                                -1,
                                                90000,
                                                -1,
                                                -1,
                                                90000,
                                                90000,
                                                90000,
                                                -1
                                                };

     public static final int[] avpChannels={    1,
                                                1,
                                                1,
                                                1,
                                                1,
                                                1,
                                                1,
                                                1,
                                                1,
                                                1,
                                                2,
                                                1,
                                                -1,
                                                -1,
                                                1,
                                                1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                                -1,
                                               -1,
                                                };
}

