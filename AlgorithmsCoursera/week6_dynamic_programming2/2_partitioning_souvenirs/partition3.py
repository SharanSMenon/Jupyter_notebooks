# Uses python3
import sys
import itertools


def isSubsetSum(arr, n, sum):
    if sum == 0:
        return 1
    if n == 0 and sum != 0:
        return 0
    if arr[n-1] > sum:
        return isSubsetSum(arr, n-1, sum)

    return isSubsetSum(arr, n-1, sum) or isSubsetSum(arr, n-1, sum-arr[n-1])
def partition3(arr):
    n = len(arr)
    sum = 0
    for i in range(0, n):
        sum += arr[i]
    if sum % 2 != 0:
        return 0
    return isSubsetSum(arr, n, sum // 2)

if __name__ == '__main__':
    input = sys.stdin.read()
    n, *A = list(map(int, input.split()))
    print(partition3(A))

