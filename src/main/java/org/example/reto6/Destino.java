package org.example.reto6;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "destinos")
public class Destino {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private String pais;

    // Constructor vacío
    public Destino() {}

    // Constructor con parámetros
    public Destino(String nombre, String descripcion, String pais) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pais = pais;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
}
