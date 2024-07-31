package HomeworkAssignment4;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Stack;

public class PairInt {
    private int x;
    private int y;

    public PairInt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object p) {
        return super.equals(p);
    }

    @Override
    public String toString() {
        return "PairInt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public PairInt copy() {
        PairInt copyofPairInt = new PairInt(0,1);
        copyofPairInt.x = getX();
        copyofPairInt.y = getY();

        return copyofPairInt;
    }

    //result is the list of successful paths recorded up til now
    //trace is the current path being explored
    public void findMazePathStackBased(int x, int y, ArrayList<ArrayList<PairInt>> result, Stack<PairInt> trace) {

    }

    public ArrayList<ArrayList<PairInt>> findAllMazePaths(int x, int y) {
        ArrayList<ArrayList<PairInt>> result = new ArrayList<>();
        Stack<PairInt> trace = new Stack<>();
        findMazePathStackBased(0,0, result, trace);
        return result;
    }
}
