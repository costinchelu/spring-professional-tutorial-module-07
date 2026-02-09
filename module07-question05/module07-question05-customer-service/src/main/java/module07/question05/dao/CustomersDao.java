package module07.question05.dao;

import module07.question05.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
