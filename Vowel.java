public class Vowel {
    public String vowelOrConsonant(char ch){
        if(ch== 'a'||ch=='e'|| ch== 'i'||ch=='o'||ch=='u'){
            return "given character is vowel";
        }
        else{
            return "it is an consonent";
        }
        }
        public static void main(String[] args) {
            Vowel obj1 = new Vowel();
            System.out.println(obj1.vowelOrConsonant('a'));
        }
    }
    

