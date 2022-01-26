package co.com.bancodebogota.context.account.limits.domain.interfaces;

import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;

public interface UsersListFinder {
    DataUsers informationUsersListData(int idPage);
}
