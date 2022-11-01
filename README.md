# Coding-Challenge

Jeg kunne ikke få docker til at installerer eller virke på min computer tiltrods for ihærdige forsøg.
Den er lavet i java med brug af springtool frameworket sammen med gradle. 


Jeg har lavet 3 patient journaler(admissions) med 3 forskellige afdelinger og 3 forskellige afdelinger. 
Patient1 er tilknyttet de to først og patient2 er tilknyttet den tredje. 

Kør dette i postman hvorefter den  skriver at denne doctor har adgang  til denne patients filer. 
Hvis doctorid ændres til 2 siger den det samme mens at doctorid = 3 siger den ikke har adgang.
Det samme sker hvis patientId skiftes til 2222222222. 
http://localhost:8080/getpatient?doctorId=1&patientId=1111111111
