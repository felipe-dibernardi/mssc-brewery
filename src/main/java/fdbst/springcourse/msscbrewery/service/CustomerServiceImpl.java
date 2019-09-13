package fdbst.springcourse.msscbrewery.service;

import fdbst.springcourse.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Classe CustomerServiceImpl
 * 
 * Essa classe ...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Felipe Di Bernardi")
                .build();
    }

    @Override
    public CustomerDTO save(CustomerDTO customer) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID id, CustomerDTO customer) {
        //TODO: implement update
    }

    @Override
    public void delete(UUID id) {
        log.debug("Deleting a customer...");
        //TODO: implement delete
    }
}
