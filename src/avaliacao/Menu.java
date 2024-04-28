package avaliacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Menu {
    public static void main(String[] args) {
    	 List<Atleta> listaDeAtletas = new ArrayList<>();
    	 listaDeAtletas.add(new Atleta("123456789", "Joao", "Joãozinho", "2000-01-01", 0));
         listaDeAtletas.add(new Atleta("987654321", "Maria", "Mariinha", "1995-05-10", 100));
         listaDeAtletas.add(new Atleta("555666777", "José", "Zé", "1998-12-25", 50));
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("digite:");
            System.out.println("1. Opcao 1");
            System.out.println("2. Opcao 2");
            System.out.println("3. Opcao 3");
            System.out.println("4. Opcao 4");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Voce escolheu a opcao 1.");
                    
                    listaDeAtletas.sort(Comparator.comparing(Atleta::getNome));
                    
                    listarAtletas(listaDeAtletas);
                    
                    break;
                case 2:
                    System.out.println("Voce escolheu a opcao 2.");
                    System.out.println("digite o telefone:");
                    String fone = scanner.next();
                    System.out.println("digite o nome:");
                    String nome = scanner.next();
                    System.out.println("digite o apelido");
                    String apelido = scanner.next();
                    System.out.println("digite a data de nascimento");
                    String dataNasc = scanner.next();
                    System.out.println("digite a pontuacao");
                    int pontuacao = scanner.nextInt();
                    
                    cadastrarAtleta(fone, nome, apelido, dataNasc, pontuacao, listaDeAtletas);
                    
                    break;
                case 3:
                    System.out.println("Voce escolheu a opcao 3.");
                    nome = scanner.next();
                    
                    listarAtletas(procurarAtletaPeloNome(listaDeAtletas, nome));
                    
                    break;
                case 4:
                    System.out.println("Voce escolheu a opcao 4");
                    fone = scanner.next();
                    
                    removerAtleta(fone,listaDeAtletas);
                    
                    break;
                case 5:
                	System.out.println("saindo do programa");
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (escolha != 5);

        scanner.close();
    }
    public static void listarAtletas(List<Atleta> listaDeAtletas) {
        System.out.println("Lista de Atletas:");
        for (Atleta atleta : listaDeAtletas) {
        	
            System.out.println("Fone: " + atleta.getFone());
            System.out.println("Nome: " + atleta.getNome());
            System.out.println("Apelido: " + atleta.getApelido());
            System.out.println("Data de Nascimento: " + atleta.getDataNascimento());
            System.out.println("Pontuação Acumulada: " + atleta.getPontuacaoAcumulada());
            System.out.println();
        }
    }
    public static void cadastrarAtleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada,List<Atleta> listaDeAtletas) {
        
        Atleta novoAtleta = new Atleta(fone, nome, apelido, dataNascimento, pontuacaoAcumulada);
        if(!listaDeAtletas.contains(novoAtleta)) {
        listaDeAtletas.add(novoAtleta);
        System.out.println(novoAtleta.apelido+" cadastrado");
        }
        else {
        	System.out.println("telefone ja cadastrado");
        }
        
    }
    public static List<Atleta> procurarAtletaPeloNome(List<Atleta> listaDeAtletas, String nome) {
        List<Atleta> atletasEncontrados = new ArrayList<>();
        
        for (Atleta atleta : listaDeAtletas) {
            if (atleta.getNome().equalsIgnoreCase(nome)) {
                atletasEncontrados.add(atleta);
            }
        }
        if(atletasEncontrados.size()>0) {
        	return atletasEncontrados;
        }
        else {
        	for (Atleta atleta : listaDeAtletas) {
                if (atleta.getApelido().equalsIgnoreCase(nome)) {
                    atletasEncontrados.add(atleta);
                }
            }
        	if(atletasEncontrados.size()<=0) {
        		System.out.println("Atleta não encontrado");
        		return null;
        	}
        	else {
        		return atletasEncontrados;
        	}
        }
    }
    
    public static void removerAtleta(String fone, List<Atleta> listaDeAtletas) {
    	List<Atleta> atletasParaRemover = new ArrayList<>();
    	for (Atleta atleta : listaDeAtletas) {
            if (atleta.getFone().equalsIgnoreCase(fone)) {
                atletasParaRemover.add(atleta);
                
            }
        }
    	listaDeAtletas.removeAll(atletasParaRemover);
    	
    	
    }
    
}
    
