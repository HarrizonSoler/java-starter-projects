Proceso sin_titulo
	definir r,h,vol como Real
	
	Escribir "This software calculates the volume of a cilinder knowing the radius and height. Made by Harrizon Soler"
	Escribir "Type the radius of the cilinder"
	leer r
	Mientras r<=0 hacer
		Escribir "ERROR, The radius must be greater than 0"
		leer r
	FinMientras
	Escribir "Type the height of the cilinder"
	leer h
	Mientras h<=0 hacer
		Escribir "ERROR, The height must be greater than 0"
		leer h
	FinMientras
	
	vol <- PI * (r^2) * h
	
	Escribir "El radio del cilindro de radio ",r," y altura ",h," es ",vol
FinProceso^

