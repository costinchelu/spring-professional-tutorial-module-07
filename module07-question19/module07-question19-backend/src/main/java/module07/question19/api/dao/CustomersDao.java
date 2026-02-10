package module07.question19.api.dao;

import module07.question19.api.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
