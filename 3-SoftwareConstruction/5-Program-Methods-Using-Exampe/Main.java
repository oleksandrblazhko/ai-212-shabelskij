import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static class User {
        private String userID;
        private String name;
        private Date dateOfBirth;
        private String login;
        private String password;
        private String status;
        private String email;
        private List<UsingExample.User> friends;

        public User(String userID, String name, String email, Date dateOfBirth, String login, String password) {
            this.userID = userID;
            this.name = name;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
            this.login = login;
            this.password = password;
            this.status = "online"; // Початковий статус - online
            this.friends = new ArrayList<>(); // Список друзів
        }

        // Методи для отримання та встановлення значень полів (getters/setters)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<UsingExample.User> getFriends() {
            return friends;
        }

        public void setFriends(List<UsingExample.User> friends) {
            this.friends = friends;
        }

        public void addUser(String userID, String name, String email, Date dateOfBirth, String login, String password) {
            User newUser = new User(userID, name, email, dateOfBirth, login, password);
            System.out.println("Додано нового користувача: " + newUser.getName() + " для користувача з ID: " + this.userID);
        }

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
                System.out.println("Змінено статус на online для користувача з ID: " + userID);
                this.status = "online";

            } else {
                // Зміна статусу з online на offline
                System.out.println("Змінено статус на offline для користувача з ID: " + userID);
                this.status = "offline";
            }

            // Повертає 1 для позначення успішної зміни статусу
            return 1;
        }

    }

    public static void main(String[] args) {
        // Створення 1-го користувача
        User user1 = new User("1", "John", "john@example.com", new Date(), "johnny", "pass123");

        // Створення другого користувача
        User user2 = new User("2", "Emily", "emily@example.com", new Date(), "emily", "pass456");

        //Виведення інформації про користувачів
        System.out.println("Інформація про користувача:");
        System.out.println("ID: " + user1.getUserID());
        System.out.println("Ім'я: " + user1.getName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Дата народження: " + user1.getDateOfBirth());
        System.out.println("Логін: " + user1.getLogin());
        System.out.println("Пароль: " + user1.getPassword());

        System.out.println("Інформація про користувача:");
        System.out.println("ID: " + user2.getUserID());
        System.out.println("Ім'я: " + user2.getName());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("Дата народження: " + user2.getDateOfBirth());
        System.out.println("Логін: " + user2.getLogin());
        System.out.println("Пароль: " + user2.getPassword());

        System.out.println("Status user1:" + user1.getStatus());
        System.out.println("Status user2:" + user2.getStatus());

        //Використання функції changeStatus()
        user1.changeStatus("1", "offline");
        user2.changeStatus("2", "offline");

        System.out.println("Status user1:" + user1.getStatus());
        System.out.println("Status user2:" + user2.getStatus());
    }
}