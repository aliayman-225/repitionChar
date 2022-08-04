





public class main {
    public static char firstNonRepeated(String message)
    {
        int count[] = new int[127];
        int indexOfNonRepeatingChar=-1;
        for (int i = 0; i < message.length(); i++) {
            count[message.charAt(i)]++;
        }
        for (int i = 0; i < message.length(); i++) {
            if(count[message.charAt(i)]==1)
            {
                indexOfNonRepeatingChar=i;
                break;
            }

        }
        if(indexOfNonRepeatingChar!=-1)
            return message.charAt(indexOfNonRepeatingChar);
        return 0;
    }



    public static void main(String[] args) {
        System.out.println(firstNonRepeated("aabb"));

    }
}
