import myClass.*;
import DataBase.LibDB;
import java.util.*;


/**
 * 사용자(User) 및 도서(Book) 데이터를 생성하여 데이터베이스에 등록하고 출력합니다.
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (2026.10.05)
 */
public class MyApp
{

    /**
     * 프로그램의 시작 지점으로, 사용자 및 도서 DB를 초기화하고 등록된 데이터를 출력합니다.
     * 
     * @param args 명령행 인자 배열
     */
    public static void main (String args[])
    {
        //사용자DB 생성 및 등록 
        User user1 = new User(2025320001, "Kim");
        User user2 = new User(2024320002, "Lee");
        User user3 = new User(2023320003, "Park");
        LibDB<User> userDB = new LibDB<User>();
        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);
        printDB(userDB);

        
        //책 DB 생성 및 등록
        Book book1 = new Book("B01","Java Programming","홍길동","ABC",2000);
        Book book2 = new Book("B02","Software Analysis and Design","profsHwang","SMU",2023);
        Book book3 = new Book("B03","명품 자바프로그래밍","황기태","생능출판",2025);
        Book book4 = new Book("B04","소프트웨어테스트","profsHwang","SMU",2024);
        LibDB<Book> bookDB = new LibDB<Book>();
        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);
        printDB(bookDB);
        
    }
    /**
     * DB_Element를 상속받은 객체들을 저장하는 LibDB의 모든 요소를 화면에 출력합니다.
     * 
     * @param <T> DB_Element를 상속받은 데이터 타입 (User, Book 등)
     * @param libDB 출력할 데이터베이스 객체
     */
    public static <T extends DB_Element> void printDB (LibDB<T> libDB)
    {
        libDB.printAllElements();
    }
    // /**
     // * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     // *
     // * @param  y  메소드의 샘플 파라미터
     // * @return    x 더하기 y의 결과값을 반환
     // */
    // public static void printLoanListDB (타입  loanDB)
    // {
    // }
}
