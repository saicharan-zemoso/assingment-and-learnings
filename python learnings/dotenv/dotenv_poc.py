import dotenv
dotenv.load_dotenv() #loads the .env file we can pass the path of the file as well
import os
print(os.getenv("SECREAT_MESSAGE")) #loads the value for from the environment variables
print(dotenv.find_dotenv()) #finds the path to the .env file
print(dotenv.dotenv_values("./other env/.env")) # gets the values in dotenv in the form of dict
print(dotenv.get_key("./other env/.env","HELLO_MESSAGE")) # gets the key value from the specified file with the value and returns none if not exist
dotenv.set_key("./other env/.env","NEW_MESSAGE","THIS IS A NEW MESSAGE") # sets the value in the .env file
print(dotenv.dotenv_values("./other env/.env"))
print(dotenv.unset_key("./other env/.env","NEW_MESSAGE")) #removes the value with given key if it does not exit it returns false 
print(dotenv.dotenv_values("./other env/.env"))