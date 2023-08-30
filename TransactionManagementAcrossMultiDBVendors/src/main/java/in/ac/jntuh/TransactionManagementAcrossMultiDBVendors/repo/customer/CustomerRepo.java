package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
