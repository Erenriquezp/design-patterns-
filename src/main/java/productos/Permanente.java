package main.java.productos;

import main.java.visitantes.Visitor;

public class Permanente extends ProductoEuropeo {
    private final String composicion;
    private final String durabilidad;
    private final String riesgo;

    private Permanente(Builder builder) {
        super(builder);
        this.composicion = builder.composicion;
        this.durabilidad = builder.durabilidad;
        this.riesgo = builder.riesgo;
    }

    // Getters
    public String getComposicion() { return composicion; }
    public String getDurabilidad() { return durabilidad; }
    public String getRiesgo() { return riesgo; }

    @Override
    public void aceptar(Visitor visitante) {

    }

    public static class Builder extends ProductoEuropeo.Builder<Builder> {
        private String composicion;
        private String durabilidad;
        private String riesgo;

        public Builder setComposicion(String composicion) {
            this.composicion = composicion;
            return self();
        }

        public Builder setDurabilidad(String durabilidad) {
            this.durabilidad = durabilidad;
            return self();
        }

        public Builder setRiesgo(String riesgo) {
            this.riesgo = riesgo;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Permanente build() {
            return new Permanente(this);
        }
    }
}
