package Reproductor;

public class Cancion {
   private String ubicacion;
   private String nombre_cancion;
   private String nombre_archivo;

    public Cancion(String ubicacion, String nombre_cancion) {
        this.ubicacion = ubicacion;
        this.nombre_cancion = nombre_cancion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }
}
