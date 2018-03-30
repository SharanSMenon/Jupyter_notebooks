def isPrime(x):
    for i in range(2, x // 2):
        if x % i == 0:
            return False
    return True


isEven = lambda x: x % 2 == 0
isOdd = lambda x: x % 2 == 1