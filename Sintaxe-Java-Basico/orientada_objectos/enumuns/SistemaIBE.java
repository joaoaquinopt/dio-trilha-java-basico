package orientada_objectos.enumuns;

public class SistemaIBE {

    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}
