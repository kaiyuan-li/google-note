Must try eventually with example! Then try an edge case: length = 0/1

Consider overflow problems

Sort must provide sort function!

Unshift is push, shift is pop!

when decreasing i--!

for (let val of map.values())

forEach's return is only for callback not for whole function

arr.push is not returning array. it's returning length
map.set(foo, map.get(foo).push(bar)) is not valid!
should just do map.get(foo).push(bar)

if you save array into result, remember do deep copy, otherwise the array content gets changed...

remember ++ in while!

use array to pass multiple results: safer than objects!  [x, y] = (function(){ return [3, 4]; })();

BFS queue must unshift! never pop!

function in function cannot see outer most variable!...

var inventory = [
    {name: 'apples', quantity: 2},
    {name: 'bananas', quantity: 0},
    {name: 'cherries', quantity: 5}
];

function isCherries(fruit) { 
    return fruit.name === 'cherries';
}

console.log(inventory.find(isCherries)); 
// { name: 'cherries', quantity: 5 }

8.toString(2)=>'1000'

dont confuse string and number '1' !== 1

js compare string lexicographically: s1.localeCompare(s2)