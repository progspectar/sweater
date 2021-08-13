# sweater

Добавляем базу данных (БД) в Spring

Ссылка на git репозиторий из видео:
https://github.com/drucoder/sweater/tree/JPA_Postgres

Для начала нам необходимо найти нужный гайд на сайте Spring:
https://spring.io/guides/gs/accessing-data-mysql/

Следующим шагом мы устанавливаем необходимые зависимости. В руководстве, которое мы используем, обозначена СУБД MySQL, которую можно использовать, как быстрый старт (её необходимо установить отдельно). Я же предпочитаю Postgres (его тоже надо устанавливать отдельно), ввиду большего соответсвия моим требованиям. На начальном этапе вы можете использовать любую удобную для вас БД.

Зависимость для Postgres:
https://gist.github.com/drucoder/540185d50117491e094991d8a95c772d

#pom.xml
<dependency>
<groupId>org.postgresql</groupId>
<artifactId>postgresql</artifactId>
<scope>runtime</scope>
</dependency>

Настройки БД для Postgres:
https://gist.github.com/drucoder/17424174aa6c6ae3338632bcedcac859

Далее по руководству создаем доменный объект (объект, который будем хранить в БД), репозиторий, для взаимодействия с БД и вносим изменения в контроллер и шаблон страницы.

Руководство по mustache:
http://mustache.github.io/mustache.5.html

Руководство по JPA репозиториям:
https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.query-creation

#git:
git checkout -b JPA_Postgres
git add .
git commit -m "JPA_Postgres"
git branch -M JPA_Postgres
git push -u origin JPA_Postgres
