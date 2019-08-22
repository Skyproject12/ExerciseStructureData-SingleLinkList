public interface IBook<K> {

  public void insertFirst(K key);
  public void insertLast(K key);
  public Node<K> removeFirst();
  public int size();
  public K show();

}