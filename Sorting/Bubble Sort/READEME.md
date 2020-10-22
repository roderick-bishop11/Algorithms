# The Bubble Sort Algorithm 

There are essentially two ways to do this alg: you can sort from greatest to least (swap if left > right) or from least to greatest(swap if left < right ). Either way your highest values "bubble up" to the top



Language implemetations in this repo:
* [x] Java
* [ ] python (coming soon)

## The Pseudo:  
```

//for values bubbling up to the top (sorting greatest first)
public bubbleSort(int [] a){
//iterating through each value
    for(i  = 0: i< a.length); i++){ 

//iterating through each value to the left of the last sorted number
    for(int j = 0; i < a.length-(i+1); j++){ 
        if( a[j] > a[j+1]){
            swap values;
        }
    }
}
} 
```


## Use cases:

This alg is nice when you don't have anything else better in your arsenal or you'll be handling a fixied number of inputs since your time-complexity will grow exponentially. Otherwise, stay away from this sort, since it can get pretty bas pretty quickly. 

The best case is when your collection is already sorted, while **the worse case occurs when your collection has values in reverse order.** The average case is also the worst case because every value will be checked by each value in successive order of occurrence, thus the two for loops. 

## Caveats:


## Time complexity breakdown:
| Best Case Ω(n) | Average Case Θ(n) | Worst Case O(n) |
|----------------|-------------------|-----------------|
|     n          |       n^2         |      n^2        |



## See this algorithm in action [here](https://www.youtube.com/watch?v=6Gv8vg0kcHc&ab_channel=HackerRank)


## Resources:
https://www.geeksforgeeks.org/bubble-sort/
