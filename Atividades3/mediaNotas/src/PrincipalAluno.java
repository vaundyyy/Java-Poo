public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rodolfo", 6.4,8.0,8.6);
        Aluno aluno2 = new Aluno("Ana", 9.2, 7.5,10.0);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
    }
}
