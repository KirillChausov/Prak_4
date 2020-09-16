package prak_4_2;

public class Loader {
    public static void main(String[] args) {
        Author a = new Author("Джоан Роулинг", "JK.Rowling@mirea.ru", 'W');
        Author b = new Author("Уильям Шекспир", "william.shakespeare@gmail.com", 'M');
        System.out.println("Имя и пол автора: " + a.getName() + " --- " + a.getGender() + "\n" + " Электронный адрес: " + a.getEmail());
        b.setEmail("JK.Rowling@gmail.com");
        System.out.println("Имя и пол автора: " + b.getName() + " --- " + b.getGender() + "\n" + " Электронный адрес: " + b.getEmail());
        System.out.println("\n" + a.toString());
        System.out.println("\n" + b.toString());
    }
}
