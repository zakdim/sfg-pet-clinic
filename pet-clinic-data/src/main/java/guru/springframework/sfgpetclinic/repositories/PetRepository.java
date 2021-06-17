package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by developer on 2021-06-16.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
