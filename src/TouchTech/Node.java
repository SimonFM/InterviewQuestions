package TouchTech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by simon on 11/09/2016.
 */
public class Node {

    private Long id;
    private Set<Node> neighbours;

    public Node(Long identifer){
        this.id = identifer;
        this.neighbours = new HashSet<Node>();
    }

    public Node addNeighbour(Node newNeigbour){
        this.neighbours.add(newNeigbour);
        return newNeigbour;
    }

    public Set<Node> getNeighbours(){
        return this.neighbours;
    }
}
