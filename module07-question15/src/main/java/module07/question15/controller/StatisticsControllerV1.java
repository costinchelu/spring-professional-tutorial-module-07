package module07.question15.controller;

import module07.question15.entity.Customer;
import module07.question15.ds.CustomerStatistics;
import module07.question15.service.CustomerStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatisticsControllerV1 {

    @Autowired
    private CustomerStatisticsService customerStatisticsService;

    // we have a @Controller (not @RestController) and in order to return a serializable response (just model), we will use @ResponseBody
    // Usually we should use @RestController (that will include @ResponseBody also)

    // curl -v -X POST -H 'Content-Type: application/json' -d '{ "code": "CS", "firstName": "Christine", "lastName": "Smart" }' http://localhost:8080/api/v1/calculateStatistics
    @PostMapping("/api/v1/calculateStatistics")
    @ResponseBody
    public CustomerStatistics getStatistics(@RequestBody Customer customer) {
        return new CustomerStatistics(
                customer,
                customerStatisticsService.calculateStatistics(customer)
        );
    }
}
