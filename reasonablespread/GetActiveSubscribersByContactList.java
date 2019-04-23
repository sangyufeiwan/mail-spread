/**
 * GetActiveSubscribersByContactList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class GetActiveSubscribersByContactList  implements java.io.Serializable {
    private String loginEmail;

    private String APIKey;

    private String contactListName;

    public GetActiveSubscribersByContactList() {
    }

    public GetActiveSubscribersByContactList(
           String loginEmail,
           String APIKey,
           String contactListName) {
           this.loginEmail = loginEmail;
           this.APIKey = APIKey;
           this.contactListName = contactListName;
    }


    /**
     * Gets the loginEmail value for this GetActiveSubscribersByContactList.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this GetActiveSubscribersByContactList.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the APIKey value for this GetActiveSubscribersByContactList.
     *
     * @return APIKey
     */
    public String getAPIKey() {
        return APIKey;
    }


    /**
     * Sets the APIKey value for this GetActiveSubscribersByContactList.
     *
     * @param APIKey
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }


    /**
     * Gets the contactListName value for this GetActiveSubscribersByContactList.
     *
     * @return contactListName
     */
    public String getContactListName() {
        return contactListName;
    }


    /**
     * Sets the contactListName value for this GetActiveSubscribersByContactList.
     *
     * @param contactListName
     */
    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetActiveSubscribersByContactList)) return false;
        GetActiveSubscribersByContactList other = (GetActiveSubscribersByContactList) obj;
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
            ((this.contactListName==null && other.getContactListName()==null) ||
             (this.contactListName!=null &&
              this.contactListName.equals(other.getContactListName())));
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
        if (getContactListName() != null) {
            _hashCode += getContactListName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetActiveSubscribersByContactList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">getActiveSubscribersByContactList"));
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
        elemField.setFieldName("contactListName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "contactListName"));
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
