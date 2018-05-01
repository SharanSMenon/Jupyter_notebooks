# Uses python3

import sys
from functools import reduce

minfind = lambda a, b: a if (a < b) else b
is_equal_or_greater = lambda digit, max_digit: True if max_digit >= digit else False


def largest_number(a):
    # write your code here
    answer = ""
    print(a)
    while len(a) != 0:
        max_digit = float("inf")*-1
        for digit in a:
            if is_equal_or_greater(digit, max_digit):
                max_digit = digit
        answer += str(max_digit)
        a.remove(max_digit)
    return answer


if __name__ == '__main__':
    # ip = sys.stdin.read()
    print(is_equal_or_greater(21, 2))
    ip = input("S: ")
    data = ip.split()
    a = data[0:]
    for i in range(len(a)):
        a[i] = int(a[i])
    print(largest_number(a))
