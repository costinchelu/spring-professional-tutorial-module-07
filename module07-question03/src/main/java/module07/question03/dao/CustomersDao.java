package module07.question03.dao;

import module07.question03.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
