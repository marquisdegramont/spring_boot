package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Beer;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Customer;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.repo.beer.BeerRepo;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.repo.customer.CustomerRepo;

@Service
public class BeerService {

	@Autowired
	private BeerRepo beerRepo;

	@Autowired
	private CustomerRepo customerRepo;

	public long getTotalBeers() {
		return beerRepo.count();
	}

	public void save(final Beer beer) {
		beerRepo.save(beer);
	}

	@Transactional(value = "chainedTransactionManager", rollbackFor = java.lang.Exception.class)
	public List<Beer> finalAll() {

		Beer beer = new Beer();
		beer.setMalt("fgshdkfgh");
		beer.setName("sfdghjkldgl");
		beer.setStyle("fghskdfghk");
		beerRepo.save(beer);

		Customer customer = new Customer();
		customer.setAge(22);
		customer.setFullName("jhfgkjhskdg");
		customer.setGender("m");
		customer.setPhoneNumber("7702295645");
		customerRepo.save(customer);

		// repo.delete();

		return beerRepo.findAll();
	}
}
