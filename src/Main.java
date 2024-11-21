import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> wording = new ArrayList<>();
        List<String> author = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("종료")) {
                break;
            }
            if (str.equals("등록")) {
                System.out.print("명언 : ");
                String word = sc.nextLine();
                System.out.print("작가 : ");
                String name = sc.nextLine();
                wording.add(word);
                author.add(name);
                System.out.println(wording.size()+"번 명언이 등록되었습니다.");
            }
            if(str.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-----------------------");
                for(int i = wording.size()-1;i>=0;i--) {
                    int num = i + 1;
                    if (!author.get(i).equals("0")) {
                        System.out.println(num + " / " + author.get(i) + " " + wording.get(i));
                    }
                }
            }
            if(str.equals("삭제")) {
                System.out.print("id = ");
                int idx = Integer.parseInt(sc.nextLine());
                if (wording.get(idx - 1).equals("0")) {
                    System.out.println(idx + "번 명언은 존재하지 않습니다.");
                } else {
                    wording.set(idx - 1, "0");
                    author.set(idx - 1, "0");
                    System.out.println(idx + "번 명언이 삭제되었습니다.");
                }
            }
            if(str.equals("수정")){
                System.out.print("id= ");
                int mod = Integer.parseInt(sc.nextLine());
                if(wording.get(mod -1).equals("0")){
                    System.out.println(mod+"번 명언은 존재하지 않습니다");
                } else {
                    System.out.println("명언(기존) : "+wording.get(mod-1));
                    System.out.print("명언 : ");
                    String newword = sc.nextLine();
                    wording.set(mod-1,newword);
                }
            }

        }
    }
}
