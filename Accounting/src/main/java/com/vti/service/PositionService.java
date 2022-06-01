package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Position;
import com.vti.repository.IPositionRepository;

@Service
public class PositionService implements IPositionService {

	@Autowired
	private IPositionRepository repository;

	public List<Position> getAllPositions() {
		return repository.findAll();
	}

//	public Position getPositionByID(int id) {
//		return repository.findById(id).get();
//	}
//
//	public void createPosition(Position Position) {
//		repository.save(Position);
//	}
//
//	public void updatePosition(Position Position) {
//		repository.save(Position);
//	}
//
//	public void deletePosition(int id) {
//		repository.deleteById(id);
//	}
//
//	public boolean isPositionExistsByID(int id) {
//		return repository.existsById(id);
//	}

}
