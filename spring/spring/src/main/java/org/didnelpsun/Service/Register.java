//Register.java
package org.didnelpsun.Service;

import org.didnelpsun.Common.User;

public class Register {
    public static void registerUser(User user){
        if(user.getUsername()!=null && user.getPassword()!=null){
            System.out.println("注册成功！\n");
        }
    }
}
