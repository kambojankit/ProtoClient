
package com.techarha.java.ecomm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.techarha.java.ecomm.model.common.CapacityType;
import com.techarha.java.ecomm.model.common.SizeType;
import com.techarha.java.ecomm.model.common.WeightType;


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
 *         &lt;element name="thumbnailURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{http://www.techarha.com/schema/xsd/common/CommonTypes}SizeType"/>
 *         &lt;element name="weight" type="{http://www.techarha.com/schema/xsd/common/CommonTypes}WeightType"/>
 *         &lt;element name="capacity" type="{http://www.techarha.com/schema/xsd/common/CommonTypes}CapacityType"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantityInStock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="characters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "thumbnailURI",
    "imageURI",
    "color",
    "size",
    "weight",
    "capacity",
    "brand",
    "quantityInStock",
    "material",
    "characters",
    "gender",
    "type"
})
@XmlRootElement(name = "ProductDetailsType")
public class ProductDetailsType {

    @XmlElement(required = true)
    protected String thumbnailURI;
    @XmlElement(required = true)
    protected String imageURI;
    @XmlElement(required = true)
    protected String color;
    @XmlElement(required = true)
    protected SizeType size;
    @XmlElement(required = true)
    protected WeightType weight;
    @XmlElement(required = true)
    protected CapacityType capacity;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(required = true)
    protected String quantityInStock;
    @XmlElement(required = true)
    protected String material;
    @XmlElement(required = true)
    protected String characters;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the thumbnailURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailURI() {
        return thumbnailURI;
    }

    /**
     * Sets the value of the thumbnailURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailURI(String value) {
        this.thumbnailURI = value;
    }

    /**
     * Gets the value of the imageURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURI() {
        return imageURI;
    }

    /**
     * Sets the value of the imageURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURI(String value) {
        this.imageURI = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setWeight(WeightType value) {
        this.weight = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link CapacityType }
     *     
     */
    public CapacityType getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacityType }
     *     
     */
    public void setCapacity(CapacityType value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the quantityInStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * Sets the value of the quantityInStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityInStock(String value) {
        this.quantityInStock = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the characters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacters() {
        return characters;
    }

    /**
     * Sets the value of the characters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacters(String value) {
        this.characters = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
