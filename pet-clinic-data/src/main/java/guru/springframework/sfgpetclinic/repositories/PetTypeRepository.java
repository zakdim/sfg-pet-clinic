package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by developer on 2021-06-16.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
