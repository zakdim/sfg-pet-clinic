package guru.springframework.sfgpetclinic;

/**
 * Created by developer on 2021-05-09.
 */
public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
