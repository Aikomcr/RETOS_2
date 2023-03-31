
public class reto_3{
    public static void main(String[] args) {

        char[][] matriz_calculadora = new char[5][4];
         
        matriz_calculadora[0] = new char [] {'1','2','3'};
        matriz_calculadora[1] = new char [] {'4','5','6'};
        matriz_calculadora[2] = new char [] {'7','8','9'};
        matriz_calculadora[3] = new char [] {'0','x','+'};
        matriz_calculadora[4] = new char [] {'-','/','='};

        for(int i=0; i < matriz_calculadora.length; i++) {
            System.out.print("|");
            for(int j=0; j < matriz_calculadora[i].length; j++) {
                System.out.printf("%-3s",matriz_calculadora[i][j] +"");
            }
            System.out.println("|");
        }

       }
}

