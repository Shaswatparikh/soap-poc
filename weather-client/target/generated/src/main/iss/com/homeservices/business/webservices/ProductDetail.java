
package com.homeservices.business.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for productDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://webservices.business.homeservices.com/}address" minOccurs="0"/>
 *         &lt;element name="blackoutDates" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deliveryIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="distanceChargeItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distanceCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gasHookup" type="{http://webservices.business.homeservices.com/}gasHookup" minOccurs="0"/>
 *         &lt;element name="itemPrices">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://webservices.business.homeservices.com/}item" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://webservices.business.homeservices.com/}itemPrice" minOccurs="0"/>
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
 *         &lt;element name="multipleTownships" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permits" type="{http://webservices.business.homeservices.com/}permit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productDetail", propOrder = {
    "address",
    "blackoutDates",
    "deliveryIncluded",
    "distanceChargeItemNumber",
    "distanceCharges",
    "gasHookup",
    "itemPrices",
    "multipleTownships",
    "permits",
    "productId",
    "storeNumber"
})
public class ProductDetail {

    protected Address address;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> blackoutDates;
    protected boolean deliveryIncluded;
    protected String distanceChargeItemNumber;
    protected BigDecimal distanceCharges;
    protected GasHookup gasHookup;
    @XmlElement(required = true)
    protected ProductDetail.ItemPrices itemPrices;
    protected boolean multipleTownships;
    @XmlElement(nillable = true)
    protected List<Permit> permits;
    protected String productId;
    protected String storeNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the blackoutDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackoutDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackoutDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getBlackoutDates() {
        if (blackoutDates == null) {
            blackoutDates = new ArrayList<XMLGregorianCalendar>();
        }
        return this.blackoutDates;
    }

    /**
     * Gets the value of the deliveryIncluded property.
     * 
     */
    public boolean isDeliveryIncluded() {
        return deliveryIncluded;
    }

    /**
     * Sets the value of the deliveryIncluded property.
     * 
     */
    public void setDeliveryIncluded(boolean value) {
        this.deliveryIncluded = value;
    }

    /**
     * Gets the value of the distanceChargeItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceChargeItemNumber() {
        return distanceChargeItemNumber;
    }

    /**
     * Sets the value of the distanceChargeItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceChargeItemNumber(String value) {
        this.distanceChargeItemNumber = value;
    }

    /**
     * Gets the value of the distanceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceCharges() {
        return distanceCharges;
    }

    /**
     * Sets the value of the distanceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceCharges(BigDecimal value) {
        this.distanceCharges = value;
    }

    /**
     * Gets the value of the gasHookup property.
     * 
     * @return
     *     possible object is
     *     {@link GasHookup }
     *     
     */
    public GasHookup getGasHookup() {
        return gasHookup;
    }

    /**
     * Sets the value of the gasHookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasHookup }
     *     
     */
    public void setGasHookup(GasHookup value) {
        this.gasHookup = value;
    }

    /**
     * Gets the value of the itemPrices property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetail.ItemPrices }
     *     
     */
    public ProductDetail.ItemPrices getItemPrices() {
        return itemPrices;
    }

    /**
     * Sets the value of the itemPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetail.ItemPrices }
     *     
     */
    public void setItemPrices(ProductDetail.ItemPrices value) {
        this.itemPrices = value;
    }

    /**
     * Gets the value of the multipleTownships property.
     * 
     */
    public boolean isMultipleTownships() {
        return multipleTownships;
    }

    /**
     * Sets the value of the multipleTownships property.
     * 
     */
    public void setMultipleTownships(boolean value) {
        this.multipleTownships = value;
    }

    /**
     * Gets the value of the permits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permit }
     * 
     * 
     */
    public List<Permit> getPermits() {
        if (permits == null) {
            permits = new ArrayList<Permit>();
        }
        return this.permits;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://webservices.business.homeservices.com/}item" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://webservices.business.homeservices.com/}itemPrice" minOccurs="0"/>
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
        "entry"
    })
    public static class ItemPrices {

        protected List<ProductDetail.ItemPrices.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductDetail.ItemPrices.Entry }
         * 
         * 
         */
        public List<ProductDetail.ItemPrices.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ProductDetail.ItemPrices.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://webservices.business.homeservices.com/}item" minOccurs="0"/>
         *         &lt;element name="value" type="{http://webservices.business.homeservices.com/}itemPrice" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            protected Item key;
            protected ItemPrice value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link Item }
             *     
             */
            public Item getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link Item }
             *     
             */
            public void setKey(Item value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link ItemPrice }
             *     
             */
            public ItemPrice getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemPrice }
             *     
             */
            public void setValue(ItemPrice value) {
                this.value = value;
            }

        }

    }

}
