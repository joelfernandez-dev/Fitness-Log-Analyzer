# Fitness Log Analyzer

A console-based Java application that reads in a list of exercises and lets you analyze it in several ways — sorting, filtering, statistics, and frequency counting.

## Why I built this

Built as an independent project to strengthen core Java fundamentals — arrays, Scanner input, method design, and String manipulation — through something of my own rather than a tutorial.

## How to run it

1. Clone the repo
2. Open in your IDE of choice (built using Eclipse)
3. Run `FitnessLogAnalyzer.java`
4. Enter a comma-separated list of exercises when prompted, then pick an option from the menu

Example input:
```
Bench Press, squats, deadlift, OHP, pull ups, curl, lunges
```

## Menu Options

| Option | Description |
|---|---|
| 1 | Sort the list alphabetically (case-insensitive) |
| 2 | Show only full (multi-word) exercise names |
| 3 | Show only single-word exercise names |
| 4 | Show stats: count, total letters, average length, shortest, longest, population standard deviation |
| 5 | Show exercises with an even length (spaces excluded) |
| 6 | Show exercises with an odd length (spaces excluded) |
| 7 | Show every word that doesn't start with an uppercase letter |
| 8 | Show the most frequent exercise (case-insensitive), or a message if nothing repeats |
| 9 | Enter a new list, replacing the current one |
| 0 | Quit |

## What I learned

- Scanner-based input parsing, including the `nextInt()` / `nextLine()` buffer interaction
- Sorting with `Arrays.sort()` and a `Comparator`
- String immutability, and when `StringBuilder` actually matters
- The accumulator pattern and "track the best so far" pattern
- Designing methods as either return-a-value or void-and-print
