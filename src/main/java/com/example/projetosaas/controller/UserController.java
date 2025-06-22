//package com.example.projetosaas.controller;
//
//import com.example.projetosaas.data.User;
//import com.example.projetosaas.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping
//    public List<User> listUsers() {
//        return userRepository.findAll();
//    }
//
//    @PostMapping("/CreateUser")
//    public User createUser(@RequestBody User user) {
//        return userRepository.save(user);
//    }
//
//    @PutMapping(value = "/upload-file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ResponseEntity<?> UpdateUserFile (
//            @RequestParam("id") UUID id,
//            @RequestParam("file")MultipartFile file
//    )
//    {
//        if (!file.getOriginalFilename().toLowerCase().endsWith(".zip")) {
//            return ResponseEntity.badRequest().body(null);
//        }
//
//        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado.");
//        }
//
//        try {
//            User user = optionalUser.get();
//            user.setFile(file.getBytes());
//            userRepository.save(user);
//            return ResponseEntity.ok("Arquivo ZIP atualizado com sucesso.");
//        } catch (IOException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("Erro ao processar o arquivo.");
//        }
//
//    }
//}
//
//
//
