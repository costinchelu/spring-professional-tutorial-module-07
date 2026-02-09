package module07.question05.dao;

import module07.question05.ds.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressesDao extends CrudRepository<Address, Integer> {
}
