How to make a hash table?

1. create a hash function to convert key to array index
2. the array is pointers to linked lists
3. set: put the {key, value} as end node of the corresponding linked value in the list. visit all the elements in the list, do value update if key already exists
4. get: use hash function to get the index, then search in the linked list till the end.