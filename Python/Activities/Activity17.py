import pandas

data = {
    "Usernames": ["admin", "madhu", "babu"],
    "Passwords": ["password", "konduri", "good"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

dataframe.to_csv("sample.csv", index=False)