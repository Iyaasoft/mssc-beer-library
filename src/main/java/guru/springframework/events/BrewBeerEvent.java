package guru.springframework.events;

import guru.springframework.web.model.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent{

    private static final long serialVersionUID = -1325635929695275743L;

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
