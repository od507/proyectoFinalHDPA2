# proyectoFinalHDPA2
Proyecto Final Herramientas II

Se desea que cree un programa para administrar un parqueadero. A continuación, describiremos las opciones con las que debe contar el programa:
1. Configurar la matriz/archivo de estacionamientos El parqueadero tiene solo 35 puestos disponibles y está organizado en cinco filas en donde se pueden estacionar siete autos por fila, cada estacionamiento tiene un id que lo identifica y el mismo está formado por una letra que identifica la fila y un número que corresponde a la columna (A1, A2, A3…A7).
En esta opción debe permitirle al usuario configurar cuales columnas van a ser para Premium, cuáles van a ser VIP y el resto quedaría disponible para tarifa por minuto.
2. Consultar Disponibilidad En esta opción el usuario debe poder ver la matriz de estacionamientos con aquellos estacionamientos que estén ocupados debe aparecer la palabra ocupado. Como aparece en el ejemplo:

   ![image](https://github.com/od507/proyectoFinalHDPA2/assets/68254453/b0689c78-0d44-406d-8ed8-4f19a95a8257)
Puede suceder que en algún momento los estacionamientos Premium o Vip estén llenos y exista demanda. El sistema debe permitir hacer una reasignación de espacios permitiéndole al usuario
tomar uno de los estacionamientos disponibles y asignarlo ya sea a Premium o a Vip según sea el caso

3. Ingreso del Auto al Estacionamiento Cuando un auto llega al parqueadero, el encargado le
solicita al cliente el número de placa, para verificar si ya está registrado el auto en el sistema. Se
pueden dar dos escenarios:
a. Si el auto está registrado en el sistema: El encargado le pregunta al conductor que tipo de
alquiler desea realizar y procede a verificar la disponibilidad en el sistema para este tipo de
alquiler, de tener disponibilidad, procede a verificar el nombre del conductor y el teléfono
que está registrado en el sistema, procede a indicarle el estacionamiento que debe utilizar y
le suministra un tiquete al cliente con la hora en la cual entró y la placa del vehículo.
b. Si el auto no está registrado en el sistema: Le pregunta el tipo de alquiler que desea y
verifica la disponibilidad, de tener espacios disponibles procede a solicitarle los datos al
conductor, le indica el estacionamiento que debe utilizar y le suministra un tiquete al cliente
con la hora en la cual entró y la placa del vehículo.
4. Registrar Auto en el Sistema
De acuerdo al tipo de cliente se deben registrar los datos requeridos. Datos que debe suministrar el
conductor de acuerdo al tipo de alquiler
a. Datos del Auto para el Alquiler de Estacionamiento con Tarifa por Minuto
• Número de Placa
• Marca
• Modelo o Año
• Color del Auto
• Nombre del Conductor
• Numero de Celular
• Teléfono de Contacto en caso de alguna emergencia
b. Datos del Auto para el Alquiler de Estacionamiento con Tarifa por Día
• Número de Placa o Marca o Modelo
• Año o Nombre del Conductor
• Número de Celular
• Teléfono de Contacto en caso de alguna emergencia o Email
c. Datos del Auto para el Alquiler de Estacionamiento con Tarifa por Mes
• Número de Placa
• Marca
• Modelo
• Año o Nombre del Conductor o Número de Celular
• Teléfono de Contacto en caso de alguna emergencia
• Email
• Cédula
• Copia de la Licencia
• Registro Único Vehicular
• Póliza de Seguro
Cuando el cliente va a retirar el auto le entrega al encargado el tiquete y este procede a indicarle
cuanto debe pagar basado en el tiempo que duro el auto usando el parqueadero si es un cliente
Premium la tarifa diaria.
En los casos en que el cliente ha solicitado el servicio de Estacionamiento para Alquiler por Mes,
se le entrega una tarjeta que permite que el cliente pueda entrar y salir del estacionamiento. Al
finalizar el mes la tarjeta se desactiva hasta que el cliente pague.
5. Cobrar Uso del Estacionamiento
El encargado debe ingresar la placa del auto y dependiendo del tipo de alquiler le diga cuanto debe
pagar por el uso del estacionamiento, de acuerdo al tipo de estacionamiento alquilado. Una vez
registrado el pago debe liberarse el estacionamiento utilizado por el auto.
Tarifas por tipo de Alquiler
• La tarifa por minuto es de $0.05 el minuto.
• Modalidad Premium para aquellos clientes que deseen utilizar el parking por el día
completo pueden hacerlo a una tarifa de $6.50 el día.
• Los clientes tipo VIP son los que alquilan por un mes el estacionamiento, realizan un solo
pago, el primer día del mes de alquiler, ya que la tarifa de ellos cubre todo el mes (20 días, de
lunes a viernes). Estos clientes pagan un monto de $100.00.
6. Consulta de Monto Recaudado
En esta opción debe mostrar el monto recaudado por tipo de alquiler. Esta consulta debe solicitar
como parámetro el tipo de alquiler o dar la opción de mostrar todos los tipos. Esta consulta puede
ser realizada en cualquier momento sin importar que no se haya realizado el cierre del día.
7. Cierre de Caja
El programa debe contar con un proceso de Cierre de Caja en donde se muestra el total recaudado
durante del día.
