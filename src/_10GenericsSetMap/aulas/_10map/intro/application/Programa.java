package _10GenericsSetMap.aulas._10map.intro.application;

import java.util.Map;
import java.util.TreeMap;

public class Programa {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99711133");

        // verifica se tem uma chave
        System.out.println("Existe a chave 'phone': " + cookies.containsKey("phone"));

        //verifica qual o valor/conteudo apartir de uma chave
        System.out.println("Numero de telefone: " + cookies.get("phone"));

        // quando o elemento não existe o metodo retorna nulo
        System.out.println("Email: " + cookies.get("email"));

        //retorna o tamanho do map
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("TODOS OS COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }




    }
}
