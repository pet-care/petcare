package gr.petcare;

/**
 * Created by user on 16/4/2016.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Service {
    private String  version = "1.0";

    @RequestMapping("/version")
    public String getVersion() {
        return version;
    }

    @RequestMapping("/mock-pet")
    public Pet getPet() {
        MockPetFactory petFactory = new MockPetFactory();
        petFactory.getPet();
        return  petFactory.getPet();


    }

}