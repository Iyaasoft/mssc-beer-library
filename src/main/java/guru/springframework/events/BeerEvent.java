package guru.springframework.events;

import guru.springframework.web.model.BeerDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 4400143800131311761L;

    private BeerDto beerDto;

    public BeerEvent(BeerDto beerDto) {
        this.beerDto = beerDto;
    }
}
