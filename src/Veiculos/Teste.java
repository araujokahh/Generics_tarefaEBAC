package Veiculos;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new BMW("M3"));
        listaDeCarros.add(new Porsche("911"));
        listaDeCarros.add(new Chevrolet("Camaro"));

        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
        }
    }
}