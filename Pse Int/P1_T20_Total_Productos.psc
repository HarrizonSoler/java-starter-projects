Proceso sin_titulo
	Definir np,i como entero
	definir acum,total,precio como Real
	definir c1 como logico
	
	Escribir "Este software calcula el valor bruto y el total del numero de productos elegidos por el usuario.Hecho por Harrizon Soler"
	Escribir "Digite el numero de productos a calcular"
	Leer np
	
	si np >= 1 Entonces
		acum <- 0
		c1 <- verdadero
		para i=1 hasta np Hacer
			Escribir "Digite el precio del producto " , i
			leer precio
			si precio < 0 entonces
				Escribir "El precio del producto " , i , " no es valido"
				np <- i
				c1 <- falso
			SiNo
				acum <- precio + acum
			FinSi
		FinPara
		si c1 = Verdadero Entonces
			total <- (acum*0.19)+acum
			Escribir "El valor bruto de los productos es " , acum , " y su total es " , total
		FinSi
	SiNo
		Escribir "Entrada no valida, El numero de productos debe ser al menos 1"
	FinSi
FinProceso
