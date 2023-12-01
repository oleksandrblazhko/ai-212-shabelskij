| Опис вхідних умов | Правильний/неправильний клас еквівалентності | Опис значень вхідних даних |
|-------------------|----------------------------------------------|----------------------------|
| 1)userID не NULL  2)status не NULL та довжина < 15 | Правильний | userID = 25  status = "Online" |
| 1)userID = NULL  2)status не NULL та довжина < 15| Неправильний |  userID =   status = "Online" |
| 1)userID не NULL  2)status = NULL та довжина < 15| Непраивльно | userID = 76  status =  |
| 1)userID не NULL 2)довжина status > 15 та не NULL| Неправильно | userID = 15 status = "Onliiiiiiiiiiiine" |
