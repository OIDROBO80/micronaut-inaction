package co.com.bancodebogota.context.domain.user;

import io.micronaut.core.annotation.Introspected;

import java.util.ArrayList;

@Introspected
public class DataUsers extends Data{

    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<Data> data;
    public Support support;
}
