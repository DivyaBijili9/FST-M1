import pandas
data = {
    "Usernames": ["admin", "Divya", "Deekshu"],
    "Passwords": ["password", "Db13", "chintoo"]
}
dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("sample.csv", index=False)