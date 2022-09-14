import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int multiplier = 7;
        Random rand = new Random();
        Matrix A = new Matrix(2, 2);
        Matrix B = new Matrix(2, 2);

        for(int i = 0; i < A.line; i++)
        {
            for(int j = 0; j < A.column; j++)
            {
                A.mas[i][j] = rand.nextInt(4,6);
                B.mas[i][j] = rand.nextInt(4,5);
            }
        }

        System.out.println("Матрица А");
        A.Print();
        System.out.println("Матрица Б");
        B.Print();
        System.out.println("Сложение двух матриц");
        Matrix cAd = Matrix.Addition(A, B);
        cAd.Print();
        System.out.println("Умножение матрицы на число");
        Matrix cMul = Matrix.Multiplication(A, multiplier);
        cMul.Print();

    }
}