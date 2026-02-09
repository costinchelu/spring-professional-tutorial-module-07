package module07.question02.dao;

import module07.question02.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
