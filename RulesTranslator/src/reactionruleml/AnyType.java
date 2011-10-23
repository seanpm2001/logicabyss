//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.02 at 03:31:08 PM MEZ 
//


package reactionruleml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Any.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Any.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}Any.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}Any.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Any.type", propOrder = {
    "content"
})
public class AnyType {

    @XmlElementRefs({
        @XmlElementRef(name = "Atom", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Message", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Aperiodic", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Data", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Ind", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Periodic", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Neg", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Any", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "on", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Var", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Sequence", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Concurrent", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "oid", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Conjunction", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Naf", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Rule", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Expr", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Not", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Xor", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Disjunction", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Ind" is used by two different parts of a schema. See: 
     * line 103 of file:/D:/Development/workplace/RuleML2DroolsTranslator/resources/rrml/rr.xsd
     * line 292 of http://svn.codehaus.org/logicabyss/RuleML2Drools/trunk/resources/rrml/modules/algebra_module.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
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
     * {@link JAXBElement }{@code <}{@link AtomType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link AperiodicType }{@code >}
     * {@link JAXBElement }{@code <}{@link IndType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link PeriodicType }{@code >}
     * {@link JAXBElement }{@code <}{@link NegType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnyType }{@code >}
     * {@link JAXBElement }{@code <}{@link SequenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VarType }{@code >}
     * {@link JAXBElement }{@code <}{@link OnType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcurrentType }{@code >}
     * {@link JAXBElement }{@code <}{@link OidType }{@code >}
     * {@link JAXBElement }{@code <}{@link RuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link NafType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConjunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExprType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisjunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link XorType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
