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
     *  객체의 고유 식별자를 반환하는 추상 메서드.
     * @return 하위 클래스에서 각 객체에 맞는 식별자(ID) 문자열반환  
     */
    public abstract String getID();
}