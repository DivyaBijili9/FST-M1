numbers = list(input("Enter a sequence of comma separated values: ").split(","))
sum1 = 0
for number in numbers:
    sum1 += int(number)
print("The sum of numbers is:\t",sum1)
