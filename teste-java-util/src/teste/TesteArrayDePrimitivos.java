package teste;

import modelo.Array;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        Array array = new Array();

        int [] testeArray = array.preencheArray();
        array.imprimeArray(testeArray);
    }
}
