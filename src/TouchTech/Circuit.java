package TouchTech;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by simon on 11/09/2016.
 */
public class Circuit {
    private Set<Node> nodeSet;
    private Integer maximumNumberOfDigits;
    private static Integer totalSolutions = 0;

    public Circuit(){
        this.nodeSet = new HashSet<Node>();
        this.maximumNumberOfDigits = 5;
        this.generateExample();
    }

    public Node addNode(Node node){
        this.nodeSet.add(node);
        return node;
    }

    public Set<Node> getNodes(){
        return this.nodeSet;
    }

    public Integer numberOfPossibleSolutionsWithGlobal(){
        for (Node node: nodeSet) {
            numberOfPossibleSolutionsWithGlobal(node, maximumNumberOfDigits);
        }
        return totalSolutions;
    }

    private void numberOfPossibleSolutionsWithGlobal(Node parent, Integer numberOfDigits) {

        if (numberOfDigits.compareTo(0) == 0) { // base case
            totalSolutions++;
        } else { // iterate through the neighbours
            Set<Node> nodes = parent.getNeighbours();
            for (Node neighbour : nodes) {
                numberOfPossibleSolutionsWithGlobal( neighbour, numberOfDigits - 1);
            }
        }
    }

    public Integer recursiveSolution(){
        Integer solutions = 0;
        for (Node node: nodeSet) {
            solutions += recursiveSolution(node, maximumNumberOfDigits, 0);
        }
        return solutions;
    }

    private Integer recursiveSolution(Node parent, Integer numberOfDigits, Integer solutionFound){
        if(numberOfDigits.compareTo(0) == 0){
           return solutionFound + 1;
        } else {
            Set<Node> nodes = parent.getNeighbours();
            Integer solution = 0;
            for (Node neighbour : nodes) {
                solution += recursiveSolution( neighbour, numberOfDigits - 1, solutionFound);
            }
            return solution;
        }
    }

    /***
     * Generates a graph like this:
     *              ----- 0 ----
     *              |     |     |
     *              |     |     |
     *              4 --- 5 --- 1
     *              |     |     |
     *              |     |     |
     *              3 --------- 2
     */
    private void generateExample(){
        Long number = new Long(0);
        Node zero = new Node(number++);
        Node one = new Node(number++);
        Node two = new Node(number++);
        Node three = new Node(number++);
        Node four = new Node(number++);
        Node five = new Node(number++);

        zero.addNeighbour(one);
        zero.addNeighbour(five);
        zero.addNeighbour(four);

        one.addNeighbour(zero);
        one.addNeighbour(two);
        one.addNeighbour(five);

        two.addNeighbour(five);
        two.addNeighbour(one);
        two.addNeighbour(three);

        three.addNeighbour(five);
        three.addNeighbour(two);
        three.addNeighbour(four);

        four.addNeighbour(five);
        four.addNeighbour(zero);
        four.addNeighbour(three);

        five.addNeighbour(zero);
        five.addNeighbour(one);
        five.addNeighbour(two);
        five.addNeighbour(three);
        five.addNeighbour(four);

        addNode(zero);
        addNode(one);
        addNode(two);
        addNode(three);
        addNode(four);
        addNode(five);
    }
}
