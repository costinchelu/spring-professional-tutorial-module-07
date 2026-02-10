package module07.question20.ds;

import lombok.Data;
import lombok.NoArgsConstructor;
import module07.question20.entity.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@NoArgsConstructor
public class Customers {

    private List<Customer> customers = new LinkedList<>();

    public Customers(Iterable<Customer> customers) {
        this.customers = StreamSupport.stream(customers.spliterator(), false)
                .collect(Collectors.toList());
    }
}
