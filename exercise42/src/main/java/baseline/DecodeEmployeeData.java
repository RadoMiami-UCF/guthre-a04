package baseline;

class DecodeEmployeeData {
    public static EmployeeData decodeData(String dataString) {
        //First, take in a known good string an argument.
        //Then, use the commas to split it into three pieces.
        //Finally, return an EmployeeData object with the firstName, lastName, and salary of the EmployeeData object to
        //their respective values.
        //Note: The reason why it's just a single static method run many times instead of a single non-static method run
        //once an entire array is because running it on an entire array would require a second array to be created.
        return new EmployeeData("", "", 1);
    }
}
