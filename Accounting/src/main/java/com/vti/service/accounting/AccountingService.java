package com.vti.service.accounting;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Accounting;
import com.vti.repository.IAccountingRepository;

@Service
public class AccountingService implements IAccountingService {

	@Autowired
	private IAccountingRepository repository;

	public List<Accounting> getAllAccountings() {
		return repository.findAll();
	}

	public Accounting getAccountingByID(int id) {
		return repository.findById(id).get();
	}

//	public void createAccounting(Accounting accounting) {
//		repository.save(accounting);
//	}
//
//	public void updateAccounting(Accounting accounting) {
//		repository.save(accounting);
//	}
//
//	public void deleteAccounting(int id) {
//		repository.deleteById(id);
//	}
//
//	public boolean isAccountingExistsByID(int id) {
//		return repository.existsById(id);
//	}

}
