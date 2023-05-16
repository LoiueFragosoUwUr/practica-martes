
package aplicacionconsolaclientews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comprar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comprar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_producto" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num_prod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprar", propOrder = {
    "idProducto",
    "precio",
    "numProd",
    "total"
})
public class Comprar {

    @XmlElement(name = "id_producto")
    protected long idProducto;
    protected int precio;
    @XmlElement(name = "num_prod")
    protected int numProd;
    protected int total;

    /**
     * Gets the value of the idProducto property.
     * 
     */
    public long getIdProducto() {
        return idProducto;
    }

    /**
     * Sets the value of the idProducto property.
     * 
     */
    public void setIdProducto(long value) {
        this.idProducto = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(int value) {
        this.precio = value;
    }

    /**
     * Gets the value of the numProd property.
     * 
     */
    public int getNumProd() {
        return numProd;
    }

    /**
     * Sets the value of the numProd property.
     * 
     */
    public void setNumProd(int value) {
        this.numProd = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
