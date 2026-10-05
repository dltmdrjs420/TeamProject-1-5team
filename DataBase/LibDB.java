package DataBase;
import java.util.*;
import myClass.*;

/**
 * 제네릭 타입 T를 이용하여 다양한 도서관 데이터(User, Book 등)를 목록 형태로 저장하고 관리하는 데이터베이스 클래스입니다.
 * @author (2025320015_김홍일, 2022320016_박문아, 2022320001_이승건)
 * @version (2026.10.05)
 */
public class LibDB <T>
{
    // 데이터를 순차적으로 저장하는 리스트
    private ArrayList<T> db;

    /**
     * 비어 있는 ArrayList를 생성하여 LibDB 객체를 초기화합니다.
     */
    public LibDB()
    {
        this.db = new ArrayList<T>();        
    }

    /**
     * 전달받은 데이터 요소를 데이터베이스(리스트)에 추가합니다.
     * 
     * @param data 데이터베이스에 추가할 요소 객체
     */
    public void addElement(T data)
    {
        db.add(data);
    }
    /**
     * 주어진 식별값(ID)과 일치하는 요소를 데이터베이스에서 검색하여 반환합니다.
     * 
     * @param y 검색할 요소의 식별자(ID) 문자열
     * @return 검색된 요소 객체 (일치하는 항목이 없을 경우 null)
     */
    // public T findElement(String y)
    // {
    //     // 여기에 코드를 작성하세요.
    //     return "";
    // }
    /**
     * 데이터베이스에 저장된 모든 요소를 화면에 순서대로 출력합니다.
     * 첫 번째 요소의 인스턴스 타입(User 또는 Book)에 따라 알맞은 제목 헤더를 출력합니다.
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

