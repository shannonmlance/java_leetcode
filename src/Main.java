import main.java.com.shannonmlance.arrays101.conclusion.FindAllNumbersDisappearedInAnArray;
import main.java.com.shannonmlance.arrays101.conclusion.HeightChecker;
import main.java.com.shannonmlance.arrays101.conclusion.ThirdMaximumNumber;
import main.java.com.shannonmlance.solutionHelperClasses.LoopThroughSolution;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting to solve current problem...");

//        place input for problem here:
        int[] nums = {2,2,3,1,5,8,3,3};

//        adjust which class and method the solution calls:
        List<Integer> solution = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers2(nums);

//        various ways of reading the solutions:
        LoopThroughSolution lts = new LoopThroughSolution(Collections.singletonList(solution));
        lts.loop();

    }
}