//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

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
 *         &lt;element ref="{}subj-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}series-title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}series-text" minOccurs="0"/>
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
    "subjGroups",
    "seriesTitles",
    "seriesText"
})
@XmlRootElement(name = "article-categories")
public class PmcXmlArticleCategories {

    @XmlElement(name = "subj-group")
    protected List<PmcXmlSubjGroup> subjGroups;
    @XmlElement(name = "series-title")
    protected List<PmcXmlSeriesTitle> seriesTitles;
    @XmlElement(name = "series-text")
    protected PmcXmlSeriesText seriesText;

    /**
     * Gets the value of the subjGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSubjGroup }
     * 
     * 
     */
    public List<PmcXmlSubjGroup> getSubjGroups() {
        if (subjGroups == null) {
            subjGroups = new ArrayList<PmcXmlSubjGroup>();
        }
        return this.subjGroups;
    }

    /**
     * Gets the value of the seriesTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSeriesTitle }
     * 
     * 
     */
    public List<PmcXmlSeriesTitle> getSeriesTitles() {
        if (seriesTitles == null) {
            seriesTitles = new ArrayList<PmcXmlSeriesTitle>();
        }
        return this.seriesTitles;
    }

    /**
     * Gets the value of the seriesText property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlSeriesText }
     *     
     */
    public PmcXmlSeriesText getSeriesText() {
        return seriesText;
    }

    /**
     * Sets the value of the seriesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlSeriesText }
     *     
     */
    public void setSeriesText(PmcXmlSeriesText value) {
        this.seriesText = value;
    }

}
