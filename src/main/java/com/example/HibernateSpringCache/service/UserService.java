package com.example.HibernateSpringCache.service;

import com.example.HibernateSpringCache.dto.UserDTO;
import com.example.HibernateSpringCache.model.User;
import com.example.HibernateSpringCache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private UserDTO convertToDTO(User user) {
        if (user == null) return null;
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    @Cacheable("users")
    public Optional<UserDTO> getUserById(int id) {
        return userRepository.findById(id).map(this::convertToDTO);
    }
}