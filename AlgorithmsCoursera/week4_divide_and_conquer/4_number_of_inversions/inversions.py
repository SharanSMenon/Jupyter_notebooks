# Uses python3
import sys


def get_number_of_inversions(a, left, right):
    inv_count = 0
    for i in range(n):
        for j in range(i + 1, n):
            if (a[i] > a[j]):
                inv_count += 1

    return inv_count


if __name__ == '__main__':
    input = sys.stdin.read()
    n, *a = list(map(int, input.split()))
    # b = n * [0]
    print(get_number_of_inversions(a, 0, len(a)))
