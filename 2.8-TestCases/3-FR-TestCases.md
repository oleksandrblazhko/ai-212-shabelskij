| FR ID | Test Case ID | Опис кроків тестового сценарію | Опис очікуваних результатів |
|-------|--------------|--------------------------------|-----------------------------|
| FR1.1 | TC1.1 | Користувача поки не існує  Кроки:  userNmae = PetroVlad  password = geroy567 | Result = 1 |
| FR1.1 | TC1.2 | userName =   password = 12345678 | Result = -1 |
| FR1.1 | TC1.3 | userName = PetrrrrrrrrrrrroVladddddd password = 12345678 | Result = -1 |
| FR1.1 | TC1.4 | userName = PetroVlad  password = 12345 | Result = -2 |
