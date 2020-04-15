subproceso super(nl)
	Definir np,pt,pp,i como entero
	Definir suma,total como Real
	
	Escribir ""
	Escribir "El precio base del servicio es "
	segun nl hacer
		1: pt<-20000
			Escribir sin Saltar pt,"$ (Lugar:5000$"
		2: pt<-17000
			Escribir sin Saltar pt,"$ (Lugar:2000$"
		3: pt<-22500
			Escribir sin Saltar pt,"$ (Lugar:7500$"
		4: pt<-19000
			Escribir sin Saltar pt,"$ (Lugar:4000$"
		5: pt<-25000
			Escribir sin Saltar pt,"$ (Lugar:10000$"
	FinSegun
	Escribir ", Servicio 15000$)"
	Escribir ""
	Escribir "Ingrese el numero de productos a comprar"
	Leer np
	Escribir ""
	
	mientras np<=0 hacer
		Escribir "Entrada no valida,debe ser mayor que 0"
		Leer np
	FinMientras
	Escribir ""
	
	suma<-0
	
	para i<-1 hasta np Hacer
		Escribir "Digite el valor del producto ",i
		Leer pp
		mientras pp > 0 hacer
			Escribir "El valor del producto ",i," debe ser mayor a 0"
			leer pp
		FinMientras
		suma<-suma+pp
	FinPara
	
	total<-suma+pt
	
	Escribir "El precio de ",np," productos es ",suma,"$ y el total es ",total,"$"
FinSubProceso

subproceso recibo(nl)
	definir pt,pr,nc como entero
	Definir suma como Real
	
	Escribir "El precio base del servicio es "
	segun nl hacer
		1: pt<-15000
			Escribir sin Saltar pt,"$ (Lugar:5000$"
		2: pt<-12000
			Escribir sin Saltar pt,"$ (Lugar:2000$"
		3: pt<-17500
			Escribir sin Saltar pt,"$ (Lugar:7500$"
		4: pt<-14000
			Escribir sin Saltar pt,"$ (Lugar:4000$"
		5: pt<-20000
			Escribir sin Saltar pt,"$ (Lugar:10000$"
	FinSegun
	Escribir ", Servicio 10000$)"
	Escribir ""
	
	Escribir "Digite el precio a pagar"
	Leer pr
	
	mientras pr <= 0 hacer 
		Escribir "Entrada no valida, el precio debe ser mayor a 0"
		leer pr
	FinMientras
	
	Escribir "Digite el numero del recibo"
	Leer nc
	
	mientras nc <= 0 Hacer
		Escribir "Entrada no valida, el numero debe ser mayor a 0"
		leer nc
	FinMientras
	
	suma<-pr + pt
	
	Escribir "El pago de ",pr,"$ al numero ",nc," cuesta en total ",suma,"$"
FinSubProceso

SubProceso envio(nl)
	Definir pt como Entero
	Definir lo,ao,alo como Real
	Escribir "el precio base del servicio es "
	
	segun nl hacer
		1: pt<-10000
			Escribir sin Saltar pt,"$ (Lugar:5000$"
		2: pt<-7000
			Escribir sin Saltar pt,"$ (Lugar:2000$"
		3: pt<-12500
			Escribir sin Saltar pt,"$ (Lugar:7500$"
		4: pt<-9000
			Escribir sin Saltar pt,"$ (Lugar:4000$"
		5: pt<-15000
			Escribir sin Saltar pt,"$ (Lugar:10000$"
	FinSegun
	Escribir ", Servicio 5000$)"
	Escribir ""
	
	Escribir "Las medidas maximas del objeto a transportar son 60 cm de alto,ancho y largo"
	
	Escribir "Digite el alto del objeto (max. 60 cm)"
	leer lo
	
	mientras lo<=0 o lo>60 hacer
		Escribir "El largo debe estar entre 1 y 60"
		leer lo
	FinMientras
	
	Escribir "Digite el ancho del objeto (max. 60 cm)"
	leer ao
	
	mientras ao<=0 o ao>60 hacer
		Escribir "El ancho debe estar entre 1 y 60"
		leer ao
	FinMientras
	
	Escribir "Digite el alto del objeto (max 60 cm)"
	leer alo
	
	mientras alo<=0 o alo>60 hacer
		Escribir "El alto debe estar entre 1 y 60"
		leer alo
	FinMientras
	
	Escribir "El transporte del objeto con medidas ",lo,"cm x",ao,"cm x",alo,"cm hacia"
	segun nl hacer
		1: Escribir sin Saltar " Muiscas cuesta ", pt,"$"
		2: Escribir sin Saltar " el Centro cuesta ",pt,"$"
		3: Escribir sin Saltar "los Hongos cuesta ",pt,"$"
		4: Escribir sin Saltar "las Quintas cuesta ",pt,"$"
		5: Escribir sin Saltar "San Francisco cuesta ",pt,"$"
	FinSegun
	Escribir ""
FinSubProceso

Proceso sin_titulo
	
	Definir ol,os como entero

	Escribir "**************USTA Rappi**************"
	Escribir "De donde desea su servicio?"
	Escribir "1. Muiscas"
	Escribir "2. Centro"
	Escribir "3. Hongos"
	Escribir "4. Las Quintas"
	Escribir "5. San Francisco"
	
	Leer ol
	
	Mientras ol < 1 o ol > 5 hacer 
		Escribir ""
		Escribir "Entrada no valida. Ingrese valor entre 1 y 5"
		Leer ol
	FinMientras
	
	Escribir ""
	Escribir "Que servicio desea?"
	Escribir "1. Compras en supermercado"
	Escribir "2. Pago de Recibos en el Banco"
	Escribir "3. Transporte de objetos"
	Escribir ""	
	Leer os 
	
	Mientras os < 1 o os > 3 hacer
		Escribir "Entrada no valida. Digite entre 1 y 3"
		Leer os
	FinMientras
	
	segun os hacer
		1: super(ol)
	    2: recibo(ol)
		3: envio(ol)
	FinSegun
FinProceso
