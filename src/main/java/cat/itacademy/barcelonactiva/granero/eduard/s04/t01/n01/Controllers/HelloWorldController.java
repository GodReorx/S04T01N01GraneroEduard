package cat.itacademy.barcelonactiva.granero.eduard.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String sayHi(@RequestParam(value="name", defaultValue = "UNKNOWN") String name){
        return "Hola " + name + ". Estas ejecutando un projecto Maven";
    }
    @RequestMapping( value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String sayHi2(@PathVariable(required = false) String name){
        return "Hola " + name + ". Estas ejecutando un projecto Maven";
    }
}
