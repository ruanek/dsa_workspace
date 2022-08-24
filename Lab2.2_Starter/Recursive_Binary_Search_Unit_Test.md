### Recursive Binary Search Test Plan

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
   public static boolean binarySearch(int target, int[] sortedArray)
  ```
  
- success path(s)
    - return true for a positive search int within a non-empty sorted int array length>2 that contains the value
    - return false for a positive search int within a non-empty sorted int array length>2 that does not contain the value

- failure path(s) (some may not be negative, but we’ll start assuming they’ll fail)
    - should return false if the array is null
    - non-sorted array?  How will we know?  unpredictable behavior?
    - should return false if the array is empty
