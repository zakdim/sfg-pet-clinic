package guru.springframework.sfgpetclinic.model;

/**
 * Created by developer on 2021-05-27.
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
