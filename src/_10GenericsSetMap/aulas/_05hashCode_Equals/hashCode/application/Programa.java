package _10GenericsSetMap.aulas._05hashCode_Equals.hashCode.application;

import _10GenericsSetMap.aulas._05hashCode_Equals.hashCode.entites.Cliente;

public class Programa {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Maria","Maria@gmail.com");
        Cliente c2 = new Cliente("Maria","Maria@gmail.com");



        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);

    }
}
