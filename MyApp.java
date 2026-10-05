import myClass.*;
import DataBase.LibDB;
import java.util.*;


/**
 * DB_ELement 클래스의 설명을 작성하세요.
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (2026.10.05)
 */
public class MyApp
{
    /**
     * main 메소드 - 실행 결과를 출력 하는 메서드 
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public static void main(String[] args)
    {
        // ① 데이터베이스 3개 생성
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB = new HashMap<User, Book>();
 
        // ② 이용자 3명 생성
        User user1 = new User(2025320001, "Kim");
        User user2 = new User(2024320002, "Lee");
        User user3 = new User(2023320003, "Park");
 
        // ③ 이용자DB에 등록
        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);
 
        // ④ 이용자 목록 출력
        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        System.out.println();
 
        // ⑤ 책 4권 생성
        Book book1 = new Book("B01", "Java Programming", "홍길동", "ABC", 2000);
        Book book2 = new Book("B02", "Software Analysis and Design", "profsHwang", "SMU", 2023);
        Book book3 = new Book("B03", "명품 자바프로그래밍", "황기태", "생능출판", 2025);
        Book book4 = new Book("B04", "소프트웨어테스트", "profsHwang", "SMU", 2024);
 
        // ⑥ 책DB에 등록
        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);
 
        // ⑦ 책 목록 출력
        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);
        System.out.println();
 
        // ⑧ 대출작업 3건: stID와 bookID로 각 DB에서 찾아서 대출DB에 등록
        loanDB.put(userDB.findElement("2025320001"), bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2024320002"), bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2023320003"), bookDB.findElement("B04"));
 
        // ⑨ 대출 현황 출력
        printLoanList(loanDB);
    }
    
    /**
     * 책DB 또는 이용자DB의 모든 요소를 출력하는 Generic 메소드
     *
     * @param db 출력할 데이터베이스
     */
    public static <T extends DB_Element> void printDB(LibDB<T> db)
    {
        db.printAllElements();
    }
    
    /**
     * 대출DB의 정보를 "[stID] 이름 ===> (bookID) 책정보" 형식으로 출력
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

