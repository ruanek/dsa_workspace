### Stack Test Plan

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public void push(V item)
  public V pop()
  ```

- success path(s)
    - pop returns correct object at top of non-empty stack 
    - push adds object to empty stack, confirmed w/pop 
    - push add object to non-empty stack, confirmed w/pop 
    - pop on empty stack does nothing 
    - push a null object does not modify stack

- failure path(s)
    
