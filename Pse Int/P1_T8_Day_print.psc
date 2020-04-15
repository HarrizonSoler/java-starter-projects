Proceso sin_titulo
	Definir wd como Entero
	
	Escribir "This software prints the day of the week in letters.Made by Harrizon Soler"
	leer wd
	
	mientras wd<1 o wd>7 Hacer
		Escribir "ERROR, must be between 1 and 7"
		Escribir ""
		leer wd
	FinMientras
	
	Escribir Sin Saltar "El dia ",wd," significa "
	
	Segun wd hacer
		1:Escribir "Lunes"
		2:Escribir "Martes"
		3:Escribir "Miercoles"
		4:Escribir "Jueves"
		5:Escribir "Viernes"
		6:Escribir "Sabado"
		7:Escribir "Domingo"
	FinSegun
FinProceso
