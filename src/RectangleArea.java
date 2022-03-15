import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
    double width, height, area;

    public void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the value of the height of the rectangle.");
        height = Double.parseDouble(br.readLine());
        System.out.print("Please enter the value of the width of the rectangle.");
        width = Double.parseDouble(br.readLine());
    }

    public void computeField(){
        area = width * height;
    }

    public void fieldDisplay(){
        System.out.println("The area of a rectangle with height " + height);
        System.out.println("and width " + width);
        System.out.println("is " + area);

    }
}

