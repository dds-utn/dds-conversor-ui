# Conversor de Unidades

Como vemos en este gráfico de Wikpiedia... ![Uso del Sistema Internacional de Medidas](https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Metric_and_imperial_systems_%282019%29.svg/1920px-Metric_and_imperial_systems_%282019%29.svg.png) ... casi todo el mundo utiliza el Sistema Internacional de Medidas. Pero si tenés la mala suerte de interactuar con temperaturas en Estados Unidos vas a tener que usar grados Farenheit :shrug:.

Por eso vamos a crear una novedosa herramienta llamada _conversor de unidades_ :roll_eyes: que presenta los siguientes requerimientos:

1. Como usuarie del conversor de unidades quiero poder introducir, a través de una interfaz gráfica, una temperatura en grados celsius, y presionando un botón, verla expresada en grados Farenheit

2. Como cliente (que financia la construcción del conversor de unidades) quiero que el mismo esté desarrollado bajo una arquitectura MVC ó MVVM

3. Como cliente, quiero poder tener en el futuro múltiples versiones de la gráfica del conversor, cada una usando distintas tecnologías de Java (`awt`, `swing`, `swt`, `jface`, etc).

4. Bonus: como usuarie del conversor de unidades quiero que la temperatura sea convertida instantaneamente a medida que tipeo, sin necesidad de presionar un botón


