package org.example.challengemonnet.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auto")
public interface AutoApi {
    @GetMapping("/manejarDia/{dia}")
    String manejar(@PathVariable String dia);
}
