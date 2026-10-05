package myClass;


/**
 * 도서관 이용자 정보를 저장하는 클래스입니다.
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (2026.10.05)
 */
public class User extends DB_Element
{
    // 이용자의 이름, 학번
    private String name;
    private Integer stID;

    /**
     * 학번과 이름을 전달받아 User 객체를 생성합니다.
     * @param stID 이용자의 학번
     * @param name 이용자의 이름
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * 이용자의 식별값(ID)을 문자열 형태로 반환합니다.
     * @return    이용자의 ID 문자열
     */
    @Override
    public String getID()
    {
        return "";
    }
     /**
     * 이용자의 정보를 문자열 형태로 반환합니다.
     *예: [2022320016] 박문아
     * @return 이용자의 학번과 이름을 포함한 문자열
     */
    public String toString()
    {
        return "["+stID+"] "+name;
    }
}
