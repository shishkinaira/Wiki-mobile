# Проект по базовой автоматизации тестирования мобильной версии [Wikipedia](wikipedia.org)

> Википе́дия (англ. Wikipedia) — общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.
## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>


____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>
<p>

1. [ ] Автотесты написаны на Java с использованием фреймворка Selenide.
3. [ ] Gradle - используется как инструмент автоматизации сборки.
5. [ ] JUnit5 - используется для выполнения тестов.
6. [ ] Jenkins - используется CI/CD для запуска тестов удаленно.
8. [ ] Allure Report - используется для визуализации результатов тестирования.

Тесты проверяют:
1. [ ] успешный поиск по порталу,
2. [ ] безуспешный поиск по порталу,
3. [ ] проверка функционала смены языка.
</p>

<a id="jenkins"></a>

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Wiki-mobile/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Wiki-mobile////"><img src="images/screen/jenkins_build.png" alt="Jenkins" width="950"/></a>  
</p>




<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean test
```

***Удалённый запуск через Jenkins:***
```bash  
clean test
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/Wiki-mobile/9/allure/#)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/jenkins.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/jenkins_tests.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/allure_graths.png" width="850">

<img title="Allure Graphics" src="images/screen/graphs.png" width="850">  
</p>

___
