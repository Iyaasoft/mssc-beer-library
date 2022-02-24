package guru.springframework.services.validate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BeerOrderValidationResult {

    private UUID beerOrderId;
    private boolean isValid;
}
