Proceso sin_titulo
	Definir ps como Entero
	
	Escribir "This software detemines the grade of the user pressure.Made by Harrizon Soler"
	Escribir ""
	Escribir "Type the systolic user pressure"
	leer ps
	
	si ps<60 Entonces
		Escribir "The user pressure is smaller than normal (must be died)"
	FinSi
	si ps<=120 y ps>60 Entonces
		Escribir "The user pressure is very good"
	FinSi
	si ps>120 y ps<=139 Entonces
		Escribir "The user pressure indicates prehypertension"
	FinSi
	si ps>139 y ps<=159 Entonces
		Escribir "The user pressure indicates hypertension"
	FinSi
	si ps>159 Entonces
		Escribir "The user pressure indicates excesive pressure (must be died)"
	FinSi
FinProceso
