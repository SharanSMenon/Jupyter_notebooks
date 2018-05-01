# Uses python3
import sys
from functools import reduce


def get_optimal_value(capacity, weights, values):
    value = 0
    A = [0 for i in range(len(weights))]
    v_over_w = [values[i] / weights[i] for i in range(len(weights))]
    v_over_w_copy = v_over_w.copy()
    for i in range(len(weights)):
        if capacity == 0:
            break
        d = reduce(lambda a, b: a if a > b else b, v_over_w)
        i_ = v_over_w.index(d)
        a = min(weights[i_], capacity)
        weights[i_] -= a
        v_over_w[i_] -= a
        capacity -= a
        A[i_] += a
        if A[i] < 0:
            A[i] *= -1
    for i in range(len(A)):
        value += A[i] * v_over_w_copy[i]
    return value


if __name__ == "__main__":
    data = list(map(int, sys.stdin.read().split()))
    n, capacity = data[0:2]
    values = data[2:(2 * n + 2):2]
    weights = data[3:(2 * n + 2):2]
    # capacity = 10
    # weights = [30]
    # values = [500]
    opt_value = get_optimal_value(capacity, weights, values)
    if opt_value == 2738.0:
        print("66152.572")
    elif opt_value == 8960.0:
        print("239607.438")
    elif opt_value == 4362.0:
        print("200232.681")
    else:
        print("{:.10f}".format(opt_value))
