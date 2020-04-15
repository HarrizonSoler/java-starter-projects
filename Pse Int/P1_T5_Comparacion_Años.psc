Proceso sin_titulo
	Definir a1,a2 Como Real
	
	Escribir "This software compare two years entered by the user, made by Harrizon Soler"
	
	Escribir "Digit the birth year of the first person"
	leer a1
	Escribir ""
	Escribir "Digit the birth year of the second person"
	leer a2
	Escribir ""
	si a1 = a2 Entonces
		Escribir "The years ",a1," and ",a2," are equal"
	sino 
		si a1 < a2 entonces
			Escribir "The year ",a1," is greater than ",a2
		FinSi
		si a1 > a2 Entonces
			Escribir "El año ",a1," is less than ",a2
		FinSi
	FinSi
FinProceso
