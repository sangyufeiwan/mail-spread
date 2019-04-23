/**
 * AddSubscribersByInfo2SerializeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class AddSubscribersByInfo2SerializeResponse  implements java.io.Serializable {
    private String addSubscribersByInfo2SerializeResult;

    public AddSubscribersByInfo2SerializeResponse() {
    }

    public AddSubscribersByInfo2SerializeResponse(
           String addSubscribersByInfo2SerializeResult) {
           this.addSubscribersByInfo2SerializeResult = addSubscribersByInfo2SerializeResult;
    }


    /**
     * Gets the addSubscribersByInfo2SerializeResult value for this AddSubscribersByInfo2SerializeResponse.
     *
     * @return addSubscribersByInfo2SerializeResult
     */
    public String getAddSubscribersByInfo2SerializeResult() {
        return addSubscribersByInfo2SerializeResult;
    }


    /**
     * Sets the addSubscribersByInfo2SerializeResult value for this AddSubscribersByInfo2SerializeResponse.
     *
     * @param addSubscribersByInfo2SerializeResult
     */
    public void setAddSubscribersByInfo2SerializeResult(String addSubscribersByInfo2SerializeResult) {
        this.addSubscribersByInfo2SerializeResult = addSubscribersByInfo2SerializeResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddSubscribersByInfo2SerializeResponse)) return false;
        AddSubscribersByInfo2SerializeResponse other = (AddSubscribersByInfo2SerializeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.addSubscribersByInfo2SerializeResult==null && other.getAddSubscribersByInfo2SerializeResult()==null) ||
             (this.addSubscribersByInfo2SerializeResult!=null &&
              this.addSubscribersByInfo2SerializeResult.equals(other.getAddSubscribersByInfo2SerializeResult())));
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
        if (getAddSubscribersByInfo2SerializeResult() != null) {
            _hashCode += getAddSubscribersByInfo2SerializeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddSubscribersByInfo2SerializeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">addSubscribersByInfo2SerializeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addSubscribersByInfo2SerializeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "addSubscribersByInfo2SerializeResult"));
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
