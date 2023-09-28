public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente de Vendas");
        gerente.setSalario(4500.0);
        gerente.setLogin("gerentevendas123");
        gerente.setSenha("senha456");

        Telefonista telefonista = new Telefonista();
        telefonista.setNome("Telefonista 2");
        telefonista.setSalario(1600.0);
        telefonista.setCodigoEstacao(102);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria 2");
        secretaria.setSalario(2000.0);
        secretaria.setNumeroRamal(203);

        System.out.println("Gerente: " + gerente.getNome() + ", Login: " + gerente.getLogin());
        System.out.println("Telefonista: " + telefonista.getNome() + ", Código de Estação: " + telefonista.getCodigoEstacao());
        System.out.println("Secretaria: " + secretaria.getNome() + ", Número de Ramal: " + secretaria.getNumeroRamal());
    }
}