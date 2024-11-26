import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Alteração aqui: 'Main' -> 'main'
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("******************************");
        System.out.println("* Faculdade UNIFAN             *");
        System.out.println("* Nome do Aluno: ADRIEN DO SANTOS    *");
        System.out.println("* Nome do Professor: Prof. BRENNO *");
        System.out.println("******************************");
        System.out.println("Bem-vindo ao Quiz de Carros!");
        System.out.println("Você responderá 15 perguntas de múltipla escolha.");
        System.out.println("Boa sorte!\n");

        // Array com as 15 questões
        Questao[] questoes = new Questao[15];
        preencherQuestoes(questoes); // Preencher com as questões do tema "Carros"

        int acertos = 0;
        int erros = 0;

        // Loop para exibir e processar as 15 perguntas
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ":");
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Resultado
        double percentualAcertos = ((double) acertos / questoes.length) * 100;
        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Você errou " + erros + " questões.");
        System.out.printf("Sua porcentagem de acertos foi: %.2f%%\n", percentualAcertos);
    }

    // Método para preencher as questões
    private static void preencherQuestoes(Questao[] questoes) {
        questoes[0] = new Questao(
                "Qual é o carro mais vendido no mundo?",
                "A) Toyota Corolla",
                "B) Ford F-Series",
                "C) Honda Civic",
                "D) Volkswagen Golf",
                "E) Chevrolet Silverado",
                "A"
        );

        questoes[1] = new Questao(
                "Qual carro foi considerado o mais rápido em 2020?",
                "A) Bugatti Veyron",
                "B) Koenigsegg Jesko",
                "C) Hennessey Venom GT",
                "D) SSC Tuatara",
                "E) McLaren Speedtail",
                "D"
        );

        questoes[2] = new Questao(
                "Quem é o fabricante do carro modelo Mustang?",
                "A) Chevrolet",
                "B) Ford",
                "C) Dodge",
                "D) Toyota",
                "E) BMW",
                "B"
        );

        questoes[3] = new Questao(
                "Qual é a marca do carro famoso com o logotipo de um cavalo empinado?",
                "A) Chevrolet",
                "B) Ford",
                "C) Ferrari",
                "D) Porsche",
                "E) Lamborghini",
                "B"
        );

        questoes[4] = new Questao(
                "Qual é o nome do carro mais rápido da Ferrari?",
                "A) Ferrari LaFerrari",
                "B) Ferrari F8 Tributo",
                "C) Ferrari 488 Pista",
                "D) Ferrari 812 Superfast",
                "E) Ferrari Portofino",
                "A"
        );

        questoes[5] = new Questao(
                "Em que país a BMW foi fundada?",
                "A) Alemanha",
                "B) Estados Unidos",
                "C) França",
                "D) Japão",
                "E) Itália",
                "A"
        );

        questoes[6] = new Questao(
                "Qual o modelo de carro que é mais associado à marca Tesla?",
                "A) Model X",
                "B) Model 3",
                "C) Model S",
                "D) Model Y",
                "E) Roadster",
                "B"
        );

        questoes[7] = new Questao(
                "Qual foi o primeiro carro híbrido da Toyota?",
                "A) Toyota Prius",
                "B) Toyota Camry Hybrid",
                "C) Toyota RAV4 Hybrid",
                "D) Toyota Yaris Hybrid",
                "E) Toyota Highlander Hybrid",
                "A"
        );

        questoes[8] = new Questao(
                "Qual é o carro mais vendido na história dos Estados Unidos?",
                "A) Honda Accord",
                "B) Ford F-Series",
                "C) Toyota Camry",
                "D) Chevrolet Silverado",
                "E) Dodge Ram",
                "B"
        );

        questoes[9] = new Questao(
                "Qual é o nome do carro que inspirou o filme 'De Volta para o Futuro'?",
                "A) Chevrolet Corvette",
                "B) Ford Mustang",
                "C) DeLorean DMC-12",
                "D) Porsche 911",
                "E) Lamborghini Miura",
                "C"
        );

        questoes[10] = new Questao(
                "Em que ano a Ferrari foi fundada?",
                "A) 1920",
                "B) 1939",
                "C) 1947",
                "D) 1951",
                "E) 1960",
                "C"
        );

        questoes[11] = new Questao(
                "Qual é o maior fabricante de carros do mundo em termos de volume de vendas?",
                "A) Toyota",
                "B) Volkswagen",
                "C) Ford",
                "D) General Motors",
                "E) Honda",
                "A"
        );

        questoes[12] = new Questao(
                "Qual carro foi o primeiro a ultrapassar 400 km/h?",
                "A) Bugatti Veyron",
                "B) Koenigsegg Agera RS",
                "C) McLaren F1",
                "D) SSC Tuatara",
                "E) Hennessey Venom GT",
                "B"
        );

        questoes[13] = new Questao(
                "Qual é o carro mais vendido do Brasil?",
                "A) Chevrolet Onix",
                "B) Volkswagen Gol",
                "C) Fiat Uno",
                "D) Toyota Corolla",
                "E) Honda Civic",
                "A"
        );

        questoes[14] = new Questao(
                "Qual é o carro mais caro já produzido?",
                "A) Bugatti La Voiture Noire",
                "B) Rolls-Royce Sweptail",
                "C) Lamborghini Veneno",
                "D) Ferrari 250 GTO",
                "E) McLaren Speedtail",
                "B"
        );
    }
}
