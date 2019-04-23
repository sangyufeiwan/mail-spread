/**
 * ExcludeContactsByDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class ExcludeContactsByDomain  implements java.io.Serializable {
    private String loginEmail;

    private String apiKey;

    private String[] contacts;

    private String domain;

    public ExcludeContactsByDomain() {
    }

    public ExcludeContactsByDomain(
           String loginEmail,
           String apiKey,
           String[] contacts,
           String domain) {
           this.loginEmail = loginEmail;
           this.apiKey = apiKey;
           this.contacts = contacts;
           this.domain = domain;
    }


    /**
     * Gets the loginEmail value for this ExcludeContactsByDomain.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this ExcludeContactsByDomain.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the apiKey value for this ExcludeContactsByDomain.
     *
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this ExcludeContactsByDomain.
     *
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the contacts value for this ExcludeContactsByDomain.
     *
     * @return contacts
     */
    public String[] getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this ExcludeContactsByDomain.
     *
     * @param contacts
     */
    public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }


    /**
     * Gets the domain value for this ExcludeContactsByDomain.
     *
     * @return domain
     */
    public String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this ExcludeContactsByDomain.
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExcludeContactsByDomain)) return false;
        ExcludeContactsByDomain other = (ExcludeContactsByDomain) obj;
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
            ((this.apiKey==null && other.getApiKey()==null) ||
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.contacts==null && other.getContacts()==null) ||
             (this.contacts!=null &&
              java.util.Arrays.equals(this.contacts, other.getContacts()))) &&
            ((this.domain==null && other.getDomain()==null) ||
             (this.domain!=null &&
              this.domain.equals(other.getDomain())));
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
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        if (getContacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContacts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContacts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcludeContactsByDomain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">ExcludeContactsByDomain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "loginEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "apiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "contacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "domain"));
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
