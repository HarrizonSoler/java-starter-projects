Proceso sin_titulo
	Definir edad como Real
	
	Escribir "This software identifies the kind of age.Made by Harrizon Soler"
	Escribir "Type the age to identifies"
	leer edad
	
	si edad<0 entonces
		Escribir "ERROR, The age must be greater than 0"
	FinSi
	si edad>0 y edad<6 Entonces
		Escribir "The person with age ",edad," is a child"
	FinSi
	si edad>=6 y edad<18 Entonces
		Escribir "The person with age ",edad," is a teen"
	FinSi
    si edad>=18 y edad<45 entonces
		Escribir "The person with the age ",edad," is an adult"
	FinSi
	si edad>=45 y edad<90 Entonces
		Escribir "The person with the age ",edad," is an older adult"
	FinSi
	si edad >= 90 Entonces
		Escribir "The person with the age ",edad," is a matusalen"
	FinSi
FinProceso
