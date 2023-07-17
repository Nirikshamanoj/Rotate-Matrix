import java.util.Scanner;
public class RotateMatrix {
    static void rotationOfMatrix(int[][] A,int row,int column)
    {
        int temp=0;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if(i<j)
                {
                    temp=A[i][j];
                    A[i][j]=A[j][i];
                    A[j][i]=temp;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int A[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        rotationOfMatrix(A,r,c);
    }
}
