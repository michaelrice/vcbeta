package com.toastcoders.vmware

import com.vmware.vim25.mo.VirtualMachine
import org.junit.Test

import co.freeside.betamax.Betamax
import co.freeside.betamax.Recorder

import static org.junit.Assert.*
import org.junit.*

public class ClientTest {

    @Rule public Recorder recorder = new Recorder()

    @Betamax(tape = "getVirtualMachine")
    @Test
    public void testGetVirtualMachine() throws Exception {
        Client client = new Client("home\\vcauto", "2haxucUdaqe5", "10.12.254.53")
        VirtualMachine virtualMachine = client.getVirtualMachine("4215fa6b-1408-c4a3-c660-d6e177a40655")
        assert virtualMachine != null
        assert virtualMachine.name == "ubuntu-python-dev"
    }
}
