def isPrime(x):
    for i in range(0,x//2):
        if x % 2 == 0:
            return False
    return True
isEven = lambda x: x % 2 == 0