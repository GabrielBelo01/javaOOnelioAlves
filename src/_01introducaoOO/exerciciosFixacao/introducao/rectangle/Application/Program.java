package exerciciosFixacao.introducao.rectangle.Application;

import exerciciosFixacao.introducao.rectangle.entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.Width = 3.00;
        rectangle.Height = 4.00;

        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " + rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());

    }
}

