Make sure the MySQL server is running on your laptop.

mysql.server start

SELECT * FROM mysql.user
SELECT user, host FROM mysql.user
SELECT * FROM mysql.help_topic
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic

Run the queries listed above one at a time by copying each individually and pasting it into the mysql prompt.

End each query with a ;.
Run the queries again but put \G at the end instead of ;.
Compare the output of the commands and why one method may be better than another.

Issue the following command to MySQL:


pager less -~SFX
This will tell MySQL to use a pager for output. Specifically, we will specify the pager program named less. A pager is a terminal program designed to handle multiple pages of output.

Re-run the four queries above and notice how the output changes.

You can use the arrow keys to move around the display, and the space bar to jump to the next page of results. In addition, you can use the following keys to navigate in less:

d: go down a half page
u: go up a half page
j: scroll down one line
k: scroll up one line
/: search for a term