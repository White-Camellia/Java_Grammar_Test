package MatrixDemo;

import java.util.Objects;

public class TripleSet {
    //提供行列坐标，以及对应元素值
    private int row, column, elem;

    public TripleSet(int row, int column, int elem) {
        this.row = row;
        this.column = column;
        this.elem = elem;
    }

    public int getrow() {
        return row;
    }

    public void setrow(int row) {
        this.row = row;
    }

    public int getcolumn() {
        return column;
    }

    public void setcolumn(int column) {
        this.column = column;
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripleSet tripleSet = (TripleSet) o;
        return row == tripleSet.row && column == tripleSet.column && elem == tripleSet.elem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column, elem);
    }

    @Override
    public String toString() {
        return "["+row+","+column+","+elem+"]";
    }
}
