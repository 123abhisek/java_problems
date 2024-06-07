package Problems;

public class Compare_Version_Numbers_165 {

	public static int compareVersion(String version1, String version2) {
        if(Double.parseDouble(version1) < Double.parseDouble(version2)){
            return -1;
        }
        else if(Double.parseDouble(version1) > Double.parseDouble(version2)){
            return 1;
        }
        else{
            return 0;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1 = "1.01";
		String version2 = "1.001";

		System.out.println(compareVersion(version1, version2));
	}

}
