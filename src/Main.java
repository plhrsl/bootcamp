import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java I", "Introducao a linguagem Java.", 4);
        Curso curso2 = new Curso("Java II", "Aprofundando na linguagem Java.", 6);

        Mentoria mentoria = new Mentoria("Orientacao a Objeto", "Solucionando questoes relacionadas a orientacao a objetos em Java.", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp de desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Maria");
        dev1.increverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getNome() + "\nConteudos inscritos: " + dev1.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.caucularTotalXP());
        dev1.progredir();

        Dev dev2 = new Dev("Joao");
        dev2.increverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println(dev2.getNome() + "\nConteudos inscritos: " + dev2.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.caucularTotalXP());
    }
}
