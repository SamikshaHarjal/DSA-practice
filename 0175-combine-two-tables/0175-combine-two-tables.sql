select person.lastName,person.firstName,address.city,address.state
from person
Left join address on person.personId=address.personId
