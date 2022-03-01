package guru.springframework.statemachine.action.event;

import guru.springframework.web.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ValidateOrderEvent implements Serializable  {

    static final long serialVersionUID = -1503817867171053513L;
    BeerOrderDto beerOrderDto;
}
