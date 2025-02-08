import random
random_num=random.randint(1,100)
#print(random_num)
n=0
print("enter the number from 1 - 100 \n that match the guess of system\n")
while random_num!=n:
    n=int(input(" n: "))
    if n==random_num:
        break
    elif n>random_num:
        print("n > target")
    elif n<random_num:
        print("n < target")
print("---->hurray---->you have guess the correct")



