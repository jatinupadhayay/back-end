package com.postgresql.ecp.Service.impl;

import com.postgresql.ecp.Entity.Users;
import com.postgresql.ecp.Service.Usersservice;
import com.postgresql.ecp.dto.Userdto;
import com.postgresql.ecp.mapper.Usersmapper;
import com.postgresql.ecp.repo.Usersrepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Usersserviceimpl implements Usersservice {
    private Usersrepo usersrepo;
    @Override
    public Userdto createUsers(Userdto userdto) {
        Users users = Usersmapper.mapToUsers(userdto);
       Users saveusers=usersrepo.save(users);
        return Usersmapper.mapToUserdto(saveusers);
    }

}
