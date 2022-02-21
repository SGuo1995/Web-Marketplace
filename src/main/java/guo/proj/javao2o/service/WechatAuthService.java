package guo.proj.javao2o.service;

import guo.proj.javao2o.dto.WechatAuthExecution;
import guo.proj.javao2o.entity.WechatAuth;
import guo.proj.javao2o.exceptions.WechatAuthOperationException;

public interface WechatAuthService {

    /**
     * Get WeChat account via openId.
     *
     * @param openId
     * @return
     */
    WechatAuth getWechatAuthByOpenId(String openId);

    /**
     * Register WeChat account
     *
     * @param wechatAuth
     * @return
     * @throws RuntimeException
     */
    WechatAuthExecution register(WechatAuth wechatAuth) throws WechatAuthOperationException;

}
