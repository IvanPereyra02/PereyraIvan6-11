package com.example.calcugod;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class division {

    private Integer numero1 = 64;
    private Integer numero2= 8;
    private Integer division = numero1 / numero2;

    @GetMapping("/div")

    public Integer calc(){
        return  getDivision();
    }
}
