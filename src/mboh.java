
import java.util.Scanner;

public class mboh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 1,angka,i,j;
        do{
            if(menu<=0 | menu>4){//proteksi
                System.out.printf("Input Salah\n");
                System.out.printf("\n");
            }
            System.out.printf("Tugas Pemrograman Java\n");
            System.out.printf("1. Calculator Matriks\n");
            System.out.printf("2. Oddities\n");
            System.out.printf("3. Dice Game\n");
            System.out.printf("4. Exit\n");
            System.out.printf("Pilihan: ");menu=scan.nextInt();
            switch(menu){
                case 1: //matrix
                    System.out.printf("\n");
                    System.out.printf("====Menu 1: Calculator Matriks====\n");
                    int[][]A=new int[2][2];
                    int[][]B=new int[2][2];
                    int[][]C=new int[2][2];
                    
                    System.out.printf("Matriks A\n");//inputA
                    for (i = 0; i < 2; i++) {
                        for (j = 0; j < 2; j++) {
                            System.out.printf("Masukkan matriks A elemen "+i+","+j+" :");
                            A[i][j]=scan.nextInt();
                        }
                    }
                    
                    System.out.printf("\n");
                    System.out.printf("Matriks B\n");//inputB
                    for (i = 0; i < 2; i++) {
                        for (j = 0; j < 2; j++) {
                            System.out.printf("Masukkan matriks B elemen "+i+","+j+" :");
                            B[i][j]=scan.nextInt();
                        }
                    }
                    
                    System.out.printf("\n");//outputA
                    System.out.printf("Matriks A\n");
                    for (i = 0; i < 2; i++) {
                        System.out.printf("| ");
                        for (j = 0; j < 2; j++) {
                            System.out.printf(A[i][j]+" ");
                        }
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    
                    System.out.printf("\n");//outputB
                    System.out.printf("Matriks B\n");
                    for (i = 0; i < 2; i++) {
                        System.out.printf("| ");
                        for (j = 0; j < 2; j++) {
                        
                            System.out.printf(B[i][j]+" ");
                        }
                        System.out.printf("|");
                        System.out.printf("\n");   
                    }
                    
                    System.out.printf("\n");//A+B
                    System.out.printf("A+B\n");
                    for (i = 0; i < 2; i++) {
                        System.out.printf("| ");
                        for (j = 0; j < 2; j++) {
                            System.out.printf(A[i][j]+B[i][j]+" ");
                        }
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    
                    System.out.printf("\n");//A-B
                    System.out.printf("A-B\n");
                    for (i = 0; i < 2; i++) {
                        System.out.printf("| ");
                        for (j = 0; j < 2; j++) {
                            System.out.printf(A[i][j]-B[i][j]+" ");
                        }
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    
                    System.out.printf("\n");//A*B
                    System.out.printf("A*B\n");
                    for (i = 0; i < 2; i++) {
                        System.out.printf("| ");
                        for (j = 0;  j< 2; j++) {//baris*kolom
                            C[0][0]=(A[0][0]*B[0][0])+(A[0][1]*B[1][0]);
                            C[0][1]=(A[0][0]*B[0][1])+(A[0][1]*B[1][1]);
                            C[1][0]=(A[1][0]*B[0][0])+(A[1][1]*B[1][0]);
                            C[1][1]=(A[1][0]*B[0][1])+(A[1][1]*B[1][1]);
                            System.out.printf(C[i][j]+" ");     
                        }
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");break;
                
                case 2: //ganjilgenap
                    System.out.printf("\n");
                    System.out.printf("====Menu 2: Oddities====\n");
                    System.out.printf("Masukkan jumlah test-case: ");angka=scan.nextInt();
                    int[]asw=new int[angka];
                    for (i = 1; i <= angka; i++) {
                        System.out.printf("Angka "+i+": ");asw[i-1]=scan.nextInt();
                    }
                    for (i = 1; i <=angka; i++) {                   
                        if (asw[i-1]%2==0){
                            System.out.printf("Testcase #"+i+" : even\n");//genap
                        }
                        else{
                            System.out.printf("Testcase #"+i+" : odd\n");//ganjil
                        }                    
                    }
                    System.out.printf("\n");break;
                
                case 3: //dadu
                    int ronde;
                    System.out.printf("\n");
                    System.out.printf("====Menu 3: Dice Game====\n");
                    System.out.printf("Masukkan jumlah test-case: ");angka=scan.nextInt();//testcase
                    int []thjo=new int[angka];//sebanyak angka
                    int []thju=new int[angka];//sebanyak angka
                    for (i=1; i <=angka; i++) {
                        int totaljojo=0,totaljuan=0;
                        System.out.printf("\n");
                        System.out.printf("Test-case #"+i+"\n");
                        System.out.printf("Masukkan jumlah ronde: ");ronde=scan.nextInt();//ronde
                        for (j=1; j <=ronde; j++) {
                            int[][] sumjojo=new int[i][j];//[angka][ronde]
                            int[][] sumjuan=new int[i][j];//[angka][ronde]
                            System.out.printf("Ronde #"+j+"\n");
                            System.out.printf("Masukkan Angka Dadu Jojo: ");sumjojo[i-1][j-1]=scan.nextInt();//dadu jojo per ronde                                                                     
                            System.out.printf("Masukkan Angka Dadu Juan: ");sumjuan[i-1][j-1]=scan.nextInt();//dadu juan per ronde
                            totaljojo=totaljojo+sumjojo[i-1][j-1];//total dadu jojo
                            totaljuan=totaljuan+sumjuan[i-1][j-1];//total dadu juan
                        }
                        thjo[i-1]=totaljojo;//variabel baru jojo
                        thju[i-1]=totaljuan;//variabel baru juan                          
                    }
                    for (i = 1; i <=angka; i++) {//jo,ju,tie
                        if(thjo[i-1]>thju[i-1]){
                            System.out.printf("Testcase #"+i+" : Jojo Win\n");
                        }else if(thjo[i-1]<thju[i-1]){
                            System.out.printf("Testcase #"+i+" : Juan Win\n");
                        }else{
                            System.out.printf("Testcase #"+i+" : Tie\n");
                        }
                    }
                }System.out.printf("\n");
        }while(menu!=4);
    }
}
