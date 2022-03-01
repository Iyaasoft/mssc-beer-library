package guru.springframework.services.messages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@ToString
public class BeerOrderValidationResult implements Serializable {

    static final long serialVersionUID = -6961509388223848004L;
    private UUID beerOrderId;
    private boolean isValid;
}
