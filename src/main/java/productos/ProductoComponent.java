package main.java.productos;

import main.java.visitantes.Visitor;

public interface ProductoComponent {
    double getPrecio();
    void aceptar(Visitor visitante);
}
