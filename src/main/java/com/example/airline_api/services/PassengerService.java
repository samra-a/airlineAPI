package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    public void savePassenger(Passenger newPassenger){passengerRepository.save(newPassenger);
    }

    public Passenger findPassenger(Long id){
        return passengerRepository.findById(id).get();
    }

    public List<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }

    public void deletePassenger(long id){
        this.passengerRepository.deleteById(id);
    }



}
