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
            for (int s : this.intSolution) {
                System.out.println(s);
            }
        } else if (this.objectSolution != null) {
            for (Object s : this.objectSolution) {
                System.out.println(s);
            }
        }
    }
}
