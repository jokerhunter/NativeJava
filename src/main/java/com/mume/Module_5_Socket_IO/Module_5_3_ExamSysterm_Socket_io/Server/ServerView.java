package com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Server;

import com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.model.UserMessage;

import java.io.IOException;

public class ServerView {
    /**
     * 使用合成复用原则
     */
    private ServerInitClose sic;
    private ServerDao sd = new ServerDao();

    /**
     * 通过构造方法初始化
     * @param sic
     */
    public ServerView(ServerInitClose sic) {
        this.sic = sic;
    }

    public void serverReceive() throws IOException, ClassNotFoundException {
        UserMessage um = (UserMessage) sic.getOis().readObject();
        System.out.println("接收到地消息是：" + um);
        // 调用方法实现管理员账号和密码信息的校验
        um.setType(sd.serverManagerCheck(um.getUser()) ? "success" : "failed");
        sic.getOos().writeObject(um);
        System.out.println("成功发送返回结果");
    }

}
