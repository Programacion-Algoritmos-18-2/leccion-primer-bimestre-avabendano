from mipaquete import Empleado

e = Empleado()
e.agregar_nombre('Luis')
e.agregar_apellido('Benitez')
e.agregar_cedula('1956523544')

print(e.presentar_datos)