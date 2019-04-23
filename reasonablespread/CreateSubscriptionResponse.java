/**
 * CreateSubscriptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CreateSubscriptionResponse  implements java.io.Serializable {
    private boolean createSubscriptionResult;

    public CreateSubscriptionResponse() {
    }

    public CreateSubscriptionResponse(
           boolean createSubscriptionResult) {
           this.createSubscriptionResult = createSubscriptionResult;
    }


    /**
     * Gets the createSubscriptionResult value for this CreateSubscriptionResponse.
     * 
     * @return createSubscriptionResult
     */
    public boolean isCreateSubscriptionResult() {
        return createSubscriptionResult;
    }


    /**
     * Sets the createSubscriptionResult value for this CreateSubscriptionResponse.
     * 
     * @param createSubscriptionResult
     */
    public void setCreateSubscriptionResult(boolean createSubscriptionResult) {
        this.createSubscriptionResult = createSubscriptionResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateSubscriptionResponse)) return false;
        CreateSubscriptionResponse other = (CreateSubscriptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.createSubscriptionResult == other.isCreateSubscriptionResult();
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
        _hashCode += (isCreateSubscriptionResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">createSubscriptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createSubscriptionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "createSubscriptionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
