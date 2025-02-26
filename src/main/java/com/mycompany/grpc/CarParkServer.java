/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 *
 * @author Programacion IEE
 */
public class CarParkServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException{
         Server server = ServerBuilder.forPort(5003)
                .addService(new CarParkServiceImpl())
                .build();

        server.start();

        // Server is kept alive for the client to communicate.
        server.awaitTermination();
    }
    
}
