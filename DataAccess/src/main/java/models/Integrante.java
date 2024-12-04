
package models;

/**
 *
 * @author angelsn
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Integrante {
    private String nombre;
    private String apellido;
    private String rol;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida; 
    private boolean estadoActivo;

    public Integrante() {}

    public Integrante(String nombre, String apellido, String rol, LocalDate fechaIngreso, LocalDate fechaSalida, boolean estadoActivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoActivo = estadoActivo;
    }

    // Constructor que parsea las fechas desde String
    public Integrante(String nombre, String apellido, String rol, String fechaIngreso, String fechaSalida, boolean estadoActivo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaIngreso = LocalDate.parse(fechaIngreso, formatter);
        this.fechaSalida = fechaSalida != null && !fechaSalida.isEmpty() 
            ? LocalDate.parse(fechaSalida, formatter) 
            : null;
        this.estadoActivo = estadoActivo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    
}
