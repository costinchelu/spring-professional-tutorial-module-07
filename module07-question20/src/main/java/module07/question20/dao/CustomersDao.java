package module07.question20.dao;

import module07.question20.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersDao extends CrudRepository<Customer, Integer> {

    List<Customer> findByFirstNameLike(String firstNamePattern);
}
