### Partition Test Plan

- success path(s)
    - partition() - Unsorted array - pivot at end 
    - partition() - Sorted (increasing) array - pivot at end 
    - partition() - Sorted (decreasing) array - pivot at end 
    - partition() - Unsorted negative pivot - correct pivot at end 
    - partition() - single element array, return 0 
    - swap() - array length>1, values swapped 
    - swap() - array length == 1, no effect
    
- failure path(s)
    - partition() - Null Array - void method does nothing 
    - partition() - empty array - void method does nothing 
    - swap() - array null, no effect 
    - swap() - empty array, no effect
