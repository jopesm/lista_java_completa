package lista_java_completa;

import javax.swing.JOptionPane;

import lista_java_completa.Aluno;

public class exercicio20 {
    
    public static Aluno criarCopia(Aluno alunoOriginal) {
        
        Aluno copiaAluno = new Aluno(alunoOriginal.getNome(), alunoOriginal.getNota());
        return copiaAluno;
    }

    public static void main(String[] args) {
        
        String nomeUsuario = JOptionPane.showInputDialog("Digite o nome do aluno:");
        double notaUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));

        
        Aluno alunoOriginal = new Aluno(nomeUsuario, notaUsuario);

        
        Aluno copiaAluno = criarCopia(alunoOriginal);

        
        JOptionPane.showMessageDialog(null, "Cópia: Nome = " + copiaAluno.getNome() + ", Nota = " + copiaAluno.getNota());

        
        copiaAluno.setNota(9.0);

        
        JOptionPane.showMessageDialog(null, "Cópia modificada: Nome = " + copiaAluno.getNome() + ", Nota = " + copiaAluno.getNota());
        JOptionPane.showMessageDialog(null, "Objeto original: Nome = " + alunoOriginal.getNome() + ", Nota = " + alunoOriginal.getNota());
    }
}
