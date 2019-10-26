package cn.edu.aynu.service;

public interface ILoginService {

    /**
     * 根据用户名在redis数据库中设置60秒验证码
     * @param name
     * @return
     */
    public String verificationCode(String name);
}
