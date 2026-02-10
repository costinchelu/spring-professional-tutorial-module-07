package module07.question20.entity;

import lombok.NoArgsConstructor;
import module07.question20.jpa.Identifiable;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements Identifiable {

    @Id
    @GenericGenerator(name = "assigned-identity", strategy = "module07.question20.jpa.AssignedIdentityGenerator")
    @GeneratedValue(generator = "assigned-identity", strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 5, message = "Code must have length of 2 - 5 characters")
    @Pattern(regexp = "[A-Za-z]*", message = "Code contains illegal characters")
    private String code;

    @NotBlank(message = "First name cannot be empty")
    @Pattern(regexp = "[A-Za-z-']*", message = "First name contains illegal characters")
    private String firstName;

    @NotBlank(message = "Last name cannot be empty")
    @Pattern(regexp = "[A-Za-z-']*", message = "Last name contains illegal characters")
    private String lastName;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
