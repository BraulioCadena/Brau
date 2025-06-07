package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Estado;
import com.example.demo.Service.EstadoService;

@RestController
@RequestMapping ("/estado")
public class EstadoREST {
	@Autowired
	private EstadoService estadoService;

	@GetMapping("{idPais}")
	public ResponseEntity<List<Estado>> getAllByPais(@PathVariable long idPais){
	return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
}

}
