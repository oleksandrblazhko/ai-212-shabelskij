import java.util.ArrayList;
import java.util.List;

public class ProgramClasses {
    public class User {
        private String name;
        private String dateOfBirth;
        private String login;
        private String password;
        private String status;
        private String email;
        private List<User> friends;


        // Конструктор класу
        public User(String username, String email, int age) {
            this.name = name;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
            this.login = login;
            this.password = password;
            this.status = "Active"; // Початковий статус - Active
            this.friends = new ArrayList<>(); // Список друзів
        }

        // Методи для отримання та встановлення значень полів (getters/setters)
        public String getUsername() {
            return name;
        }

        public void setUsername(String username) {
            this.name = username;
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        // Зміна статусу користувача
        public void changeStatus(String newStatus) {
            this.status = newStatus;
        }

        // Додавання нового користувача до списку друзів
        public void addFriend(User friend) {
            friends.add(friend);
        }

        // Видалення користувача зі списку друзів
        public void deleteFriend(User friend) {
            friends.remove(friend);
        }

        // Додавання нового користувача до системи
        public void addUser(User newUser) {
            // Логіка для додавання нового користувача
            System.out.println("User added: " + newUser.getUsername());
        }
    }

    public class Friend {
        private String name;
        private String dateOfBirth;
        private String email;
        private String status;

        public Friend(String name, String dateOfBirth, String email, String status) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public class Settings {
        private String font;
        private String background;

        public Settings(String font, String background) {
            this.font = font;
            this.background = background;
        }

        public String getFont() {
            return font;
        }

        public void setFont(String font) {
            this.font = font;
        }

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }

        // Метод для зміни шрифту
        public void changeFont(String newFont) {
            this.font = newFont;
            System.out.println("Font changed to: " + newFont);
        }

        // Метод для зміни фону
        public void changeBackground(String newBackground) {
            this.background = newBackground;
            System.out.println("Background changed to: " + newBackground);
        }
    }

    public class Chat {
        private String firstUserID;
        private String secondUserID;

        public Chat(String firstUserID, String secondUserID) {
            this.firstUserID = firstUserID;
            this.secondUserID = secondUserID;
        }

        public String getFirstUserID() {
            return firstUserID;
        }

        public void setFirstUserID(String firstUserID) {
            this.firstUserID = firstUserID;
        }

        public String getSecondUserID() {
            return secondUserID;
        }

        public void setSecondUserID(String secondUserID) {
            this.secondUserID = secondUserID;
        }

        // Метод для з'єднання користувачів
        public void connectUser() {
            System.out.println("Connected users: " + firstUserID + " and " + secondUserID);
            // Логіка для з'єднання користувачів
        }
    }
}
