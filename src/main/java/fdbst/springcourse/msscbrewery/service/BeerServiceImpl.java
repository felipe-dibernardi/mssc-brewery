package fdbst.springcourse.msscbrewery.service;

import fdbst.springcourse.msscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Classe BeerServiceImpl
 * <p>
 * Essa classe é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDTO save(BeerDTO beer) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID id, BeerDTO beer) {
        //TODO: real implementation of update method
    }

    @Override
    public void delete(UUID id) {
        log.debug("Deleting a beer...");
        //TODO: real implementation of update method
    }
}
