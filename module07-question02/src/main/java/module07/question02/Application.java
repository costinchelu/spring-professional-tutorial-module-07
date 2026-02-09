package module07.question02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    // we have no controllers but having spring-boot-starter-data-rest dependency will provide us with links (generated automatically by the Spring Data REST)
    // also no schema is needed because dependency spring-boot-starter-data-jpa is creating it based on the entities

    // Visit http://localhost:8080/ in browser to navigate through REST Service
    // curl -X GET http://localhost:8080/customers |jq
    // curl -X GET http://localhost:8080/customers/1 |jq
    // curl -X GET http://localhost:8080/customers/1/addresses |jq
    // curl -X GET http://localhost:8080/customers/1/addresses/1 |jq

    // adding an address and associating it with a customer is a 2-step process:
    // fist add the address in the addresses table and then associate it with a PUT operation with header: -H "Content-Type: text/uri-list"
    // curl -X POST -H 'Content-Type: application/json' -d '{ "addressName": "Apartment Address", "streetNumber": 3551, "streetName": "Maple Lane", "aptNumber": 4, "city": "Huntsville", "state": "AL", "zipCode": "35816" }' http://localhost:8080/addresses |jq
    // curl -i -X PUT -H "Content-Type: text/uri-list" -d 'http://localhost:8080/customers/1' http://localhost:8080/addresses/7/customer
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
