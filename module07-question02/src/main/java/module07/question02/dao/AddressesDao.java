package module07.question02.dao;

import module07.question02.ds.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressesDao extends CrudRepository<Address, Integer> {
}
