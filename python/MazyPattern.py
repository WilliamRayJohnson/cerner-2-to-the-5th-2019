#cerner_2^5_2019
import random
# Creates a maze like pattern using \ and /
while (True):
    print("/" if random.randint(0, 1) else "\\", end='')