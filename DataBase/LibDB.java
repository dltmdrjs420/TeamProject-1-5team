package DataBase;
import java.util.*;
import myClass.*;

/**
 * DB_ELement 클래스의 설명을 작성하세요.
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (2026.10.05)
 */
public class LibDB <T>
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private ArrayList<T> db;

    /**
     * LibDB 클래스의 객체 생성자
     */
    public LibDB()
    {
        this.db = new ArrayList<T>();        
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void addElement(T data)
    {
        db.add(data);
    }
    
    /**
     * 고유 식별번호로 요소 검색
     *
     * @param id 찾을 요소의 식별번호 (bookID 또는 stID)
     * @return 찾은 요소, 없으면 null
     */
    public T findElement(String id)
    {
        for (T element : db) {
            if (element.getID().equals(id)) {
                return element;
            }
        }
        return null;
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void printAllElements()
    {
        T data = db.get(0);
        if (data instanceof User) {
            System.out.println("----- 이용자 목록 출력 -----");
        }
        else if (data instanceof Book) {
            System.out.println("----- 책 목록 출력 -----");
        }
        for(T element:db){
            System.out.println(element.toString());
        }
    }
}

