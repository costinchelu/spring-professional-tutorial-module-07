package module07.question06.dao;

import module07.question06.ds.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressesDao extends CrudRepository<Address, Integer> {
}
