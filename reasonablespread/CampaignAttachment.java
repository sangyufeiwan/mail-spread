/**
 * CampaignAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reasonablespread;

public class CampaignAttachment  implements java.io.Serializable {
    private String displayName;

    private byte[] file;

    private String fileType;

    public CampaignAttachment() {
    }

    public CampaignAttachment(
           String displayName,
           byte[] file,
           String fileType) {
           this.displayName = displayName;
           this.file = file;
           this.fileType = fileType;
    }


    /**
     * Gets the displayName value for this CampaignAttachment.
     *
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CampaignAttachment.
     *
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the file value for this CampaignAttachment.
     *
     * @return file
     */
    public byte[] getFile() {
        return file;
    }


    /**
     * Sets the file value for this CampaignAttachment.
     *
     * @param file
     */
    public void setFile(byte[] file) {
        this.file = file;
    }


    /**
     * Gets the fileType value for this CampaignAttachment.
     *
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this CampaignAttachment.
     *
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignAttachment)) return false;
        CampaignAttachment other = (CampaignAttachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.displayName==null && other.getDisplayName()==null) ||
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.file==null && other.getFile()==null) ||
             (this.file!=null &&
              java.util.Arrays.equals(this.file, other.getFile()))) &&
            ((this.fileType==null && other.getFileType()==null) ||
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "CampaignAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.reasonablespread.com/", "fileType"));
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
