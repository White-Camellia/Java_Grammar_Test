package MatrixDemo;

import java.util.Arrays;

public abstract class AbstractMatrix {
    private int[][] elem;
    private int row, column;

    public AbstractMatrix (int x, int y) {
        row = x; column =y;
        elem = new int[x][y];
    }

    //必须使用构造方法初始化矩阵,顺便获取矩阵的行数和列数
    public AbstractMatrix (int[][] elem) {
        column = elem.length;
        row = elem[0].length;
        this.elem = elem;
    }
    //输出矩阵的元素,重写toString方法
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                if(j == 0){
                    sb.append("[\t"+elem[i][j]+"\t");
                }else if(j == column-1){
                    sb.append(elem[i][j]+"\t"+"]\n");
                }else sb.append(elem[i][j]+"\t");
            }
        return sb.toString();
    }
}
