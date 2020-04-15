Proceso sin_titulo
	Definir p1,p2,p3,p4,suma,iva,total Como Real
	
	Escribir "this software calculates the total value of four products, Made by Harrizon Soler"
	Escribir ""
	Escribir "Digit the value of product 1"
	leer p1
	Escribir ""
	
	Escribir "Digit the value of product 2"
	leer p2
	Escribir ""
	
	Escribir "Digit the value of product 3"
	leer p3
	Escribir ""
	
	Escribir "Digit the value of product 4"
	leer p4
	Escribir ""
	
	suma <- p1+p2+p3+p4
	iva<- suma*0.19
	total <- suma+iva
	
	Escribir "The gross value ",suma," + the iva ",iva," is equal to ",total
	
FinProceso
