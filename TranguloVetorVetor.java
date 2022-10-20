import java.util.Scanner;
public class TranguloVetorVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Importação do Scanner
        
        String interacao = "Olá, esse programa foi desenvolvido para dizer qual é o tipo do seu triângulo"; // dá boas vindas ao usuário
        String[] textos = {"Digite o lado: ", "O triângulo é ", "equilátero", "isósceles", "escaleno", "Não é possível formar um triângulo!"}; // Vetor tem 5 string's começando pelo vetor 0
        double[] lados = new double[3]; // vetor que cria 3 váriaveis de número 
        
        System.out.println(interacao); // Dá boas vindas ao usuário
        
        for (int i = 0; i < lados.length; i++){
            System.out.println(textos[0] + (i+1)); // vai falar o texto[0] e vai somando +1 até chegar no vetor
            lados[i] = in.nextDouble(); // vai criar uma variável a cada lado que o usuário digitar no console
        }
        
        int pos = 0; // Cria o valor em 0 pois ele vai ser alterado pelo maior valor
        
        for (int i = 1; i < lados.length; i++){
            if(lados[i]>lados[pos]){ // Verifica se o tamanho de lados é maior que a quantidade lados
                pos = i; 
            }
        }
        
        double total = 0; // Declaração de um novo double 
        
        for (int i = 0; i < lados.length; i++){
            if(i != pos){ // Se cont é diferente de pos
                total = total + lados[i]; // valor total é a soma do total + os lados
            }
        }
        
        if(total>lados[pos]){
            if(lados[0] == lados[1] && lados[1] == lados[2]){ // Verifica se todos os lados são iguais
                System.out.println(textos[1] + textos[2]); // Se todos os lados são iguais ele é equilátero
            }
            else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados [2]){ // Verifica se pelo menos um lado é igual ao outro
                System.out.println(textos[1] + textos[3]); // Se um lado é igual ao outro ele é Isósceles
            }
            else { // Se ele não é nenhum acima, ele obrigatóriamente vai ser isso
                System.out.println(textos[1] + textos[4]);  // Se ele for nada, ele obrigatóriamente vai ser escaleno
            }
        }
        else{ // Se não der para formar um triângulo, automáticamente não será possivel formar um triângulo
            System.out.println(textos[5]); // vai avisar ao usuáruio que não é possível formar um triângulo
        }
    }
}