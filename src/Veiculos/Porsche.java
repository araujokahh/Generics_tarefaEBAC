package Veiculos;

class Porsche extends Carro {
    public Porsche(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro Porsche: " + getModelo());
    }
}