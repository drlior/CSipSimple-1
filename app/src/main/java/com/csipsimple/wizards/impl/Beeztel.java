/**
 * Copyright (C) 2010-2012 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 * <p>
 * CSipSimple is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * If you own a pjsip commercial license you can also redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public License
 * as an android library.
 * <p>
 * CSipSimple is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.csipsimple.wizards.impl;

import android.text.InputType;

import com.csipsimple.api.SipConfigManager;
import com.csipsimple.api.SipProfile;
import com.csipsimple.utils.PreferencesWrapper;

public class Beeztel extends SimpleImplementation {

    @Override
    protected String getDomain() {
        return "m.beeztel.com";
    }

    @Override
    public void fillLayout(final SipProfile account) {
        super.fillLayout(account);
        accountUsername.getEditText().setInputType(InputType.TYPE_CLASS_PHONE);
        accountUsername.setTitle("Beenumber");
    }


    @Override
    protected String getDefaultName() {
        return "Beeztel";
    }


    public SipProfile buildAccount(SipProfile account) {
        account = super.buildAccount(account);
        return account;
    }

    @Override
    public void setDefaultParams(PreferencesWrapper prefs) {
        super.setDefaultParams(prefs);

        // Add stun server
        prefs.setPreferenceBooleanValue(SipConfigManager.ENABLE_STUN, true);


        // Prefer silk, g729 (not possible due to license, and keep g711 fallback)
        prefs.setCodecPriority("PCMU/8000/1", SipConfigManager.CODEC_WB, "0");
        prefs.setCodecPriority("PCMA/8000/1", SipConfigManager.CODEC_WB, "239");
        prefs.setCodecPriority("G722/16000/1", SipConfigManager.CODEC_WB, "0");
        prefs.setCodecPriority("iLBC/8000/1", SipConfigManager.CODEC_WB, "241");
        prefs.setCodecPriority("speex/8000/1", SipConfigManager.CODEC_WB, "0");
        prefs.setCodecPriority("speex/16000/1", SipConfigManager.CODEC_WB, "0");
        prefs.setCodecPriority("speex/32000/1", SipConfigManager.CODEC_WB, "0");
        prefs.setCodecPriority("GSM/8000/1", SipConfigManager.CODEC_WB, "240");
        prefs.setCodecPriority("SILK/8000/1", SipConfigManager.CODEC_WB, "242");
        prefs.setCodecPriority("SILK/12000/1", SipConfigManager.CODEC_WB, "243");
        prefs.setCodecPriority("SILK/16000/1", SipConfigManager.CODEC_WB, "244");
        prefs.setCodecPriority("SILK/24000/1", SipConfigManager.CODEC_WB, "245");

        //Prefer silk, g729 (not possible due to license, and keep g711 fallback)
        prefs.setCodecPriority("PCMU/8000/1", SipConfigManager.CODEC_NB, "0");
        prefs.setCodecPriority("PCMA/8000/1", SipConfigManager.CODEC_NB, "239");
        prefs.setCodecPriority("G722/16000/1", SipConfigManager.CODEC_NB, "0");
        prefs.setCodecPriority("iLBC/8000/1", SipConfigManager.CODEC_NB, "240");
        prefs.setCodecPriority("speex/8000/1", SipConfigManager.CODEC_NB, "0");
        prefs.setCodecPriority("speex/16000/1", SipConfigManager.CODEC_NB, "0");
        prefs.setCodecPriority("speex/32000/1", SipConfigManager.CODEC_NB, "0");
        prefs.setCodecPriority("GSM/8000/1", SipConfigManager.CODEC_NB, "241");
        prefs.setCodecPriority("SILK/8000/1", SipConfigManager.CODEC_NB, "245");
        prefs.setCodecPriority("SILK/12000/1", SipConfigManager.CODEC_NB, "244");
        prefs.setCodecPriority("SILK/16000/1", SipConfigManager.CODEC_NB, "243");
        prefs.setCodecPriority("SILK/24000/1", SipConfigManager.CODEC_NB, "242");
    }


    @Override
    public boolean needRestart() {
        return true;
    }
}
