while True:
    N1, N2 = map(int, input().split())

    if N1 == N2:
        break

    if N2 % N1 == 0:
        print("factor")
    elif N1 % N2 == 0:
        print("multiple")
    else:
        print("neither")

//// 깔끔