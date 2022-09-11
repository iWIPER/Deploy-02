package co.develhope.deploy2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    //return 2 random integers
    @GetMapping("/sum")
    public double sum(){

        Double number1 = 1 + Math.random();
        Double number2 = 2 + Math.random();
        return number1*number2;
    }
}
