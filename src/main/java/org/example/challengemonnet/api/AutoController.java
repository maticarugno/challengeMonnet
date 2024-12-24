package org.example.challengemonnet.api;

import lombok.AllArgsConstructor;
import org.example.challengemonnet.service.AutoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AutoController implements AutoApi {

    private final AutoService autoService;

    @Override
    public String manejar(String dia) {
        return autoService.manejar(dia);
    }
}
