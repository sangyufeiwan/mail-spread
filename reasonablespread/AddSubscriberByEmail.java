/**
 * AddSubscriberByEmail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class AddSubscriberByEmail  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String subscriberEmail;

    private String subscription;

    private com.reasonablespread.DoubleOptIn optInType;

    public AddSubscriberByEmail() {
    }

    public AddSubscriberByEmail(
           String loginEmail,
           String password,
           String subscriberEmail,
           String subscription,
           com.reasonablespread.DoubleOptIn optInType) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.subscriberEmail = subscriberEmail;
           this.subscription = subscription;
           this.optInType = optInType;
    }


    /**
     * Gets the loginEmail value for this AddSubscriberByEmail.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this AddSubscriberByEmail.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this AddSubscriberByEmail.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AddSubscriberByEmail.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the subscriberEmail value for this AddSubscriberByEmail.
     *
     * @return subscriberEmail
     */
    public String getSubscriberEmail() {
        return subscriberEmail;
    }


    /**
     * Sets the subscriberEmail value for this AddSubscriberByEmail.
     *
     * @param subscriberEmail
     */
    public void setSubscriberEmail(String subscriberEmail) {
        this.subscriberEmail = subscriberEmail;
    }


    /**
     * Gets the subscription value for this AddSubscriberByEmail.
     *
     * @return subscription
     */
    public String getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this AddSubscriberByEmail.
     *
     * @param subscription
     */
    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the optInType value for this AddSubscriberByEmail.
     *
     * @return optInType
     */
    public com.reasonablespread.DoubleOptIn getOptInType() {
        return optInType;
    }


    /**
     * Sets the optInType value for this AddSubscriberByEmail.
     *
     * @param optInType
     */
    public void setOptInType(com.reasonablespread.DoubleOptIn optInType) {
        this.optInType = optInType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddSubscriberByEmail)) return false;
        AddSubscriberByEmail other = (AddSubscriberByEmail) obj;
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
            ((this.subscriberEmail==null && other.getSubscriberEmail()==null) ||
             (this.subscriberEmail!=null &&
              this.subscriberEmail.equals(other.getSubscriberEmail()))) &&
            ((this.subscription==null && other.getSubscription()==null) ||
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.optInType==null && other.getOptInType()==null) ||
             (this.optInType!=null &&
              this.optInType.equals(other.getOptInType())));
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
        if (getSubscriberEmail() != null) {
            _hashCode += getSubscriberEmail().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getOptInType() != null) {
            _hashCode += getOptInType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddSubscriberByEmail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">addSubscriberByEmail"));
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
        elemField.setFieldName("subscriberEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "subscriberEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optInType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "optInType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "DoubleOptIn"));
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
