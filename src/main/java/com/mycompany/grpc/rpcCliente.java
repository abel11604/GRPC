/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.sample.park.CarParkServiceGrpc;
import org.sample.park.ParkRequest;
import org.sample.park.ParkResponse;
import org.sample.park.Vehicle;

/**
 *
 * @author Programacion IEE
 */
public class rpcCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Channel is used by the client to communicate with the server using the domain localhost and port 5003.
        // This is the port where our server is starting.
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5003)
                .usePlaintext()
                .build();

        // Auto generated stub class with the constructor wrapping the channel.
        CarParkServiceGrpc.CarParkServiceBlockingStub stub =CarParkServiceGrpc.newBlockingStub(channel);

        // Start calling the `parkVehicle` method
        ParkRequest parkRequest = ParkRequest.newBuilder()
                .setVehicle(Vehicle.newBuilder()
                        .setVehicleNumber("NA-1324")
                        .setVehicleType("BUS")
                        .build())
                .build();

        ParkResponse parkResponse = stub.parkVehicle(parkRequest);
        System.out.println("Response for the first call: " + parkResponse.getResult());

        // Call to the `parkVehicle` method is successfully completed. Now calling the `parkVehicleManyTimes` method.
        // Hold the thread for 10s before calling the other method.
        System.out.println("### Initiating the second request ###");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ParkRequest parkRequest2 = ParkRequest.newBuilder()
                .setVehicle(Vehicle.newBuilder()
                        .setVehicleNumber("PE-6723")
                        .setVehicleType("VAN")
                        .build())
                .build();

        System.out.println("Response for the second call: ");
        stub.parkVehicleManyTimes(parkRequest2).forEachRemaining(parkResponseManyTimes -> {
            System.out.println(parkResponseManyTimes.getResult());
        });
        // Call to the `parkVehicleManyTimes` method is successfully completed.
    }
    }
    

