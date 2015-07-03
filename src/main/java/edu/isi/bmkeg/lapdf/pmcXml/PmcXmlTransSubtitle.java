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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import edu.isi.bmkeg.lapdf.pmcXml.mathml.PmcXmlMath;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}inline-supplementary-material"/>
 *         &lt;element ref="{}related-article"/>
 *         &lt;element ref="{}related-object"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}abbrev"/>
 *         &lt;element ref="{}milestone-end"/>
 *         &lt;element ref="{}milestone-start"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}fn"/>
 *         &lt;element ref="{}target"/>
 *         &lt;element ref="{}xref"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *         &lt;element ref="{}break"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "trans-subtitle")
public class PmcXmlTransSubtitle {

    @XmlElementRefs({
        @XmlElementRef(name = "inline-formula", type = PmcXmlInlineFormula.class, required = false),
        @XmlElementRef(name = "sub", type = PmcXmlSub.class, required = false),
        @XmlElementRef(name = "sup", type = PmcXmlSup.class, required = false),
        @XmlElementRef(name = "ext-link", type = PmcXmlExtLink.class, required = false),
        @XmlElementRef(name = "chem-struct", type = PmcXmlChemStruct.class, required = false),
        @XmlElementRef(name = "milestone-end", type = PmcXmlMilestoneEnd.class, required = false),
        @XmlElementRef(name = "target", type = PmcXmlTarget.class, required = false),
        @XmlElementRef(name = "private-char", type = PmcXmlPrivateChar.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMath.class, required = false),
        @XmlElementRef(name = "sc", type = PmcXmlSc.class, required = false),
        @XmlElementRef(name = "monospace", type = PmcXmlMonospace.class, required = false),
        @XmlElementRef(name = "underline", type = PmcXmlUnderline.class, required = false),
        @XmlElementRef(name = "sans-serif", type = PmcXmlSansSerif.class, required = false),
        @XmlElementRef(name = "italic", type = PmcXmlItalic.class, required = false),
        @XmlElementRef(name = "email", type = PmcXmlEmail.class, required = false),
        @XmlElementRef(name = "roman", type = PmcXmlRoman.class, required = false),
        @XmlElementRef(name = "break", type = PmcXmlBreak.class, required = false),
        @XmlElementRef(name = "fn", type = PmcXmlFn.class, required = false),
        @XmlElementRef(name = "styled-content", type = PmcXmlStyledContent.class, required = false),
        @XmlElementRef(name = "milestone-start", type = PmcXmlMilestoneStart.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = PmcXmlInlineGraphic.class, required = false),
        @XmlElementRef(name = "tex-math", type = PmcXmlTexMath.class, required = false),
        @XmlElementRef(name = "related-article", type = PmcXmlRelatedArticle.class, required = false),
        @XmlElementRef(name = "alternatives", type = PmcXmlAlternatives.class, required = false),
        @XmlElementRef(name = "named-content", type = PmcXmlNamedContent.class, required = false),
        @XmlElementRef(name = "inline-supplementary-material", type = PmcXmlInlineSupplementaryMaterial.class, required = false),
        @XmlElementRef(name = "overline", type = PmcXmlOverline.class, required = false),
        @XmlElementRef(name = "abbrev", type = PmcXmlAbbrev.class, required = false),
        @XmlElementRef(name = "related-object", type = PmcXmlRelatedObject.class, required = false),
        @XmlElementRef(name = "uri", type = PmcXmlUri.class, required = false),
        @XmlElementRef(name = "bold", type = PmcXmlBold.class, required = false),
        @XmlElementRef(name = "strike", type = PmcXmlStrike.class, required = false),
        @XmlElementRef(name = "xref", type = PmcXmlXref.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlInlineFormula }
     * {@link PmcXmlSub }
     * {@link PmcXmlSup }
     * {@link PmcXmlExtLink }
     * {@link PmcXmlMilestoneEnd }
     * {@link PmcXmlChemStruct }
     * {@link PmcXmlPrivateChar }
     * {@link PmcXmlTarget }
     * {@link PmcXmlMath }
     * {@link PmcXmlSc }
     * {@link PmcXmlMonospace }
     * {@link PmcXmlUnderline }
     * {@link PmcXmlSansSerif }
     * {@link PmcXmlEmail }
     * {@link PmcXmlItalic }
     * {@link PmcXmlRoman }
     * {@link PmcXmlFn }
     * {@link PmcXmlBreak }
     * {@link PmcXmlStyledContent }
     * {@link PmcXmlMilestoneStart }
     * {@link PmcXmlTexMath }
     * {@link PmcXmlInlineGraphic }
     * {@link String }
     * {@link PmcXmlRelatedArticle }
     * {@link PmcXmlAlternatives }
     * {@link PmcXmlNamedContent }
     * {@link PmcXmlInlineSupplementaryMaterial }
     * {@link PmcXmlAbbrev }
     * {@link PmcXmlOverline }
     * {@link PmcXmlRelatedObject }
     * {@link PmcXmlUri }
     * {@link PmcXmlBold }
     * {@link PmcXmlStrike }
     * {@link PmcXmlXref }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
