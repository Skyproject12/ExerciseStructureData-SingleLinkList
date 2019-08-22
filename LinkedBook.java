public class LinkedBook<K> implements IBook<K> {

  Node first;

  public LinkedBook() {
    first = null;
  }
  
  public boolean isNull() {
    return (first == null);
  }

  @Override
  public void insertFirst(K key) {
    Node node = new Node(key);
    node.next = first;
    first = node;
  }

  @Override
  public void insertLast(K key) {
    Node node, i;
    node = new Node(key);
    node.next = null;

    if (isNull()) {
      first = node;
      first.next = null;
    } else {
      i = first;
      while (i.next != null) {
        i = i.next;
      }
  
      i.next = node;
    }

  }

  @Override
  public Node<K> removeFirst() {
    if (!isNull()) {
      Node temp = first;
      first = first.next;
      return temp;
    }

    return null;
  }

  @Override
  public int size() {
    Node current = first;
    int length = 0;
    
    if (current == null) {
      return 0;
    }

    while (current != null) {
      length++;
      current = current.next;
    }
    
    return length;

  }

  @Override 
  public K show() {
    Node current = first;
    
    if (current == null) {
      System.out.println("Data kosong");
      return null;
    }

    while (current != null) {
      current.show();
      current = current.next;
    }

    return null;
    
  }
  
}