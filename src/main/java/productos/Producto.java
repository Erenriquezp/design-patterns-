package main.java.productos;

import main.java.visitantes.Visitor;
import java.util.Date;

abstract public class Producto {
    protected final String nombre;
    protected final double precio;
    protected final String tipo;
    protected final Date fechaCaducidad;
    protected final int numeroLote;

    protected Producto(Builder<?> builder) {
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.tipo = builder.tipo;
        this.fechaCaducidad = builder.fechaCaducidad;
        this.numeroLote = builder.numeroLote;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public abstract void aceptar(Visitor visitante);

    public abstract static class Builder<T extends Builder<T>> {
        private String nombre;
        private double precio;
        private String tipo;
        private Date fechaCaducidad;
        private int numeroLote;

        public T setNombre(String nombre) {
            this.nombre = nombre;
            return self();
        }

        public T setPrecio(double precio) {
            this.precio = precio;
            return self();
        }

        public T setTipo(String tipo) {
            this.tipo = tipo;
            return self();
        }

        public T setFechaCaducidad(Date fechaCaducidad) {
            this.fechaCaducidad = fechaCaducidad;
            return self();
        }

        public T setNumeroLote(int numeroLote) {
            this.numeroLote = numeroLote;
            return self();
        }

        protected abstract T self();

        public abstract Producto build();
    }
}
