package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by developer on 2021-06-16.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
