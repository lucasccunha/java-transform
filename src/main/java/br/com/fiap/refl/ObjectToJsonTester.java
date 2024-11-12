package br.com.fiap.refl;

import br.com.fiap.ObjectToJson;
import br.com.fiap.Pessoa;

public class ObjectToJsonTester {
    public static void main(String... x) {
        Pessoa pessoa = new  Pessoa(1, "Lucas", "1234");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.transform(pessoa));
    }
}
