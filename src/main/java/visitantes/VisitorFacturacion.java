package main.java.visitantes;

import main.java.estrategias.DescuentoPorPaquete;
import main.java.estrategias.DescuentosPorDocena;
import main.java.estrategias.DescuentosStrategy;
import main.java.productos.Producto;
import main.java.productos.ProductoComposite;
import main.java.productos.ProductoLeaf;

public class VisitorFacturacion implements Visitor {
    private DescuentosStrategy descuentoCantidad = new DescuentosPorDocena();
    private DescuentosStrategy descuentoPaquete = new DescuentoPorPaquete();
    private double total = 0;

    @Override
    public void visitar(ProductoLeaf producto) {
        total += producto.getPrecio();
        System.out.println("total = " + total);
    }

    @Override
    public void visitar(ProductoComposite paquete) {
        double precio = paquete.getPrecio();
        int cantidad = paquete.getNumeroProductos();
        double precioConDescuento = descuentoCantidad.aplicarDescuento(precio, cantidad);
        System.out.println("precioConDescuento = " + precioConDescuento);
        precioConDescuento = descuentoPaquete.aplicarDescuento(precioConDescuento, cantidad);
        System.out.println("precioConDescuento = " + precioConDescuento);
        total += precioConDescuento;
    }
    public double totalFactura() {
        return total;
    }
}
