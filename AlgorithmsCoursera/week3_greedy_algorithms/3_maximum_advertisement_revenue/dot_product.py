# Uses python3

import sys
from functools import reduce


def sorter(lis):
    """
    Sorts lists
    """
    return_ = []
    for i in range(len(lis)):
        smallest = reduce(min, lis)
        index = lis.index(smallest)
        return_.append(lis[index])
        lis.pop(index)
    return return_


def max_dot_product(a, b):
    # write your code here
    res = 0
    as_ = sorter(a)
    bs = sorter(b)
    for i in range(len(as_)):
        res += as_[i] * bs[i]
    return res


if __name__ == '__main__':
    input = sys.stdin.read()
    data = list(map(int, input.split()))
    n = data[0]
    a = data[1:(n + 1)]
    b = data[(n + 1):]
    print(max_dot_product(a, b))
