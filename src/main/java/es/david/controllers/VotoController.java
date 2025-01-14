package es.david.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.david.dto.VotoDto;
import es.david.entities.Voto;
import es.david.services.VotoService;

@RestController
@RequestMapping("/votos")
public class VotoController {
	
	private VotoService votoService;
	
	public VotoController(VotoService votoService) {
		this.votoService = votoService;
	}
	
	@GetMapping
	public List<Voto> listarVotos(){
		return votoService.listarVotos();
	}
	
	@PostMapping
	public Voto crearVoto(@RequestBody VotoDto votoNuevo) {
		
		return votoService.crearVoto(votoNuevo);
		
	}

}
