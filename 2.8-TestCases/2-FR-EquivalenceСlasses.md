| Опис вхідних умов | Правильний/неправильний клас еквівалентності | Опис значень вхідних даних |
|-------------------|----------------------------------------------|----------------------------|
| 1)userID не NULL  2)status не NULL 3)довжина status < 15 | Правильний | userID = 25  status = "Online" |
| 1)userID = NULL  2)status не NULL 3)довжина status < 15| Неправильний |  userID =   status = "Online" |
| 1)userID не NULL  2)status = NULL 3)довжина status < 15| Непраивльно | userID = 76  status =  |
| 1)userID не NULL 2)довжина status > 15 3)status не NULL| Неправильно | userID = 15 status = "Onliiiiiiiiiiiine" |
