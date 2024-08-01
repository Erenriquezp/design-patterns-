package main.java.productos;

import main.java.visitantes.Visitor;

public class ProductoLeaf implements ProductoComponent {
    private final Producto producto;

    public ProductoLeaf(Producto producto) {
        this.producto = producto;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }

    @Override
    public void aceptar(Visitor visitante) {
        producto.aceptar(visitante);
        //visitante.visitar(this);
    }
}
