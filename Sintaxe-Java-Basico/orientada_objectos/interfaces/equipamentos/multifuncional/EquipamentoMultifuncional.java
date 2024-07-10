package orientada_objectos.interfaces.equipamentos.multifuncional;

import orientada_objectos.interfaces.equipamentos.copiadora.Copiadora;
import orientada_objectos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import orientada_objectos.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {


    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");

    }
}
