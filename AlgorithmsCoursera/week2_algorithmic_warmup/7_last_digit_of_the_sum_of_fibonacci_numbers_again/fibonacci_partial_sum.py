# Uses python3
import sys
from functools import reduce
def partial_sum(from_, to):
    f = [0, 1]
    for i in range(2, to + 1):
        f.append(f[i - 1] + f[i - 2])
    filtered = f[from_:to + 1]
    sm = str(reduce(lambda a, b: a + b, filtered))
    return int(sm[-1])

if __name__ == '__main__':
    input = sys.stdin.read()
    from_, to = map(int, input.split())
    # from_ = int(input("Enter number 1: "))
    # to= int(input("Enter number 2: "))
    print(partial_sum(from_, to))
