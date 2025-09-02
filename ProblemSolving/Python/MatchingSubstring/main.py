def FindSubstring():
    text = "Hello World"
    pattern = "world"

    if pattern in text:
        print("Yes")
    else:
        print("No")

def FindAndCountSubstringWithOverlap():
    text = "aababa";
    pattern = "aba";

    count = 0
    start = 0

    while (start := text.find(pattern, start)) != -1 :
        count += 1
        start += 1

    print(count)


def FindAndCountSubstringWithOutOverlap():
    text = "aababa";
    pattern = "aba";

    count = 0
    start = 0

    while (start := text.find(pattern, start)) != -1:
        count += 1
        start += len(pattern)

    print(count)

FindSubstring()
FindAndCountSubstringWithOverlap()
FindAndCountSubstringWithOutOverlap()
