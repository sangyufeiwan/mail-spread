/**
 * GetCampaignClicksWithName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetCampaignClicksWithName  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private int campaignID;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public GetCampaignClicksWithName() {
    }

    public GetCampaignClicksWithName(
           String loginEmail,
           String password,
           int campaignID,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.campaignID = campaignID;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the loginEmail value for this GetCampaignClicksWithName.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this GetCampaignClicksWithName.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this GetCampaignClicksWithName.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetCampaignClicksWithName.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the campaignID value for this GetCampaignClicksWithName.
     *
     * @return campaignID
     */
    public int getCampaignID() {
        return campaignID;
    }


    /**
     * Sets the campaignID value for this GetCampaignClicksWithName.
     *
     * @param campaignID
     */
    public void setCampaignID(int campaignID) {
        this.campaignID = campaignID;
    }


    /**
     * Gets the startDate value for this GetCampaignClicksWithName.
     *
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetCampaignClicksWithName.
     *
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this GetCampaignClicksWithName.
     *
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetCampaignClicksWithName.
     *
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCampaignClicksWithName)) return false;
        GetCampaignClicksWithName other = (GetCampaignClicksWithName) obj;
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
            this.campaignID == other.getCampaignID() &&
            ((this.startDate==null && other.getStartDate()==null) ||
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) ||
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        _hashCode += getCampaignID();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCampaignClicksWithName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">GetCampaignClicksWithName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "loginEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "campaignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
