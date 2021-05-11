package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by developer on 2021-05-10.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
