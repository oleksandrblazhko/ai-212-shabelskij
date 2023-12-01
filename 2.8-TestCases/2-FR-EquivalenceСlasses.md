| Опис вхідних умов | Правильний/неправильний клас еквівалентності | Опис значень вхідних даних |
|-------------------|----------------------------------------------|----------------------------|
| 1)userID не NULL  2)status не NULL | Правильний | userID = 25  status = "Online" |
| 1)userID = NULL  2)status не NULL | Неправильний |  userID =   status = "Online" |
| 1)userID не NULL  2)status = NULL | Непраивльно | userID = 76  status =  |
| 1)userID не NULL 2)status > 15 | Неправильно | userID = 15 status = "Onliiiiiiiiiiiine" |
