package fdbst.springcourse.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Classe CustomerDTO
 * 
 * Essa classe ...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private UUID id;

    private String name;

}
