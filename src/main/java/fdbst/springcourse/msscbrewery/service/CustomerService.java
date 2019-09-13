package fdbst.springcourse.msscbrewery.service;

import fdbst.springcourse.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

/**
 * Interface CustomerService
 * 
 * Essa interface ...
 *
 * @author Felipe Di Bernardi S Thiago
 */
public interface CustomerService {

    CustomerDTO getCustomerById(UUID id);

    CustomerDTO save(CustomerDTO customer);

    void update(UUID id, CustomerDTO customer);

    void delete(UUID id);
}
