s = 'Pytho@@@9'

upper=0
lower =0
numeric =0
special = 0
for i in s:
    if i.isupper():
        upper=upper+1
    elif i.islower():
        lower=lower+1
    elif i.isnumeric():
        numeric=numeric +1
    else:   
        special = special+1


print(upper)
print(lower)
print(numeric)
print(special)