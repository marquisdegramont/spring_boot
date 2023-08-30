package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Customer;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.repo.beer.BeerRepo;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.repo.customer.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;

	@Autowired
	private BeerRepo bRepo;

	public long getTotalCustomers() {
		return repo.count();
	}

	public void save(final Customer customer) {
		repo.save(customer);
	}

	public List<Customer> findAll() {
		return repo.findAll();
	}
}
