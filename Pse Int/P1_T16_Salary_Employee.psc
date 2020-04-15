Proceso sin_titulo
	Definir sm,dm,div como Real
	
	Escribir "This software determine the salary of an employee. Harrizon Soler"
	Escribir "Type the month salary of the employee"
	leer sm
	
	mientras sm<=0 hacer
		Escribir "ERROR, The input must be greater than 0"
		leer sm
	FinMientras
	
	Escribir "Type the days hired of the month"
	leer dm
	
	Mientras dm<=0 o dm>30 hacer 
		Escribir "ERROR, The input must be between 1 and 30"
		leer dm
	FinMientras
	
	div<-sm/dm
	
	Escribir "The salary of the employee is ",div
FinProceso
