package com.dwang134.react_movies.service;

import com.dwang134.react_movies.model.Customer;
import com.dwang134.react_movies.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Customer registerUser(Customer user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return customerRepository.save(user);
    }

    public Optional<Customer> findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    public boolean authenticateUser(String email, String password) {
        Optional<Customer> userOptional = customerRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            Customer user = userOptional.get();
            return passwordEncoder.matches(password, user.getPassword());
        }
        return false;
    }
}
