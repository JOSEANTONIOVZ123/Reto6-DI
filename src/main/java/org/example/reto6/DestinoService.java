package org.example.reto6;

import org.example.reto6.Destino;
import org.example.reto6.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;

    // Listar todos los destinos
    public List<Destino> obtenerTodos() {
        return destinoRepository.findAll();
    }

    // Obtener un destino por ID
    public Optional<Destino> obtenerPorId(String id) {
        return destinoRepository.findById(id);
    }

    // Guardar un nuevo destino
    public Destino guardarDestino(Destino destino) {
        return destinoRepository.save(destino);
    }

    public void eliminarDestino(String id) {
        destinoRepository.deleteById(id);
    }

}
