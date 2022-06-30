


l=[5,9,10,2,3]

f=l[0]
for i in l:
    if f>=i:
        f=f
    else:
        f=i
l.remove(f)
s=l[0]
for j in l:
    if s>=j:
        s=s
    else:
        s=j
print(s)
        
