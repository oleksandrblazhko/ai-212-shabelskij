### Словник атрибутів об’єктів

| Об'єкт | Атрибут | Короткий опис | Тип | Обмеження |
|--------|---------|---------------|-----|-----------|
|  User  | name    | Ім'я користувача | string | not NULL |
|  User  | dateOfDirsth | Дата народження користувача | string | not NULL |
|  User  | email | Електронна пошта | string | not NULL |
|  User  | login | Логін користувача | string | not NULL |
|  User  | password | Пароль користувача | string | not NULL |
|  User  | stasus | Статус "У мережі" | string | not NULL |
| Friend | name | Ім'я користувача | string | not NULL |
| Friend | dateOfBirth | Дата народження користувача | string | not NULL |
| Friend | email | Електронна пошта | string | not NULL |
| Friend |  stasus | Статус "У мережі" | string | not NULL |
| Settings | background | Фон чату | string | not NULL |
| Settings | font | Шрифт | string | not NULL |
| Chat | firstUser | Посилання на першого користувача у чаті | string | not NULL |
| Chat | secondUser | Посилання на другого користувача у чаті | string | not NULL |
