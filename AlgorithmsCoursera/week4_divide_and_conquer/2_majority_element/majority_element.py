# Uses python3
import sys


def get_majority_element(a):
    count = {i: 0 for i in a}
    for i in range(0, len(a)):
        count[a[i]] += 1
    for i in count:
        if count[i] > len(a) / 2:
            return True
    return False


if __name__ == "__main__":
    input = sys.stdin.read()
    n, *a = list(map(int, input.split()))
    if get_majority_element(a):
        print(1)
    else:
        print(0)
