n=int(input(" ENTER A NUMBER ..."))
for i in range(n):
    for j in range(n):
        if i==j:  # diagonal
            print(chr(97+i), end="")
        elif(i==0 or i==n-1 or j==0 or j==n-1):  # border
            print(" * ", end="")
        else:
            print("  ",end=" ")
    print()
