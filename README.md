# Video
(Link goes here)

# Flowchart
I started this process by thinking of the concepts first, and documented it in the flowchart as I went along. Some extra thinking was also documented. https://github.com/KuroFoxCoder/1.2-Word-Frequency/blob/main/1.2%20thought%20process.drawio

# Summarized function
When the program runs, it will first request the user to input a sentence. It will then use split(" ") to use the spaces to divide the sentence into an array of words, unless the sentence has more than 20 words, in which case the program will ask for a new sentence.
When the sentence is under 20 words, after splitting the sentence into an array, getWordFrequency() is called, and counts the number of times a word has appeared in a sentence, ignoring the case of the word.

# Sources
https://docs.oracle.com/javase/8/docs/api/java/lang/String.html for split() usage
https://www.w3schools.com/java/java_user_input.asp for Scanner tutorial I used to implement it
