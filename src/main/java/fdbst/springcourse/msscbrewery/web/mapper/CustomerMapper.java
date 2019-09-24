package fdbst.springcourse.msscbrewery.web.mapper;

import fdbst.springcourse.msscbrewery.domain.Customer;
import fdbst.springcourse.msscbrewery.web.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Interface CustomerMapper
 * 
 * Essa interface ...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOToCustomer(CustomerDTO customerDTO);

}
