# Task1
Write a program with the following functionality:
Pass a string as input (we will assume it is some standardized document number in a given format).
The document number has the format xxxx-yyyy-xxxxx-yyyy-xyxyxy, where x is any digit and y is a letter of the Latin alphabet (can be large and small).
	- Print the first two blocks of 4 digits on one line.
	- Display the document number, but replace blocks of three letters with *** (each letter will be replaced with *).
	- Display only one letter of the document number in the format yyy/yyyy/y/y/y in lower case.
	- Display letters from the document number in the format "Letters:yyy/yyyy/y/y/y/y" in uppercase (implement using StringBuilder class).
	- Check if the document number contains the sequence "abc" and display the message whether it does or not (abc and ABC are considered to be the same sequence).
	- Check if the document number starts with the sequence 555.
	- Check if the document number ends with the sequence 1a2b.
Implement all these methods in a separate class in static methods, each task in a separate method.
The methods will take as input (input parameter) the string input to the program.

A string of arbitrary length with arbitrary words is given.
Find the shortest word in the string and display it on the screen.
Find the longest word in the string and display it on the screen.
If there are several such words, display the last of them.

An arbitrary string is given.
Output a new string to the console, which is
