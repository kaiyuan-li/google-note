1. maintain a queue
2. get root, put all it's children into the queue
3. while the queue is not empty, get one from the queue and put all its children to the queue

4. if want to know the level, after checking queue not empty, record the number of nodes and loop over them with for.

if this is a graph, also maintain a list called visited, do not put visited nodes into the queue again.

