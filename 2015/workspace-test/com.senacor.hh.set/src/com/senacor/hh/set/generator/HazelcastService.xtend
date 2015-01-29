package com.senacor.hh.set.generator

import com.senacor.hh.set.setDsl.Service

class HazelcastService {
	def static generateAbstractHazelcastService(Service service) '''
package com.senacor.services.«service.name»;

import com.senacor.services.base.HZService;

public class AbstractHZ«service.name» extends HZService {
    @Override
    public String getDescription() {
        return null;
    }

}
	'''

	def static generateHazelcastServiceImpl(Service service) '''
package com.senacor.services.«service.name»;

import com.senacor.services.base.HZService;

public class HZ«service.name»Impl extends AbstractHZ«service.name» {
    @Override
    public String getDescription() {
        return null;
    }

    public static void main(String[] args) {
        new HZ«service.name»Impl();
    }
}
	'''
}