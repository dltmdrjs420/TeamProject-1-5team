package myClass;
/**
 * 도서 정보를 관리하는 클래스입니다.
 *
<<<<<<< HEAD
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (버전 번호 또는 작성한 날짜)
=======
 * @author (2022320016 박문아, )
 * @version (2026.10.05)
>>>>>>> 773f3a016b1da575750522d25304173e13b53d18
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
     * Book 클래스의 객체 생성자
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
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    @Override
    public String getID()
    {
        return "";
    }
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String toString()
    {
        String bookInfo = "("+bookID+") "+title+", "+author+", "+publisher+", "+year;
        return bookInfo;
    }
    
}
