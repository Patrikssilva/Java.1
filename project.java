import java.util.Scanner; 

    class project 

{ 
    public static void main(String[] args) { 
    Scanner leitor = new Scanner (System.in); 
    
    double a, b, c; 
    String tipo = null; 

    System.out.print("Digite o lado A:");  
    a = leitor.nextDouble(); 

     System.out.print("Digite o lado B:");  
    b = leitor.nextDouble(); 
    
    System.out.print("Digite o lado C:");  
    c = leitor.nextDouble(); 
    
    if ( (a == b && a != c) || (a == c && a != b) || (b == c && c != a) ) 
    tipo = "O tipo de triângulo é um Isósceles!"; 
  
    else if ((a == b && b == c )) 
    tipo = "O triangulo é equilátero"; 

    else if ((a!=b && a!=c && b!=c)) 
    tipo = "O triangulo é escaleno"; 

    else if ((a>=b) || (b>=c) || (a>=c)) 
    tipo = "não é um triangulo"; 

    String saida; 
    saida = String.format("%s", tipo); 
    System.out.println (saida); 

} } 

 