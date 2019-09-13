package fdbst.springcourse.msscbrewery.web.controller;

import fdbst.springcourse.msscbrewery.web.model.BeerDTO;
import fdbst.springcourse.msscbrewery.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Classe BeerController
 * <p>
 * Essa classe é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDTO beer) {
        BeerDTO savedBeer = beerService.save(beer);

        HttpHeaders headers = new HttpHeaders();
        //TODO: add hostname to URL
        headers.add("Location", "/api/v1/beer/" + savedBeer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("id") UUID id, @RequestBody BeerDTO beer) {
        beerService.update(id, beer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("id") UUID id) {
        beerService.delete(id);
    }

}
