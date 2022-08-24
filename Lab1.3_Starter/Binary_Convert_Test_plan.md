### Binary Convert Test Plan

- Constructors - none (static methods)
- Getters/Setters with Business logic - none
- Public methods

  ```
  public static int convertFromBinary(String binary)
  public static int convertFromOctal(String octal)
  ```

- Success paths
  - Test each numeric position in the string.  
     May be done in a single method, loop through array values
- Failure path(s)
  - null string? 
  - bad character? 
  - out of range? 
  - does 0 work?
