def shortestpaths(dist1, num1):
    v = [0 for x in range(num1)]
    src = eval(input("enter the source you are starting from:"))
    sdist = [[9999, str(src)] for x in range(num1 + 1)]  # shortest distance
    v[src - 1] = 1  # visited nodes or places
    sdist[src - 1][0] = 0
    for i in range(num1):
        sdist[i][0] = dist1[src - 1][i]
        sdist[i][1] = str(src)
    vi = 1
    while (vi < num1):
        m = num1
        # find min path
        for i in range(num1):
            if v[i] == 0 and sdist[i][0] < sdist[m][0]:
                m = i
        # check if there are paths
        if m == num1:
            break
        v[m] = 1
        vi += 1
        sdist[m][1] = sdist[int(sdist[m][1]) - 1][1] + str(m + 1)
        for j in range(num1):
            if v[j] == 0 and dist1[m][j] != 9999 and sdist[j][0] > sdist[m][0] + dist1[m][j]:
                sdist[j][0] = sdist[m][0] + dist1[m][j]
                sdist[j][1] = str(m + 1)
    print("the shortest path and distance from ", src, " is")
    for i in range(num1):
        if v[i] == 1:
            print(sdist[i][0], "\t path is ", sdist[i][1])


n = eval(input("enter the number of places: "))
l = []
print("enter the distance between each place if no path enter 9999:", n)
for i in range(n):
    l1 = [int(x) for x in input().split()]
    l.append(l1)
shortestpaths(l, n)
