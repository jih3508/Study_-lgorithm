arr = list(map(int, input().split()))
r = list(range(1, 9))
if arr == r: print('ascending')
elif arr == r[::-1]: print('descending')
else: print('mixed')