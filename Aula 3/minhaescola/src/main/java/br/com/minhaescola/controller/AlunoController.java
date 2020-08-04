package br.com.minhaescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.minhaescola.model.AlunoModel;
import br.com.minhaescola.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<AlunoModel>> buscarAlunos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AlunoModel> buscarId(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<AlunoModel> postarAluno(@RequestBody AlunoModel aluno){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<AlunoModel> editarAluno(@RequestBody AlunoModel aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void deletarAluno(@PathVariable long id){
		repository.deleteById(id);
	}
}








