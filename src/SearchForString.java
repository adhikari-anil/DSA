public class SearchForString {
    public static void main(String[] args) {
        String name = "Anneel";
        char target = 'e';
        System.out.println(searchString(name,target));
    }
    static int searchString(String str, char choice){
        if(str.length() == 0){
            return -1;
        }

        for(int i=0;i<=str.length();i++){
            char gotOne = str.charAt(i);
            if(gotOne == choice){
                return i;
            }
        }
        return -1;
    }
}
