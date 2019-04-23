/**
 * CreateCampaignBySimpleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CreateCampaignBySimpleType  implements java.io.Serializable {
    private String loginEmail;

    private String password;

    private String campaignName;

    private String from;

    private String fromEmail;

    private String subject;

    private String content;

    private java.util.Calendar schedule;

    private String categorys;

    private int interval;

    public CreateCampaignBySimpleType() {
    }

    public CreateCampaignBySimpleType(
           String loginEmail,
           String password,
           String campaignName,
           String from,
           String fromEmail,
           String subject,
           String content,
           java.util.Calendar schedule,
           String categorys,
           int interval) {
           this.loginEmail = loginEmail;
           this.password = password;
           this.campaignName = campaignName;
           this.from = from;
           this.fromEmail = fromEmail;
           this.subject = subject;
           this.content = content;
           this.schedule = schedule;
           this.categorys = categorys;
           this.interval = interval;
    }


    /**
     * Gets the loginEmail value for this CreateCampaignBySimpleType.
     *
     * @return loginEmail
     */
    public String getLoginEmail() {
        return loginEmail;
    }


    /**
     * Sets the loginEmail value for this CreateCampaignBySimpleType.
     *
     * @param loginEmail
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }


    /**
     * Gets the password value for this CreateCampaignBySimpleType.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CreateCampaignBySimpleType.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the campaignName value for this CreateCampaignBySimpleType.
     *
     * @return campaignName
     */
    public String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this CreateCampaignBySimpleType.
     *
     * @param campaignName
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the from value for this CreateCampaignBySimpleType.
     *
     * @return from
     */
    public String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this CreateCampaignBySimpleType.
     *
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }


    /**
     * Gets the fromEmail value for this CreateCampaignBySimpleType.
     *
     * @return fromEmail
     */
    public String getFromEmail() {
        return fromEmail;
    }


    /**
     * Sets the fromEmail value for this CreateCampaignBySimpleType.
     *
     * @param fromEmail
     */
    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }


    /**
     * Gets the subject value for this CreateCampaignBySimpleType.
     *
     * @return subject
     */
    public String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this CreateCampaignBySimpleType.
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * Gets the content value for this CreateCampaignBySimpleType.
     *
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this CreateCampaignBySimpleType.
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the schedule value for this CreateCampaignBySimpleType.
     *
     * @return schedule
     */
    public java.util.Calendar getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this CreateCampaignBySimpleType.
     *
     * @param schedule
     */
    public void setSchedule(java.util.Calendar schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the categorys value for this CreateCampaignBySimpleType.
     *
     * @return categorys
     */
    public String getCategorys() {
        return categorys;
    }


    /**
     * Sets the categorys value for this CreateCampaignBySimpleType.
     *
     * @param categorys
     */
    public void setCategorys(String categorys) {
        this.categorys = categorys;
    }


    /**
     * Gets the interval value for this CreateCampaignBySimpleType.
     *
     * @return interval
     */
    public int getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this CreateCampaignBySimpleType.
     *
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateCampaignBySimpleType)) return false;
        CreateCampaignBySimpleType other = (CreateCampaignBySimpleType) obj;
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
            ((this.campaignName==null && other.getCampaignName()==null) ||
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.from==null && other.getFrom()==null) ||
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.fromEmail==null && other.getFromEmail()==null) ||
             (this.fromEmail!=null &&
              this.fromEmail.equals(other.getFromEmail()))) &&
            ((this.subject==null && other.getSubject()==null) ||
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.content==null && other.getContent()==null) ||
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.schedule==null && other.getSchedule()==null) ||
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.categorys==null && other.getCategorys()==null) ||
             (this.categorys!=null &&
              this.categorys.equals(other.getCategorys()))) &&
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
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getFromEmail() != null) {
            _hashCode += getFromEmail().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getCategorys() != null) {
            _hashCode += getCategorys().hashCode();
        }
        _hashCode += getInterval();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCampaignBySimpleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", ">CreateCampaignBySimpleType"));
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
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "fromEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "categorys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
