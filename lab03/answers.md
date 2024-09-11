# Lab 3 Answers

## Part 1: Git

### 1.1. List the contents of the lab03-exercises repo immediately after initialization
```
# paste code here
drwxr-xr-x   4 jasminenarehood  staff  128 Sep  5 10:14 .
drwxr-xr-x   8 jasminenarehood  staff  256 Sep  5 10:12 ..
drwxr-xr-x  10 jasminenarehood  staff  320 Sep  5 10:14 .git
-rw-r--r--   1 jasminenarehood  staff    9 Sep  5 10:13 README.md

```

### 1.2. Paste the output of your `git status` command
```
# paste code here
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   README.md



```

### 1.3. Paste the output of the state of your repository after committing your README.md file
```
# paste code here
On branch main
nothing to commit, working tree clean

```

### 1.4. Copy your `git log` output
```
# paste code here
commit 8a8e7e7a32d35e74601dd3bcfbf6cca4821ae8f9 (HEAD -> main)
Author: Jasmine Narehood <jasminenarehood@Jasmines-MacBook-Air.local>
Date:   Thu Sep 5 10:19:39 2024 -0400

    add README.md to the repository

```

### 1.5. Copy your `git diff` output
```
# paste code here
diff --git a/README.md b/README.md
index 6c67b6a..72389fb 100644
--- a/README.md
+++ b/README.md
@@ -1 +1,4 @@
 # Header
+Find All Duplicates: Write a function (or a static method in the case of Java)
+that accepts a list of integers and returns a list of only those integers that
+appear more than once. 

```


### 1.6. Reflection

We've learned 6 git subcommands now. Describe each of them in your own words in the section below:

* git init: Initializes a repository with the name of the current working directory and adds a .git file.
* git status: Tells you your branch, commits, and things that need to be commited.
* git add: Tells git that a particular file will be in the next commit.
* git commit: Commits files that you have added with git add.
* git log: Tells you the author, date, and what has been done.
* git diff: Tells you what has been changed. New lines are noted by a + at the front. 


### 1.7. Practice: Find All Duplicates (Java)
Make sure you implement the `FindDuplicates.java` class as specified in the instructions (with the nested loops implementation).

## Part 2: GitHub

### 2.1. Practice: Find All Duplicates (Python)
Make sure you implement the `find_duplicates.py` file as specified in the instructions (with the nested loops implementation).


## Part 3: Branching

### 3.1. Implement the More Efficient Version of the "Find Duplicates" problem
Implement the more efficient Version of the "Find Duplicates" problem using a dictionary (or hashmap) data structure instead of nested loops. You may do this in either your Python file or in the Java file that you’ve already made. Do this by adding a second function/method to your Java/Python file with a slightly different name.


### 3.2. Link to Repo
Please make sure that the new repo that you made today on GitHub is public, and paste a link to it below.

```bash
# paste your new repo link here...
https://github.com/jnarehoo/lab03-exercises.git

```

### 3.3. What do the three "Merge pull request" options mean? 
Describe each of them in your own words.
"merge pull request" is creating a new commit that points to both previous branches.
"rebase and merge" is redefining when everything occured and allowing it to be a linear order of events. 
"squash and merge" combines the history of both branches when commiting
