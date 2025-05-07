package sbn.communis.app.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
}
