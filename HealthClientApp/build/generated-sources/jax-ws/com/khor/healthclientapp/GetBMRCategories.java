
package com.khor.healthclientapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBMRCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBMRCategories"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bmrValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBMRCategories", propOrder = {
    "bmrValue"
})
public class GetBMRCategories {

    protected double bmrValue;

    /**
     * Gets the value of the bmrValue property.
     * 
     */
    public double getBmrValue() {
        return bmrValue;
    }

    /**
     * Sets the value of the bmrValue property.
     * 
     */
    public void setBmrValue(double value) {
        this.bmrValue = value;
    }

}
