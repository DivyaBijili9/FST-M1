def calculateSum(num):
    if num:
        # Recursive function call
        return num + calculateSum(num - 1)
    else:
        return 0
results = calculateSum(20)
print(results)
