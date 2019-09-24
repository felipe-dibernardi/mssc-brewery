package fdbst.springcourse.msscbrewery.web.mapper;

import fdbst.springcourse.msscbrewery.domain.Beer;
import fdbst.springcourse.msscbrewery.web.model.v2.BeerDTOV2;
import org.mapstruct.Mapper;

/**
 * Interface BeerMapper
 * 
 * Essa interface ...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTOV2 beerToBeerDTO(Beer beer);

    Beer beerDTOToBeer(BeerDTOV2 beerDTO);

}
