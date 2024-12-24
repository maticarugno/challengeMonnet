package org.example.challengemonnet.modos;

public class ModoAgenteSecreto implements ModoAuto{
    @Override
    public String manejar() {
        String respuesta = activarCamuflaje();
        respuesta += usarArmas();
        return respuesta + "Manjando como agente secreto";
    }

    private String activarCamuflaje(){
        return "Camuflaje activado...\n";
    }

    private String usarArmas(){
        return "Usando armas...\n";
    }
}
