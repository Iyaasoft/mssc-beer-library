package guru.springframework.statemachine.action.event;

import guru.springframework.web.model.BeerOrderDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
public class ValidateOrderEvent implements Serializable  {

    static final long serialVersionUID = -1503817867171053513L;
    BeerOrderDto beerOrderDto;
}
