package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    static void main(String[] args) {
        double totalValue = 30000;
        double installmentAmount = 30000;

        for (int parcela = (int) installmentAmount; parcela >= 1; parcela--) {
            installmentAmount = totalValue / parcela;
            if (installmentAmount < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + installmentAmount);
        }
    }
}
