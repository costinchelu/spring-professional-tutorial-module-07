package module07.question12.controller;

import lombok.AllArgsConstructor;
import module07.question12.annotation.RestEndpoint;
import module07.question12.dao.AddressesDao;
import module07.question12.dao.CustomersDao;
import module07.question12.ds.Address;
import module07.question12.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@RestEndpoint
@RequestMapping("/api/v4")
public class ApiControllerV4 {

    private CustomersDao customersDao;

    private AddressesDao addressesDao;

    // curl localhost:8080/api/v4/customers |jq
    @GetMapping("customers")
    public Iterable<Customer> listCustomers() {
        return customersDao.findAll();
    }

    // curl localhost:8080/api/v4/addresses |jq
    @GetMapping("addresses")
    public Iterable<Address> listAddresses() {
        return addressesDao.findAll();
    }
}
