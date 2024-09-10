package Veiculos;

class BMW extends Carro {
    public BMW(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro BMW: " + getModelo());
    }
}