package myClass;

/**
 * 도서관 이용자 정보를 저장하는 클래스
 * 
 * @author (2025320015 김홍일, 2022320016 박문아, 2022320001 이승건)
 * @version (2026.10.05)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * 학번과 이름을 전달받아 User 객체를 생성하는 생성자 
     * 
     * @param stID 이용자의 학번
     * @param name 이용자의 이름
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * 이용자의 식별값(ID)을 문자열 형태로 반환하는 메소드
     * 
     * @return  이용자의 ID 문자열
     */
    public String getID()
    {
        return String.valueOf(stID);
    }
    
     /**
     * 이용자의 정보를 문자열 형태로 반환하는 메소드 
     *
     * @return 이용자의 학번과 이름을 포함한 문자열
     */
    public String toString()
    {
        return "[" + stID + "] " + name;
    }
}
