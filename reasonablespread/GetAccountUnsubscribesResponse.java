/**
 * GetAccountUnsubscribesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetAccountUnsubscribesResponse  implements java.io.Serializable {
    private com.reasonablespread.GetAccountUnsubscribesResponseGetAccountUnsubscribesResult getAccountUnsubscribesResult;

    public GetAccountUnsubscribesResponse() {
    }

    public GetAccountUnsubscribesResponse(
           com.reasonablespread.GetAccountUnsubscribesResponseGetAccountUnsubscribesResult getAccountUnsubscribesResult) {
           this.getAccountUnsubscribesResult = getAccountUnsubscribesResult;
    }


    /**
     * Gets the getAccountUnsubscribesResult value for this GetAccountUnsubscribesResponse.
     *
     * @return getAccountUnsubscribesResult
     */
    public com.reasonablespread.GetAccountUnsubscribesResponseGetAccountUnsubscribesResult getGetAccountUnsubscribesResult() {
        return getAccountUnsubscribesResult;
    }


    /**
     * Sets the getAccountUnsubscribesResult value for this GetAccountUnsubscribesResponse.
     *
     * @param getAccountUnsubscribesResult
     */
    public void setGetAccountUnsubscribesResult(com.reasonablespread.GetAccountUnsubscribesResponseGetAccountUnsubscribesResult getAccountUnsubscribesResult) {
        this.getAccountUnsubscribesResult = getAccountUnsubscribesResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountUnsubscribesResponse)) return false;
        GetAccountUnsubscribesResponse other = (GetAccountUnsubscribesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getAccountUnsubscribesResult==null && other.getGetAccountUnsubscribesResult()==null) ||
             (this.getAccountUnsubscribesResult!=null &&
              this.getAccountUnsubscribesResult.equals(other.getGetAccountUnsubscribesResult())));
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
        if (getGetAccountUnsubscribesResult() != null) {
            _hashCode += getGetAccountUnsubscribesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountUnsubscribesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">GetAccountUnsubscribesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountUnsubscribesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "GetAccountUnsubscribesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">>GetAccountUnsubscribesResponse>GetAccountUnsubscribesResult"));
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
