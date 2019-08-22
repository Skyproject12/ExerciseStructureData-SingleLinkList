public class Node<K> {

  private K key;
  public Node next;

  public Node(K key) {
    this.key = key;
  }

  public void show() {
    System.out.print("{" + key + "} "); 
  }
  
}