package com.example.prochatit.Common;

import com.example.prochatit.Holder.QBUsersHolder;
import com.quickblox.users.model.QBUser;

import java.util.List;

public class Common {

    public static final String DIALOG_EXTRA = "Dialogs";

    public static final String UPDATE_DIALOG_EXTRA = "ChatDialogs";
    public static final String UPDATE_MODE = "Mode";
    public static final String UPDATE_ADD_MODE = "add";
    public static final String UPDATE_REMOVE_MODE = "remove";


    //Dialog Avatar
    public static final int SELECT_PICTURE = 7171;
    public static String createChatDialogName(List<Integer> qbUsers){

        List<QBUser> qbUsers1 = QBUsersHolder.getInstance().getUsersById(qbUsers);
        StringBuilder name = new StringBuilder();
        //dialog name will be name of all users in the list
        for (QBUser user:qbUsers1)
            name.append(user.getFullName()).append(" ");
        //if length of names >30, we put "..." to the end of name
        if (name.length() > 30)
            name = name.replace(30, name.length()-1,"...");
        return name.toString();

    }

    public static boolean isNullOrEmptyString(String content){
        return (content != null && !content.trim().isEmpty()?false:true);
    }
}
