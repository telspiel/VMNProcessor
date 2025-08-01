//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 06:50:28 PM IST 
//


package com.noesis.vmn.processor.xml.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="totalMessageParts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="partMessageIdList">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="partMessageId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="longUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="shortUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "recipientList"
})
@XmlRootElement(name = "xmlPushResponse")
public class XmlPushResponse {

    @XmlElement(required = true)
    protected String campaignName;
    @XmlElement(required = true)
    protected XmlPushResponse.RecipientList recipientList;

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
     * Gets the value of the recipientList property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPushResponse.RecipientList }
     *     
     */
    public XmlPushResponse.RecipientList getRecipientList() {
        return recipientList;
    }

    /**
     * Sets the value of the recipientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPushResponse.RecipientList }
     *     
     */
    public void setRecipientList(XmlPushResponse.RecipientList value) {
        this.recipientList = value;
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
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="totalMessageParts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="partMessageIdList">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="partMessageId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="longUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="shortUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

        protected List<XmlPushResponse.RecipientList.Recipient> recipient;

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
         * {@link XmlPushResponse.RecipientList.Recipient }
         * 
         * 
         */
        public List<XmlPushResponse.RecipientList.Recipient> getRecipient() {
            if (recipient == null) {
                recipient = new ArrayList<XmlPushResponse.RecipientList.Recipient>();
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
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="destAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="custref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="totalMessageParts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="partMessageIdList">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="partMessageId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="longUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="shortUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "code",
            "desc",
            "timestamp",
            "destAddress",
            "custref",
            "requestId",
            "totalMessageParts",
            "partMessageIdList",
            "longUrl",
            "shortUrl"
        })
        public static class Recipient {

            @XmlElement(required = true)
            protected String code;
            @XmlElement(required = true)
            protected String desc;
            @XmlElement(required = true)
            protected String timestamp;
            protected String destAddress;
            @XmlElement(required = true)
            protected String custref;
            @XmlElement(required = true)
            protected String requestId;
            @XmlElement(required = true)
            protected Integer totalMessageParts;
            @XmlElement(required = true)
            protected XmlPushResponse.RecipientList.Recipient.PartMessageIdList partMessageIdList;
            protected String longUrl;
            protected String shortUrl;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the desc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesc() {
                return desc;
            }

            /**
             * Sets the value of the desc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesc(String value) {
                this.desc = value;
            }

            /**
             * Gets the value of the timestamp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimestamp() {
                return timestamp;
            }

            /**
             * Sets the value of the timestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimestamp(String value) {
                this.timestamp = value;
            }

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

            /**
             * Gets the value of the requestId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public String getRequestId() {
                return requestId;
            }

            /**
             * Sets the value of the requestId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRequestId(String value) {
                this.requestId = value;
            }

            /**
             * Gets the value of the totalMessageParts property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public Integer getTotalMessageParts() {
                return totalMessageParts;
            }

            /**
             * Sets the value of the totalMessageParts property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalMessageParts(Integer value) {
                this.totalMessageParts = value;
            }

            /**
             * Gets the value of the partMessageIdList property.
             * 
             * @return
             *     possible object is
             *     {@link XmlPushResponse.RecipientList.Recipient.PartMessageIdList }
             *     
             */
            public XmlPushResponse.RecipientList.Recipient.PartMessageIdList getPartMessageIdList() {
                return partMessageIdList;
            }

            /**
             * Sets the value of the partMessageIdList property.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlPushResponse.RecipientList.Recipient.PartMessageIdList }
             *     
             */
            public void setPartMessageIdList(XmlPushResponse.RecipientList.Recipient.PartMessageIdList value) {
                this.partMessageIdList = value;
            }

            /**
             * Gets the value of the longUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongUrl() {
                return longUrl;
            }

            /**
             * Sets the value of the longUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongUrl(String value) {
                this.longUrl = value;
            }

            /**
             * Gets the value of the shortUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortUrl() {
                return shortUrl;
            }

            /**
             * Sets the value of the shortUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortUrl(String value) {
                this.shortUrl = value;
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
             *         &lt;element name="partMessageId" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
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
                "partMessageId"
            })
            public static class PartMessageIdList {

                protected List<String> partMessageId;

                /**
                 * Gets the value of the partMessageId property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the partMessageId property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPartMessageId().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BigInteger }
                 * 
                 * 
                 */
                public List<String> getPartMessageId() {
                    if (partMessageId == null) {
                        partMessageId = new ArrayList<String>();
                    }
                    return this.partMessageId;
                }

            }

        }

    }

}
