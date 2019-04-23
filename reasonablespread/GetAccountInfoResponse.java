/**
 * GetAccountInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetAccountInfoResponse  implements java.io.Serializable {
    private com.reasonablespread.GetAccountInfoResponseGetAccountInfoResult getAccountInfoResult;

    public GetAccountInfoResponse() {
    }

    public GetAccountInfoResponse(
           com.reasonablespread.GetAccountInfoResponseGetAccountInfoResult getAccountInfoResult) {
           this.getAccountInfoResult = getAccountInfoResult;
    }


    /**
     * Gets the getAccountInfoResult value for this GetAccountInfoResponse.
     *
     * @return getAccountInfoResult
     */
    public com.reasonablespread.GetAccountInfoResponseGetAccountInfoResult getGetAccountInfoResult() {
        return getAccountInfoResult;
    }


    /**
     * Sets the getAccountInfoResult value for this GetAccountInfoResponse.
     *
     * @param getAccountInfoResult
     */
    public void setGetAccountInfoResult(com.reasonablespread.GetAccountInfoResponseGetAccountInfoResult getAccountInfoResult) {
        this.getAccountInfoResult = getAccountInfoResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountInfoResponse)) return false;
        GetAccountInfoResponse other = (GetAccountInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getAccountInfoResult==null && other.getGetAccountInfoResult()==null) ||
             (this.getAccountInfoResult!=null &&
              this.getAccountInfoResult.equals(other.getGetAccountInfoResult())));
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
        if (getGetAccountInfoResult() != null) {
            _hashCode += getGetAccountInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">GetAccountInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "GetAccountInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">>GetAccountInfoResponse>GetAccountInfoResult"));
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
