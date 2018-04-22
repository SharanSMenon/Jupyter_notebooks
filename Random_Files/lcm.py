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


def lcm(a, b):
    """
    An efficient algorithm to calculate LCM \n
    This algorithm works efficiently.
    """
    return a * b // gcd(a, b)
print(lcm(2203,123))
