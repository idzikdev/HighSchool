package challenges;


public class Zadanie1 {
        public static int isTwo(String string){
            for (int i = string.length()-1; i > 0; i--) {
                if (string.charAt(i)==string.charAt(i-1)){
                    return i;
                }
            }
//            for (int i = 0; i < string.length()-1; i++) {
//                if (string.charAt(i)==string.charAt(i+1)){
//                    return i+1;
//                }
//            }
            return 0;
        }
        public static String solution(int A, int B) {
            StringBuilder result=new StringBuilder();
            if (A>B){
                result.append("a");
                A=A-1;
            }
            else {
                result.append("b");
                B=B-1;
            }
            while (A>0||B>0){
//                System.out.println(result);
//                System.out.println(isTwo(result.toString()));
                if (A==0){
                    for (int i = 0; i < B; i++) {
                        result.append("b");
                        B=B-1;
                    }
                }
                else if (B==0){
                    for (int i = 0; i < A; i++) {
                        result.append("a");
                        A=A-1;
                    }
                }
                else {
                    if (A>B){
                        int indeks=isTwo(result.toString());
                        if (indeks!=0&&result.charAt(indeks)=='a'){
                            result.append("b");
                            B=B-1;
                        }
                        else if (indeks!=0&&result.charAt(indeks)=='b'){
                            result.append("a");
                            A=A-1;
                        }
                        else {
                            result.append("a");
                            A=A-1;
                        }

                    }
                    else {
                        int indeks=isTwo(result.toString());
                        if (indeks!=0&&result.charAt(indeks)=='b'){
                            result.append("a");
                            A=A-1;
                        }
                        else if (indeks!=0&&result.charAt(indeks)=='a'){
                            result.append("b");
                            B=B-1;
                        }
                        else {
                            result.append("b");
                            B=B-1;
                        }
                    }
                }
            }
            return result.toString();
         }
    public static void main(String[] args) {
//        System.out.println(isTwo("a"));
        System.out.println(solution(1,4));
    }
}
