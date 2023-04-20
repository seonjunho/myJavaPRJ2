package Ex08;

import java.util.*;

public class Ex_F08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = null;

        for (int i = 0; i < 3; i++) {

            System.out.println("이름 : ");
            String name = sc.next();

            System.out.println("이메일 : ");
            String email = sc.next();

            System.out.println("부서 : ");
            String dept = sc.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }
            int listSIze = list.size();

            System.out.println("저장된 데이터 수 : " + listSIze);

            System.out.println("2세대 반복문");

            for (Map<String, String> rMap : list) {
                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("dept : " + rMap.get("dept"));
            }
        }
    }

