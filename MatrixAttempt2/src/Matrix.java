public class Matrix
{
    int line;
    int column;
    int[][] mas;

    public Matrix(int lineE, int columnN)
    {
        line = lineE;
        column = columnN;
        mas = new int[lineE][columnN];
    }
   //Сложение
   public static Matrix Addition(Matrix A, Matrix B)
   {
       Matrix C = new Matrix(A.line, A.column);
       for(int i = 0; i < A.line; i++)
       {
           for(int j = 0; j < A.column; j++)
           {
               C.mas[i][j] = A.mas[i][j] + B.mas[i][j];
           }
       }
       return C;
   }
   //Умножение
   public static Matrix Multiplication(Matrix A, int multiplier)
   {
       Matrix C = new Matrix(A.line, A.column);
       for(int i = 0; i < A.line; i++)
       {
           for(int j = 0; j < A.column; j++)
           {
               C.mas[i][j] = (A.mas[i][j] * multiplier);
           }
       }
       return C;
   }
   //Вывод на печать
   public void Print()
   {
       for(int i = 0; i < line; i++)
       {
           for(int j = 0; j < column; j++)
           {
               System.out.print("\t" + mas[i][j]);
           }
       }
       System.out.println();
   }
}
