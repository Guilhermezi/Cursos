package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Consdição ValorParcela >= 1000
    static void main(String[] args) {
        double totalValue = 30000;
        double installmentAmount = 1;

        for (int parcela = 1; parcela <= totalValue; parcela++) {
            installmentAmount = totalValue / parcela;
            if (installmentAmount < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + installmentAmount);
        }

    }
}
