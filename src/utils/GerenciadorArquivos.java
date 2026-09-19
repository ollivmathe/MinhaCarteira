package utils;

import entities.Transacao;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivos {
    public static void salvarDados(List<Transacao> transacoes) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("transacoes.bin");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(transacoes);
        } catch (IOException e) {
            System.out.printf("Erro ao salvar o arquivo binário: %s\n", e.getMessage());
        }
    }

    public static List<Transacao> carregarDados() {
        try (FileInputStream fileInputStream = new FileInputStream("transacoes.bin");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            List<Transacao> transacoes = (List<Transacao>) objectInputStream.readObject();
            return transacoes;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Não foi possível carregar as informações, uma nova carteira será criada.");
            return new ArrayList<>();
        }
    }

    public static void gerarExtrato(List<Transacao> transacoes) {
        try (FileWriter fileWriter = new FileWriter("extrato.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Transacao t : transacoes) {
                String line = String.format("%s; %.2f; %s;", t.getDescricao(), t.getValor(), t.getData());
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
