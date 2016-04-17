package gr.petcare;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.math.BigDecimal;
/**
 * Created by user on 16/4/2016.
 */
@Entity
@Table(name = "Offers")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long Id;
    @Size(max = 64)
    private String name;
    @NotNull
    @Size(max = 64)
    private String ContactName;
    @NotNull
    @Size(max = 64)
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
