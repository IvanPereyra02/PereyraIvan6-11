package com.example.calcugod;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class multi {

    private Integer numero1 = 8;
    private Integer numero2= 8;
    private Integer multi = numero1 * numero2;

    @GetMapping("/multi")

    public Integer calc(){
        return  getMulti();
    }
}
