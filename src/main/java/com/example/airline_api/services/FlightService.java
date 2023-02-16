package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public void saveFlight(Flight flight){flightRepository.save(flight);
    }

    public Flight findFlight(Long id){
        return flightRepository.findById(id).get();
    }

    public List<Flight> findAllFlights(){
        return flightRepository.findAll();
    }

    public void deleteFlight(long id){
        this.flightRepository.deleteById(id);
    }

    public Flight addPassengerToClass(long flightId, Passenger passenger ){
        Flight flight = flightRepository.findById(flightId).get();
        List<Passenger> passengers = flight.getPassengers();
        passengers.add(passenger);
        flight.setPassengers(passengers);
        flightRepository.save(flight);
        return flight;

          //create a flights list
        //add passenger to flight
    }
}
