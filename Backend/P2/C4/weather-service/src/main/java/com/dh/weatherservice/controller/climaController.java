package com.dh.weatherservice.controller;
import com.dh.weatherservice.service.ClimaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class climaController {

    private final ClimaService climaService;

    public climaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/weather")
    public String getClima(){
        return climaService.tempratura();
    }


}
