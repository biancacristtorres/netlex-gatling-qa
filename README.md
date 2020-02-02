# Projeto Teste de Carga Básico

## Pré requisitos

|  Nome  |  Link  |
| ------ | ------ |
| Gatling | https://gatling.io/open-source |
| Java | https://www.java.com/pt_BR/download/ |
| scala |  https://www.scala-lang.org/download/ |


Para configurar o ambiente veja o documento [**Configuração de ambiente GATLING**](https://docs.google.com/document/d/1ETEZuxg9VVagK-skfT4hbodhlUcXyQ1_Gjen4ODqkMs/edit?usp=sharing)



## Execução do teste
Após as configurações, o arquivo `NetlexQASimulation.scala` deve ser colocado dentro da pasta do gatling `../gatling-charts-highcharts-bundle-3.3.1/user-files/simulations`


O comando abaixo deve ser executado dentro da pasta `../gatling-charts-highcharts-bundle-3.3.1/bin`



```sh
Windows
$ ./gatling.bat
```

```sh
Linux
$ ./gatling.sh
```

Será listado uma série de opções 
```sh
Choose a simulation number:
     [0] NetlexQASimulaton
     [1] RecordedSimulation
     [2] RecordedSimulationHAR
     [3] RecordedSimulationRecoder
     [4] computerdatabase.BasicSimulation
     [5] computerdatabase.advanced.AdvancedSimulationStep01
     [6] computerdatabase.advanced.AdvancedSimulationStep02
     [7] computerdatabase.advanced.AdvancedSimulationStep03
     [8] computerdatabase.advanced.AdvancedSimulationStep04
     [9] computerdatabase.advanced.AdvancedSimulationStep05
```

Escolha a opção **NetlexQASimulaton**

```sh
Linux
$ 0
```

Em seguida será solicitado uma descrição para a execução, basta clicar **enter** e aguardar que a execução termine.


## Relatório

Após a execução do teste, terá um relatório disponível dentro de **results**. Cada teste gera uma nova pasta com data e hora da execução `..\gatling-charts-highcharts-bundle-3.3.1\results\netlexqasimulaton-20200202230459356`

Basta abrir o arquivo **index.html**