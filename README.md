# Проект по автоматизации мобильного приложения Omni-Notes

Omni-Notes - это приложение для ведения заметок с открытым исходным кодом, целью которого является простой интерфейс при сохранении интеллектуального поведения

![This is an image](images/screenshots/omni_notes.png)

## :page_with_curl: Содержание:

- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Запуск тестов](#rocket-запуск-тестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска теста в Browserstack](#-видео-примера-запуска-теста-в-browserstack)

## :wrench: Использованный стек технологий

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Appium" src="images/logo/Appium.svg">
<img width="6%" title="Browserstack" src="images/logo/Browserstack.png">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/Allure_TestOps.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>.
Для написания тестов использован <code>Appium</code>.
Запуск тестов можно осуществлять локально или с помощью <code>Browserstack</code>.
Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами в <code>Telegram</code> после завершения прогона.
Тестовая модель хранится в Allure TestOps и формируется автоматически на основе выгрузки результатов автотестов.

## :boom: Запуск тестов

Запуск тестов на эмуляторе
```
gradle clean test -Denv=local
```

Запуск тестов в Browserstack
```
gradle clean test -Denv=browserstack
```

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="images/logo/Jenkins.svg"> Сборка в Jenkins

<p align="center">
<img title="Jenkins Build" src="images/screenshots/jenkinsBuild.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="images/logo/Allure_Report.svg"> Пример Allure-отчета
### Overview

<p align="center">
<img title="Allure Overview" src="images/screenshots/allureReportMain.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="images/screenshots/allureReportTests.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="images/logo/Allure_TestOps.svg"> Интеграция с Allure TestOps

Полная статистика о прохождении тестов, отчеты и результаты прогонов хранятся в Allure TestOps. Тестовая модель формируется автоматически на основе выгрузки результатов автотестов

### Примеры дашбордов

<p align="center">
<img title="Dashboards" src="images/screenshots/dashboards.png">
</p>

### Список тест-кейсов

<p align="center">
<img title="Dashboards" src="images/screenshots/testCases.png">
</p>

### Описание тестового сценария

<p align="center">
<img title="Dashboards" src="images/screenshots/testCase.png">
</p>

### Список тестовых прогонов

<p align="center">
<img title="Dashboards" src="images/screenshots/launches.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне

<p align="center">
<img width="70%" title="Telegram Notifications" src="images/screenshots/notificationExample.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Browserstack" src="images/logo/Browserstack.png"> Видео примера запуска теста в Browserstack

При запуске тестов на удаленном окружении к каждому тесту в отчете прилагается видео. Ниже пример одного из таких видео при запуске тестов в Browserstack
<p align="center">
  <img title="Browserstack Video" src="images/gif/videoExample.gif">
</p>
