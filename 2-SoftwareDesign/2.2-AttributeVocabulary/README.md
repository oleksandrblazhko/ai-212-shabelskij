### Словник атрибутів об’єктів

| Об'єкт | Атрибут | Короткий опис | Тип | Обмеження |
|--------|---------|---------------|-----|-----------|
|  User  | name    | Ім'я користувача | string | not NULL |
|  User  | friendList | Список усіх друзів користувача | list[] | - |
| Settings | background | Фон чату | string | not NULL |
| Settings | font | Шрифт | string | not NULL |
| Chat | firstUser | Посилання на першого користувача у чаті | string | not NULL |
| Chat | secondUser | Посилання на другого користувача у чаті | string | not NULL |
