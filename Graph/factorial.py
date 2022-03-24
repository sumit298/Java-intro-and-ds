# III. Recursive function to find the factorial

def factorial(num):
    if(num < 1):
        return 1
    else:
        result = factorial(num) + factorial(num+1)
    return result

print(factorial(5))