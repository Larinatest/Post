public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        // Точка останова может быть здесь для проверки значений в отладчике
        System.out.println("Заполненный объект Post:");
        System.out.println("Имя: " + post.name);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Телефон: " + post.phone);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Подписка на новости: " + post.subscription);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
    }
}
