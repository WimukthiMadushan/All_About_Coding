numbers = [4,39,19,0,56,83,2,76,10,94,21,12,94,76,46,24]
for i in range(len(numbers)):
    for j in range(len(numbers)-1):
        if numbers[j] > numbers[j+1]:
            numbers[j], numbers[j+1] = numbers[j+1], numbers[j]
print(numbers)