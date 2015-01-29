package com.senacor.services.prototype;

import com.senacor.services.base.HZService;

/**
 * Created by rwinzing on 20.01.15.
 */
public class HZPrototype extends HZService {
    @Override
    public String getDescription() {
        return null;
    }

    public static void main(String[] args) {
        new HZPrototype();
    }
}
