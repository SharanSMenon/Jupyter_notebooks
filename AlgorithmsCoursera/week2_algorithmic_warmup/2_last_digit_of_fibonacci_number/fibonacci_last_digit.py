# Uses python3
import sys


def calc_fib(n):
    f = [0, 1]
    n = n + 1
    for i in range(2, n):
        f.append(f[i - 1] + f[i-2])
    print(f)
    return f[n - 1]

def get_fibonacci_last_digit_naive(n):
    print("Hello")
    number = calc_fib(n)
    print(number)
    return int(str(number)[-1])

if __name__ == '__main__':
    print("Hello")
    n = int(input("Enter number: "))
    print(get_fibonacci_last_digit_naive(n))
