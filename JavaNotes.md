It has to be the wrapper type - Character - List<Character>. You can't use generics with primitive types.

convert to int: count = 0; count = count*10+(ch -'0')

minPQ = new PriorityQueue<>();
maxPQ = new PriorityQueue<>(Collections.reverseOrder());

Queue<ListNode> priorityqueue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode n1, ListNode n2){
                return n1.val - n2.val;
            }
        });
PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] c1, int[] c2) {
                return c1[2] - c2[2];
            }
        });

PriorityQueue<ListNode> heap = new PriorityQueue<>((l1, l2)->l1.val - l2.val);

        
priorityQueue: add, peek, offer, poll (pop), contains, remove (remove specific element if present), size

loop in set: for (int i:set)

HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
keySet(), values, put, remove, replace, get, containsKey, containsValue

List<String> expected = new ArrayList<>();
		expected.add("2");

List is an interface, does not have ctor. It's implemented by ArrayList

Integer.toString(int)

Stack: push, pop, peek

String s = "xyz";
for(int i = 0; i < s.length(); i++)
{
   char c = s.charAt(i);
}

string has no contains() do bra.indexOf(ch)!= -1

StringBuilder: charAt(), setCharAt()

new String(array)

private int res = Integer.MIN_VALUE;

&& has higher priority than ||

boolean[][] are all false

pq.add(new int[]{i, j, heightMap[i][j]});
int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
boolean[][] visited = new boolean[rows][cols];

linkedlist: add, remove, removeFirst, removeLast, addFirst, addLast, get(element) returns index

Hashtable is synchrnized, HashMap is not, HashMap has subclass of LinkedHashMap

convert arraylist to array: arrayList.toArray()

Arrays.asList(array)

LinkedList
removeFirstOccurrence(E) remove(int index) remove(E) when the E is integer, it will trigger index one first.

list: add(int idx, E element), remove(int idx), indexOf, subList, get(int idx)

Set<E> = new HashSet<>(), contains, add, remove

StringBuilder: setCharAt(int idx, char ch), insert(in offset, char ch)

ArrayDeque poll() head pop() end addFirst() addLast

string should use string.equals not ==! not safe!

Char array to string
char[] a = {'a', 'b'};
String b = new String(a);

for queue, use offer and poll. addfirst and polllast are methods for linked list, not for queue.

cannot iterate priorityqueue. iterating not generating the correct order. 

Collections.sort(List<>)

topography sort will need fromMap and toMap

for (char ch : w.toCharArray()) {
                chSet.add(ch);
            }

coin jump: should record length, remember that longer length should have smaller lexico value

public protected default private: all, subclass, same package, same class

only private properties/methods cannot be inherited

get input from console:
BufferedReawder br = new BufferedReader(new InputStreamReader());
String input = br.readLine();

try {
    FileReader fr = new FileReader("c:\\aa.txt");
} catch (Exception e) {
    e.printStackTrace();
}

/* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder());