1.CREATE TABLE postarea
(
id numeric NOT NULL,
mesaj character(20),
data_postarii date,
fk_user bigint,
CONSTRAINT pkp PRIMARY KEY (id),
CONSTRAINT postarea_fk_user_fkey FOREIGN KEY (fk_user)
REFERENCES "user" (id) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION

CREATE TABLE "user"
(
id numeric(20,0) NOT NULL,
username character(20),
parola character(20),
orasul character(20),
blocat boolean,
varsta integer,
CONSTRAINT pku PRIMARY KEY (id)
)


2. select username, mesaj
from "user"
join "postarea"
on "user".id = "postarea".fk_user
where username = 'Adrian'

2.SELECT username
FROM "user";

3.SELECT *
FROM "user"
WHERE blocat='0'

4.Select username, varsta
from "user"
where varsta = (select MIN(varsta) from "user")

5.select username, varsta
from "user"
where (varsta between 23 and 33)
order by varsta ASC

6.SELECT AVG(varsta)
FROM "user"
WHERE blocat = '1'

7.select username
from "user"
where orasul='Cluj-Napoca' and blocat='0'

8.select fk_user, username, mesaj
from "user"
join "postarea"
on "user".id = "postarea".fk_user
where blocat = '0' and orasul = 'Cluj-Napoca' and varsta > 23

9.SELECT username,count(postarea.fk_user) as numar_de_mesaje
from "user"
join "postarea"
on "user".id = "postarea".fk_user
group by
"user".id
order by numar_de_mesaje DESC
limit 1


10.select fk_user, username, mesaj
from "user"
join "postarea"
on "user".id = "postarea".fk_user
where data_postarii between '01.05.2016' and '02.29.2016' and username like 'B%'



11.SELECT *
FROM "postarea"
ORDER BY data_postarii DESC


12.DELETE from "postarea"
WHERE  mesaj like '%politica%'
AND fk_user IN (SELECT id
FROM   "user"
WHERE  varsta<30);