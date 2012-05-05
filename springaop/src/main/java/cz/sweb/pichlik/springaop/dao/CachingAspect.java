/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springaop.dao;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;


/**
 * Upravte tuto tridu, tak aby slouzila jako cacheovaci aspect pro
 * {@link cz.sweb.pichlik.springaop.dao.UserStorageDao}.
 * <ul>
 *  <li>Nadeklarujte tridu jako Aspect a zavedte ji jako Spring beanu</li>
 *  <li>Naimplementujte metody {@link #clearCache(ProceedingJoinPoint)} a
 *  {@link #getFromCache(ProceedingJoinPoint, Long)}, aby vyuzivaly interni mapu jako
 *  cache.
 *  </li>
 * </ul>
 *
 * Tipy:
 * Anotace @Aspect, @Around
 * execution(* cz.sweb.pichlik.springaop.dao.UserStorageDao.save(..))" +
 *           "|| execution(* cz.sweb.pichlik.springaop.dao.UserStorageDao.update(..))" +
 *           "|| execution(* cz.sweb.pichlik.springaop.dao.UserStorageDao.delete(..))")
 *
 * @Around("execution(* cz.sweb.pichlik.springaop.dao.UserStorageDao.get(..))  && args(userId)")
 *
 */
public class CachingAspect {
    private final Map<Long, User> cache = new HashMap<Long, User>();

    private int cacheHitCounter = -1;

    /**
     * Po smazani cache nastavte cacheHitCounter na nula.
     */
    public Object clearCache(ProceedingJoinPoint call) throws Throwable{
        //odstrante objekt z cache
        return null;
    }

    /**
     * Tato metoda budto vrati vysledek z cache a nebo zavola DAO, vysledek ulozi do cache,
     * a vrati jej.
     */
    public Object getFromCache(ProceedingJoinPoint call, Long userId) throws Throwable{
        return null;
    }

    public int getCacheHitCounter() {
        return cacheHitCounter;
    }
}
