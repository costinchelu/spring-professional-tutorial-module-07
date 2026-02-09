package module07.question04.dao;

import module07.question04.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
