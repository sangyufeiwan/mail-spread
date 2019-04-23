/**
 * GetAPIKeyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetAPIKeyResponse  implements java.io.Serializable {
    private String getAPIKeyResult;

    public GetAPIKeyResponse() {
    }

    public GetAPIKeyResponse(
           String getAPIKeyResult) {
           this.getAPIKeyResult = getAPIKeyResult;
    }


    /**
     * Gets the getAPIKeyResult value for this GetAPIKeyResponse.
     *
     * @return getAPIKeyResult
     */
    public String getGetAPIKeyResult() {
        return getAPIKeyResult;
    }


    /**
     * Sets the getAPIKeyResult value for this GetAPIKeyResponse.
     *
     * @param getAPIKeyResult
     */
    public void setGetAPIKeyResult(String getAPIKeyResult) {
        this.getAPIKeyResult = getAPIKeyResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAPIKeyResponse)) return false;
        GetAPIKeyResponse other = (GetAPIKeyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getAPIKeyResult==null && other.getGetAPIKeyResult()==null) ||
             (this.getAPIKeyResult!=null &&
              this.getAPIKeyResult.equals(other.getGetAPIKeyResult())));
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
        if (getGetAPIKeyResult() != null) {
            _hashCode += getGetAPIKeyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAPIKeyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">GetAPIKeyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAPIKeyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "GetAPIKeyResult"));
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
