def add_sum(numbers):
    sum_of = 0
    for number in numbers:
        sum_of += number
    return sum_of

numList = [988776, 40, 60, 9009]
result_of_calc = add_sum(numList)
print("The sum of all the elements is: " + str(result_of_calc))
