# Uses python3
import sys


def gcd(a, b):
    """
    An efficient algorithm to compute GCD \n
    a is a number \n
    b is the other number \n
    no other arguments
    """
    if b == 0:
        return a
    ap = a % b
    return gcd(b, ap)

def lcm_naive(a, b):
    return a * b / gcd(a, b)


if __name__ == '__main__':
    input = sys.stdin.read()
    a, b = map(int, input.split())
    print(int(lcm_naive(a, b)))