package com.jitianyu.exp1.databases;

import java.util.Optional;

import com.jitianyu.exp1.domain.Commodity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * JdbcCommodityRepository
 */
@Repository
public class JdbcCommodityRepository implements CommodityRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcCommodityRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Commodity> findByCommodityId(Long commodityId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Commodity> findAll(Integer offset, Integer limit) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long count() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Commodity commodities) {
        // TODO Auto-generated method stub

    }

    @Override
    public Commodity save(Commodity commodity) {
        // TODO Auto-generated method stub
        return null;
    }

}