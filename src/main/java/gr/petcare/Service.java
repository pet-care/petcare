package gr.petcare;

/**
 * Created by user on 16/4/2016.
 */

import gr.petcare.dao.PetDao;
import org.springframework.beans.factory.annotation.Autowired;
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
    private List<Pet> userPets= new ArrayList<Pet>();
    private List<Pet> pets = new ArrayList<Pet>();
    @Autowired
    private PetDao petDao;
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
    public List<Pet> getMockPets() {
        List<Pet> pets= new ArrayList<Pet>();
        MockPetFactory petFactory = new MockPetFactory();
        pets = petFactory.getPets();
        return pets;
    }
    @RequestMapping(value = "/new/pet", method = RequestMethod.POST)
    public ResponseEntity<Pet> createPet(@RequestBody @Valid final Pet pet) {
        this.userPets.add(pet);
        return null;
    }
    @RequestMapping("/user-pets")
    public List<Pet> getUserPets() {
        return userPets;
    }
    @RequestMapping("/get/all")
    public  List<Pet> getAllPets() {
        pets = new ArrayList<Pet>();
        if (petDao.getPetCount() <= 50) pets = petDao.getAll();
        else pets = petDao.getAll();
        return pets;
    }




}