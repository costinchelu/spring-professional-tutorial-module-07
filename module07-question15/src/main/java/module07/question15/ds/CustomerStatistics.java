package module07.question15.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import module07.question15.entity.Customer;

@AllArgsConstructor
@Getter
@ToString
public class CustomerStatistics {

    private Customer customer;

    private Statistics statistics;
}
