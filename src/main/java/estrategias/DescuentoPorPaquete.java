package main.java.estrategias;

public class DescuentoPorPaquete implements DescuentosStrategy {
    private static final double DESCUENTO_POR_PAQUETE = 0.1;
    @Override
    public double aplicarDescuento(double precio, int cantidad) {
        return precio * (1 - DESCUENTO_POR_PAQUETE);
    }
}
