package guru.springframework.events;

import guru.springframework.web.model.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    private static final long serialVersionUID = 1737265622440031665L;

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
