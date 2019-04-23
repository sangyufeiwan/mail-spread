/**
 * EmailExists.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class EmailExists  implements java.io.Serializable {
    private String loginEmail;

    private String APIKey;

    private String accountEmail;

    public EmailExists() {
    }

    public EmailExists(
           String loginEmail,
           String APIKey,
           String accountEmail) {
           this.loginEmail = loginEmail;
           this.APIKey = APIKey;
           this.accountEmail = accountEmail;
    }


    /**
     * Gets the loginEmail value for this EmailExists.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this EmailExists.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the APIKey value for this EmailExists.
     *
     * @return APIKey
     */
    public String getAPIKey() {
        return APIKey;
    }


    /**
     * Sets the APIKey value for this EmailExists.
     *
     * @param APIKey
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }


    /**
     * Gets the accountEmail value for this EmailExists.
     *
     * @return accountEmail
     */
    public String getAccountEmail() {
        return accountEmail;
    }


    /**
     * Sets the accountEmail value for this EmailExists.
     *
     * @param accountEmail
     */
    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmailExists)) return false;
        EmailExists other = (EmailExists) obj;
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
            ((this.APIKey==null && other.getAPIKey()==null) ||
             (this.APIKey!=null &&
              this.APIKey.equals(other.getAPIKey()))) &&
            ((this.accountEmail==null && other.getAccountEmail()==null) ||
             (this.accountEmail!=null &&
              this.accountEmail.equals(other.getAccountEmail())));
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
        if (getAPIKey() != null) {
            _hashCode += getAPIKey().hashCode();
        }
        if (getAccountEmail() != null) {
            _hashCode += getAccountEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailExists.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">EmailExists"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "loginEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APIKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "APIKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "accountEmail"));
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
