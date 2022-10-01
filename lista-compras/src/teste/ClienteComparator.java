package teste;

import modelo.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClienteComparator {


    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        cliente.setCodigo("0001");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rodrigo");
        cliente1.setCodigo("0008");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana");
        cliente2.setCodigo("0015");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Joao");
        cliente3.setCodigo("0016");

        clientes.add(cliente);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);



        clientes.forEach(cliente11 -> System.out.println(cliente11.getNome() + ", Codigo: " + cliente11.getCodigo()));
        System.out.println(" ------------------------ ");
//        Comparator<Cliente> clienteComparator = new Comparator<Cliente>() {
//            @Override
//            public int compare(Cliente cliente1, Cliente cliente2) {
//                return cliente1.getNome().compareTo(cliente2.getNome());
//            }
//        };

         clientes.sort((cliente11,cliente12) -> cliente11.getCodigo().compareTo(cliente12.getCodigo()));
         clientes.sort((cliente11,cliente12) -> cliente11.getNome().compareTo(cliente12.getNome()));

         clientes.forEach(cliente11 -> System.out.println(cliente11.getNome() + ", Codigo: " + cliente11.getCodigo()));

//         clientes.forEach(cliente11 -> {
//                 System.out.println(cliente11.getNome() + ", Codigo: " + cliente11.getCodigo());
//                 cliente11.setCpf("5465465");
//                    });



    }



}

//class NomeClienteComparator implements Comparator<Cliente> {
//
//    @Override
//    public int compare(Cliente cliente1, Cliente cliente2) {
//        return cliente1.getNome().compareTo(cliente2.getNome());
//    }
//}