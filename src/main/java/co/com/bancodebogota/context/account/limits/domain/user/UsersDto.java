package co.com.bancodebogota.context.account.limits.domain.user;

import java.util.ArrayList;

public class UsersDto {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<UserDto> data;
    public Support support;
}
