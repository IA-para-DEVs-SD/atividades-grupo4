package br.com.conectatalentos.conectatalentos.controller;

import br.com.conectatalentos.conectatalentos.model.Vaga;
import br.com.conectatalentos.conectatalentos.repository.VagaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
@RequiredArgsConstructor
public class VagaController {

    private final VagaRepository vagaRepository;

    @GetMapping
    public List<Vaga> listarTodas() {
        return vagaRepository.findAll();
    }

    @PostMapping
    @SuppressWarnings("null")
    public ResponseEntity<Vaga> criar(@Valid @RequestBody Vaga vaga) {
        return ResponseEntity.status(HttpStatus.CREATED).body(vagaRepository.save(vaga));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (!vagaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        vagaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
