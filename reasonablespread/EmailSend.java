/**
 * EmailSend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class EmailSend  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String from;

    private String fromName;

    private String to;

    private String subject;

    private String body;

    public EmailSend() {
    }

    public EmailSend(
           String loginEmail,
           String password,
           String from,
           String fromName,
           String to,
           String subject,
           String body) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.from = from;
           this.fromName = fromName;
           this.to = to;
           this.subject = subject;
           this.body = body;
    }


    /**
     * Gets the loginEmail value for this EmailSend.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this EmailSend.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this EmailSend.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this EmailSend.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the from value for this EmailSend.
     *
     * @return from
     */
    public String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this EmailSend.
     *
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }


    /**
     * Gets the fromName value for this EmailSend.
     *
     * @return fromName
     */
    public String getFromName() {
        return fromName;
    }


    /**
     * Sets the fromName value for this EmailSend.
     *
     * @param fromName
     */
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }


    /**
     * Gets the to value for this EmailSend.
     *
     * @return to
     */
    public String getTo() {
        return to;
    }


    /**
     * Sets the to value for this EmailSend.
     *
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }


    /**
     * Gets the subject value for this EmailSend.
     *
     * @return subject
     */
    public String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this EmailSend.
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * Gets the body value for this EmailSend.
     *
     * @return body
     */
    public String getBody() {
        return body;
    }


    /**
     * Sets the body value for this EmailSend.
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmailSend)) return false;
        EmailSend other = (EmailSend) obj;
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
            ((this.from==null && other.getFrom()==null) ||
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.fromName==null && other.getFromName()==null) ||
             (this.fromName!=null &&
              this.fromName.equals(other.getFromName()))) &&
            ((this.to==null && other.getTo()==null) ||
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.subject==null && other.getSubject()==null) ||
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.body==null && other.getBody()==null) ||
             (this.body!=null &&
              this.body.equals(other.getBody())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getFromName() != null) {
            _hashCode += getFromName().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailSend.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">EmailSend"));
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
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "FromName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "Body"));
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
