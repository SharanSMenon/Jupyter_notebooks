"""
Functions that can be applied on integer lists
"""
from functools import *
import math

add = lambda x, y: x + y
min = lambda x, y: y if x > y else x
addList = lambda l: reduce(add, l)


def squareList(l):
    """
    Squares all elements in a list
    :param l:
    :return:
    """
    return list(map(lambda x: x ** 2, l))


def sort(l):
    """
    Sorts a list
    :param l:
    :return: l_sorted
    """
    l_copy = l.copy()
    l_sorted = []
    for i in range(0, len(l_copy)):
        minimum = reduce(min, l_copy)
        # print(minumum)
        l_sorted.append(minimum)
        l_copy.remove(minimum)
    return l_sorted
