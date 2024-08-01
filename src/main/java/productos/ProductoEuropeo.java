package main.java.productos;

import java.util.Date;

public abstract class ProductoEuropeo extends Producto {
    private final Date fechaFabricacion;
    private final String paisOrigen;
    private final String normaFabricacion;

    protected ProductoEuropeo(Builder<?> builder) {
        super(builder);
        this.fechaFabricacion = builder.fechaFabricacion;
        this.paisOrigen = builder.paisOrigen;
        this.normaFabricacion = builder.normaFabricacion;
    }

    // Getters
    public Date getFechaFabricacion() { return fechaFabricacion; }
    public String getPaisOrigen() { return paisOrigen; }
    public String getNormaFabricacion() { return normaFabricacion; }

    // Builder para ProductoEuropeo
    public static abstract class Builder<T extends Builder<T>> extends Producto.Builder<T> {
        private Date fechaFabricacion;
        private String paisOrigen;
        private String normaFabricacion;

        public T setFechaFabricacion(Date fechaFabricacion) {
            this.fechaFabricacion = fechaFabricacion;
            return self();
        }

        public T setPaisOrigen(String paisOrigen) {
            this.paisOrigen = paisOrigen;
            return self();
        }

        public T setNormaFabricacion(String normaFabricacion) {
            this.normaFabricacion = normaFabricacion;
            return self();
        }
    }
}
