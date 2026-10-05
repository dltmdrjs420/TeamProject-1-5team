package myClass;


/**
 * User 클래스의 설명을 작성하세요.
 *
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class User extends DB_Element
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String name;
    private Integer stID;

    /**
     * User 클래스의 객체 생성자
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
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
        return "["+stID+"] "+name;
    }
}
