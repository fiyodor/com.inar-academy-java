package chapters.chapter_11.Checkpoints;

public class Checkpoint_30_31_32_33_34 {

    /*
    30
a. Create an ArrayList for storing double values?                   ArrayList<Double> list = new Arraylist<>();
b. Append an object to a list?                                      list.add(object);
c. Insert an object at the beginning of a list?                     list.add(0, object);
d. Find the number of objects in a list?                            list.size();
e. Remove a given object from a list?                               list.remove(object);
f. Remove the last object from the list?                            list.remove(list.size() - 1);
g. Check whether a given object is in a list?                       list.contains(object);
h. Retrieve an object at a specified index from a list?             list.get(index);


    31
ArrayList<String> list = new ArrayList<>();             ok
list.add("Denver");                                     ok
list.add("Austin");                                     ok
list.add(new java.util.Date());                         x (it is an arrayy list of strings)
String city = list.get(0);                              ok
list.set(3, "Dallas");                                  x (index 3 doesnt exist)
System.out.println(list.get(3));                        x (index 3 doesnt exist)


    32
Suppose the ArrayList list contains {"Dallas", "Dallas", "Houston",
"Dallas"}. What is the list after invoking list.remove("Dallas") one time?
Does the following code correctly remove all elements with value "Dallas" from
the list? If not, correct the code.

//first Dallas will be removed from the list


for (int i = 0; i < list.size(); i++)
list.remove("Dallas");

//it is not removing all elements with value "Dallas"

for (int i = 0; i < list.size(); i++) {
  if (list.remove(element))
    i--;
}

    33
Explain why the following code displays [1, 3] rather than [2, 3].
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.remove(1);
System.out.println(list);

// because list.remove(1) removes the element in the index 1. index 1 holds 2 so 2 will be removed from the list

    34
Explain why the following code is wrong.
ArrayList<Double> list = new ArrayList<>();
list.add(1);

//because 1 is an integer. replace it with 1.0*/
}
