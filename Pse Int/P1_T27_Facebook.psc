Proceso sin_titulo
	Definir inte,cnt como Entero
	
	Escribir "Este software simula un ingreso de usuario con 3 intentos"
	Escribir "Hecho por Harrizon Soler"
	Escribir ""
	
	inte <- 3
	
	Mientras inte>0 Hacer
		Escribir "Digite la contraseña, Intentos: ", inte
		leer cnt
		Si cnt=352 o cnt=259 o cnt=569 entonces
			Escribir ""
			Escribir "*****Contraseña Correcta*****"
			Escribir ""
			Escribir "  __^__                                      __^__"
			Escribir " ( ___ )------------------------------------( ___ )"
			Escribir "  | / |                                      | \ |"
			Escribir "  | / |               Facebook               | \ |"
			Escribir "  |___|                                      |___|"
			Escribir " (_____)------------------------------------(_____)"
			inte <- 0
		SiNo
			Escribir "Contraseña no valida"
			Escribir ""
			inte <- inte - 1
		FinSi
		
	FinMientras
FinProceso
