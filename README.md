# Tréninkové materiály pro školení Spring framework

V této Git repozitoři se nacházejí tréninkové materiály pro školeni _Spring framework_ od Romana Pichlíka (http://dagblog.cz). K dispozici jsou nejen zdrojové kódy pro jednotlivá cvičení, ale i prezentace, podle kterých probíhá vlastní školení. Všechny materiály jsou volně dostupné pod licencí  _Creative Commons Attribution-ShareAlike 3.0_ (http://creativecommons.org/licenses/by-sa/3.0/). Materiály je možné používat, upravovat a dále šířit v souladu s podmínkami této licence.

## Představení

Základní seznámení a vysvětlení kontextu, ve kterém _Spring framework vzniknul_. 

* J2EE a jak do toho zapadnul _Spring framework_
* Architektura vícevrstvých aplikací
* Několik pohledů na to co _Spring framework_ nabízí
* Základní stavební kameny _Spring frameorku_

<div style="width:425px" id="__ss_12915404"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-introduction" title="Spring introduction" target="_blank">Spring introduction</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915404" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Inversion of control

Úvod do problematiky řízení vztahů mezi komponentami pomocí _Iversion of Control_. Zdrojové soubory se nalézají v adresáři _springioc_.

* Programy před zavedením IoC
* Možné implementace IoC (service locator vs. dependency injection) a jejich srovnání
* Požadavky na IoC kontejner z pohledu aplikačního programátora
* Použití XML pro IoC
* Použití anotací pro IoC
* Použití JavaConfig pro IoC
* Scopes

<div style="width:425px" id="__ss_12915406"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-ioc-12915406" title="Spring ioc" target="_blank">Spring ioc</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915406" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Inversion of control pokročilé

Pokročilá témata vztahující se k _Inverstion of Control_ a   Zdrojové soubory se nalézají v adresáři _springioc_.

* Properties, hierarchická konfigurace pro aplikaci
* Resource abstrakce
* Dynamické nahrávaní aplikačních kontextu
* Property editory
* SPEL

<div style="width:425px" id="__ss_12915407"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-iocadvanced" title="Spring ioc-advanced" target="_blank">Spring ioc-advanced</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915407" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Testování aplikací

Testování aplikací postavených nejenom nad _Spring frameworkem_. Zdrojové soubory pro cvičení se nalézají v adresáři _springtdd_.

* Proč testujeme
* Rozdíl mezi automatickými a ručními testy
* Použití mocku a stubu
* Integrace _Spring framerku_ a _JUnit_

<div style="width:425px" id="__ss_12915410"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-testing" title="Spring Testing" target="_blank">Spring Testing</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915410" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Aspektově orientované programování

Aspektově Orientované Programovaní (AOP) jako klíč k řešení tradičních aplikačních problému. Zdrojové soubory pro cvičení se nalézají v adresáři _springaop_.

* Co a k čemu AOP slouží
* Základní termíny (joinpoint, advice, weaving, pointcut)
* Fungovaní weavingu v _Spring framework_
* Profilovací aspekt

<div style="width:425px" id="__ss_12915383"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-aop-12915383" title="Spring aop" target="_blank">Spring aop</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915383" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Přístup k datům

Co všechno potřebujeme, když chceme přistupovat k datům v relační databázi. Jak nám v tomto úsilí pomáhá _Spring framework_.  Zdrojové soubory pro cvičení se nalézají v adresáři _springdao_.

* Klasické problémy, michání odpovědností, návrhový vzor Copy&Paste
* Řešení v podobě _Template method_
* Definice datasource
* Práce s JDBC přes _JdbcTemplate_
* Použití JPA

<div style="width:425px" id="__ss_12915392"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-dao" title="Spring dao" target="_blank">Spring dao</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915392" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Transakční zpracování

Co jsou to transakce k čemu slouží, jaké jsou jejich základní atributy. Tato část pokrývá úvod do transakčního zpracování a jeho správu v _Spring frameworku_. Zdrojové soubory pro cvičení se nalézají v adresáři _springdao_.

* ACID
* Nested a Flat model transakcí
* Lokální a distribuované transakce
* Propagace a Izolace transakcí
* Volba transakčního manažeru
* Deklarativní ovládání transakcí
* Programové ovládání transakcí

<div style="width:425px" id="__ss_12915413"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-transactions" title="Spring Transactions" target="_blank">Spring Transactions</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915413" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

# Vývoj webových aplikací

Historický vývoj webových aplikací a toho co nám nabízí _Spring framework_ v rámci poskytování vlastní implementace _Model View Controller_. Zdrojové soubory pro cvičení se nalézají v adresáři _springmvc_.

* JSP 1.0 a vývoj k moderním _MVC frameworkům_
* Vysvětlení _MVC_ vzoru
* Zpracování požadavků _Spring MVC_
* Základní konfigurace a ovládání _Spring MVC_

<div style="width:425px" id="__ss_12915415"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-mvc-12915415" title="Spring MVC" target="_blank">Spring MVC</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915415" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Webové služby a vzdálený přístup

RESTové a SOAPové webové služby a jejich podpora v  _Spring framework_. Zdrojové soubory pro cvičení se nalézají v adresáři _springws_.

* Jakým způsobem můžeme vystavovat aplikační logiku
* RPC versus výměna zpráv
* Rozdíl SOAP a REST služby, za jakých okolností bychom měli použít jedno nebo druhé
* Spring WS
* Návrh kontraktu
* Ukázka Endpointu
* Spring MVC REST
* Návrh REST resourcu
* Ukázka REST controlleru

<div style="width:425px" id="__ss_12915382"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-web-services" title="Spring Web Services" target="_blank">Spring Web Services</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915382" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>

## Integrace s J2EE

Použití _Spring frameworku_ s J2EE (1.4) a integrace s technologiemi jako _Enterprise Java Beans_.  Zdrojové soubory pro cvičení se nalézají v adresáři _springj2ee_.

* Podporované technologie
* Integrace s EJB

<div style="width:425px" id="__ss_12915408"> <strong style="display:block;margin:12px 0 4px"><a href="http://www.slideshare.net/pichlik/spring-j2ee" title="Spring J2EE" target="_blank">Spring J2EE</a></strong> <iframe src="http://www.slideshare.net/slideshow/embed_code/12915408" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no"></iframe> <div style="padding:5px 0 12px"> View more <a href="http://www.slideshare.net/" target="_blank">presentations</a> from <a href="http://www.slideshare.net/pichlik" target="_blank">Roman Pichlik</a> </div> </div>