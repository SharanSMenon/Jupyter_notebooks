from functools import *
import math

add = lambda x, y: x + y
min = lambda x, y: y if x > y else x
addList = lambda l: reduce(add, l)


def squareList(l):
    return list(map(lambda x: x ** 2, l))


def sort(l):
    l_copy = l.copy()
    ret = []
    for i in range(0, len(l_copy)):
        minimum = reduce(min, l_copy)
        # print(minumum)
        ret.append(minimum)
        l_copy.remove(minimum)
    return ret
