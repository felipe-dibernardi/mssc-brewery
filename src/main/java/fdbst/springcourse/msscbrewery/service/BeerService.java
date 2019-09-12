package fdbst.springcourse.msscbrewery.service;

import fdbst.springcourse.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

/**
 * Interface BeerService
 * <p>
 * Essa intereface é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
