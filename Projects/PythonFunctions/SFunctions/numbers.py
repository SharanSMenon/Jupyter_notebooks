import math


def isPrime(x):
    for i in range(2, x // 2):
        if x % i == 0:
            return False
    return True


isEven = lambda x: x % 2 == 0
isOdd = lambda x: x % 2 == 1


def squared(x):
    return x ** 2


subtract = lambda x, y: x - y
multipliy = lambda x, y: x * y
divide = lambda x, y: x / y


def circleOfNumbers(n, firstNumber):
    if firstNumber >= n // 2:
        return firstNumber - (n // 2)
    else:
        return firstNumber + (n // 2)


def perimeterOfRectangle(s1, s2):
    return s1 * 2 + s2 * 2


def perimeterOfSquare(s):
    return s * 4


def areaOfSquare(s):
    return s ** 2


areaOfRectangle = lambda s1, s2: s1 * s2


def circumference(radius=0, diameter=0):
    if diameter > 0:
        return diameter * math.pi
    elif radius > 0:
        return (2 * radius) * math.pi


def areaOfCircle(radius=0, diameter=0):
    if diameter > 0:
        return math.pi * ((diameter / 2) ** 2)
    elif radius > 1:
        return math.pi * (radius ** 2)


def pythagoreanTheorem(a, b):
    return math.sqrt(a ** 2 + b ** 2)


lawOfCosines = lambda a, b, C: math.sqrt(a ** 2 + b ** 2 - (2 * a * b * (math.cos(math.radians(C)))))
# def lawOfCosines(a, b, C):
#     prt1 = a**2 + b**2
#     prt2 = math.cos(math.radians(C)#
#     prt3 = 2 * a * b * prt2
#     return prt1 - prt3
