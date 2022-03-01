package guru.springframework.services.messages;

import guru.springframework.web.model.BeerOrderDto;
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
public class AllocateOrderResult implements Serializable {
    static final long serialVersionUID = 1152702851760060652L;
    BeerOrderDto beerOrder;
    boolean allocated;
    boolean allocationError;
}
