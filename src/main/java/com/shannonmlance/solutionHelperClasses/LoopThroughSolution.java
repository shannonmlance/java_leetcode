package main.java.com.shannonmlance.solutionHelperClasses;

import java.util.List;

public class LoopThroughSolution {
    int[] intSolution;
    List<Object> objectSolution;

    public LoopThroughSolution(int[] intSolution) {
        this.intSolution = intSolution;
    }

    public LoopThroughSolution(List<Object> objectSolution) {
        this.objectSolution = objectSolution;
    }

    public void loop() {
        if (this.intSolution != null) {
            for (int i = 0; i < this.intSolution.length - 1; i++) {
                System.out.print(this.intSolution[i]);
                System.out.print(", ");
            }
            System.out.println(this.intSolution[this.intSolution.length - 1]);
        } else if (this.objectSolution != null) {
            for (Object s : this.objectSolution) {
                System.out.println(s);
            }
        }
    }
}
