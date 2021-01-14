Iterator - 

Description -
1. We want to create differnt types of lists that will store some type of objects and those list have some functionality to iterate over the list and access details of those objects.

2. This is saame type of a "for loop" functionality but in a more elegant fashion.

3. Lists have method "getiterator" - gives the iterator instance

4. iterator have 2 methods - 
"hasnext()" - if the ietaror have still some elements left while ietarting 
"next()" - to get the next element while iterating

5. we use the "while" loop with the iterator.hasnext()

6. gist of itetartor 

IteratorPlan it = list.getIterator();
while(it.hasNext()){
    object = it.next();
    object.getDetails();
}


Problem Statement -
