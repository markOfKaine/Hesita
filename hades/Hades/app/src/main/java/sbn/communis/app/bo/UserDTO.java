package sbn.communis.app.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    //front end should be sending this object to the back end
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
}
