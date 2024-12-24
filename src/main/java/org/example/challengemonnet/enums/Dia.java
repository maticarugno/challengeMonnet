package org.example.challengemonnet.enums;

import org.example.challengemonnet.modos.*;

public enum Dia {
    LUNES(new ModoTrabajo()),
    MARTES(new ModoCarrera()),
    MIERCOLES(new ModoOffRoad()),
    JUEVES(new ModoOffRoad()),
    VIERNES(new ModoAgenteSecreto());

    private final ModoAuto modo;

    Dia(ModoAuto modo) {
        this.modo = modo;
    }

    public ModoAuto getModo() {
        return modo;
    }

    public static Dia fromString(String dia) {
        return Dia.valueOf(dia.toUpperCase());
    }
}
