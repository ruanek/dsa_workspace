### BubbleSort Test Plan

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public static void sort(int[] numbers)
  ```
  
- success path(s)
  - non-empty non-null unsorted array sorted in correct order

- failure path(s) (some may not be negative, but we’ll start assuming they’ll fail)
  - empty array
  - null array
  - pre-sorted array
  - array with duplicates