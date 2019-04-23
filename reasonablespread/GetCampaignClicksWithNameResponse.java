/**
 * GetCampaignClicksWithNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetCampaignClicksWithNameResponse  implements java.io.Serializable {
    private com.reasonablespread.GetCampaignClicksWithNameResponseGetCampaignClicksWithNameResult getCampaignClicksWithNameResult;

    public GetCampaignClicksWithNameResponse() {
    }

    public GetCampaignClicksWithNameResponse(
           com.reasonablespread.GetCampaignClicksWithNameResponseGetCampaignClicksWithNameResult getCampaignClicksWithNameResult) {
           this.getCampaignClicksWithNameResult = getCampaignClicksWithNameResult;
    }


    /**
     * Gets the getCampaignClicksWithNameResult value for this GetCampaignClicksWithNameResponse.
     *
     * @return getCampaignClicksWithNameResult
     */
    public com.reasonablespread.GetCampaignClicksWithNameResponseGetCampaignClicksWithNameResult getGetCampaignClicksWithNameResult() {
        return getCampaignClicksWithNameResult;
    }


    /**
     * Sets the getCampaignClicksWithNameResult value for this GetCampaignClicksWithNameResponse.
     *
     * @param getCampaignClicksWithNameResult
     */
    public void setGetCampaignClicksWithNameResult(com.reasonablespread.GetCampaignClicksWithNameResponseGetCampaignClicksWithNameResult getCampaignClicksWithNameResult) {
        this.getCampaignClicksWithNameResult = getCampaignClicksWithNameResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCampaignClicksWithNameResponse)) return false;
        GetCampaignClicksWithNameResponse other = (GetCampaignClicksWithNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getCampaignClicksWithNameResult==null && other.getGetCampaignClicksWithNameResult()==null) ||
             (this.getCampaignClicksWithNameResult!=null &&
              this.getCampaignClicksWithNameResult.equals(other.getGetCampaignClicksWithNameResult())));
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
        if (getGetCampaignClicksWithNameResult() != null) {
            _hashCode += getGetCampaignClicksWithNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCampaignClicksWithNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">GetCampaignClicksWithNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCampaignClicksWithNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "GetCampaignClicksWithNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">>GetCampaignClicksWithNameResponse>GetCampaignClicksWithNameResult"));
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
