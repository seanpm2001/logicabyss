//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 09:34:39 AM MEZ 
//


package datalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Query.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Query.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}Query.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}Query.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query.type", propOrder = {
    "oid",
    "formulaOrRulebaseOrAtom"
})
public class QueryType {

    protected OidType oid;
    @XmlElements({
        @XmlElement(name = "Atom", type = AtomType.class),
        @XmlElement(name = "formula", type = FormulaQueryType.class),
        @XmlElement(name = "And", type = AndQueryType.class),
        @XmlElement(name = "Or", type = OrQueryType.class),
        @XmlElement(name = "Exists", type = ExistsType.class),
        @XmlElement(name = "Entails", type = EntailsType.class),
        @XmlElement(name = "Rulebase", type = RulebaseType.class)
    })
    protected List<Object> formulaOrRulebaseOrAtom;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String closure;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link OidType }
     *     
     */
    public OidType getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OidType }
     *     
     */
    public void setOid(OidType value) {
        this.oid = value;
    }

    /**
     * Gets the value of the formulaOrRulebaseOrAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulaOrRulebaseOrAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulaOrRulebaseOrAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomType }
     * {@link FormulaQueryType }
     * {@link AndQueryType }
     * {@link OrQueryType }
     * {@link ExistsType }
     * {@link EntailsType }
     * {@link RulebaseType }
     * 
     * 
     */
    public List<Object> getFormulaOrRulebaseOrAtom() {
        if (formulaOrRulebaseOrAtom == null) {
            formulaOrRulebaseOrAtom = new ArrayList<Object>();
        }
        return this.formulaOrRulebaseOrAtom;
    }

    /**
     * Gets the value of the closure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosure() {
        return closure;
    }

    /**
     * Sets the value of the closure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosure(String value) {
        this.closure = value;
    }

}
