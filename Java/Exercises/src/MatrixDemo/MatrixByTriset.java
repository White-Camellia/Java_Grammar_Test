package MatrixDemo;

import java.util.HashMap;

public class MatrixByTriset {
    //用哈希表这种双列集合可以跨越式添加，动态数组添加的元素的索引不能超过其对应的size值
    private HashMap<Integer, TripleSet> matrixHashMap = new HashMap<>();
    private int[] numOfColumn = new int[10];
    private int index = 0;

    //添加三元组至稀疏矩阵的第一种方法
    public void addELem(TripleSet tmp) {
        addElem(tmp, index);
    }

    //根据索引添加三元组至动态三元组集合,并且统计列元素出现个数，从而确定下一次插入的位置
    public void addElem(TripleSet tmp, int index){
        matrixHashMap.put(index, tmp);
        numOfColumn[tmp.getcolumn()]++;
        this.index++;
    }

    //获取已知下标的三元组
    public TripleSet getTripleSetAt(int index){
        return matrixHashMap.get(index);
    }

    //基础转置，使元素的行列对调,并且按照指定索引填至Hashmap,需要传递索引Key作为参数，并且给新的稀疏矩阵统计数量即也是Index值
    public void transfer(TripleSet pre, int index){
        TripleSet tmp = new TripleSet(pre.getcolumn(), pre.getrow(), pre.getElem());
        matrixHashMap.put(index, tmp);
        this.index++;
    }

    //实现矩阵快速转置算法
    public MatrixByTriset fastTransfer(MatrixByTriset preMatrix) {
        MatrixByTriset tmpMatrix = new MatrixByTriset();
        int[] position = new int[matrixHashMap.size()+1];
        position[0] = 0;
        //生成位置索引
        for (int i = 1; i <= index; i++) {
            position[i] = position[i-1] + numOfColumn[i-1];
        }
        //
        for (int i = 0; i < index; i++) {
            //获取当前Key索引所对应的三元组
            TripleSet tmptriSet = matrixHashMap.get(i);
            //由当前三元组的column值作为position数组中的索引，获取当前的存放位置,并完成后缀自增运算，使下一次存放时的索引后移
            int tmpIndex = position[tmptriSet.getcolumn()]++;
            //转置并且添加元素
            tmpMatrix.transfer(tmptriSet, tmpIndex);
        }

        return tmpMatrix;
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            TripleSet tmptriSet = matrixHashMap.get(i);
            sb.append("[");
            sb.append(tmptriSet.getrow());
            sb.append(",");
            sb.append(tmptriSet.getcolumn());
            sb.append(",");
            sb.append(tmptriSet.getElem());
            sb.append("]");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
