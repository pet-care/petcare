package gr.petcare;

/**
 * Created by user on 16/4/2016.
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Service {
    private String  version = "1.0";
    private List<Pet> pets= new ArrayList<Pet>();
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

    @RequestMapping("/mock-pets")
    public List<Pet> getPets() {
        MockPetFactory petFactory = new MockPetFactory();
        this.pets = petFactory.getPets();
        return this.pets;
    }
    @RequestMapping("/new/pet", method = RequestMethod.POST)
    public ResponseEntity<Pet> createPet(@RequestBody @Valid final Pet pet) {
        this.pets.add(pet);
        return null;

    }

}