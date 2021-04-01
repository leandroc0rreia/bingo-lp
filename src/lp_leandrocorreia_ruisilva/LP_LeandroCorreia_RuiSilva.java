public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tamanho;

        System.out.print("Insira o tamanho da tabela ");
        tamanho = scn.nextInt();

        int[][] duasPos = new int[tamanho][tamanho];

        for (int a = 0; a < duasPos.length; a++){
            for(int b = 0; b < duasPos.length; b++){
                System.out.print("Insira um numero para a posição " + a + "x" + b + " da tabela ");
                duasPos[a][b]= scn.nextInt();
            }
        }

        for (int[] colunas : duasPos){
            for (int i : colunas) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}