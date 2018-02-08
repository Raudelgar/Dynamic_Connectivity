package com.company;

import java.util.*;

public interface  Union_Find {

    /**
     * Check if p and q have the same value
     * First time would be false, so the union method will be executed
     * @param p
     * @param q
     * @return
     */
    boolean connected(int p, int q);

    /**
     * Change the value of p index for q index value
     * @param p
     * @param q
     */
    void union (int p, int q);

    boolean check_Value_Size (int n);

}
