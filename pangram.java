class pangram{
    public static boolean isPanagram(String s){
        s=s.toLowerCase();
        for(char c='a';c<='z';c++){
            if(!s.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="The quick brown fox jumps over the lazy dog";
        if(isPanagram(s)){
            System.out.println("The string is a panagram");
        }
        else{
            System.out.println("The string is not a panagram");
        }
    }
}