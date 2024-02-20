// In Java, `.length` and `.length - 1` refer to different concepts when dealing with arrays.


// 1. `.length`: In Java, when you have an array, `.length` is a property of the array object that returns the number of elements in the array. It represents the actual size of the array.

//    For example:
//    ```java
//    int[] array = {1, 2, 3, 4, 5};
//    int length = array.length; // length will be 5
//    ```

// 2. `.length - 1`: This expression is used to access the index of the last element in the array. Since array indices in Java start from 0, the index of the last element is always `.length - 1`.

//    For example:
//    ```java
//    int[] array = {1, 2, 3, 4, 5};
//    int lastIndex = array.length - 1; // lastIndex will be 4
//    ```

// You typically use `.length` when you want to iterate over all elements in the array or need to know the exact size of the array. On the other hand, you use `.length - 1` when you need to access the last element or perform operations relative to the last element, such as when looping backward through an array.


// For Finding Last Index used -> Arr.length-1
// For Finding Length used -> Arr.length