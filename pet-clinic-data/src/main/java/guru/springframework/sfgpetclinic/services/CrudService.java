package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by developer on 2021-05-11.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
