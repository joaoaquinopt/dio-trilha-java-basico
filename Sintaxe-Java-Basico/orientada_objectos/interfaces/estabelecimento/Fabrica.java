package orientada_objectos.interfaces.estabelecimento;

import orientada_objectos.interfaces.equipamentos.copiadora.Copiadora;
import orientada_objectos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import orientada_objectos.interfaces.equipamentos.impressora.Deskjet;
import orientada_objectos.interfaces.equipamentos.impressora.Impressora;
import orientada_objectos.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }

}
