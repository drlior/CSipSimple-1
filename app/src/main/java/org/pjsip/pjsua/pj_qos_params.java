/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pj_qos_params {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected pj_qos_params(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(pj_qos_params obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                pjsuaJNI.delete_pj_qos_params(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public void setFlags(short value) {
        pjsuaJNI.pj_qos_params_flags_set(swigCPtr, this, value);
    }

    public short getFlags() {
        return pjsuaJNI.pj_qos_params_flags_get(swigCPtr, this);
    }

    public void setDscp_val(short value) {
        pjsuaJNI.pj_qos_params_dscp_val_set(swigCPtr, this, value);
    }

    public short getDscp_val() {
        return pjsuaJNI.pj_qos_params_dscp_val_get(swigCPtr, this);
    }

    public void setSo_prio(short value) {
        pjsuaJNI.pj_qos_params_so_prio_set(swigCPtr, this, value);
    }

    public short getSo_prio() {
        return pjsuaJNI.pj_qos_params_so_prio_get(swigCPtr, this);
    }

    public void setWmm_prio(SWIGTYPE_p_pj_qos_wmm_prio value) {
        pjsuaJNI.pj_qos_params_wmm_prio_set(swigCPtr, this, SWIGTYPE_p_pj_qos_wmm_prio.getCPtr(value));
    }

    public SWIGTYPE_p_pj_qos_wmm_prio getWmm_prio() {
        return new SWIGTYPE_p_pj_qos_wmm_prio(pjsuaJNI.pj_qos_params_wmm_prio_get(swigCPtr, this), true);
    }

    public pj_qos_params() {
        this(pjsuaJNI.new_pj_qos_params(), true);
    }

}
