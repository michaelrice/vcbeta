package com.toastcoders

import com.toastcoders.vmware.Client
import com.vmware.vim25.mo.VirtualMachine

class HelloController {

    def index() {

        Client client = new Client("home\\vcauto", "2haxucUdaqe5", "10.12.254.53")
        VirtualMachine virtualMachine = client.getVirtualMachine("4215fa6b-1408-c4a3-c660-d6e177a40655")
        render virtualMachine.name
    }
}
