package co.com.bancodebogota.context.account.limits.application.list;

import co.com.bancodebogota.context.account.limits.domain.interfaces.UserRepository;
import co.com.bancodebogota.context.account.limits.domain.user.DataUsers;
import jakarta.inject.Singleton;

@Singleton
public class UsersListFinder{

    private final UserRepository userRepository;

    public UsersListFinder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*public DataUsers usersListData(int idPage){
        return userRepository.usersListData(idPage);
    }*/
}
