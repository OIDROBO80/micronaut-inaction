package co.com.bancodebogota.context.account.limits.infrastructure;
import co.com.bancodebogota.context.account.limits.domain.user.UsersDto;
import io.micronaut.context.annotation.Value;

public final class APIRegresRepository implements co.com.bancodebogota.context.account.limits.domain.interfaces.APIRegresRepository {

    @Value("${api.regres.url}")
    private String endpoint;
    private static final String USERS="/users/";

    @Override
    public UsersDto informationUser(int idUser) {
        return new UsersDto();
    }

    @Override
    public void updateUser(int idUser) {
    //
    }

}
