//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 03:57:33 PM BST 
//


package com.gazbert.bxbot.core.config.engine.generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for engineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="engineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emergency-stop-currency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emergency-stop-balance">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="trade-cycle-interval">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "engineType", propOrder = {
    "emergencyStopCurrency",
    "emergencyStopBalance",
    "tradeCycleInterval"
})
public class EngineType {

    @XmlElement(name = "emergency-stop-currency", required = true)
    protected String emergencyStopCurrency;
    @XmlElement(name = "emergency-stop-balance", required = true)
    protected BigDecimal emergencyStopBalance;
    @XmlElement(name = "trade-cycle-interval")
    protected int tradeCycleInterval;

    /**
     * Gets the value of the emergencyStopCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyStopCurrency() {
        return emergencyStopCurrency;
    }

    /**
     * Sets the value of the emergencyStopCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyStopCurrency(String value) {
        this.emergencyStopCurrency = value;
    }

    /**
     * Gets the value of the emergencyStopBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmergencyStopBalance() {
        return emergencyStopBalance;
    }

    /**
     * Sets the value of the emergencyStopBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmergencyStopBalance(BigDecimal value) {
        this.emergencyStopBalance = value;
    }

    /**
     * Gets the value of the tradeCycleInterval property.
     * 
     */
    public int getTradeCycleInterval() {
        return tradeCycleInterval;
    }

    /**
     * Sets the value of the tradeCycleInterval property.
     * 
     */
    public void setTradeCycleInterval(int value) {
        this.tradeCycleInterval = value;
    }

}
