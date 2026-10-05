package myClass;
/**
 * 도서 정보를 관리하는 클래스입니다.
 *
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (2026.10.05)
 */
public class Book extends DB_Element
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String author;
    private String bookID;
    private String publisher;
    private String title;
    private int year;

    /**
     * 도서의 상세 정보(도서ID, 제목, 저자, 출판사, 출판연도)를 전달받아 Book 객체를 생성합니다.
     * 
     * @param bookID 도서 식별 번호(ID)
     * @param title 도서 제목
     * @param author 도서 저자
     * @param publisher 출판사
     * @param year 출판연도
     */
    public Book(String bookID, String title, String author, String publisher, int year)
    {
        this.author = author;
        this.bookID = bookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * 도서의 식별값(ID)을 문자열 형태로 반환합니다.
     * 
     * @return 도서의 bookID 문자열
     */
    @Override
    public String getID()
    {
        return "";
    }
    /**
     * 도서의 전체 정보를 포맷팅된 문자열 형태로 반환합니다.
     * 예: (b001) 자바프로그래밍, 홍길동, 선문출판사, 2026
     * 
     * @return (도서ID) 제목, 저자, 출판사, 출판연도 형태의 문자열
     */
    public String toString()
    {
        String bookInfo = "("+bookID+") "+title+", "+author+", "+publisher+", "+year;
        return bookInfo;
    }
    
}
