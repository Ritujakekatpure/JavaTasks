CREATE DATABASE practice1;
USE practice1;
CREATE TABLE teacher (t_id int PRIMARY KEY , t_name VARCHAR(25));
CREATE TABLE course (c_id int PRIMARY KEY , c_name VARCHAR(20) , teacher int , FOREIGN KEY (teacher) REFERENCES teacher(t_id));
CREATE TABLE student (s_id int PRIMARY KEY , s_name VARCHAR(20) , course int , FOREIGN KEY (course) REFERENCES course(c_id));
CREATE TABLE WORKER(w_id int , w_name varchar(20) , w_salary int , w_department varchar(10) );
INSERT INTO WORKER VALUES(1 , 'DEEPAK' ,30000, 'SALES'),(2 ,'RAMESH' ,50000,'FINANACE'),(3,'SURESH',50000,'FINANCE'),(4 ,'PRADEEP' ,20000,'SALES'),(5,'RAM',20000,'FINANCE');
CREATE TABLE employee(id int , name varchar(20));
CREATE TABLE manager(id int , name varchar(20));
INSERT INTO employee VALUES(1 , 'DEEPAK'),(2 ,'RAMESH'),(3,'SURESH'),(4 ,'PRADEEP');
INSERT INTO manager VALUES(1 , 'DEEPAK' ),(4 ,'PRADEEP' );
INSERT INTO teacher VALUES(1 , 'Upendra Singh'),(2 , 'Vivek Menonn'),(3,'Rohit Jain'),(4,'Pooja Gupta');
INSERT INTO course VALUES(1 , 'Python' ,4),(2,'CPP',2),(3,'SQL',3),(4,'JAVA',1);
INSERT INTO student VALUES(1 ,'Rituja' , 4 ),(2,'Rishabh',4),(3,'Rishi',1),(4,'Aman',3),(5,'Pawan',2),(6,'Nandini',4),(7,'Gayatri',4),(8,'Shivani',2);
-- UNION UNION aLL
SELECT * FROM employee UNION SELECT * FROM manager;
SELECT * FROM employee UNION ALL SELECT * FROM manager;
-- AGGREGATE FUNCTIONS , GROUP BY  AND HAVING
SELECT COUNT(w_id) AS workers FROM WORKER ;
SELECT SUM(w_salary) AS SUM FROM WORKER ;
SELECT MIN(w_salary) AS MINIMUM FROM WORKER ;
SELECT MAX(w_salary) AS MAXIMUM FROM WORKER ;
SELECT AVG(w_salary) AS AVERAGE FROM WORKER;
SELECT ROUND( AVG(w_salary)) AS ROUND FROM WORKER;
SELECT w_department , w_name ,MAX(w_salary) as maximum FROM WORKER GROUP BY w_department;
SELECT w_department , w_name ,MAX(w_salary) as maximum FROM WORKER GROUP BY w_department HAVING w_department = 'SALES' ;
-- WINDOW FUNCTION 
SELECT w_name , w_department, w_salary , MAX(w_salary) OVER(PARTITION BY w_department) AS MAX_Salary FROM WORKER;
SELECT  w_name , w_department , ROW_NUMBER() OVER(ORDER BY w_department) AS "ROW_NUMBER" , RANK() OVER(ORDER BY w_department) AS "RANK" ,DENSE_RANK() OVER(ORDER BY w_department) AS "DENSE RANK" FROM WORKER;
-- Join
SELECT s_name ,c_name From student INNER JOIN course ON course=c_id;
SELECT s_name ,c_name From student CROSS JOIN course ; 
SELECT s_name ,c_name From student LEFT JOIN course ON s_id=c_id; 
SELECT s_name ,c_name From student RIGHT JOIN course ON s_id=c_id; 
-- EXTRAS
UPDATE student SET  s_name=' Moin WHERE' WHERE s_id= 8;
SELECT * FROM student;
SELECT * FROM student WHERE s_name LIKE('%i');
SELECT * FROM WORKER ORDER BY w_salary DESC;
SELECT w_name, w_salary FROM WORKER WHERE w_salary BETWEEN 20000 AND 30000;
ALTER TABLE manager CHANGE COLUMN name m_name varchar(20);
DESC manager;