import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição do curso de Java");
        curso.setCargaHoraria(12);
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de teste");
        mentoria.setDescricao("Teste de monitoria");
        mentoria.setData(LocalDate.of(2022, 07, 30));
        System.out.println(mentoria);
    }
}
