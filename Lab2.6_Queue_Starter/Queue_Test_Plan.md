### Queue Test Plan

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public void enqueue(V item)
  public V dequeue()
  ```

- success path(s)
    - enqueue to an empty queue should add the new element to the beginning, that is, to the head 
    - enqueue to an existing queue should add a new element to the tail 
    - dequeue from an existing 1-element queue should return the single element 
    - dequeue from an n-element queue should return the first element queued, that is from the head

- failure path(s)
    - attempting to add a null element should not change the queue 
    - are duplicates allowed? 
    - dequeueing from an empty Queue should return null
