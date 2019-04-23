/**
 * ErrorDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class ErrorDetail  implements java.io.Serializable {
    private String errorCode;

    private String errorDesc;

    public ErrorDetail() {
    }

    public ErrorDetail(
           String errorCode,
           String errorDesc) {
           this.errorCode = errorCode;
           this.errorDesc = errorDesc;
    }


    /**
     * Gets the errorCode value for this ErrorDetail.
     *
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ErrorDetail.
     *
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorDesc value for this ErrorDetail.
     *
     * @return errorDesc
     */
    public String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this ErrorDetail.
     *
     * @param errorDesc
     */
    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ErrorDetail)) return false;
        ErrorDetail other = (ErrorDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.errorCode==null && other.getErrorCode()==null) ||
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorDesc==null && other.getErrorDesc()==null) ||
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "errorDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "errorDesc"));
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
