/**
 * CreateNewAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CreateNewAccountResponse  implements java.io.Serializable {
    private boolean createNewAccountResult;

    public CreateNewAccountResponse() {
    }

    public CreateNewAccountResponse(
           boolean createNewAccountResult) {
           this.createNewAccountResult = createNewAccountResult;
    }


    /**
     * Gets the createNewAccountResult value for this CreateNewAccountResponse.
     * 
     * @return createNewAccountResult
     */
    public boolean isCreateNewAccountResult() {
        return createNewAccountResult;
    }


    /**
     * Sets the createNewAccountResult value for this CreateNewAccountResponse.
     * 
     * @param createNewAccountResult
     */
    public void setCreateNewAccountResult(boolean createNewAccountResult) {
        this.createNewAccountResult = createNewAccountResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateNewAccountResponse)) return false;
        CreateNewAccountResponse other = (CreateNewAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.createNewAccountResult == other.isCreateNewAccountResult();
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
        _hashCode += (isCreateNewAccountResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateNewAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">CreateNewAccountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createNewAccountResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "CreateNewAccountResult"));
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
