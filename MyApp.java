import myClass.*;
import DataBase.LibDB;
import java.util.*;


/**
 * MyApp 클래스의 설명을 작성하세요.
 *
<<<<<<< HEAD
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (버전 번호 또는 작성한 날짜)
=======
 * @author (2022320016 박문아,2022320001 이승건)
 * @version (2026.10.05)
>>>>>>> 773f3a016b1da575750522d25304173e13b53d18
 */
public class MyApp
{

    /**
     * main 메소드 - 실행 결과를 출력 하는 메서드 
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
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

        
        //책 DB 생성
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
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
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
