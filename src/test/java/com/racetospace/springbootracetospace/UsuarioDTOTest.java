// package com.racetospace.springbootracetospace;


// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotNull;
// import static org.junit.Assert.assertTrue;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.MediaType;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.test.context.junit4.SpringRunner;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.MvcResult;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.racetospace.springbootracetospace.model.Usuario;
// import com.racetospace.springbootracetospace.model.UsuarioDTO;
// import com.racetospace.springbootracetospace.service.MyUserDetailsService;

// @RunWith(SpringRunner.class)
// @SpringBootTest
// @AutoConfigureMockMvc
// public class UsuarioDTOTest {

//     @Autowired
//     private MockMvc mockMvc;

//     @Autowired
//     private PasswordEncoder passwordEncoder;

//     @Autowired
//     private MyUserDetailsService myUserDetailsService;

//     @Test
//     public void testCrearUsuario() throws Exception {
//         UsuarioDTO usuarioDto = new UsuarioDTO();
//         usuarioDto.setUsername("testuser");
//         usuarioDto.setPassword("testpassword");

//         String encryptedPassword = passwordEncoder.encode(usuarioDto.getPassword());
//         usuarioDto.setPassword(encryptedPassword);

//         MvcResult result = mockMvc.perform(post("/auth/register")
//                 .contentType(MediaType.APPLICATION_JSON)
//                 .content(asJsonString(usuarioDto)))
//                 .andExpect(status().isCreated())
//                 .andReturn();

//         String content = result.getResponse().getContentAsString();
//         Usuario usuarioRegistrado = new ObjectMapper().readValue(content, Usuario.class);

//         assertNotNull(usuarioRegistrado);
//         assertEquals("testuser", usuarioRegistrado.getUsername());
//         assertTrue(passwordEncoder.matches("testpassword", usuarioRegistrado.getPassword()));
//     }

//     // Método para convertir un objeto a formato JSON
//     private static String asJsonString(final Object obj) {
//         try {
//             return new ObjectMapper().writeValueAsString(obj);
//         } catch (Exception e) {
//             throw new RuntimeException(e);
//         }
//     }

// }
