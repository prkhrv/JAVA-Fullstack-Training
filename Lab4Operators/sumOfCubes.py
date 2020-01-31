num = int(input("Enter the number "))

def sumOfCubes(n):
    sum = 0
    while(n != 0):
        sum = sum + ((n%10)**3)
        n = n // 10

    return sum


print(sumOfCubes(num));