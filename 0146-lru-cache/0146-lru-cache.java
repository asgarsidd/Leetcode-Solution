class LRUCache {
 private class Node{
     int key=0;
     int value=0;
     Node prev=null,next=null;
     Node(int key,int value){
         this.key=key;
         this.value=value;
     }
 }
 private HashMap<Integer,Node> map;
private Node head=null,tail=null;
private int capacity=0;
private int size=0;
    public LRUCache(int capacity) {
        this.map=new HashMap<>();
        this.capacity=capacity;
    }
    private void addFirst(Node node){
        if(head==null){
            this.head=this.tail=node;
        }
        else{
            this.head.next=node;
            node.prev=this.head;
            this.head=node;
        }
        size++;
    }
    private void removeNode(Node node){
        if(this.size==1){
            this.head=this.tail=null;
        }
        else if(this.head == node){
            Node pren =node.prev;
            pren.next=node.prev=null;
            this.head=pren;

        }
          else if(this.tail == node){
            Node nextn =node.next;
            nextn.prev=node.next=null;
            this.tail=nextn;

        }
        else{
              Node pren =node.prev;
               Node nextn =node.next;
               pren.next=nextn;
               nextn.prev=pren;
               node.prev=node.next=null;
        }
        size--;

    }
    private void makerecent(Node node){
        if(node==this.head)return;
        removeNode(node);
        addFirst(node);
    }
    private Node fetchNode(int key){
        Node node=map.get(key);
        makerecent(node);
        return node;
    }
    public int get(int key) {
        if(!map.containsKey(key))return -1;
        return fetchNode(key).value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
          Node node=fetchNode(key);
          node.value=value;
        }
        else{
              Node node =new Node(key,value);
              addFirst(node);
              map.put(key,node);
              if(map.size()>this.capacity){
                  Node tail=this.tail;
                  removeNode(tail);
                  map.remove(tail.key);
              }
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */