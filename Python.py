def maxval(A):
    max = float('-inf')
    for i in range(len(A)):
        if(A[i] > max):
            max = A[i]
    return max

def minval(A):
    min = float('inf')
    for i in range(len(A)):
        if(A[i] < min):
            min = A[i]
    return min


if __name__ == "__main__":
    A = [1, 2, 4, 5, 3, 9, 5, 6, 7, 8]
    
    print("Max value is: ", maxval(A))
    print("Min value is: ", minval(A))