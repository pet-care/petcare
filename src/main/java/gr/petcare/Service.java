package gr.petcare;

/**
 * Created by user on 16/4/2016.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
public class Service {
    String version = "1.0";
    @RequestMapping
    public @ResponseBody String getVersion() {
        return version;
    }
}