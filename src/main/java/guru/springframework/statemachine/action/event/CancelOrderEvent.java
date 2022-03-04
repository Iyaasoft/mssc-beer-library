package guru.springframework.statemachine.action.event;

import guru.springframework.web.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
public class CancelOrderEvent {
    static final long serialVersionUID = -6894292001060220258L;
    BeerOrderDto beerOrderDto;
}
