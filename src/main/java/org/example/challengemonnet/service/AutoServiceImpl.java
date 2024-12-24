package org.example.challengemonnet.service;

import lombok.NoArgsConstructor;
import org.example.challengemonnet.enums.Dia;
import org.example.challengemonnet.modos.ModoAuto;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class AutoServiceImpl implements AutoService {
    @Override
    public String manejar(String dia) {
        try {
            Dia diaModo = Dia.fromString(dia);
            ModoAuto modoAuto = diaModo.getModo();
            return modoAuto.manejar();
        } catch (IllegalArgumentException e){
            //TODO: lanzar una excepcion personalizada usando tambien un ExceptionHandler
            return String.format("El dia %s no tiene configurado ningun modo de manejo", dia);
        }
    }
}
