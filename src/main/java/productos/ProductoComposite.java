package main.java.productos;

import main.java.visitantes.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ProductoComposite implements ProductoComponent {
    private final List<ProductoComponent> productos = new ArrayList<>();
    public void addProducto(ProductoComponent producto) {
        productos.add(producto);
    }
    public void removeProducto(ProductoComponent producto) {
        productos.remove(producto);
    }
    public int getNumeroProductos() {
        return productos.size();
    }
    @Override
    public double getPrecio() {
        return productos.stream().mapToDouble(ProductoComponent::getPrecio).sum();
    }

    @Override
    public void aceptar(Visitor visitante) {
        for (ProductoComponent producto : productos) {
            producto.aceptar(visitante);
        }
        visitante.visitar(this);
    }
}
