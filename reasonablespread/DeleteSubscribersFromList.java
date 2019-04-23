/**
 * DeleteSubscribersFromList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class DeleteSubscribersFromList  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String[] subscriberEmails;

    private String subscription;

    public DeleteSubscribersFromList() {
    }

    public DeleteSubscribersFromList(
           String loginEmail,
           String password,
           String[] subscriberEmails,
           String subscription) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.subscriberEmails = subscriberEmails;
           this.subscription = subscription;
    }


    /**
     * Gets the loginEmail value for this DeleteSubscribersFromList.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this DeleteSubscribersFromList.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this DeleteSubscribersFromList.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this DeleteSubscribersFromList.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the subscriberEmails value for this DeleteSubscribersFromList.
     *
     * @return subscriberEmails
     */
    public String[] getSubscriberEmails() {
        return subscriberEmails;
    }


    /**
     * Sets the subscriberEmails value for this DeleteSubscribersFromList.
     *
     * @param subscriberEmails
     */
    public void setSubscriberEmails(String[] subscriberEmails) {
        this.subscriberEmails = subscriberEmails;
    }


    /**
     * Gets the subscription value for this DeleteSubscribersFromList.
     *
     * @return subscription
     */
    public String getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this DeleteSubscribersFromList.
     *
     * @param subscription
     */
    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteSubscribersFromList)) return false;
        DeleteSubscribersFromList other = (DeleteSubscribersFromList) obj;
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
            ((this.subscriberEmails==null && other.getSubscriberEmails()==null) ||
             (this.subscriberEmails!=null &&
              java.util.Arrays.equals(this.subscriberEmails, other.getSubscriberEmails()))) &&
            ((this.subscription==null && other.getSubscription()==null) ||
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription())));
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
        if (getSubscriberEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberEmails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubscriberEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteSubscribersFromList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">DeleteSubscribersFromList"));
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
        elemField.setFieldName("subscriberEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "subscriberEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "subscription"));
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
