public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 21;
        post.birthday.month = 3;
        post.birthday.year = 1986;
        post.name = "Сергей";
        post.passport = "1234 № 87654321";
        post.patronymic = "Викторович";
        post.phone = "+7(911)-222-33-44";
        post.surname = "Загребельный";
        post.subscription = true;

    }
}
