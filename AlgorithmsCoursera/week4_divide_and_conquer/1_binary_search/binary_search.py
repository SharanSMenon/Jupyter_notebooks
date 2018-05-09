# Uses python3
import sys


def binary_search(list_: list, key: int, low=0, high=0):
    """

    :param list_: list
    :param key: int
    :param low: int
    :param high: ubt
    :return:
    """
    if high < low:
        return -1
    if high == 0:
        high = len(list_)
    mid = low + int(((high - low) / 2))
    try:
        _ = list_[mid]
    except IndexError:
        return -1
    if key == list_[mid]:
        return mid
    elif key < list_[mid]:
        return binary_search(list_, key, high=mid - 1, low=low)
    else:
        return binary_search(list_, key, low=mid + 1, high=high)


def linear_search(a, x):
    for i in range(len(a)):
        if a[i] == x:
            return i
    return -1


if __name__ == '__main__':
    input = sys.stdin.read(27)
    data = list(map(int, input.split()))
    n = data[0]
    m = data[n + 1]
    a = data[1: n + 1]
    for x in data[n + 2:]:
        # replace with the call to binary_search when implemented
        print(binary_search(a, x), end=' ')
