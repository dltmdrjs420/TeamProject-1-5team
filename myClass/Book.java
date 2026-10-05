package myClass;

/**
 * 도서 정보를 관리하는 클래스
 *
 * @author (2025320015 김홍일, 2022320016 박문아, 2022320001 이승건)
 * @version (2026.10.05)
 */
public class Book extends DB_Element
{
    private String author;
    private String bookID;
    private String publisher;
    private String title;
    private int year;

    /**
     * 도서의 상세 정보(도서ID, 제목, 저자, 출판사, 출판연도)를 전달받아 
     * Book 객체를 생성하는 생성자 
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
     * 도서의 식별값(ID)을 문자열 형태로 반환하는 메소드
     * 
     * @return 도서의 bookID 문자열
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * 도서의 전체 정보를 포맷팅된 문자열 형태로 반환    
     * @return (도서ID) 제목, 저자, 출판사, 출판연도 형태의 문자열
     */
    public String toString()
    {
        String bookInfo = "("+bookID+") "+title+", "+author+", "+publisher+", "+year;
        return bookInfo;
    }
}