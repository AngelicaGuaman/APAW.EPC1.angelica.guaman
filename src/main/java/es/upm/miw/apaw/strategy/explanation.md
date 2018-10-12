# Strategy Pattern

> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)

## Definición

El patrón Estrategia es un patrón de diseño para el desarrollo de software. Se clasifica como patrón de comportamiento porque determina cómo se debe realizar el intercambio de mensajes entre diferentes objetos para resolver una tarea. El patrón estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto cliente puede elegir aquel que le conviene e intercambiarlo dinámicamente según sus necesidades.

## Componentes
**Contexto** (**_Context_**) : Es el elemento que usa los algoritmos, por tanto, delega en la jerarquía de estrategias. Configura una estrategia concreta mediante una referencia a la estrategia necesaria. Puede definir una interfaz que permita a la estrategia el acceso a sus datos en caso de que fuese necesario el intercambio de información entre el contexto y la estrategia. En caso de no definir dicha interfaz, el contexto podría pasarse a sí mismo a la estrategia como parámetro.

**Estrategia** (**_Strategy_**): Declara una interfaz común para todos los algoritmos soportados. Esta interfaz será usada por el contexto para invocar a la estrategia concreta.

**EstrategiaConcreta** (**_ConcreteStrategy_**): Implementa el algoritmo utilizando la interfaz definida por la estrategia.


## Ejemplo a realizar

Para una tienda online, se pretende desarrollar la estategia de entrega de un pedido. Actualmente se dispone de 3
posibles entregas: en tienda, en casa, o entrega express. 

A continuación, se describe las funciones que realizan las clases y la interfaz.

* Context: **Order** Será la encargada de realizar el envío.
* Estrategia: **ShippingStrategy** que define el método de enviar pedido.
* Estrategia concreta: **PickUpInStoreConcreteStrategy, HomeDeliveryConcreteStrategy, ExpressDeliveryConcreteStrategy** serán las encargas de implementar el método de enviar pedido.


## Diseño de entidades
![strategy-architecture-diagram](https://github.com/AngelicaGuaman/APAW.EPC1.angelica.guaman/blob/develop/docs/strategy/strategy-entities-class-diagram.png)


## Fuentes consultadas

1. [Definición](https://es.wikipedia.org/wiki/Strategy_(patr%C3%B3n_de_dise%C3%B1o))

1. [Definición y ejemplo](https://stackoverflow.com/questions/1658192/what-is-the-difference-between-strategy-design-pattern-and-state-design-pattern)
