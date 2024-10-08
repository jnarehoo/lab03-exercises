def find_duplicates_nested_loop(l: list) -> list:
    unique = []
    original_index = []
    duplicates = []
    #for i in len(l):
    #    for j in len(unique):
    #        for k in len(duplicates):
    #            if (i == j): # they are the same 
    #        if (duplicates.count(i) > 0): # it has already been acounted for ignore it
    #            continue
    #        elif (unique.count(i) > 0): # it has already been accounted for once before
    #            duplicates.append(i)
    #        unique.append(i) # add it to the unique list (I FORGOT THIS INITIALLY)
    for i in range(len(l)):
        for j in range(i + 1, len(l)): # start after the number we are at, and see if anything after matches
            if l[i] == l[j] and l[i] not in duplicates:
                duplicates.append(l[i])
    return duplicates

if __name__ == "__main__":
    sample1 = [3, 7, 5, 6, 7, 4, 8, 5, 7, 66]
    sample2 = [3, 5, 6, 4, 4, 5, 66, 6, 7, 6]
    sample3 = [3, 0, 5, 1, 0]
    sample4 = [3]
    
    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))