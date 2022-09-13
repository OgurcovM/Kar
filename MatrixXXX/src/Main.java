import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("matrix.txt");

        Matrix a = new Matrix(4, 4);
        a.fillRandom();
        a.print("A (Рандомная матрицв)");
        a.toFile(fw, "A (Рандомная матрица)");

        Matrix b = new Matrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        b.print("B (Известная матрица)");
        b.toFile(fw, "B (Известная матрица)");

        Matrix c = a.add(b);
        c.print("C = A + B");
        c.toFile(fw, "C = A + B");

        Matrix d = c.multiply(2);
        d.print("D = C * 2");
        d.toFile(fw, "D = C * 2");

        Matrix m = c.divide(2);
        m.print("M = C / 2");
        m.toFile(fw, "M = C / 2");

        Matrix e = c.multiply(d);
        e.print("E = C * D");
        e.toFile(fw, "E = C * D");

        fw.close();
    }
}
