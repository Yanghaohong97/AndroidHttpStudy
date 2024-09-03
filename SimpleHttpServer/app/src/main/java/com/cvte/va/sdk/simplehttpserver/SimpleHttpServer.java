package com.cvte.va.sdk.simplehttpserver;

import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;

public class SimpleHttpServer extends NanoHTTPD {

    public SimpleHttpServer(int port) throws IOException {
        super(port);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("Server started on port " + port);
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "<html><body><h1>Hello, Android HTTP Server!</h1></body></html>";
        return newFixedLengthResponse(msg);
    }
}