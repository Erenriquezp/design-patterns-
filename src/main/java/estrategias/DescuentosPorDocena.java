package main.java.estrategias;

public class DescuentosPorDocena implements DescuentosStrategy {
    private static final double DESCUENTO_POR_DOCENA = 0.25;
    private static final double DESCUENTO_GENERAL = 0.03;
    @Override
    public double aplicarDescuento(double precio, int cantidad) {
        if (cantidad >= 12) {
            return precio * (1 - DESCUENTO_POR_DOCENA);
        }
        return precio * (1 - DESCUENTO_GENERAL);
    }
}
