# Пример создания pull request

Правильно для каждой новой фичи в программе создавать **отдельную ветку** и делать **pull request**.

### На локальном репозитории

1. **$ git pull origin master** - подтягиваем последние изменения с удаленного на локальный репозиторий.
2. **$ git branch IND-2_update-readme** - создаем под новую фичу отдельную ветку. Где:
    * **IND-2** - номер задачи в таск-трекере;
    * **update-readme** - краткое описание фичи.
3. **$ git switch IND-2_update-readme** - переключиться на ветку с фичей.
4. Вносим необходимые изменения (в README-файл в данном случае).
5. **$ git add .** - добавляем изменения.
6. **$ git commit -m "update README.md"** - коммитим изменения.
7. **$ git push origin IND-2_update-readme** - вносим изменения (ветку) в удаленный репозиторий (origin).

### В GitHub

1. Переходим в нужный репозиторий.
2. Во вкладке **[<>code]** выбираем нужную ветку **[main]** -> **[IND-2_update-readme]**.
3. Во вкладке **[Pull requests]** нажимаем на **[new pull request]** (создаем новый pull request).
4. Выбираем откуда и куда будем делать pull request **[base: master] <- [compare: IND-2_update-readme]**.
5. Создаем pull request кнопкой **[create pull request]**.
6. Ссылку на pull request вида "https://github.com/IvanIvanov/project/pull/1" при необходимости можно послать код-ревьюеру в личку.
7. Происходит ревью предложенных изменений.
8. Изменения принимаются кнопками **[Merge pull request]** и **[Confirm merge]** и происходит слияние.

### На локальном репозитории

1. **$ git switch master** - переключиться на ветку master.
2. **$ git pull origin master** - подтянуть изменения в локальный репозиторий.