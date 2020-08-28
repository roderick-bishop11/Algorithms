# The Quicksort Algorithm 

The quicksort alg is a fairly fast algorithm and one of the easiest to memorize and implement. It works by recursively splitting a list into partitions around a specified pivot. The pivot doesn't necessarily matter, most people simply just choose the last element of the array. 

However, you can select your pivot to be the middle element, first element, or random element also, the only thing that may change is your params in your call to the partition helper method. 

### Language implemetations in this repo:
* [x] Java

## The Pseudo:

This alg has two parts: 
* quicksort method (recursive method)

```
quicksort(arr, low, high){
    if(low<high){ <--base case, if low == high, then we have reached the final recursive case
    var partitionIndex = partition(arr, low, high) <-- your index to partition around

    quicksort(arr, low,  partitionIndex-1) <-- sorting the subarray that comes before the pivot
    quicksort(arr, partitionIndex+1, high) <-- sorting sub array after the pivot
        }
}
```
* partition method 

*This is the last element in array implementation, it will be different if you go another route*

```
partition(arr, low, high){
    var pivot = arr[high] <-- first, last, random, median
    var smaller = low-1 <-- index of smaller element, you'll need this later

        //loop from low to high
    for( j = low; j< high; j++){
        if(curr element is smaller than pivot){
            smaller++ <-- increment the smaller index
            swap(arr[i], arr[j]) <-- swaps the value higher than the pivot with a value at a lower index
        }
    }

     /*
    make a final swap so that your pivot is in the right place, one after the low value, not necessarily completely sorted, but in the sense that numbers less than are to the left, and numbers to the right are greater than
    */
    swap(i+i, high)


    return i+1 <- return the first element after the pivot
}
```

## Caveats:
You arrrive at quicksort's worst case if the pivot is the least or greatest in the array. If it is possible to know where your least or greatest elements are within the array, go with the implementation that chooses the pivot to not be either of those elements.

## Time complexity breakdown:
| Best Case Ω(n) | Average Case Θ(n) | Worst Case O(n) |
|----------------|-------------------|-----------------|
|   Nlog(N)      |     Nlog(N)       |  N<sup>2</sup>  |


## Space complexity:
**O(n)** space because there has to be space reserved for each recursive call in the stack. 



## See this algorithm in action [here](https://practice.geeksforgeeks.org/problems/quick-sort/1)
