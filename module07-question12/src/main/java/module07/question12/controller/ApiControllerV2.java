package module07.question12.controller;

import lombok.AllArgsConstructor;
import module07.question12.dao.AddressesDao;
import module07.question12.dao.CustomersDao;
import module07.question12.ds.Address;
import module07.question12.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@AllArgsConstructor
@Controller
@RequestMapping("/api/v2")
public class ApiControllerV2 {

    private CustomersDao customersDao;

    private AddressesDao addressesDao;

    // curl localhost:8080/api/v2/customers |jq
    @GetMapping("customers")
    @ResponseBody
    public Iterable<Customer> listCustomers() {
        return customersDao.findAll();
    }

    // curl localhost:8080/api/v2/addresses |jq
    @GetMapping("addresses")
    @ResponseBody
    public Iterable<Address> listAddresses() {
        return addressesDao.findAll();
    }
}
