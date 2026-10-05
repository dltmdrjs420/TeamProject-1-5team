package myClass;

/**
 * LibDB에 저장되는 모든 요소(Book, User)의 상위 추상클래스
 * 
 * @author (2025320015 김홍일, 2022320016 박문아, 2022320001 이승건)
 * @version (2026.10.05)
 */
public abstract class DB_Element
{

    /**
<<<<<<< HEAD
     * 요소의 고유 식별번호를 문자열로 반환 (Book은 bookID, User는 stID)
=======
>>>>>>> fa3a77dad07eaf1a6a0d413b1341a2385de62c41
     * 
     * @return 객체의 식별자(ID) 문자열
     */
    public abstract String getID();
}