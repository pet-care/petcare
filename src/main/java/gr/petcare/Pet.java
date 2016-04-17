package gr.petcare;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

/**
 * Created by user on 16/4/2016.
 */
@Entity
@Table(name = "Pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Size(max = 64)
    private String name;
    @NotNull
    @Size(max = 64)
    private String ContactName;
    @NotNull
    @Size(max = 64)
    private String phone;
    @Column(length = 65535,columnDefinition="Text")
    private String photo;
    public String getName() {
        return name;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getPhone() {
        return phone;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPetPhoto(String photo) {
        this.photo = photo;
    }
}
