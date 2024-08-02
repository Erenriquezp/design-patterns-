package main.java.productos;

import main.java.visitantes.Visitor;

public class SemiPermanente extends ProductoEuropeo {
    private final String tiempoVidaUtil;

    private SemiPermanente(Builder builder) {
        super(builder);
        this.tiempoVidaUtil = builder.tiempoVidaUtil;
    }

    // Getters
    public String getTiempoVidaUtil() { return tiempoVidaUtil; }

    @Override
    public void aceptar(Visitor visitante) {
       // visitante.visitar(this);
    }

    public static class Builder extends ProductoEuropeo.Builder<Builder> {
        private String tiempoVidaUtil;

        public Builder setTiempoVidaUtil(String tiempoVidaUtil) {
            this.tiempoVidaUtil = tiempoVidaUtil;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SemiPermanente build() {
            return new SemiPermanente(this);
        }
    }
}
