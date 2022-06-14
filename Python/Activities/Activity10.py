num_tuple = tuple(input("Enter a sequence of values").split(", "))
print("Given list is ", num_tuple)

print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)