package sbn.communis.app.bo;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    //backend should handle this object
    //private String id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;

}
