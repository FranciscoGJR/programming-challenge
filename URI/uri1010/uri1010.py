line1 = input().split(" ")
line2 = input().split(" ")

code1 = int(line1[0])
amount1 = int(line1[1])
price1 = float(line1[2])

code2 = int(line2[0])
amount2 = int(line2[1])
price2 = float(line2[2])

total = price1 * amount1 + price2 * amount2
'''
print(line1[0])
print(code1)
'''

#print("VALOR A PAGAR: R$ {:.2}".format(total))
print("VALOR A PAGAR: R$ %0.2f"%total)

