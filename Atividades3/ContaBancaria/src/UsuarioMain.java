public class UsuarioMain {
    public static void main(String[] args) {
        Usuario user = new Usuario();

        user.titular = "Maia";
        user.setSaldo(9840);
        user.setNumeroConta(123);

        System.out.println("Numero da conta: " + user.getNumeroConta());
        System.out.println("Saldo: " + user.getSaldo());
        System.out.println("Titular: " + user.titular);

        user.setSaldo(5225);
        System.out.println("Novo saldo: " + user.getSaldo());
    }
}
