import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "introducao a linguagem Java.", 300);
        Mentoria mentoria1 = new Mentoria("Orientacao a Objeto", "solucionando questoes relacionadas a orientacao a objetos em Java", LocalDate.now());
        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}
