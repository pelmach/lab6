public class TaskOne {
    public static void main(String[] args){
        String[] strings = {"1", "2", ";", ":", ";", "a", "b", "c"};
        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i] == ";" || strings[i] == ":"){
                k++;
            }
        }
        System.out.println(k);
    }
}
