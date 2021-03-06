package service;

import model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class RoleService implements IRoleService{
    @Autowired
    IRoleService iRoleService;

    @Override
    public ArrayList<Role> findAll() {
        return iRoleService.findAll();
    }
}
