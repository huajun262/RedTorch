/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcFutureLimitPosiParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcFutureLimitPosiParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFutureLimitPosiParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcFutureLimitPosiParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorRange(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_InvestorID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_ProductID_get(swigCPtr, this);
  }

  public void setSpecOpenVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_SpecOpenVolume_set(swigCPtr, this, value);
  }

  public int getSpecOpenVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_SpecOpenVolume_get(swigCPtr, this);
  }

  public void setArbiOpenVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_ArbiOpenVolume_set(swigCPtr, this, value);
  }

  public int getArbiOpenVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_ArbiOpenVolume_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureLimitPosiParamField_OpenVolume_get(swigCPtr, this);
  }

  public CThostFtdcFutureLimitPosiParamField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcFutureLimitPosiParamField(), true);
  }

}
