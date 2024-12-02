package October;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        if (phone_number.length() == 4) {
            return phone_number;
        }

        String frontStr = phone_number.substring(0, phone_number.length() - 4);
        String backStr = phone_number.substring(phone_number.length() - 4);
        String changed = frontStr.replaceAll(".", "*");

        answer = changed + backStr;
        return answer;
    }
}
