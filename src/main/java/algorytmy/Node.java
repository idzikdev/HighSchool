package algorytmy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Node<T> {
    private List<Node<T>> children = new ArrayList<Node<T>>();
    private Node<T> parent = null;
    private T data = null;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setParent(Node<T> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(T data) {
        Node<T> child = new Node<T>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(Node<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public void removeParent() {
        this.parent = null;
    }

    public Node<T> getParent(){
        return parent;
    }

    public static void main(String[] args) {
        Node<String> root= new Node<String>("Parent");
        Node<String> childNode1 = new Node<String>("Child 1",root);
        Node<String> childNode2 = new Node<String>("Child 2",root);
        System.out.println(childNode1);
    }
}
