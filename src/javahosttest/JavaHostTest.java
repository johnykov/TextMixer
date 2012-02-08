package javahosttest;

public class JavaHostTest {

    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent sodales neque nec ipsum mattis hendrerit. Maecenas ac tellus eu turpis sollicitudin dictum et eget nunc. Aliquam sodales pulvinar diam ut auctor. Nullam tincidunt aliquet mauris, ut ornare ante molestie eu. Proin malesuada urna ac ipsum tempus sollicitudin. Fusce luctus ornare viverra. Suspendisse et lacinia metus. Nunc ac cursus orci. Donec ornare consectetur egestas.";
        TextTransform tt = new TextTransform(input);
        System.out.println(tt.mixUpAllText());
    }
}
