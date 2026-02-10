package module07.question13.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerCriteria {
    private String firstNameLike;

    @SuppressWarnings("unused")
    public CustomerCriteria() {
    }
}
