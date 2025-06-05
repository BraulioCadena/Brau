package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Pais;
import com.example.demo.Service.PaisService;

@RestController
@RequestMapping ("/pais")
public class PaisREST {
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	private ResponseEntity <List<Pais>> findAllPiases(){
		return ResponseEntity.ok(paisService.findAll());
		   
	}
}
