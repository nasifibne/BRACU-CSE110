public class task11 {
    public static int vowel(String s){
        int vowel=0;
        for(int i =0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' ||c=='i' ||c=='o' || c=='u' || c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'){
                vowel++;
            }
        }
        return vowel;
    }
    public static int consunant(String s){
        int consu =0, space=0;
        for(int i =0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c==' '){
                space++;
            }
        }
        consu = s.length()-(vowel(s)+space);
        return consu;
    }
    public static int vowelSum (String[] s){
        int sumV=0;
        for (int i=0 ; i<s.length ; i++){
            String st = s[i];
            int v= vowel(st);
            sumV+=v;
        }
        return sumV;
    }
    public static int consonantSum(String[] s){
        int sumC =0;
        for (int i=0 ; i<s.length ; i++){
            String st = s[i];
            int c= consunant(st);
            sumC +=c;
        }
        return sumC;
    }

    public static void main(String[] args) {
        String st ="The quick brown fox jumps over the lazy dog";
        System.out.println(vowel(st));
        System.out.println(consunant(st));
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        System.out.println( "The total number of vowels in the array is:" + vowelSum(names));
        System.out.println( "The total number of consonants in the array is:" + consonantSum(names));

    }
}
