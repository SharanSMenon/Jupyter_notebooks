# Uses python3
import sys
import random


def qsort_3w(items):
    _sort_3w(items, 0, len(items) - 1)


def _sort_3w(items, lo, hi):
    if hi <= lo:
        return
    lt = lo
    gt = hi
    pivot = items[lo]
    i = lo
    while i <= gt:
        if items[i] < pivot:
            items[lt], items[i] = items[i], items[lt]
            lt += 1
            i += 1
        elif items[i] > pivot:
            items[gt], items[i] = items[i], items[gt]
            gt -= 1
        else:
            i += 1
    _sort_3w(items, lo, lt - 1)
    _sort_3w(items, gt + 1, hi)


if __name__ == '__main__':
    input = sys.stdin.read()
    n, *a = list(map(int, input.split()))
    qsort_3w(a)
    for x in a:
        print(x, end=' ')
