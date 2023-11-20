| Опис вхідних умов | Правильний/неправильний клас еквівалентності | Опис значень вхідних даних |
|-------------------|----------------------------------------------|----------------------------|
| 1)userName не NULL  2)довжина userName менше 15 символів  3)password більше 8 символів | Правильний | userName = PetroVlad  password = 657geroy1 |
| 1)userName = NULL  2)довжина userName менше 15 символів 3)password більше 8 символів | Неправильний |  userName =   password = 657geroy1 |
| 1)userName не NULL  2)довжина userName більше 15 символів 3)password більше 8 символів | Непраивльно | userName = useeeeeeeeeeeeerr  password = 657geroy1 |
| 1)userName не NULL  2)довжина userName менше 15 символів  3)password менше 8 символів | Неправильно |  userName = PetroVlad  password = geroy |

