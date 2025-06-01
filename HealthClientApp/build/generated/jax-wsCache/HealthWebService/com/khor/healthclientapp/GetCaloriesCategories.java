
package com.khor.healthclientapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCaloriesCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCaloriesCategories"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caloriesBurned" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCaloriesCategories", propOrder = {
    "caloriesBurned"
})
public class GetCaloriesCategories {

    protected double caloriesBurned;

    /**
     * Gets the value of the caloriesBurned property.
     * 
     */
    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    /**
     * Sets the value of the caloriesBurned property.
     * 
     */
    public void setCaloriesBurned(double value) {
        this.caloriesBurned = value;
    }

}
