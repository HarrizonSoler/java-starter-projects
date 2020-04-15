Proceso sin_titulo
	Definir nm como entero
	
	Escribir "This software determines how many days has the number of month.Made by Harrizon Soler"
	Escribir "Type the number of month to identifies"
	leer nm
	
	mientras nm<1 o nm>12 hacer
		Escribir "ERROR, The input must be between 1 and 12"
		leer nm
	FinMientras
	
	Escribir Sin Saltar "The month with number ",nm," is "
	
	segun nm hacer
		1: Escribir Sin Saltar "January and has 31 days"
		2: Escribir Sin Saltar "February and has 29 days" 
		3: Escribir Sin Saltar "March and has 31 days"
		4: Escribir Sin Saltar "April and has 30 days"
		5: Escribir Sin Saltar "May and has 31 days"
		6: Escribir Sin Saltar "June and has 30 days"
		7: Escribir Sin Saltar "July and has 31 days"
		8: Escribir Sin Saltar "August and has 31 days"
		9: Escribir Sin Saltar "September and has 30 days"
		10: Escribir Sin Saltar "October and has 31 days"
		11: Escribir Sin Saltar "November and has 30 days"
		12: Escribir Sin Saltar "December and has 31 days"
	FinSegun	
FinProceso
