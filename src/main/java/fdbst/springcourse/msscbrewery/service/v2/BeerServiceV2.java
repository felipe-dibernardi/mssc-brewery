package fdbst.springcourse.msscbrewery.service.v2;

import fdbst.springcourse.msscbrewery.web.model.v2.BeerDTOV2;

import java.util.UUID;

/**
 * Interface BeerServiceV2
 * <p>
 * Essa intereface é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
public interface BeerServiceV2 {

    BeerDTOV2 getBeerById(UUID beerId);

    BeerDTOV2 saveNewBeer(BeerDTOV2 beerDto);

    void updateBeer(UUID beerId, BeerDTOV2 beerDto);

    void deleteById(UUID beerId);
}
