package module07.question19.ui.client;

import module07.question19.ui.ds.Customer;
import module07.question19.ui.ds.Customers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "backend", url = "http://localhost:8081")
public interface BackendClient {

    @GetMapping("/api/customers")
    ResponseEntity<Customers> getCustomers();

    @PostMapping("/api/customers")
    ResponseEntity<Customer> postCustomer(@RequestBody Customer customer);
}
