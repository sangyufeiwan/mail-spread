/**
 * CampaignStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CampaignStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Inexistent = "Inexistent";
    public static final String _Deleted = "Deleted";
    public static final String _Sent = "Sent";
    public static final String _Draft = "Draft";
    public static final String _Pause = "Pause";
    public static final String _Sending = "Sending";
    public static final String _Waiting = "Waiting";
    public static final String _EngineSending = "EngineSending";
    public static final String _PreApproval = "PreApproval";
    public static final String _DisApproval = "DisApproval";
    public static final String _Approved = "Approved";
    public static final String _NRTriggering = "NRTriggering";
    public static final String _Preparing = "Preparing";
    public static final String _UploadWaiting = "UploadWaiting";
    public static final CampaignStatus Inexistent = new CampaignStatus(_Inexistent);
    public static final CampaignStatus Deleted = new CampaignStatus(_Deleted);
    public static final CampaignStatus Sent = new CampaignStatus(_Sent);
    public static final CampaignStatus Draft = new CampaignStatus(_Draft);
    public static final CampaignStatus Pause = new CampaignStatus(_Pause);
    public static final CampaignStatus Sending = new CampaignStatus(_Sending);
    public static final CampaignStatus Waiting = new CampaignStatus(_Waiting);
    public static final CampaignStatus EngineSending = new CampaignStatus(_EngineSending);
    public static final CampaignStatus PreApproval = new CampaignStatus(_PreApproval);
    public static final CampaignStatus DisApproval = new CampaignStatus(_DisApproval);
    public static final CampaignStatus Approved = new CampaignStatus(_Approved);
    public static final CampaignStatus NRTriggering = new CampaignStatus(_NRTriggering);
    public static final CampaignStatus Preparing = new CampaignStatus(_Preparing);
    public static final CampaignStatus UploadWaiting = new CampaignStatus(_UploadWaiting);
    public String getValue() { return _value_;}
    public static CampaignStatus fromValue(String value)
          throws IllegalArgumentException {
        CampaignStatus enumeration = (CampaignStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CampaignStatus fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "CampaignStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
