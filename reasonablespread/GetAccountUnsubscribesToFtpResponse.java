/**
 * GetAccountUnsubscribesToFtpResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetAccountUnsubscribesToFtpResponse  implements java.io.Serializable {
    private String getAccountUnsubscribesToFtpResult;

    public GetAccountUnsubscribesToFtpResponse() {
    }

    public GetAccountUnsubscribesToFtpResponse(
           String getAccountUnsubscribesToFtpResult) {
           this.getAccountUnsubscribesToFtpResult = getAccountUnsubscribesToFtpResult;
    }


    /**
     * Gets the getAccountUnsubscribesToFtpResult value for this GetAccountUnsubscribesToFtpResponse.
     *
     * @return getAccountUnsubscribesToFtpResult
     */
    public String getGetAccountUnsubscribesToFtpResult() {
        return getAccountUnsubscribesToFtpResult;
    }


    /**
     * Sets the getAccountUnsubscribesToFtpResult value for this GetAccountUnsubscribesToFtpResponse.
     *
     * @param getAccountUnsubscribesToFtpResult
     */
    public void setGetAccountUnsubscribesToFtpResult(String getAccountUnsubscribesToFtpResult) {
        this.getAccountUnsubscribesToFtpResult = getAccountUnsubscribesToFtpResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountUnsubscribesToFtpResponse)) return false;
        GetAccountUnsubscribesToFtpResponse other = (GetAccountUnsubscribesToFtpResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getAccountUnsubscribesToFtpResult==null && other.getGetAccountUnsubscribesToFtpResult()==null) ||
             (this.getAccountUnsubscribesToFtpResult!=null &&
              this.getAccountUnsubscribesToFtpResult.equals(other.getGetAccountUnsubscribesToFtpResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetAccountUnsubscribesToFtpResult() != null) {
            _hashCode += getGetAccountUnsubscribesToFtpResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountUnsubscribesToFtpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">GetAccountUnsubscribesToFtpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountUnsubscribesToFtpResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "GetAccountUnsubscribesToFtpResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
