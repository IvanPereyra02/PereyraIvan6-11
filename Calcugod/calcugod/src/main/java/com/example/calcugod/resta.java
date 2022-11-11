package com.example.calcugod;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class resta {

    private Integer numero1 = 16;
    private Integer numero2= 8;
    private Integer resta = numero1 - numero2;

    @GetMapping("/resta")

    public Integer calc(){
        return  getResta();
    }
}
