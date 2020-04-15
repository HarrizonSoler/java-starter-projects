Proceso sin_titulo
	Definir p,i Como Entero
	Definir pr,sum,sobr Como Real
	
	i<-0
	sum<-0
	sobr<-0
	p<-0
	
	Escribir "Este software suma los precios de varios productos hasta que sume 500.000 o menos"
	Escribir "Hecho por Harrizon Soler"
	Escribir ""
	Mientras sum <= 500000 Hacer
		i<-i+1
		Escribir "Digite el precio del ",i," producto"
		leer pr
		sum <- sum + pr
		Escribir ""
		si sum = 500000 entonces
			Escribir "La cuenta va por ",sum,"$ (Se recomienda no añadir mas)"
		SiNo
			Escribir "La cuenta va por ",sum,"$"
		FinSi
		Escribir ""
	FinMientras
	si sum > 500000 Entonces
		Escribir "Se tuvo que restar ",pr,"$ del precio ya que exede el precio"
		sum <- sum- pr
	FinSi
	sobr <- 500000 - sum
	Escribir "El total de productos suma: ",sum,"$ quedando sobrado: ",sobr,"$"
FinProceso
