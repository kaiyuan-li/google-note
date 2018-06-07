1. least number of squares: DP: dp[n] = min(dp[n - m^2] + 1). note dp[0] = 0, so dp[1,4,9 ...] = 1

2. minimize gas station distance: since if you build gas stations between existing ones, they must be put evenly. Prepopulate the stations with numbers to set closest to total distance / total gas stations. Then insert gas stations one by one to the ones that has largest intervals. Need priority queue.

3. JS priority queue: every insert includes a binary search.

4. how to encode string array separator?
use escaping. first convert all # in the strings to ##, then seperate the strings by %#%. if there is one #, it is and only is separator.

5. trap water:
think as not trapping water, but trapping sand/iceblock. then take the four side down one after each other, loop till no change in one round.

6. get hits of past 5 min.
create 300 bins, bin has a tag which is current time stamp. bin index is timestamp % 300. when putting into the bin, if bin's tag is not current time stamp, deplete the bin and mark current time stamp.
When get hit, sum 300 bins up

7. perfect rectangle
the large rectangle area should be equal to the sum of small rectangles
count of all the points should be even, and that of all the four corner points should be one

8. flip game: because after each move, the states is reduced, try each move and search the next state. Do caching all the visited state into hashmap

9. paint fence: dp. last two posts can be same/different color.

10. multiend BFS: put multiple sources into the queue at the first time. like multi source sound propagation

11. try to use count sort if possible

12. wild-card match: dp to store if first i in word and first j in pattern match. for dp[i][j] if word[i] === pattern[j], dp[i][j] = dp[i-1][j-1]. if pattern[j] === '*', dp[i][j] = dp[i-1][j]||dp[i][j-1]

13. if this is a reg express problem, very similar for conditions other than *. when * appears, if pattern letter before start is not equal to string letter, dp[i][j] = dp[i][j-2] (no such letter in pattern). If they are the same, three conditions: letter count as 0(dp[i][j] = dp[i][j-2]) count as 1 (dp[i][j] = dp[i][j-1]) or count as multiple (dp[i][j] = dp[i-1][j])

14. max of sliding window: use a dequeue to record index. for each number, if in the dequeue there are indices of smaller numbers in front of you, pop them out and put you in

15. A binary search tree is a rooted binary tree, whose internal nodes each store a key (and optionally, an associated value) and each have two distinguished sub-trees, commonly denoted left and right. The tree additionally satisfies the binary search property, which states that the key in each node must be greater than or equal to any key stored in the left sub-tree, and less than or equal to any key stored in the right sub-tree.[1]:287 The leaves (final nodes) of the tree contain no key and have no structure to distinguish them from one another.

16. implement pow(x,n), should think about negative numbers!

17. skyline ending point must have reverse order of x and height

18. find convex: find left most point, then find the next point that has largest angle from (0,1), then clockwisely find largest angle with previous vector. (gift wrapping)

19. Count of Range Sum： count during merge sort. becasue in substep of merge sort, left half and right half are sorted.

20. find k smallest combos of two sorted lists. connect one array's each element to the other array's first element. [0,0] pair is the smallest one, the next possible one will be [0,1], add to the queue and see if that is the smallest, if not, [1,0] is the smalles, remove it and add [1,1]to the queue.

21. ez solution for 20: binary search. how to calclulate number of smaller numbers. count how many numbers are smaller in each row.
private int count(int value, int m, int n) {
    int i = m, j = 1;
    int count = 0;
    while (i >= 1 && j <= n) { 
        if (i * j <= value) {
            count += i;
            j++;
        } else {
            i--;
        }
    }
    return count;
}

22. 20's complexity is O(klgk) 21's is ((m+n)lg(mn)) pick algorithm accordingly

23. minimum height tree: start from each leave, do bfs, until the last search.

24. alien dictionary: make directed graph and do graph ordering:
take all no-parent node and put into queue. take one node from the queue to result and remove all its edges to its children. if any child does not have other incoming paren, put the child into queue

25. Russion doll. for each one, record the number of envelopes can be inside me. use this as dp

26. get random number from linked list: have 1/n chance of swap when you are at nth node.

27. array remove in o(1) time: swap target with end, pop()

28. Split Array into Consecutive Subsequences: if there is no existing subsequence to fit num, create a new subsequence. If there is, put num into the shortest subsequence.

29. when playing with the merge sort problem. do merge sort separately to make logic more clear. If play with BST, remember to add to the tree in reversed order.

30. knapsack problem: 1. do not save status. because only need last status and this can save the time to say next status equals prev status. need to update from high to low. 2. remember the choices of m has m+1 possibliities.