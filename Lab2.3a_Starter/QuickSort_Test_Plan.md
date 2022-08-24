### QuickSort Test Plan (Initial)

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public void sort(int[] numbers)
  ```

- success path(s)
    - sort unsorted non-empty non-null array in ascending order 
    - sort unsorted non-empty array w/duplicate of pivot 
    - sort unsorted non-empty array w/duplicate of any element

- failure path(s)  
    - null array? 
    - empty array?


### QuickSort Test Plan (Modified)

changing private methods to public

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public void sort(int[] numbers, int start, int end)
  public int partition(int[] numbers, int start, int end)
  ```

- success path(s)
    - sort unsorted non-empty non-null array in ascending order

- failure path(s)
    - null array?
    - empty array?