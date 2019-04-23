/**
 * AddSubscribersByInfo2Serialize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class AddSubscribersByInfo2Serialize  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String subscriberArgs;

    private String subscription;

    private com.reasonablespread.DoubleOptIn optInType;

    private boolean isOverRide;

    private int userID;

    private int websiteID;

    private String APIUrl;

    public AddSubscribersByInfo2Serialize() {
    }

    public AddSubscribersByInfo2Serialize(
           String loginEmail,
           String password,
           String subscriberArgs,
           String subscription,
           com.reasonablespread.DoubleOptIn optInType,
           boolean isOverRide,
           int userID,
           int websiteID,
           String APIUrl) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.subscriberArgs = subscriberArgs;
           this.subscription = subscription;
           this.optInType = optInType;
           this.isOverRide = isOverRide;
           this.userID = userID;
           this.websiteID = websiteID;
           this.APIUrl = APIUrl;
    }


    /**
     * Gets the loginEmail value for this AddSubscribersByInfo2Serialize.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this AddSubscribersByInfo2Serialize.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this AddSubscribersByInfo2Serialize.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this AddSubscribersByInfo2Serialize.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the subscriberArgs value for this AddSubscribersByInfo2Serialize.
     *
     * @return subscriberArgs
     */
    public String getSubscriberArgs() {
        return subscriberArgs;
    }


    /**
     * Sets the subscriberArgs value for this AddSubscribersByInfo2Serialize.
     *
     * @param subscriberArgs
     */
    public void setSubscriberArgs(String subscriberArgs) {
        this.subscriberArgs = subscriberArgs;
    }


    /**
     * Gets the subscription value for this AddSubscribersByInfo2Serialize.
     *
     * @return subscription
     */
    public String getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this AddSubscribersByInfo2Serialize.
     *
     * @param subscription
     */
    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the optInType value for this AddSubscribersByInfo2Serialize.
     *
     * @return optInType
     */
    public com.reasonablespread.DoubleOptIn getOptInType() {
        return optInType;
    }


    /**
     * Sets the optInType value for this AddSubscribersByInfo2Serialize.
     *
     * @param optInType
     */
    public void setOptInType(com.reasonablespread.DoubleOptIn optInType) {
        this.optInType = optInType;
    }


    /**
     * Gets the isOverRide value for this AddSubscribersByInfo2Serialize.
     *
     * @return isOverRide
     */
    public boolean isIsOverRide() {
        return isOverRide;
    }


    /**
     * Sets the isOverRide value for this AddSubscribersByInfo2Serialize.
     *
     * @param isOverRide
     */
    public void setIsOverRide(boolean isOverRide) {
        this.isOverRide = isOverRide;
    }


    /**
     * Gets the userID value for this AddSubscribersByInfo2Serialize.
     *
     * @return userID
     */
    public int getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this AddSubscribersByInfo2Serialize.
     *
     * @param userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }


    /**
     * Gets the websiteID value for this AddSubscribersByInfo2Serialize.
     *
     * @return websiteID
     */
    public int getWebsiteID() {
        return websiteID;
    }


    /**
     * Sets the websiteID value for this AddSubscribersByInfo2Serialize.
     *
     * @param websiteID
     */
    public void setWebsiteID(int websiteID) {
        this.websiteID = websiteID;
    }


    /**
     * Gets the APIUrl value for this AddSubscribersByInfo2Serialize.
     *
     * @return APIUrl
     */
    public String getAPIUrl() {
        return APIUrl;
    }


    /**
     * Sets the APIUrl value for this AddSubscribersByInfo2Serialize.
     *
     * @param APIUrl
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddSubscribersByInfo2Serialize)) return false;
        AddSubscribersByInfo2Serialize other = (AddSubscribersByInfo2Serialize) obj;
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
            ((this.subscriberArgs==null && other.getSubscriberArgs()==null) ||
             (this.subscriberArgs!=null &&
              this.subscriberArgs.equals(other.getSubscriberArgs()))) &&
            ((this.subscription==null && other.getSubscription()==null) ||
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.optInType==null && other.getOptInType()==null) ||
             (this.optInType!=null &&
              this.optInType.equals(other.getOptInType()))) &&
            this.isOverRide == other.isIsOverRide() &&
            this.userID == other.getUserID() &&
            this.websiteID == other.getWebsiteID() &&
            ((this.APIUrl==null && other.getAPIUrl()==null) ||
             (this.APIUrl!=null &&
              this.APIUrl.equals(other.getAPIUrl())));
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
        if (getSubscriberArgs() != null) {
            _hashCode += getSubscriberArgs().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getOptInType() != null) {
            _hashCode += getOptInType().hashCode();
        }
        _hashCode += (isIsOverRide() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getUserID();
        _hashCode += getWebsiteID();
        if (getAPIUrl() != null) {
            _hashCode += getAPIUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddSubscribersByInfo2Serialize.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">addSubscribersByInfo2Serialize"));
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
        elemField.setFieldName("subscriberArgs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "subscriberArgs"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOverRide");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "isOverRide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("websiteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "websiteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APIUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "APIUrl"));
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
