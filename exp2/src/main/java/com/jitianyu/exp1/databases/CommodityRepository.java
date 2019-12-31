package com.jitianyu.exp1.databases;

import java.util.Optional;

import com.jitianyu.exp1.domain.Commodity;

/**
 * CommodityRepository persists commodities.
 */
public interface CommodityRepository {
    /**
     * 
     * @param commodityId commodity id
     * @return optional commodity
     */
    Optional<Commodity> findByCommodityId(Long commodityId);

    /**
     * list all commodities
     * 
     * @return iterable commodity
     */
    Iterable<Commodity> findAll(Integer offset, Integer limit);

    /**
     * count return the row number
     * 
     * @return row number
     */
    Long count();

    /**
     * delete spec fic commodity
     * 
     * @param commodities
     */
    void delete(Commodity commodities);

    /**
     * save commodity
     * 
     * @param commodity
     * @return
     */
    Commodity save(Commodity commodity);
}