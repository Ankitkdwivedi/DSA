print("To access our website, please choose a username that meets the following criteria:")
print("The username must be between 8 and 15 characters long.")
print("It can only contain numbers and letters.")
print("The first and last characters cannot be numbers.")
print("It must contain a mixture of uppercase letters, lowercase letters, and numbers.")

#Main code
while True:
    # Prompt the user to enter a new username
    username = input("Please enter your new username: ")
    length = len(username)  # Calculate the length of the username
    has_upper = any(char.isupper() for char in username)  # Check for uppercase letters
    has_lower = any(char.islower() for char in username)  # Check for lowercase letters
    has_digit = any(char.isdigit() for char in username)  # Check for numeric digits
    first_char_not_digit = not username[0].isdigit()  # Check if the first character is not a digit
    last_char_not_digit = not username[-1].isdigit()  # Check if the last character is not a digit

    # Display the length of the username and check if it's too short, OK, or too long
    print(f"Length of username: {length} -", end=' ')
    if length < 8:
        print("Too short")
    elif 8 <= length <= 15:
        print("OK")
    else:
        print("Too long")

    # Check if all characters in the username are alphanumeric
    if all(char.isalnum() for char in username):
        print("All characters are alphanumeric - OK")
    else:
        print("Not all characters are alphanumeric - Not OK")

    # Check if the first and last characters are digits
    if first_char_not_digit and last_char_not_digit:
        print("First & last characters are not digits: OK")
    elif not first_char_not_digit and last_char_not_digit:
        print("First character is a number - Not OK")
    elif first_char_not_digit and not last_char_not_digit:
        print("Last character is a number - Not OK")
    else:
        print("First and last characters are numbers - Not OK")

    # Check if the username has at least one uppercase letter
    if has_upper:
        upper_count = 0
        for char in username:
            if char.isupper():
                upper_count += 1

        print(f"# of uppercase letters: {upper_count} - OK")
    else:
        print("There are no uppercase letters - Not OK")

    # Check if the username has at least one lowercase letter
    if has_lower:
        lower_count = 0
        for char in username:
            if char.islower():
                lower_count += 1

        print(f"# of lowercase letters: {lower_count} - OK")

    else:
        print("There are no lowercase letters - Not OK")

    # Check if the username has at least one numeric digit
    if has_digit:
        digit_count = 0
        for char in username:
            if char.isdigit():
                digit_count += 1

        print(f"# of numbers: {digit_count} - OK")

    else:
        print("There are no numbers - Not OK")

    # Check if all the conditions for a valid username are met
    if all([length >= 8, 8 <= length <= 15, all(char.isalnum() for char in username),
            first_char_not_digit, last_char_not_digit, has_upper, has_lower, has_digit]):
        print("Username is valid!!")
        break
    else:
        print("Username is invalid. Try again")
