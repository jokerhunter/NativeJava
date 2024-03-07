package com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Server;

import com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.model.User;

/**
 * @author mume
 */
public class ServerDao {
    public boolean serverManagerCheck(User user) {
        if ("admin".equals(user.getUserName()) && "123456".equals(user.getUserName())) {
            return true;
        }
        return false;
    }
}
