import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descricao curso java");
            curso1.setCargaHoraria(8);
            Curso curso2 = new Curso();
            curso2.setTitulo("Curso JS");
            curso2.setDescricao("Descricao Curso JS");
            curso2.setCargaHoraria(4);
            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("Descricao mentoria Java");
            mentoria.setData(LocalDate.now());
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descricao Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);
            Dev devJuliano = new Dev();
            devJuliano.setNome("Juliano");
            devJuliano.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos Inscritos Juliano: " + devJuliano.getConteudosInscritos());
            devJuliano.progredir();
            devJuliano.progredir();
            System.out.println("-");
            System.out.println("Conteudos Inscritos Juliano: " + devJuliano.getConteudosInscritos());
            System.out.println("Conteudos Concluidos Juliano: " + devJuliano.getConteudosConcluidos());
            System.out.println("XP: " + devJuliano.calcularTotalXp());
            System.out.println("---------------------");
            Dev devPatricia = new Dev();
            devPatricia.setNome("Patricia");
            devPatricia.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos Inscritos Suzana: " + devPatricia.getConteudosInscritos());
            devPatricia.progredir();
            devPatricia.progredir();
            devPatricia.progredir();
            System.out.println("-");
            System.out.println("Conteudos Inscritos Patricia: " + devPatricia.getConteudosInscritos());
            System.out.println("Conteudos Concluidos Patricia: " + devPatricia.getConteudosConcluidos());
            System.out.println("XP: " + devPatricia.calcularTotalXp());
        }
}

