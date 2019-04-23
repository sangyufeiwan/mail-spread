/**
 * AddSubscribersByInfo2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class AddSubscribersByInfo2Response  implements java.io.Serializable {
    private com.reasonablespread.ResponseResult addSubscribersByInfo2Result;

    public AddSubscribersByInfo2Response() {
    }

    public AddSubscribersByInfo2Response(
           com.reasonablespread.ResponseResult addSubscribersByInfo2Result) {
           this.addSubscribersByInfo2Result = addSubscribersByInfo2Result;
    }


    /**
     * Gets the addSubscribersByInfo2Result value for this AddSubscribersByInfo2Response.
     *
     * @return addSubscribersByInfo2Result
     */
    public com.reasonablespread.ResponseResult getAddSubscribersByInfo2Result() {
        return addSubscribersByInfo2Result;
    }


    /**
     * Sets the addSubscribersByInfo2Result value for this AddSubscribersByInfo2Response.
     *
     * @param addSubscribersByInfo2Result
     */
    public void setAddSubscribersByInfo2Result(com.reasonablespread.ResponseResult addSubscribersByInfo2Result) {
        this.addSubscribersByInfo2Result = addSubscribersByInfo2Result;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddSubscribersByInfo2Response)) return false;
        AddSubscribersByInfo2Response other = (AddSubscribersByInfo2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.addSubscribersByInfo2Result==null && other.getAddSubscribersByInfo2Result()==null) ||
             (this.addSubscribersByInfo2Result!=null &&
              this.addSubscribersByInfo2Result.equals(other.getAddSubscribersByInfo2Result())));
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
        if (getAddSubscribersByInfo2Result() != null) {
            _hashCode += getAddSubscribersByInfo2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddSubscribersByInfo2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">addSubscribersByInfo2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addSubscribersByInfo2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "addSubscribersByInfo2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "ResponseResult"));
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
