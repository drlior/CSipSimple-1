/**
 * Copyright (C) 2010-2012 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 *
 *  CSipSimple is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  If you own a pjsip commercial license you can also redistribute it
 *  and/or modify it under the terms of the GNU Lesser General Public License
 *  as an android library.
 *
 *  CSipSimple is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.csipsimple.wizards.impl;


import com.csipsimple.api.SipConfigManager;
import com.csipsimple.utils.PreferencesWrapper;

public class DianaAPT extends SimpleImplementation {

    @Override
    protected String getDomain() {
        return "5.29.69.46";
    }

    @Override
    protected String getDefaultName() {
        return "Diana APT";
    }

    @Override
    public void setDefaultParams(PreferencesWrapper prefs) {
        super.setDefaultParams(prefs);



        // g729 and PCMA as fallback
        prefs.setCodecPriority("PCMU/8000/1", SipConfigManager.CODEC_WB,"210");
        prefs.setCodecPriority("PCMA/8000/1", SipConfigManager.CODEC_WB,"200");
        //prefs.setCodecPriority("G722/16000/1", SipConfigManager.CODEC_WB,"0");
        //prefs.setCodecPriority("G729/8000/1", SipConfigManager.CODEC_WB,"245");
        //prefs.setCodecPriority("iLBC/8000/1", SipConfigManager.CODEC_WB,"0");
        //prefs.setCodecPriority("speex/8000/1", SipConfigManager.CODEC_WB,"0");
        //prefs.setCodecPriority("speex/16000/1", SipConfigManager.CODEC_WB,"0");
        //prefs.setCodecPriority("speex/32000/1", SipConfigManager.CODEC_WB,"0");
        prefs.setCodecPriority("GSM/8000/1", SipConfigManager.CODEC_WB, "190");
        //prefs.setCodecPriority("SILK/8000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("SILK/12000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("SILK/16000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("SILK/24000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("G726-16/8000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("G726-24/8000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("G726-32/8000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("G726-40/8000/1", SipConfigManager.CODEC_WB, "0");
        //prefs.setCodecPriority("opus/48000/1", SipConfigManager.CODEC_WB, "0");


        // access
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_WIFI_IN, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_WIFI_OUT, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_3G_IN, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_3G_OUT, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_GPRS_IN, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_GPRS_OUT, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_EDGE_IN, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.USE_EDGE_OUT, true);
        prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_TCP, true);
        //prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_TLS, true);
        //prefs.setPreferenceStringValue(SipConfigManager.TCP_TRANSPORT_PORT, "5060");




        prefs.setPreferenceBooleanValue(SipConfigManager.INTEGRATE_WITH_CALLLOGS, false);
        prefs.setPreferenceBooleanValue(SipConfigManager.INTEGRATE_WITH_DIALER, false);
        prefs.setPreferenceBooleanValue(SipConfigManager.INTEGRATE_TEL_PRIVILEGED, false);
    }


    @Override
    public boolean needRestart() {
        return true;
    }



}
