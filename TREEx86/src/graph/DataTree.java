package graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenneth
 */
public class DataTree {
    public static class Node {
        protected Node parent;
        protected List<Node> children;
        protected int value;
        public Node(Node parent){
            this.parent = parent;
            this.children = new ArrayList<>();
            this.value = 0;
        }
        void setValue(int val){
            this.value = val;
        }
        public int getValue(){
            return value;
        }
        public void addChild(Node child){
            this.children.add(child);
        }
        public void disownChild(int index){
            this.children.remove(index);
        }
    }
    public static class RootNode extends Node {
        public RootNode(){
            super(null);
        }
    }
    private RootNode root;
    private Node head;
    public DataTree(RootNode root){
        this.root = root;
        this.head = root;
    }
    public void traverse(int index){
        if(index == -1){
            head = head.parent;
        } else {
            head = head.children.get(index);
        }
    }
    public Node getValue(){
        return this.head;
    }
}
