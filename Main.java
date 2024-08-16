package Challenge.ProjetoChallenge.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dicionário de perguntas e respostas
        Map<String, String> respostasChatbot = new HashMap<>();
        respostasChatbot.put("ola", "Olá! Como posso te ajudar hoje?");
        respostasChatbot.put("como voce esta", "Sou apenas um programa, mas estou funcionando bem! E você?");
        respostasChatbot.put("qual e o seu nome", "Sou um chatbot simples criado em Java.");
        respostasChatbot.put("o que voce pode fazer", "Posso responder a perguntas básicas e conversar com você.");
        respostasChatbot.put("tchau", "Até logo! Tenha um ótimo dia!");

        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao ChatBot Java! Inicie uma conversa digitando algo.");

        while (true) {
            // Entrada do usuário
            System.out.print("Você: ");
            String entradaUsuario = scanner.nextLine().toLowerCase();

            // Verifica se o chatbot conhece a resposta
            if (respostasChatbot.containsKey(entradaUsuario)) {
                // Resposta do chatbot
                String resposta = respostasChatbot.get(entradaUsuario);
                System.out.println("ChatBot: " + resposta);

                // Encerra a conversa se o usuário disser "tchau"
                if (entradaUsuario.equals("tchau")) {
                    break;
                }
            } else {
                System.out.println("ChatBot: Desculpe, eu não entendo isso.");
            }
        }

        scanner.close();
    }
}

