package _05enumeracoesComposicao.aulas.composicaoPost.programa;

import _05enumeracoesComposicao.aulas.composicaoPost.classes.Comentario;
import _05enumeracoesComposicao.aulas.composicaoPost.classes.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem!!");
        Comentario c2 = new Comentario("Isso é demais!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Vou ir conhecer esse pais maravilhoso",
                12);
        p1.addComentario(c1);
        p1.addComentario(c2);


        System.out.println(p1);







    }
}
