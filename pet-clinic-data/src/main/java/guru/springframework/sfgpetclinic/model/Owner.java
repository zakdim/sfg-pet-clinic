package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by developer on 2021-05-09.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
