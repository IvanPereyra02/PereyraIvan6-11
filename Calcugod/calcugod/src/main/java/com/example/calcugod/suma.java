package com.example.calcugod;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class suma {

    private Integer numero1 = 8;
    private Integer numero2= 8;
    private Integer suma = numero1 + numero2;

    @GetMapping("/calc")

    public Integer calc(){
        return  getSuma();
    }
}
