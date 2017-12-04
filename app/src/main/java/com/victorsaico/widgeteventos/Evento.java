package com.victorsaico.widgeteventos;

/**
 * Created by JARVIS on 4/12/2017.
 */

public class Evento {
    private String fecha;
    private String mensaje;
    private Integer id;


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "fecha='" + fecha + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", id=" + id +
                '}';
    }
}
