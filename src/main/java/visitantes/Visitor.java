package main.java.visitantes;

import main.java.productos.ProductoComposite;
import main.java.productos.ProductoLeaf;

public interface Visitor {
    void visitar(ProductoLeaf producto);
    void visitar(ProductoComposite paquete);

}
