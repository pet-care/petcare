package gr.petcare;

/**
 * Created by user on 16/4/2016.
 */
public class Pet {
    private String name;
    private String ContactName;
    private String ContactPhone;
    private String photo;
    public String getName() {
        return name;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getContactPhone() {
        return ContactPhone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public void setContactPhone(String contactPhone) {
        ContactPhone = contactPhone;
    }

    public void setPetPhoto(String photo) {
        this.photo = photo;
    }
}
