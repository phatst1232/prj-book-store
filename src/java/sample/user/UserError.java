/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

/**
 *
 * @author phats
 */
public class UserError {

    private String userIDError;
    private String fullNameError;
    private String roleIDError;
    private String passwordError;
    private String confirmError;
    private String messageError;

    public UserError() {
        this.userIDError = "";
        this.fullNameError = "";
        this.passwordError = "";
        this.roleIDError = "";
        this.confirmError = "";
        this.messageError = "";
    }

    public UserError(String userIDError, String fullNameError, String roleIDError, String passwordError, String confirmError, String messageError) {
        this.userIDError = userIDError;
        this.fullNameError = fullNameError;
        this.roleIDError = roleIDError;
        this.passwordError = passwordError;
        this.confirmError = confirmError;
        this.messageError = messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public String getMessageError() {
        return messageError;
    }

    public String getUserIDError() {
        return userIDError;
    }

    public String getFullNameError() {
        return fullNameError;
    }

    public String getRoleIDError() {
        return roleIDError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public String getConfirmError() {
        return confirmError;
    }

    public void setUserIDError(String userIDError) {
        this.userIDError = userIDError;
    }

    public void setFullNameError(String fullNameError) {
        this.fullNameError = fullNameError;
    }

    public void setRoleIDError(String roleIDError) {
        this.roleIDError = roleIDError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public void setConfirmError(String confirmError) {
        this.confirmError = confirmError;
    }

}
