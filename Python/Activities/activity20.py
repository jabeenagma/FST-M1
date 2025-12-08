import pandas as pd
data=pd.read_excel("sample.xlsx")
print(data) 
print("Number of rows and columns are:",data.shape)
print("Printing the data in the emails column only")
print(data['Email'])
print("Printing the data after sorting")
print(data.sort_values('FirstName'))
