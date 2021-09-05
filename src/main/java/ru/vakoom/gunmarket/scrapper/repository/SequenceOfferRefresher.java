package ru.vakoom.gunmarket.scrapper.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SequenceOfferRefresher {

    private final JdbcTemplate jdbcTemplate;

    public void setHibernateSequenceCurrentValueToZero(){
        String sql = "ALTER SEQUENCE scrapperoffer_id_seq RESTART WITH 1";
        jdbcTemplate.execute(sql);
    }

}
