import myClass.*;
import DataBase.LibDB;
import java.util.*;

/**
 * 사용자(User) 및 도서(Book) 데이터를 생성하여 데이터베이스에 등록하고 대출 현황을 출력하는 MyApp 클래스
 * 
 * @author (2025320015 김홍일, 2022320016 박문아, 2022320001 이승건)
 * @version (2026.10.05)
 */
public class MyApp
{
    public static void main(String[] args)
    {
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB = new HashMap<User, Book>();

        User user1 = new User(2025320001, "Kim");
        User user2 = new User(2024320002, "Lee");
        User user3 = new User(2023320003, "Park");

        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);

        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        System.out.println();

        Book book1 = new Book("B01", "Java Programming", "홍길동", "ABC", 2000);
        Book book2 = new Book("B02", "Software Analysis and Design", "profsHwang", "SMU", 2023);
        Book book3 = new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025);
        Book book4 = new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024);

        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);

        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);
        System.out.println();

        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));

        printLoanList(loanDB);
    }

    /**
     * 책DB 또는 이용자DB의 모든 요소를 출력하는 Generic 메소드
     *
     * @param db 출력할 데이터베이스
     * DB_Element를 상속받은 객체들을 저장하는 LibDB의 모든 요소를 화면에 .
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElements();
    }

    /**
     * 대출DB의 정보를 "[stID] 이름 ===> (bookID) 책정보" 형식으로 출력하는 메소드
     *
     * @param loanDB 대출 데이터베이스
     */
    public static void printLoanList(HashMap<User, Book> loanDB)
    {
        System.out.println("----- 대출 현황 -----");
        for (User user : loanDB.keySet()) {
            System.out.println(user + " ===> " + loanDB.get(user));
        }
        System.out.println("--------------------");
    }
}

