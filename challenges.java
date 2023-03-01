
/*
 * 
 * 1. Write a java program for binary search using array
 */

import java.util.Scanner;
public class challenges {

public static void main(String[] args) {
int first = 0;
int array[] = { 12, 34, 345, 66, 2, 55, 78 };
Scanner sc = new Scanner(System.in);
System.out.println("Enter a searching number: ");
int target = sc.nextInt();
int last = array.length - 1;
int mid = (first + last) / 2;
while (first <= last) {
if (array[mid] < target) {
first = mid + 1;
} else if (array[mid] == target) {
System.out.println("fount at index: " + mid);
break;
} else {
last = mid - 1;
}
mid = (first + last) / 2;
}
if (first > last) {
System.out.println("element found!");
}
}

}

/*
 * how to find third largest and second smallest element in an array?
 */
import java.util.Scanner;

public class challenges {
public static void main(String[] args) {
int n, temp;
Scanner s = new Scanner(System.in);
System.out.println("Enter no. of elements you written array : ");
n = s.nextInt();
int a[] = new int[n];
System.out.println("enter all the elements: ");
for (int i = 0; i < n; i++) {
a[i] = s.nextInt();
}
for (int i = 0; i < n; i++) {
for (int j = i + 1; j < n; j++) {
if (a[i] > a[j]) {
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
System.out.println("third largest number: " + a[n - 3]);
System.out.println("second smallest number: " + a[1]);
}
}

/*
 * Java Program to demonstrate merging
 * two array without using pre-defined method
 */

import java.io.*;
public class challenges {
public static void main(String[] args) {
int a[] = { 3, 25, 46, 11, 4 };
int b[] = { 45, 70, 15, 6, 58 };
int a1 = a.length;
int b1 = b.length;
int c1 = a1 + b1;
int c[] = new int[c1];

for (int i = 0; i < a1; i = i + 1) {
c[i] = a[i];
}
for (int i = 0; i < b1; i = i + 1) {
c[a1 + i] = b[i];
}

for (int i = 0; i < c1; i = i + 1) {
System.out.println(c[i]);
}
}
}

/*
 * write a program to sort an array using insertion sort
 */

public class challenges {

void sort(int arr[]) {
int n = arr.length;
for (int i = 1; i < n; ++i) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j = j - 1;
}
arr[j + 1] = key;
}
}
static void printArray(int arr[]) {
int n = arr.length;
for (int i = 0; i < n; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
public static void main(String args[]) {
int arr[] = { 13, 8, 1, 323, 56, 875 };

challenges ob = new challenges();
ob.sort(arr);

printArray(arr);
}
};

/*
 * Write a java program to remove duplicate elements in an array
 */

public class challenges {
public static int removeDuplicates(int a[], int n) {
if (n == 0 || n == 1) {
return n;
}
int j = 0;
for (int i = 0; i < n - 1; i++) {
if (a[i] != a[i + 1]) {
a[j++] = a[i];
}
}
a[j++] = a[n - 1];
return j;
}
public static void main(String[] args) {
int a[] = { 23, 23, 4, 56, 33, 33, 4, 567, 76, 41, 76 };
int n = a.length;
int j = 0;
j = removeDuplicates(a, n);
for (int i = 0; i < j; i++)
System.out.print(a[i] + " ");
}
}

/*
 * how to check whether two string are anagram or not
 */

import java.util.Arrays;
public class challenges {

public static void main(String[] args) {
String word = "listen";
// String count[] = word.split(" ");
String word1 = "silent";
char[] string1 = word.toCharArray();
char[] stirng2 = word1.toCharArray();
Arrays.sort(string1);
Arrays.sort(stirng2);
if (Arrays.equals(string1, stirng2)) {
System.out.println("The word is anagram");
} else {
System.out.println("not anagram");
}
}
}

/*
 * write a java program to print odd and even numbers in an array
 */
public class challenges {
public static void main(String[] args) {
int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
System.out.println("odd numbers: ");
for (int i = 0; i < array.length; i++) {
if (array[i] % 2 != 0) {
System.out.println(array[i]);
}
}
System.out.println("even numbers: ");
for (int i = 0; i < array.length; i++) {
if (array[i] % 2 == 0) {
System.out.println(array[i]);
}
}
}
}

/*
 * how to remove given element from an array in java
 */

import java.util.Arrays;

class challenges {
public static int[] removeTheElement(int[] arr, int index) {
if (arr == null || index < 0
|| index >= arr.length) {
return arr;
}
int[] anotherArray = new int[arr.length - 1];
for (int i = 0, k = 0; i < arr.length; i++) {
if (i == index) {
continue;
}
anotherArray[k++] = arr[i];
}
return anotherArray;
}
public static void main(String[] args) {
int[] arr = { 12, 23, 44, 523, 98 };
System.out.println("Original Array: "+ Arrays.toString(arr));
int index = 3;
System.out.println("Index to be removed: " + index);
arr = removeTheElement(arr, index);
System.out.println("Resultant Array: "+ Arrays.toString(arr));
}
}

/*
 * write a java program to insert a new element into an array to the specified
 * index
 */


import java.io.*;
import java.lang.*;
import java.util.*;

class challenges {

public static int[] insertX(int n, int array[], int x, int pos)
{
int i;
int newarr[] = new int[n + 1];
for (i = 0; i < n + 1; i++) {
if (i < pos - 1)
newarr[i] = array[i];
else if (i == pos - 1)
newarr[i] = x;
else
newarr[i] = array[i - 1];
}
return newarr;
}

public static void main(String[] args) {

int n = 10;
int i;

int array[] = { 12, 45, 32, 78, 33, 68, 29, 15, 302, 73 };

System.out.println("Initial Array:\n" + Arrays.toString(array));
int x = 97;

int pos = 8;
array = insertX(n, array, x, pos);

System.out.println("\nArray with " + x + " inserted at position " + pos +
":\n" + Arrays.toString(array));
}
}

/*
 * write a java program to multiply two matrices
 */

import java.io.*;
class challenges {
static void printMatrix(int M[][], int rowSize, int colSize) {
for (int i = 0; i < rowSize; i++) {
for (int j = 0; j < colSize; j++)
System.out.print(M[i][j] + " ");
System.out.println();
}
}
static void multiplyMatrix(
int row1, int col1, int A[][],
int row2, int col2, int B[][]) {
int i, j, k;
System.out.println("\nMatrix A:");
printMatrix(A, row1, col1);
System.out.println("\nMatrix B:");
printMatrix(B, row2, col2);
if (row2 != col1) {
System.out.println("\nMultiplication Not Possible");
return;
}
int C[][] = new int[row1][col2];
for (i = 0; i < row1; i++) {
for (j = 0; j < col2; j++) {
for (k = 0; k < row2; k++)
C[i][j] += A[i][k] * B[k][j];
}
}
System.out.println("\nResultant Matrix:");
printMatrix(C, row1, col2);
}
public static void main(String[] args) {
int row1 = 4, col1 = 3, row2 = 3, col2 = 4;
int A[][] = { { 12, 34, 11 },
{ 78, 89, 65 },
{ 12, 11, 42 },
{ 7, 9, 4 } };

int B[][] = { { 1, 2, 3, 4 },
{ 5, 6, 7, 8 },
{ 9, 8, 7, 6 } };

multiplyMatrix(row1, col1, A,
row2, col2, B);
}
}
