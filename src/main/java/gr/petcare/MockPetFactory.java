package gr.petcare;

import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16/4/2016.
 */
public class MockPetFactory {
    private Pet pet;
    public MockPetFactory() {
        this.pet = createPet();
    }
    private Pet createPet() {
        Pet pet = new Pet();
        pet.setPetPhoto("Photo");
        try {
            URL url = new URL("http://i.telegraph.co.uk/multimedia/archive/03119/dog_3119263b.jpg");
            try {
                BufferedImage img = ImageIO.read(url);
                String base64String = null;
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                try {
                    ImageIO.write(img, "jpg", bos);
                    byte[] imageBytes = bos.toByteArray();
                    BASE64Encoder encoder = new BASE64Encoder();
                    base64String = encoder.encode(imageBytes);
                    bos.close();
                    pet.setPetPhoto(base64String);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        pet.setPhone("2321023768");
        pet.setPetName("Fung");
        pet.setContactName("John");
        return pet;
    }
    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<Pet>();
        for (int i=1; i<=10; i++) pets.add(this.pet);
        return pets;
    }
    public Pet getPet(){
        return this.pet;
    }
}
