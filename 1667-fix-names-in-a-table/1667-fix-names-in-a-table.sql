# Write your MySQL query statement below
SELECT user_id, concat(Upper(substring(name, 1, 1)), Lower(substring(name, 2))) as name
FROM Users
ORDER BY user_id