import main.java.fabrica.ProductoFactory;
import main.java.productos.*;
import main.java.visitantes.VisitorFacturacion;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Producto producto2 = ProductoFactory.crearProductoPermanente("producto2", 100.0, "descripcion2", new Date(), 20, new Date(), "paisOrigen2", "codigoSupervision2", "advertencias2", "durable", "riesgo");

        Producto producto1 = ProductoFactory.ProductoAmericano("producto1", 100.0, "descripcion1", new Date(), 10, new Date(), "paisOrigen1", "codigoSupervision1", "advertencias1");

        ProductoLeaf leaf1 = new ProductoLeaf(producto2);
        ProductoLeaf leaf2 = new ProductoLeaf(producto1);

        ProductoComposite paquete = new ProductoComposite();
        paquete.addProducto(leaf1);
        paquete.addProducto(leaf2);

        ProductoComposite paquete2 = new ProductoComposite();
        paquete2.addProducto(leaf1);
        paquete2.addProducto(leaf2);

        VisitorFacturacion visitor = new VisitorFacturacion();
        //leaf2.aceptar(visitor);
        paquete.aceptar(visitor);
        paquete2.aceptar(visitor);

        System.out.println("Precio total del paquete: " + visitor.totalFactura());
    }
}