import pandas as pd
data=pd.read_csv("sample.csv")
print(data)
print("Usernames")
print(data["Usernames"])
print("Usernames:",data["Usernames"][1],"|","Password:",data["Passwords"][1])
	
print("Data sorted in ascending Usernames:")
print(data.sort_values('Usernames'))
print("Data sorted in descending Passwords:")
print(data.sort_values('Passwords',ascending=False))

