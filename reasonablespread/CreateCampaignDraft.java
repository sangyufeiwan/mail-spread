/**
 * CreateCampaignDraft.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CreateCampaignDraft  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private com.reasonablespread.Campaign campaignArgs;

    private String[] category;

    private int interval;

    public CreateCampaignDraft() {
    }

    public CreateCampaignDraft(
           String loginEmail,
           String password,
           com.reasonablespread.Campaign campaignArgs,
           String[] category,
           int interval) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.campaignArgs = campaignArgs;
           this.category = category;
           this.interval = interval;
    }


    /**
     * Gets the loginEmail value for this CreateCampaignDraft.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this CreateCampaignDraft.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this CreateCampaignDraft.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CreateCampaignDraft.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the campaignArgs value for this CreateCampaignDraft.
     *
     * @return campaignArgs
     */
    public com.reasonablespread.Campaign getCampaignArgs() {
        return campaignArgs;
    }


    /**
     * Sets the campaignArgs value for this CreateCampaignDraft.
     *
     * @param campaignArgs
     */
    public void setCampaignArgs(com.reasonablespread.Campaign campaignArgs) {
        this.campaignArgs = campaignArgs;
    }


    /**
     * Gets the category value for this CreateCampaignDraft.
     *
     * @return category
     */
    public String[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CreateCampaignDraft.
     *
     * @param category
     */
    public void setCategory(String[] category) {
        this.category = category;
    }


    /**
     * Gets the interval value for this CreateCampaignDraft.
     *
     * @return interval
     */
    public int getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this CreateCampaignDraft.
     *
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateCampaignDraft)) return false;
        CreateCampaignDraft other = (CreateCampaignDraft) obj;
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
            ((this.campaignArgs==null && other.getCampaignArgs()==null) ||
             (this.campaignArgs!=null &&
              this.campaignArgs.equals(other.getCampaignArgs()))) &&
            ((this.category==null && other.getCategory()==null) ||
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            this.interval == other.getInterval();
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
        if (getCampaignArgs() != null) {
            _hashCode += getCampaignArgs().hashCode();
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getInterval();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCampaignDraft.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">createCampaignDraft"));
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
        elemField.setFieldName("campaignArgs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "campaignArgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "Campaign"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "interval"));
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
