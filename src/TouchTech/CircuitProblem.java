package TouchTech;

/**
 * Created by simon on 11/09/2016.
 */
public class CircuitProblem {

    public static void main(String[] args){
        Circuit graph = new Circuit();
        Integer globalResult = graph.numberOfPossibleSolutionsWithGlobal();
        Integer recursiveResult = graph.recursiveSolution();
        System.out.println("Number Of Possible Solutions, Global result: " + globalResult);
        System.out.println("Number Of Possible Solutions, Recursive result: " + recursiveResult);
    }
}
