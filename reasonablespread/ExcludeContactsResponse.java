/**
 * ExcludeContactsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class ExcludeContactsResponse  implements java.io.Serializable {
    private String excludeContactsResult;

    public ExcludeContactsResponse() {
    }

    public ExcludeContactsResponse(
           String excludeContactsResult) {
           this.excludeContactsResult = excludeContactsResult;
    }


    /**
     * Gets the excludeContactsResult value for this ExcludeContactsResponse.
     *
     * @return excludeContactsResult
     */
    public String getExcludeContactsResult() {
        return excludeContactsResult;
    }


    /**
     * Sets the excludeContactsResult value for this ExcludeContactsResponse.
     *
     * @param excludeContactsResult
     */
    public void setExcludeContactsResult(String excludeContactsResult) {
        this.excludeContactsResult = excludeContactsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExcludeContactsResponse)) return false;
        ExcludeContactsResponse other = (ExcludeContactsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.excludeContactsResult==null && other.getExcludeContactsResult()==null) ||
             (this.excludeContactsResult!=null &&
              this.excludeContactsResult.equals(other.getExcludeContactsResult())));
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
        if (getExcludeContactsResult() != null) {
            _hashCode += getExcludeContactsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcludeContactsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">ExcludeContactsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeContactsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "ExcludeContactsResult"));
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
