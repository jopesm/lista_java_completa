package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio03 {

    public static void main(String[] args) {

        String opcao;
        String[] vetor_tarefas = new String[100]; 
        int i = 0;

        JOptionPane.showMessageDialog(null, "Comandos disponíveis:\r\n"
                + "- \"adicionar\" para adicionar uma nova tarefa\r\n"
                + "- \"listar\" para listar as tarefas\r\n"
                + "- \"concluir\" para marcar uma tarefa como concluída\r\n"
                + "- \"sair\" para sair do programa");

        opcao = JOptionPane.showInputDialog("Digite um comando");

        while (!opcao.equals("sair")) {

            if (opcao.equals("adicionar")) {
                vetor_tarefas[i] = JOptionPane.showInputDialog("Digite uma tarefa");
                JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
                i = i + 1;
            } else if (opcao.equals("listar")) {
                StringBuilder listaTarefas = new StringBuilder("Lista de Tarefas:\n");
                for (int j = 0; j < i; j++) {
                    listaTarefas.append(j + 1).append(". ").append(vetor_tarefas[j]).append("\n");
                }
                JOptionPane.showMessageDialog(null, listaTarefas.toString());
            } else if (opcao.equals("concluir")) {
                int indiceConcluir = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída"));
                if (indiceConcluir > 0 && indiceConcluir <= i) {
                    JOptionPane.showMessageDialog(null, "Tarefa \"" + vetor_tarefas[indiceConcluir - 1] + "\" concluída!");
                } else {
                    JOptionPane.showMessageDialog(null, "Número de tarefa inválido!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            }

            opcao = JOptionPane.showInputDialog("Digite um comando");
        }
    }
}
