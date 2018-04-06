from SFunctions.NFunctions.lists import *
from SFunctions.NFunctions.numbers import *
from SFunctions.NFunctions.strings import *
import numpy

# Tests
# Lists
l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print("List " + str(l))
print("Sum of l: " + str(addList(l)))
print("All elements in l sqared: " + str(squareList(l)))
lSort = list(list(numpy.random.randint(low=0, high=10, size=(1, 10)))[0])
print("Random list to sort: " + str(lSort))
print("Sorted: " + str(sort(lSort)))
print("-----")
# Numbers
print("5 is prime: " + str(isPrime(5)))
print("10 is prime: " + str(isPrime(10)))
print("5 is even: " + str(isEven(5)))
print("10 is even: " + str(isEven(10)))
print("5 is odd: " + str(isOdd(5)))
print("10 is odd: " + str(isOdd(10)))
print("10 - 5 = " + str(subtract(10, 5)))
print("10 * 5 = " + str(multipliy(10, 5)))
print("10 / 5 = " + str(divide(10, 5)))
print("Circle of Numbers for n = 10 and firstNumber = 2: " + str(circleOfNumbers(10, 2)))
print("Perimeter of rectangle with side length 10 and 8: " + str(perimeterOfRectangle(10, 8)))
print("Area of rectangle with side length 10 and 8: " + str(areaOfRectangle(10, 8)))
print("Area of circle with radius 5: " + str(areaOfCircle(radius=5)))
print("Area of circle with diameter 20: " + str(areaOfCircle(diameter=20)))
print("Area of square with side 10: " + str(areaOfSquare(10)))
print("Perimeter of square with side 10: " + str(perimeterOfSquare(10)))
print("Circumference of circle with radius 5: " + str(circumference(radius=5)))
print("Circumference of circle with diameter 7: " + str(circumference(diameter=7)))
print("Hypotenuse for right triangle legs 3 and 4: " + str(pythagoreanTheorem(3, 4)))
print("Law of cosines for a, b = 10 and C = 25: " + str(lawOfCosines(10, 10, 25)))
print("-----")
print("String tests")
print("Check if 'civic' is a palindrome: "+str(checkPalindrome("civic")))
print("Check if 'hello' is a palindrome: "+str(checkPalindrome("hello")))
print("'Hello world' reversed: "+reverse("Hello world"))

