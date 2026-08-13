select email as Email from Person
group by email
Having (select count(email)) > 1;