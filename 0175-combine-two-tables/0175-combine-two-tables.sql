SELECT firstName, lastName, city, state
From Person
LEFT Join Address ON Person.personId = Address.personId; 

