//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.06 at 02:44:21 PM IST 
//


package net.opengis.sld;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/sld}SymbolizerType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/sld}Geometry" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/sld}Fill" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/sld}Stroke" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "geometry",
    "fill",
    "stroke"
})
public class PolygonSymbolizer
    extends SymbolizerType
{

    @XmlElement(name = "Geometry")
    protected Geometry geometry;
    @XmlElement(name = "Fill")
    protected Fill fill;
    @XmlElement(name = "Stroke")
    protected Stroke stroke;

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link Fill }
     *     
     */
    public Fill getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fill }
     *     
     */
    public void setFill(Fill value) {
        this.fill = value;
    }

    /**
     * Gets the value of the stroke property.
     * 
     * @return
     *     possible object is
     *     {@link Stroke }
     *     
     */
    public Stroke getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stroke }
     *     
     */
    public void setStroke(Stroke value) {
        this.stroke = value;
    }

}
