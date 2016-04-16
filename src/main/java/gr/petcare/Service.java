package gr.petcare;

/**
 * Created by user on 16/4/2016.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import gr.petcare.Pet;

@RestController

public class Service {
    String version = "1.0";

    @RequestMapping("/version")
    public @ResponseBody String getVersion() {
        return version;
    }

    @RequestMapping("/pet")
    public @ResponseBody String getPet() {
        Pet pet = new Pet();
        pet.setPetPhoto("Photo");
        pet.setContactPhone("2321023768");
        pet.setPetName("Fung");
        pet.setContactName("John");


        return pet.toString();
    }

}