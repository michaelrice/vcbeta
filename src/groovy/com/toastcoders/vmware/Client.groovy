package com.toastcoders.vmware

import com.vmware.vim25.mo.ServiceInstance
import com.vmware.vim25.mo.VirtualMachine
import com.vmware.vim25.ws.ApacheHttpClient
import com.vmware.vim25.ws.ClientCreator


/**
 * Created by errr on 8/9/14.
 */
class Client {

    String user
    String password
    String url
    private ServiceInstance serviceInstance

    public Client(String username, String passwd, String endpoint) {
        ClientCreator.clientClass = ApacheHttpClient.class
        user = username
        password = passwd
        url = "https://${endpoint}/sdk"
        serviceInstance = new ServiceInstance(new URL(url), user, password, true)
    }

    public VirtualMachine getVirtualMachine(String uuid) {
        return serviceInstance.searchIndex.findByUuid(null, uuid, true) as VirtualMachine
    }
}
