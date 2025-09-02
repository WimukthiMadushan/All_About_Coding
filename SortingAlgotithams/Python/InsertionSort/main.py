numbers = [42, 7, 89, 15, 63, 28, 97, 54, 3, 36, 21, 76, 12, 88, 5, 67, 45, 90, 33, 18]

for i in range(len(numbers)):
    key  = numbers[i]
    j = i-1
    while j >= 0  and  numbers[j] > key:
        numbers[j+1] = numbers[j]
        j = j-1
    numbers[j+1] = key
print(numbers)



