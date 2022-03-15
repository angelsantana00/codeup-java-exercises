Make sure the MySQL server is running on your laptop.

mysql.server start

SELECT * FROM mysql.user
SELECT user, host FROM mysql.user
SELECT * FROM mysql.help_topic
SELECT help_topic_id, help_category_id, url FROM mysql.help_topic