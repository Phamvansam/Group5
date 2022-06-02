package com.vti.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.position.PositionDTO;
import com.vti.entity.Position;
import com.vti.service.position.IPositionService;

@RestController
@RequestMapping(value = "api/v1/positions")
public class PositionController {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IPositionService service;

	@GetMapping()
	public List<PositionDTO> getAllPositions() {


		List<Position> entities = service.getAllPositions();
		
		// convert entities --> dtos
		List<PositionDTO> dtos = modelMapper.map(entities, new TypeToken<List<PositionDTO>>() {
		}.getType());
		
		return dtos;
	}

//	@GetMapping(value = "/{id}")
//	public Position getPositionByID(@PathVariable(name = "id") int id) {
//		return service.getPositionByID(id);
//	}
//
//	@PostMapping()
//	public void createPosition(@RequestBody PositionForm form) {
//		service.createPosition(form.toEntity());
//	}
//
//	@PutMapping(value = "/{id}")
//	public void updatePosition(@PathVariable(name = "id") int id, @RequestBody PositionForm form) {
//		Position Position = form.toEntity();
//		Position.setId(id);
//		service.updatePosition(Position);
//	}
//
//	@DeleteMapping(value = "/{id}")
//	public void deletePosition(@PathVariable(name = "id") int id) {
//		service.deletePosition(id);
//	}
}
