package controle_fluxo.estruturas_repeticao;

public class ExemploForArray {

        public static void main(String[] args) {
            //Em array o indice inicia com zero
            String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

            /*for (int x=0; x < alunos.length; x++) {
                System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
            }*/

            //Forma abreviada
            for(String aluno : alunos) {
                System.out.println("Nome do aluno é: " + aluno);
            }

        }
    }

