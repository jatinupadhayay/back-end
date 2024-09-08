package com.postgresql.ecp.mapper;

import com.postgresql.ecp.Entity.Users;
import com.postgresql.ecp.dto.Userdto;

public class Usersmapper {
    public static Userdto mapToUserdto(Users users){
        return new Userdto(
                 users.getUser_id(),

                 users.getEmail(),
                users.getPassword(),
                users.getUsername()
        );
    }
    public static Users  mapToUsers(Userdto userdto){
        return new Users(
                userdto.getUser_id(),
                userdto.getEmail(),
                userdto.getPassword(),
                userdto.getUsername()
        );

    }
}
