//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.02 at 03:31:08 PM MEZ 
//


package reactionruleml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for time.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}time.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}time.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time.type", propOrder = {
    "ind",
    "var",
    "expr"
})
public class TimeType {

    @XmlElement(name = "Ind")
    protected IndType ind;
    @XmlElement(name = "Var")
    protected VarType var;
    @XmlElement(name = "Expr")
    protected ExprType expr;

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link IndType }
     *     
     */
    public IndType getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndType }
     *     
     */
    public void setInd(IndType value) {
        this.ind = value;
    }

    /**
     * Gets the value of the var property.
     * 
     * @return
     *     possible object is
     *     {@link VarType }
     *     
     */
    public VarType getVar() {
        return var;
    }

    /**
     * Sets the value of the var property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarType }
     *     
     */
    public void setVar(VarType value) {
        this.var = value;
    }

    /**
     * Gets the value of the expr property.
     * 
     * @return
     *     possible object is
     *     {@link ExprType }
     *     
     */
    public ExprType getExpr() {
        return expr;
    }

    /**
     * Sets the value of the expr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExprType }
     *     
     */
    public void setExpr(ExprType value) {
        this.expr = value;
    }

}
