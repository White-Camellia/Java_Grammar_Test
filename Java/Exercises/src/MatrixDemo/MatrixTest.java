package MatrixDemo;

public class MatrixTest {
    public static void main(String[] args) {
//使用三元组表示稀疏矩阵并使用快速转置算法
        MatrixByTriset test = new MatrixByTriset();
        test.addELem(new TripleSet(1, 2,10));
        test.addELem(new TripleSet(1, 3,20));
        test.addELem(new TripleSet(2, 2,30));
        test.addELem(new TripleSet(2, 3,40));
        test.addELem(new TripleSet(2, 5,50));
        test.display();
        MatrixByTriset result = test.fastTransfer(test);
        result.display();

    }
}