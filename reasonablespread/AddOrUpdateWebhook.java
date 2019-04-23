/**
 * AddOrUpdateWebhook.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class AddOrUpdateWebhook  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String url;

    private com.reasonablespread.EventType eventtype;

    private boolean enable;

    public AddOrUpdateWebhook() {
    }

    public AddOrUpdateWebhook(
           String loginEmail,
           String password,
           String url,
           com.reasonablespread.EventType eventtype,
           boolean enable) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.url = url;
           this.eventtype = eventtype;
           this.enable = enable;
    }


    /**
     * Gets the loginEmail value for this AddOrUpdateWebhook.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this AddOrUpdateWebhook.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this AddOrUpdateWebhook.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AddOrUpdateWebhook.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the url value for this AddOrUpdateWebhook.
     *
     * @return url
     */
    public String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this AddOrUpdateWebhook.
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * Gets the eventtype value for this AddOrUpdateWebhook.
     *
     * @return eventtype
     */
    public com.reasonablespread.EventType getEventtype() {
        return eventtype;
    }


    /**
     * Sets the eventtype value for this AddOrUpdateWebhook.
     *
     * @param eventtype
     */
    public void setEventtype(com.reasonablespread.EventType eventtype) {
        this.eventtype = eventtype;
    }


    /**
     * Gets the enable value for this AddOrUpdateWebhook.
     *
     * @return enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this AddOrUpdateWebhook.
     *
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddOrUpdateWebhook)) return false;
        AddOrUpdateWebhook other = (AddOrUpdateWebhook) obj;
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
            ((this.url==null && other.getUrl()==null) ||
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.eventtype==null && other.getEventtype()==null) ||
             (this.eventtype!=null &&
              this.eventtype.equals(other.getEventtype()))) &&
            this.enable == other.isEnable();
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getEventtype() != null) {
            _hashCode += getEventtype().hashCode();
        }
        _hashCode += (isEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddOrUpdateWebhook.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">AddOrUpdateWebhook"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "eventtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "EventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "enable"));
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
