/**
 * CreateCampaignDraft2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CreateCampaignDraft2Response  implements java.io.Serializable {
    private int createCampaignDraft2Result;

    public CreateCampaignDraft2Response() {
    }

    public CreateCampaignDraft2Response(
           int createCampaignDraft2Result) {
           this.createCampaignDraft2Result = createCampaignDraft2Result;
    }


    /**
     * Gets the createCampaignDraft2Result value for this CreateCampaignDraft2Response.
     * 
     * @return createCampaignDraft2Result
     */
    public int getCreateCampaignDraft2Result() {
        return createCampaignDraft2Result;
    }


    /**
     * Sets the createCampaignDraft2Result value for this CreateCampaignDraft2Response.
     * 
     * @param createCampaignDraft2Result
     */
    public void setCreateCampaignDraft2Result(int createCampaignDraft2Result) {
        this.createCampaignDraft2Result = createCampaignDraft2Result;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateCampaignDraft2Response)) return false;
        CreateCampaignDraft2Response other = (CreateCampaignDraft2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.createCampaignDraft2Result == other.getCreateCampaignDraft2Result();
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
        _hashCode += getCreateCampaignDraft2Result();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCampaignDraft2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">createCampaignDraft2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createCampaignDraft2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "createCampaignDraft2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
