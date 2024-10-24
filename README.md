# ContentOptimizer - recursive programming

The content optimizer is a program that can reverse strings in a recursive method. 
```
public static String contentOptimizer(String str) {

    if (str.isEmpty() || str.length() == 1) {
        System.out.println(str);
        return str;
    }

    String recursive = str.charAt(str.length() - 1) + contentOptimizer(str.substring(0, str.length() - 1));
    System.out.println(recursive);
    return recursive;
}
```

Recursive programming and recursive methods have a `base case` and a `recursive case`. 

The program continues to recall itself in it's recursive case until it hits its base case. 

In this case the `base case` = `if (str.isEMpty() || str.lenght() == 1)`.


Think of the base case as the bottom floor, and the recursive case as a single step towards that bottom floor. 

We could also say that base case is the top floor, but then we would need to climb down and not up for the final result leaving us at a 

### Recursive programinng can be imagined as climbing a stairset in reverse, with the initial objective of finding our base case or bottom stair. 
1. Step down,
2. Step down,
3. Step down,
...
... 
6. Step down to bottom floor `base case`.

### You now know where the bottom floor is giving us our `base case` and a final count and data set for each stair steps in the `recursive case` or recursive call of each step.


7. Return each recursive call. Data is displayed in reverse order, last call to first call.

