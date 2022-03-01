package guru.springframework.statemachine.action.event;

import guru.springframework.web.model.BeerOrderDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
public class AllocateOrderEvent implements Serializable {
    static final long serialVersionUID = -6894292001060220258L;
    BeerOrderDto beerOrderDto;
}
