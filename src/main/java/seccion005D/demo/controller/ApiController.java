package seccion005D.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestController
@RequestMapping("/api/v1")
public class ApiController {
    @GetMapping("/saludo")
    public String hola() {
        return "HOLA";
    }

}
