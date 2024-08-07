//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.27 at 01:43:19 AM IST 
//


package com.noesis.vmn.processor.xml.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convertUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crmUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="recipientList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="recipient" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="message">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="messageTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignName",
    "domain",
    "convertUrl",
    "crmUrl",
    "entityId",
    "data"
})
@XmlRootElement(name = "xmlPushRequest")
public class XmlPushRequest {

    protected String campaignName;
    protected String domain;
    protected String convertUrl;
    protected String crmUrl;
    protected String entityId;
    protected List<XmlPushRequest.Data> data;
    @XmlAttribute(name = "username")
    protected String username;
    @XmlAttribute(name = "pin")
    protected String pin;

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the convertUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertUrl() {
        return convertUrl;
    }

    /**
     * Sets the value of the convertUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertUrl(String value) {
        this.convertUrl = value;
    }

    /**
     * Gets the value of the crmUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmUrl() {
        return crmUrl;
    }

    /**
     * Sets the value of the crmUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmUrl(String value) {
        this.crmUrl = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlPushRequest.Data }
     * 
     * 
     */
    public List<XmlPushRequest.Data> getData() {
        if (data == null) {
            data = new ArrayList<XmlPushRequest.Data>();
        }
        return this.data;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="recipientList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="recipient" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="message">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="messageTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "from",
        "recipientList",
        "message"
    })
    public static class Data {

        @XmlElement(required = true)
        protected String from;
        @XmlElement(required = true)
        protected XmlPushRequest.Data.RecipientList recipientList;
        @XmlElement(required = true)
        protected XmlPushRequest.Data.Message message;

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrom(String value) {
            this.from = value;
        }

        /**
         * Gets the value of the recipientList property.
         * 
         * @return
         *     possible object is
         *     {@link XmlPushRequest.Data.RecipientList }
         *     
         */
        public XmlPushRequest.Data.RecipientList getRecipientList() {
            return recipientList;
        }

        /**
         * Sets the value of the recipientList property.
         * 
         * @param value
         *     allowed object is
         *     {@link XmlPushRequest.Data.RecipientList }
         *     
         */
        public void setRecipientList(XmlPushRequest.Data.RecipientList value) {
            this.recipientList = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link XmlPushRequest.Data.Message }
         *     
         */
        public XmlPushRequest.Data.Message getMessage() {
            return message;
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link XmlPushRequest.Data.Message }
         *     
         */
        public void setMessage(XmlPushRequest.Data.Message value) {
            this.message = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="messageTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "templateId",
            "messageType",
            "messageTxt"
        })
        public static class Message {

            protected String templateId;
            @XmlElement(required = true)
            protected String messageType;
            @XmlElement(required = true)
            protected String messageTxt;

            /**
             * Gets the value of the templateId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTemplateId() {
                return templateId;
            }

            /**
             * Sets the value of the templateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTemplateId(String value) {
                this.templateId = value;
            }

            /**
             * Gets the value of the messageType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageType() {
                return messageType;
            }

            /**
             * Sets the value of the messageType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageType(String value) {
                this.messageType = value;
            }

            /**
             * Gets the value of the messageTxt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageTxt() {
                return messageTxt;
            }

            /**
             * Sets the value of the messageTxt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageTxt(String value) {
                this.messageTxt = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="recipient" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "recipient"
        })
        public static class RecipientList {

            protected List<XmlPushRequest.Data.RecipientList.Recipient> recipient;

            /**
             * Gets the value of the recipient property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the recipient property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRecipient().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link XmlPushRequest.Data.RecipientList.Recipient }
             * 
             * 
             */
            public List<XmlPushRequest.Data.RecipientList.Recipient> getRecipient() {
                if (recipient == null) {
                    recipient = new ArrayList<XmlPushRequest.Data.RecipientList.Recipient>();
                }
                return this.recipient;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "destAddress",
                "custref"
            })
            public static class Recipient {

                protected String destAddress;
                protected String custref;

                /**
                 * Gets the value of the destAddress property.
                 * 
                 */
                public String getDestAddress() {
                    return destAddress;
                }

                /**
                 * Sets the value of the destAddress property.
                 * 
                 */
                public void setDestAddress(String value) {
                    this.destAddress = value;
                }

                /**
                 * Gets the value of the custref property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustref() {
                    return custref;
                }

                /**
                 * Sets the value of the custref property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustref(String value) {
                    this.custref = value;
                }

            }

        }

    }

}
