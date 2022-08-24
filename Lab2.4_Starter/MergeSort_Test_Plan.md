### MergeSort Test Plan 

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public void mergeSort(int[] numbers)
  ```

- success path(s)
    - sort unsorted non-empty non-null array in ascending order
  
- failure path(s)
    - null array? 
    - empty array? 
    - already-sorted array?

- Open Question
  - are we going to do this with every kind of primitive 
    data type there is?  Can we do this with arrays of Object? 
    What implications are there if we move to a Generic 
    version of this…like ```mergeSort(<T>[])```?  Like, what do we do 
    if there is a null array element?
