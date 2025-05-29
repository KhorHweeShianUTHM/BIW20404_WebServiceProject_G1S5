
package com.khor.healthclientapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLBMCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLBMCategories"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lbm" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLBMCategories", propOrder = {
    "lbm",
    "weight"
})
public class GetLBMCategories {

    protected double lbm;
    protected double weight;

    /**
     * Gets the value of the lbm property.
     * 
     */
    public double getLbm() {
        return lbm;
    }

    /**
     * Sets the value of the lbm property.
     * 
     */
    public void setLbm(double value) {
        this.lbm = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

}
