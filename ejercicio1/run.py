from mipaquete.Empleado import Empleado, EmpleadoPorHoras, EmpleadoFijo

# Utilizacion de la clase Padre Empleado
e = Empleado()
e.agregar_nombre('Luis')
e.agregar_apellido('Benitez')
e.agregar_cedula('1956523544')

print(e.presentar_datos())

# ------------------
print("\n\n")

# Utilizacion de la clase Hija EmpleadoPorHoras
e1 = EmpleadoPorHoras()
nombre = input('Ingrese su nombre:\n')
e1.agregar_nombre(nombre)
e1.agregar_apellido('Andrade')
e1.agregar_cedula('112233')
e1.agregar_numero_horas(202)
e1.agregar_valor_hora(15)

print(e1.presentar_datos())

# ------------------
print("\n\n")

# Utilizacion de la clase Hija EmpleadoFijo
e2 = EmpleadoFijo()
e2.agregar_sueldo_fijo(3002)
e2.agregar_descuento_seguro(10) # Porcentaje
comision = float(input('Ingresa comision:\n'))
e2.agregar_comision_fija(comision)
e2.nombre = "Ana"
e2.apellido= "Diaz"

print(e2.presentar_datos())