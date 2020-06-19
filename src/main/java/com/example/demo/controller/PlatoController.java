package com.example.demo.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Plato;

import com.example.demo.service.PlatoService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
		RequestMethod.PUT })
@RequestMapping(path = "api/v1/plato")
public class PlatoController extends BaseController<Plato, PlatoService> {
	@Autowired
	private PlatoService platoService;

	@GetMapping("/byCategoria")
	@Transactional
	public ResponseEntity<?> getSelect(@RequestParam(value = "categoria") String categoria) {

		try {

			return ResponseEntity.status(HttpStatus.OK).body(platoService.findByCategoria(categoria));

		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("{\"The consultation was unsuccessful\": \"" + e.getMessage() + "\"}");
		}

	}
}
