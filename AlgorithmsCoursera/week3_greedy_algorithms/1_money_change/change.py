# Uses python3
import sys
from functools import reduce


def get_change(m):
    """
    :type m: int
    :param m:
    :return: int
    """
    R = []
    denominations = [1, 5, 10]
    while True:
        if m == 0:
            return len(R)
        for i in denominations:
            if i < m:
                mx = i
        m -= mx
        R.append(mx)


if __name__ == '__main__':
    m = int(sys.stdin.read())
    # m = 95774
    print(get_change(m))
