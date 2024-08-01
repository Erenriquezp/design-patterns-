package main.java.fabrica;

import main.java.productos.*;

import java.util.Date;

public class ProductoFactory {

   public static Producto crearProductoPermanente(String nombre, double precio, String tipo, Date fechaCaducidad,
                                                  int numeroLote, Date fechaFabricacion, String paisOrigen,
                                                  String normaFabricacion, String composicion, String durabilidad,
                                                  String riesgo) {
      return new Permanente.Builder()
              .setNombre(nombre)
              .setPrecio(precio)
              .setTipo(tipo)
              .setFechaCaducidad(fechaCaducidad)
              .setNumeroLote(numeroLote)
              .setFechaFabricacion(fechaFabricacion)
              .setPaisOrigen(paisOrigen)
              .setNormaFabricacion(normaFabricacion)
              .setComposicion(composicion)
              .setDurabilidad(durabilidad)
              .setRiesgo(riesgo)
              .build();
   }

   public static Producto crearProductoSemiPermanente(String nombre, double precio, String tipo, Date fechaCaducidad,
                                                      int numeroLote, Date fechaFabricacion, String paisOrigen,
                                                      String normaFabricacion, String tiempoVidaUtil) {
      return new SemiPermanente.Builder()
              .setNombre(nombre)
              .setPrecio(precio)
              .setTipo(tipo)
              .setFechaCaducidad(fechaCaducidad)
              .setNumeroLote(numeroLote)
              .setFechaFabricacion(fechaFabricacion)
              .setPaisOrigen(paisOrigen)
              .setNormaFabricacion(normaFabricacion)
              .setTiempoVidaUtil(tiempoVidaUtil)
              .build();
   }

   public static Producto crearProductoAsiatico(String nombre, double precio, String tipo, Date fechaCaducidad,
                                                int numeroLote, Date fechaFabricacion, String paisOrigen,
                                                String tipoPiel, String subtipo) {
      return new ProductoAsiatico.Builder()
              .setNombre(nombre)
              .setPrecio(precio)
              .setTipo(tipo)
              .setFechaCaducidad(fechaCaducidad)
              .setNumeroLote(numeroLote)
              .setFechaFabricacion(fechaFabricacion)
              .setPaisOrigen(paisOrigen)
              .setTipoPiel(tipoPiel)
              .setSubtipo(subtipo)
              .build();
   }
   public static Producto ProductoAmericano(String nombre, double precio, String tipo, Date fechaCaducidad,
                                    int numeroLote, Date fechaFabricacion, String paisOrigen,
                                    String codigoSupervision, String advertencias) {
      return new ProductoAmericano.Builder()
              .setNombre(nombre)
              .setPrecio(precio)
              .setTipo(tipo)
              .setFechaCaducidad(fechaCaducidad)
              .setNumeroLote(numeroLote)
              .setFechaFabricacion(fechaFabricacion)
              .setPaisOrigen(paisOrigen)
              .setCodigoSupervision(codigoSupervision)
              .setAdvertencias(advertencias)
              .build();
   }

}
