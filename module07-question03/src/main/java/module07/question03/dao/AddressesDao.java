package module07.question03.dao;

import module07.question03.ds.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressesDao extends CrudRepository<Address, Integer> {
}
