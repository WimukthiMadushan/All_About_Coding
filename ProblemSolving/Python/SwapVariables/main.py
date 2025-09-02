a = 10
b = 20

def SwapUsingThirdVariable(a, b):
    print("Before Swapping", "a = ", a, "b=" , b)
    temp = a
    a = b
    b = temp
    print("After Swapping", "a = ", a, "b=" , b)

def SwapWithoutThirdVariable(a, b):
    print("Before Swapping", "a = ", a, "b=" , b)
    #a,b = b,a
    #[a,b] = [b,a]
    # a = 10, b = 20
    a = a + b # a = 30
    b = a - b # b = 10
    a = a - b # a = 20
    print("After Swapping", "a = ", a, "b=" , b)

#SwapUsingThirdVariable(a, b)
SwapWithoutThirdVariable(a, b)


