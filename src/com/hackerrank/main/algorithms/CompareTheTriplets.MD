Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet A=(a0,a1,a2), and the rating for Bob's challenge to be the triplet B=(b0,b1,b2).

Your task is to find their comparison points by comparing  a0 with b0 , a1 with b1, and a2 with b2.

If ai>bi, then Alice is awarded  point.
If ai<bi, then Bob is awarded  point.
If ai=bi, then neither person receives a point.
Comparison points is the total points a person earned.

Given A and B, can you compare the two challenges and print their respective comparison points?

### Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

## Constraints

### Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

### Sample Input

5 6 7
3 6 10
### Sample Output

1 1 
### Explanation

In this example:

Now, let's compare each individual score:

, so Alice receives  point.
, so nobody receives a point.
, so Bob receives  point.
Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
