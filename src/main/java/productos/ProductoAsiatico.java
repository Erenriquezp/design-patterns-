package main.java.productos;

import main.java.visitantes.Visitor;

import java.util.Date;

public class ProductoAsiatico extends Producto {
    private final Date fechaFabricacion;
    private final String paisOrigen;
    private final String tipoPiel;
    private final String subtipo;

    private ProductoAsiatico(Builder builder) {
        super(builder);
        this.fechaFabricacion = builder.fechaFabricacion;
        this.paisOrigen = builder.paisOrigen;
        this.tipoPiel = builder.tipoPiel;
        this.subtipo = builder.subtipo;
    }

    // Getters
    public Date getFechaFabricacion() { return fechaFabricacion; }
    public String getPaisOrigen() { return paisOrigen; }
    public String getTipoPiel() { return tipoPiel; }
    public String getSubtipo() { return subtipo; }

    @Override
    public void aceptar(Visitor visitante) {
        //visitante.visitar(this);
    }

    public static class Builder extends Producto.Builder<Builder> {
        private Date fechaFabricacion;
        private String paisOrigen;
        private String tipoPiel;
        private String subtipo;

        public Builder setFechaFabricacion(Date fechaFabricacion) {
            this.fechaFabricacion = fechaFabricacion;
            return self();
        }

        public Builder setPaisOrigen(String paisOrigen) {
            this.paisOrigen = paisOrigen;
            return self();
        }

        public Builder setTipoPiel(String tipoPiel) {
            this.tipoPiel = tipoPiel;
            return self();
        }

        public Builder setSubtipo(String subtipo) {
            this.subtipo = subtipo;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ProductoAsiatico build() {
            return new ProductoAsiatico(this);
        }
    }
}
