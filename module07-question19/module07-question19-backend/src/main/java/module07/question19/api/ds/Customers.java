package module07.question19.api.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import module07.question19.api.entity.Customer;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {

    private List<Customer> customers;

    public Customers(Spliterator<Customer> spliterator) {
        customers = StreamSupport.stream(spliterator, false)
                .collect(Collectors.toList());
    }
}
