package main.java.productos;

import main.java.visitantes.Visitor;

import java.util.Date;

public class ProductoAmericano extends Producto {
    private final Date fechaFabricacion;
    private final String paisOrigen;
    private final String codigoSupervision;
    private final String advertencias;

    ProductoAmericano(Builder builder) {
        super(builder);
        this.fechaFabricacion = builder.fechaFabricacion;
        this.paisOrigen = builder.paisOrigen;
        this.codigoSupervision = builder.codigoSupervision;
        this.advertencias = builder.advertencias;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public String getAdvertencias() {
        return advertencias;
    }

    public static class Builder extends Producto.Builder<Builder> {
        private Date fechaFabricacion;
        private String paisOrigen;
        private String codigoSupervision;
        private String advertencias;

        public Builder setFechaFabricacion(Date fechaFabricacion) {
            this.fechaFabricacion = fechaFabricacion;
            return this;
        }

        public Builder setPaisOrigen(String paisOrigen) {
            this.paisOrigen = paisOrigen;
            return this;
        }

        public Builder setCodigoSupervision(String codigoSupervision) {
            this.codigoSupervision = codigoSupervision;
            return this;
        }

        public Builder setAdvertencias(String advertencias) {
            this.advertencias = advertencias;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ProductoAmericano build() {
            return new ProductoAmericano(this);
        }
    }

    @Override
    public void aceptar(Visitor visitante) {
        // Implementación del método aceptar
    }
}
