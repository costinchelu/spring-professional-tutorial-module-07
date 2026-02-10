package module07.question15.service;

import module07.question15.entity.Customer;
import module07.question15.ds.Statistics;
import org.springframework.stereotype.Service;

@Service
public class CustomerStatisticsService {

    public Statistics calculateStatistics(Customer customer) {
        int codeLength = customer.getCode().length();
        int firstNameLength = customer.getFirstName().length();
        int lastNameLength = customer.getLastName().length();

        return new Statistics(
                codeLength + firstNameLength + lastNameLength,
                codeLength, firstNameLength, lastNameLength
        );
    }
}
