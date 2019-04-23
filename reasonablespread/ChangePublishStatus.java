/**
 * ChangePublishStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class ChangePublishStatus  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String campaign_id;

    private boolean isPublish;

    public ChangePublishStatus() {
    }

    public ChangePublishStatus(
           String loginEmail,
           String password,
           String campaign_id,
           boolean isPublish) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.campaign_id = campaign_id;
           this.isPublish = isPublish;
    }


    /**
     * Gets the loginEmail value for this ChangePublishStatus.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this ChangePublishStatus.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this ChangePublishStatus.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ChangePublishStatus.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the campaign_id value for this ChangePublishStatus.
     *
     * @return campaign_id
     */
    public String getCampaign_id() {
        return campaign_id;
    }


    /**
     * Sets the campaign_id value for this ChangePublishStatus.
     *
     * @param campaign_id
     */
    public void setCampaign_id(String campaign_id) {
        this.campaign_id = campaign_id;
    }


    /**
     * Gets the isPublish value for this ChangePublishStatus.
     *
     * @return isPublish
     */
    public boolean isIsPublish() {
        return isPublish;
    }


    /**
     * Sets the isPublish value for this ChangePublishStatus.
     *
     * @param isPublish
     */
    public void setIsPublish(boolean isPublish) {
        this.isPublish = isPublish;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangePublishStatus)) return false;
        ChangePublishStatus other = (ChangePublishStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.loginEmail==null && other.getLoginEmail()==null) ||
             (this.loginEmail!=null &&
              this.loginEmail.equals(other.getLoginEmail()))) &&
            ((this.password==null && other.getPassword()==null) ||
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.campaign_id==null && other.getCampaign_id()==null) ||
             (this.campaign_id!=null &&
              this.campaign_id.equals(other.getCampaign_id()))) &&
            this.isPublish == other.isIsPublish();
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
        if (getLoginEmail() != null) {
            _hashCode += getLoginEmail().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCampaign_id() != null) {
            _hashCode += getCampaign_id().hashCode();
        }
        _hashCode += (isIsPublish() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePublishStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">ChangePublishStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "LoginEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "Campaign_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "isPublish"));
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
