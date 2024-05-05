package br.com.descomplica.atividade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.descomplica.atividade.entity.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@GetMapping
	public ResponseEntity<List<Aluno>> getAll(){
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Joao", 20));
		alunos.add(new Aluno("Pedro", 22));
		alunos.add(new Aluno("Maria", 40));
		alunos.add(new Aluno("Jose", 50));
		alunos.add(new Aluno("Lucas", 16));
		
		return new ResponseEntity<>(alunos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> getById(@PathVariable Integer id) {
		if(id == 1)
			return new ResponseEntity<>(new Aluno("Admin", 999), HttpStatus.OK); 
		else 
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);		
	}

}
