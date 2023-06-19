import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {

        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";

        String[] strs = text.split("[./ ]");

        int nrofObjects=strs.length/3;
        Person person[]=new Person[nrofObjects];

        String firstName="";
        String lastName="";
        String birthPlace="";

        int j=0;
        int k=0;
        for (int i=0; i < strs.length; i++) {
            if(j==0)
            {
                firstName=strs[i];
            }
            if(j==1)
            {
                lastName=strs[i];
            }
            if(j==2)
            {
                birthPlace=strs[i];
                person[k]=new Person(firstName,lastName,birthPlace);
                k=k+1;

            }
            if(j!=2)
            {
                j=j+1;
            }
            else
            {
                j=0;
            }
        }
        System.out.println(Arrays.toString(person));
    }
}