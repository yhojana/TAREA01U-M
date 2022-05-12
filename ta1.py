 def tarea31():
    #Declarar Variables3.1
    edad=int
    mensaje=str
    #Datos de Entrada
    edad=int(input("Ingrese su edad:"))
    #Proceso 
    if edad>=18:
        mensaje=(f"Puede votar porque su edad es {edad}")
    else:
        mensaje=(f"No puede votar porque su edad es {edad}")
    #Datos de Salida
    print(mensaje)

def tarea32():
    #Declarar Variables3.2
    pago=float
    cantidad=int
    sueldomensual=float
    #Datos de Entrada
    pago=float(input("Ingrese el costo por hora:"))
    cantidad=int(input("Ingrese cantidad horas trabajadas en la semana:"))
    #Proceso y Datos de Salida
    if cantidad>40:
         sueldomensual=40*pago+2*((cantidad-40)*pago)
    else:
        sueldomensual=cantidad*pago
    #Datos de Salida
    print(f"El sueldo del trabajador es {sueldomensual}")


def tarea33():
    #Definir variables3.3
    cantidad=int
    mensaje=str
    #Datos de entrada
    cantidad=int(input("Ingrese la cantidad de dinero: "))
    #Proceso
    if cantidad>=251:
        mensaje="Puedes regalar un anillo."
    elif cantidad>=101 and cantidad<251:
        mensaje="Puede regalar flores."
    elif cantidad>=11 and cantidad<101:
        mensaje="Puede regalar chocolate."
    else:
        mensaje=("Puede regalar una tarjeta.")
    #Datos de salida
    print(mensaje)

    def tarea37():
    #definir variables3.7
    edad=int
    promedio=float
    #datos de entrada
    edad=int(input("Ingresa tu edad :"))
    promedio=float (input("ingresa tu promedio:"))
    #proceso
    if edad>=18: 
    if promedio>=18:
        beca=2000
    else:
    if promedio >=15:
        beca=1000
    if promedio >12 and promedio<15:
        beca=500
    else:
        if promedio<12:
        beca="carta de invitacion "
    else:
    if edad<=18:
    if promedio >=18:
        beca=3000
    else:
    if promedio >=16 and promedio <18:
        beca=2000
    else:
    if promedio <16 and promedio >=12:
        beca=100
    else:
    if promedio<12:
        beca="carta de invitacion"                   
    #datos de salida
    print(f"la beca es de :{beca}")

def tarea38():
    #Declarar Variables3.8
    Anti:int
    sueldo:float
    bonoA:float=0
    bonoS:float
    bonoM:float
    #Datos de Entrada
    anhoA=int(input("Ingrese anho de antiguedad:"))
    sueldo=float(input("Ingrese el sueldo reciente:"))
    #Proceso y Datos de Salida
    if anhoA>2 and anhoA<5:
        bonoA=sueldo*0.20
    elif anhoA>=5:
        bonoA=sueldo*0.30
    if sueldo>3500:
        bonoS=sueldo*0.10
    elif sueldo>=1000 and sueldo<=3500:
        bonoS=sueldo*0.15
    else:
        bonoS=sueldo*0.25
    if bonoA>bonoS:
        bonoM=bonoA
    else:
        bonoM=bonoS
    #Datos de Salida  
    print(f"El Bono que corresponde es: {bonoM}")

def tarea311():
    #definir variables3.11
    anti=int
    bono=int
    #datos de entrada
    anti=int(input("ingrese la antiguedad:"))
    #proceso
    if anti==1:
        bono=100
    else:
    if anti==2:
        bono=200
    else:
    if anti==3:
        bono=300
    else:
    if anti==4:
        bono=400
    else:
    if anti==5:
        bono=500
    else:
    if anti>=5:
        bono=1000
    #datos de salida
    print(f"bono correspondiente :{bono}")
       

def tarea313():
    #definir variables3.13
    a:int
    costo:int
    alumnos:int
    c:float
    #datos de entrada
    a=int(input("Ingresa el total de alumnos :"))
    #proceso
    if a>=100: 
        costo=20
        c=a*costo
    else:
    if a >=50 and a<100:
        costo=35
        c=a*costo
    else:
    if a>=20 and a<50:
        costo=40
        c=a*costo
    else:
        costo=70
        c=a*costo  
    #datos de salida
    print(f"el total a pagar por cada alumno es de  :{costo}")
    print(f"costo total es de :{c}")


def tarea315():
    #definir variables3.15
    dia=str
    n=int
    #datos de entrada
    n=int(input("ingrese un numero:"))
    #proceso
    if n==1:
        dia="lunes"    
    else:
    if n==2:
        dia="martes"
    else:
    if n==3:
        dia="miercoles"
        else:
            if n==4:
                dia="jueves"
        else:
        if n==5:
                dia="viernes"
        else:
         if n==6:
                dia="sabado"
        else:
                    if n==7:
                dia="domingo"
                    
        #datos de salida
                print(f" al numero :{n} le corresponde el dia: {dia}")
       




    def tarea318():
    #definir variables3.18
    antiguedad=int
    sueldo=int
    bono=int
    bono_1=int
    #datos de entrada
    antiguedad=int(input("Ingresa el valor de antiguedad:"))
    sueldo=float(input("ingresa tu sueldo:"))
    #proceso
    if antiguedad >4 and sueldo >2000:
    bono=sueldo*.25
    print("Bono del 25%")
    bono_1=sueldo+bono
    else:
    bono=sueldo*.20
    print("bono del 20%") 
    bono_1=sueldo+bono
    #datos de salida
    print(f"Te corresponde un bono de:{bono}")
    print(f"total del saldo:{bono_1}")




    def tarea319():
    #definir variables3.19
    edad=int
    sexo=int
    #datos de entrada
    edad=int(input("ingrese su edad:"))
    #Proceso
    if edad>70:
    vacuna="C"
    else:
            if edad<16:
            vacuna="a"
            
            else:
            if edad >16 and edad<69:
                mujer=1
                hombre=2
                print("mujer =1  hombre=2")
                sexo=int(input("ingrese  el sexo:"))
                sexo=1
                vacuna="b"
            else:
                sexo=2
                vacuna="a"     
    #datos de salida
    print(f"tipo de vacuna: {vacuna}")

