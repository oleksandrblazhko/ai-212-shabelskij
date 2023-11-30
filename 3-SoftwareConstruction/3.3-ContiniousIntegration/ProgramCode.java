public class Settings {
    public int changeStatus(String userID, String newStatus) {
        // Перевірка, чи ідентифікатор користувача не є NULL або порожнім рядком
        if (userID == null || userID.isEmpty()) {
            return -1; // Повертає -1, якщо ідентифікатор користувача не відповідає умовам
        }

        // Перевірка, чи новий статус є допустимим для мережевого статусу
        if (!newStatus.equals("online") && !newStatus.equals("offline")) {
            return -2; // Повертає -2, якщо новий статус не відповідає допустимим значенням
        }

        // Логіка зміни мережевого статусу
        if (newStatus.equals("online")) {
            // Зміна статусу з offline на online
            this.status = "online";
            System.out.println("Змінено статус на online для користувача з ID: " + userID);
        } else {
            // Зміна статусу з online на offline
            this.status = "offline";
            System.out.println("Змінено статус на offline для користувача з ID: " + userID);
        }

        // Повертає 1 для позначення успішної зміни статусу
        return 1;
    }
}
