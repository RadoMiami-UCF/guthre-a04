package baseline;

import java.util.ArrayList;

public class Solution42 {
    //First, create an arrayList of objects used to store employee data (the first name, last name, and salary).
    private final ArrayList<EmployeeData> employeeDataArrayList = new ArrayList<>();
    //Then, create an instance of the classes used to decode input and format output with the arrayList.
    private final TakeInputFromFile input = new TakeInputFromFile(employeeDataArrayList);
    private final OutputToFile output = new OutputToFile(employeeDataArrayList);
    public static void main(String[] args) {
        //First, create an instance of Solution42.
        var app = new Solution42();
        //Then, use the input class to fill the arrayList with employeeData objects.
        app.input.readData();
        //Finally, use the output object to either print or write the output.
        app.output.writeData();
    }
}