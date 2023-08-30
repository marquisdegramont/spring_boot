package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.repo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.model.Beer;

@Repository
public interface BeerRepo extends JpaRepository<Beer, Integer> {

}
