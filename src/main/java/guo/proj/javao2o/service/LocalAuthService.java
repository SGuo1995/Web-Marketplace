package guo.proj.javao2o.service;

import guo.proj.javao2o.dto.LocalAuthExecution;
import guo.proj.javao2o.entity.LocalAuth;
import guo.proj.javao2o.exceptions.LocalAuthOperationException;

public interface LocalAuthService {
    /**
     * Acquire account info via userName and password
     *
     * @param userName
     * @return
     */
    LocalAuth getLocalAuthByUsernameAndPwd(String userName, String password);

    /**
     * Get account info via userId
     *
     * @param userId
     * @return
     */
    LocalAuth getLocalAuthByUserId(long userId);

    /**
     * Connect to WeChat
     *
     * @param localAuth
     * @return
     * @throws RuntimeException
     */
    LocalAuthExecution bindLocalAuth(LocalAuth localAuth) throws LocalAuthOperationException;

    /**
     * @param userId
     * @param username
     * @param password
     * @param newPassword
     * @return
     * @throws LocalAuthOperationException
     */
    LocalAuthExecution modifyLocalAuth(Long userId, String username, String password, String newPassword)
            throws LocalAuthOperationException;
}
