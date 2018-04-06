'''
String functions
'''


def checkPalindrome(x):
    if x[::-1] == x:
        return True
    return False
reverse = lambda s:s[::-1]
