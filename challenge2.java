/*
 * write a java program to insert an element at the specified position at the
 * linkedlist
 */

class challenge2 {

static class list {
public int data;
public list nextlist;

public list(int data) {
this.data = data;

}
}

static list Getlist(int data) {
return new list(data);
}

static list InsertPos(list headlist, int position, int data) {
list head = headlist;
if (position < 1)
System.out.print("Invalid position");

if (position == 1) {
list newlist = new list(data);
newlist.nextlist = headlist;
head = newlist;
} else {
while (position-- != 0) {
if (position == 1) {

list newlist = Getlist(data);

newlist.nextlist = headlist.nextlist;

headlist.nextlist = newlist;
break;
}
headlist = headlist.nextlist;
}
if (position != 1)
System.out.print("Position out of range");
}
return head;
}

static void PrintList(list list) {
while (list != null) {
System.out.print(list.data);
list = list.nextlist;
if (list != null)
System.out.print(",");
}
System.out.println();
}

public static void main(String[] args) {
list head = Getlist(33);
head.nextlist = Getlist(85);
head.nextlist.nextlist = Getlist(81);
head.nextlist.nextlist.nextlist = Getlist(4);

System.out.print("Linked list before insertion: ");
PrintList(head);

int data = 172, pos = 2;
head = InsertPos(head, pos, data);
System.out.print("Linked list after" + " insertion of 172 at position 2: ");
PrintList(head);

data = 3;
pos = 6;
head = InsertPos(head, pos, data);
System.out.print("Linked list after" + "insertion of 3 at position 6: ");
PrintList(head);

}
}

/*
 * write a java program to convert a hashset to an arraylist
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
class challenge2 {
public static void main(String[] args) {
HashSet<String> bike_set = new HashSet<>();
bike_set.add("meteor");
bike_set.add("pulsar");
bike_set.add("unicorn");
bike_set.add("splendor");
ArrayList<String> bike_array = new ArrayList<>(bike_set);
System.out.println("Elements of bike Arraylist are :");
System.out.println(bike_array);
System.out.print("Element at index 1 is : " + bike_array.get(1) + " ");
}
}

/*
 * write a java program to sort hashmap by keys
 */

import java.util.*;
class challenge2 {
static Map<String, Integer> map = new HashMap<>();
public static void sortbykey() {
TreeMap<String, Integer> sorted = new TreeMap<>();
sorted.putAll(map);
for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
System.out.println("Key = " + entry.getKey() + ", Value = " +
entry.getValue());
}
}
public static void main(String args[]) {
map.put("Ashok", 23);
map.put("Kumar", 20);
map.put("Arun", 21);
map.put("Prasanth", 12);
map.put("Dhanush", 37);
sortbykey();
}
}

/*
 * write a program to iterate treemap in java
 */

import java.util.Map;
import java.util.TreeMap;

class challenge2 {
public static void main(String[] arg) {
Map<String, String> im = new TreeMap<String, String>();
im.put("vetrimaran", "asuran");
im.put("lokesh", "vikram");
im.put("manirathnam", "nayagan");
im.put("bala", "pithamagan");
for (Map.Entry<String, String> entry : im.entrySet()) {
System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");
}
}
}

/*
 * write a program to sort arraylist using comparable and comparator interface
 */

import java.util.*;
class Shop {
int ProductNo;
String name;
int price;
Shop(int ProductNo, String name, int price) {
this.ProductNo = ProductNo;
this.name = name;
this.price = price;
}
}
class priceComparator implements Comparator<Shop> {
public int compare(Shop s1, Shop s2) {
if (s1.price == s2.price)
return 0;
else if (s1.price > s2.price)
return 1;
else
return -1;
}
}
class challenge2 {
public static void main(String[] args) {
ArrayList<Shop> s = new ArrayList<Shop>();
s.add(new Shop(218, "Toy", 520));
s.add(new Shop(223, "Book", 230));
s.add(new Shop(423, "Bottle", 100));
s.add(new Shop(512, "Pen", 50));
s.add(new Shop(723, "Pencil", 10));
System.out.println("Before sorting");
for (Shop shop : s) {
System.out.println(shop.price + " " + shop.name + " " + shop.ProductNo);
}
System.out.println("After sorting(sorted by price)");
Collections.sort(s, new priceComparator());
for (Shop shop : s) {
System.out.println(shop.price + " " + shop.name + " " + shop.ProductNo);
}
}
}
