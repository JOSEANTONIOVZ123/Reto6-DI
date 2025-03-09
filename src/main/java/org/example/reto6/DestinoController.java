package org.example.reto6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/destinos")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    // Página con la lista de destinos
    @GetMapping
    public String listarDestinos(Model model) {
        model.addAttribute("destinos", destinoService.obtenerTodos());
        return "listaDestinos"; // Thymeleaf renderiza listaDestinos.html
    }

    // Página de detalles de un destino
    @GetMapping("/{id}")
    public String detalleDestino(@PathVariable String id, Model model) {
        Optional<Destino> destino = destinoService.obtenerPorId(id);
        model.addAttribute("destino", destino.orElse(null));
        return "detalleDestino"; // Thymeleaf renderiza detalleDestino.html
    }

    // Página del formulario para agregar un nuevo destino
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("destino", new Destino());
        return "formDestino"; // Thymeleaf renderiza formDestino.html
    }

    // Procesar formulario y guardar destino
    @PostMapping("/guardar")
    public String guardarDestino(@ModelAttribute Destino destino) {
        destinoService.guardarDestino(destino);
        return "redirect:/destinos"; // Redirige a la lista de destinos después de guardar
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarDestino(@PathVariable String id) {
        destinoService.eliminarDestino(id);
        return "redirect:/destinos";
    }

}
