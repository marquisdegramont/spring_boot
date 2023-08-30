package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Beer;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Customer;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.service.BeerService;
import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.service.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CommonCtrl {

	@Autowired
	private BeerService beerService;
	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/beers")
	public ResponseEntity<List<Beer>> findAllBeers() {
		System.out.println("Coming");
		final List<Beer> beers = beerService.finalAll();
		for (Beer b : beers) {
			System.out.println(b.toString());
		}
		return new ResponseEntity<>(beers, HttpStatus.OK);
	}

	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> findAllCustomer() {
		final List<Customer> customers = customerService.findAll();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}
}
