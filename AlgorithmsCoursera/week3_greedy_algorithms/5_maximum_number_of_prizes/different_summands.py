# Uses python3
import sys


def optimal_summands(n):
    summands = []
    k = n
    if n <= 2:
        summands = [n]
        return summands
    i = 1
    while True:
        if k == 0:
            return summands
        kmi = k - i
        if kmi > i:
            summands.append(i)
            k -= i
        else:
            summands.append(k)
            return summands
        i += 1


if __name__ == '__main__':
    input = sys.stdin.read()
    n = int(input)
    summands = optimal_summands(n)
    print(len(summands))
    for x in summands:
        print(x, end=' ')
