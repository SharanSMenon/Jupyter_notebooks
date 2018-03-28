from functools import reduce
add = lambda x,y: x+y
addList = lambda l: reduce(add,l)