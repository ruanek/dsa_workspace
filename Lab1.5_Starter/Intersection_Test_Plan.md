### Intersection Test Plan

- Constructors - none
- Getters/Setters with business logic - none
- public methods

  ```
  public List<Integer> intersectionFast(int[]a, int[]b){
  public List<Integer> intersection(int[] a, int[] b) {
  ```

- Success path(s)
  - confirm that the method returns a list that is 
    the subset of the common elements between both lists
- Negative path(s)
  - null array(s)? 
  - empty array(s)
  - identical array? 
  - same array (same location)? 
  - different sizes of arrays? Wasn’t specified as a limitation
