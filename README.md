# List---Programming-Fundamentals-Java-course
Courses from my education Java fundamental  in @SoftUni
Problems for exercises with Lists
1.	Gauss' Trick
Write a program that sum all numbers in a list in the following order: 
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
2.	Merging Lists
You are going to receive two lists with numbers. Create a result list that contains the numbers from both of the lists. The first element should be from the first list, the second from the second list, and so on. If the length of the two lists is not equal, just add the remaining elements at the end of the list.
3.	List Manipulation Basics
Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
Add {number}: add a number to the end of the list
Remove {number}: remove a number from the list
RemoveAt {index}: remove a number at a given index
Insert {number} {index}: insert a number at a given index
Note: All the indices will be valid!
When you receive the "end" command, print the final state of the list (separated by spaces).
4.	List Manipulation Advanced
Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
Print even – print all the numbers that are even separated by a space
Print odd – print all the numbers that are oddly separated by a space
Get sum – print the sum of all the numbers
Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
5.	List of Products
Read a number n and n lines of products. Print a numbered list of all the products ordered by name.
6.	Remove Negatives and Reverse
Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order. In case of no elements left in the list, print "empty".
7.	Train
On the first line, you will be given a list of wagons (integers). Each integer represents the number of passengers that are currently in each wagon. On the next line, you will get the max capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:
•	Add {passengers} - add a wagon to the end with the given number of passengers
•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
In the end, print the final state of the train (all the wagons separated by a space)
8.	Change List
Write a program that reads a list of integers from the console and receives commands which manipulate the list. Your program may receive the following commands: 
•	Delete {element} - delete all elements in the array which are equal to the given element
•	Insert {element} {position} - insert element at the given position
You should stop the program when you receive the command "end". Print all numbers in the array, separated with a single whitespace.
9.	House Party
Write a program that keeps track of guests going to a house party. 
On the first input line, you are going to receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:
•	"{name} is going!"
•	"{name} is not going!"
If you receive the first type of input, you have to add the person if he/she is not on the list. If he/she is in the list, print on the console: "{name} is already in the list!". If you receive the second type of input, you must remove the person if he/she is on the list. If not, print: "{name} is not in the list!". In the end, print all guests.
10.	List Operations
You will be given numbers (a list of integers) on the first input line. Until you receive "End" you will be given operations you must apply on the list. The possible commands are:
•	Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times
Note: The index given may be outside the array's bounds. In that case, print "Invalid index".
11.	Bomb Numbers
Write a program that reads a sequence of numbers and a special bomb number with a certain power. Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right. Detonations are performed from left to right, and all detonated numbers disappear. Finally, print the sum of the remaining elements in the sequence.
12.	Cards Game
You will be given two hands of cards, which will be integer numbers. Assume that you have two players. You must find the winning deck and, respectively, the winner.
You start from the beginning of both hands. Compare the cards from the first deck to those from the second. The player, who has a bigger card, takes both cards and puts them on the back of his hand - the second player's card is last, and the first person's card (the winning one) is before it (second to last), and the player with the smaller card must remove the card from his deck. If both players' cards have the same values - no one wins, and the two cards must be removed from the decks. The game is over when one of the decks is left without any cards. You have to print the winner on the console and the sum of the left cards: "{First/Second} player wins! Sum: {sum}".
13.	Append Arrays
Write a program to append several arrays of numbers.
	Arrays are separated by "|".
	Values are separated by spaces (" ", one or several).
	Order the arrays from the last to the first and their values from left to right.
14.	Anonymous Threat
Anonymous has created a cyber-hyper virus that steals data from the CIA. As the lead security developer in the CIA, you have been tasked to analyze the software of the virus and observe its actions on the data. The virus is known for its innovative and unbelievably clever technique of merging and dividing data into partitions. 
You will receive a single input line containing STRINGS separated by spaces. 
The strings may contain any ASCII character except whitespace.
You will then begin receiving commands in one of the following formats:
•	merge {startIndex} {endIndex}
•	divide {index} {partitions}
Whenever you receive the merge command, you must merge all elements from the startIndex to the endIndex. In other words, you should concatenate them. 
Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.
Every time you receive the divide command, you must DIVIDE the element at the given index into several small substrings with equal length. The count of the substrings should be equal to the given partitions. 
Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with EQUAL LENGTHS, and make the LAST one – the LONGEST. 
Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
The input ends when you receive the command "3:1". At that point, you must print the resulting elements, joined by a space.
15.	Pokémon Don't Go
Ely likes to play Pokémon Go a lot. But Pokémon Go went bankrupt… So, the developers made Pokémon Don't Go out of depression. And so, Ely now plays Pokémon Don't Go. In Pokémon Don't Go, when you walk to a certain Pokémon, those closest to you naturally get further, and those further from you get closer.
You will receive a sequence of integers, separated by spaces - the distances to the Pokémons.
Then you will begin receiving integers corresponding to indexes in that sequence.
When you receive an index, you must remove the element at that index from the sequence (as if you've captured the Pokémon).
•	You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed element with the value of the removed element.
•	You must DECREASE the value of all elements in the sequence which are GREATER than the removed element with the value of the removed element.
If the given index is LESS than 0, remove the first element of the sequence, and COPY the last element to its place.
If the given index is GREATER than the last index of the sequence, remove the last element from the sequence, and COPY the first element to its place.
The increasing and decreasing of elements should be done in these cases, also. The element whose value you should use is the REMOVED element.
The program ends when the sequence has no elements (there are no Pokémons left for Ely to catch).
16.	SoftUni Course Planning
You are tasked to help plan the next Programming Fundamentals course by keeping track of the lessons that will be included in the course, as well as all the exercises for the lessons. 
On the first input line, you will receive the initial schedule of lessons and exercises that will be part of the next course, separated by a comma and space ", ". But before the course starts, there are some changes to be made. Until you receive "course start", you will be given some commands to modify the course schedule. The possible commands are: 
Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
Remove:{lessonTitle} - remove the lesson, if it exists
Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.











