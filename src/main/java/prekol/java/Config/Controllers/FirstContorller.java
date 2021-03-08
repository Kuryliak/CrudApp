package prekol.java.Config.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstContorller {
    @GetMapping("")
    public String helloPage(){
        return "second/hello";
    }

   @GetMapping("/youtube")
   public String go(){return "second/youtube";}
}
