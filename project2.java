  import java.util.Scanner; 

    class project2

{ 
    public static void main(String[] args) { 
    Scanner leitor = new Scanner (System.in); 

    double mediaG= 0, no1= 0, no2= 0, faltas = 0; 
    String nome, mensagem; 
    
    System.out.print("Digite o nome do aluno: ");  
    nome = leitor.nextLine(); 

    System.out.print("Digite a nota 1: ");  
    no1 = leitor.nextDouble(); 
    
    System.out.print("Digite a nota 2: ");  
    no2 = leitor.nextDouble(); 

    System.out.print("Digite a quantidade de faltas: ");  
    faltas = leitor.nextDouble(); 
    
    mediaG = (no1 + no2) / 2; 

    if (faltas > 20)  
    mensagem = "Reprovado por faltas"; 

    else if (mediaG < 3) 
    mensagem = "Reprovado por notas"; 
  
    else if ( mediaG >= 3 && mediaG <5) 
    mensagem = "Recuperação"; 

    else if ( mediaG >=5 && mediaG<6) 
    mensagem = "Exame"; 

    else 
    mensagem = "aprovado"; 

    String saida; 
    saida = String.format("A Média final do aluno %s será: %.1f - Status: %s", nome, mediaG, mensagem); 
    System.out.println(saida); 

} 

} 