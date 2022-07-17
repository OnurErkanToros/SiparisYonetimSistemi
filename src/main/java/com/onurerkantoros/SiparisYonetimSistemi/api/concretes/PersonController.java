package com.onurerkantoros.SiparisYonetimSistemi.api.concretes;

import com.onurerkantoros.SiparisYonetimSistemi.api.abstracts.IBaseController;
import com.onurerkantoros.SiparisYonetimSistemi.dto.abstracts.BasePersonDto;
import com.onurerkantoros.SiparisYonetimSistemi.service.abstracts.IBaseService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class PersonController implements IBaseController<BasePersonDto> {
    private final IBaseService userService;

    public PersonController(IBaseService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public HttpEntity<BasePersonDto> create(@RequestBody BasePersonDto basePersonDto){
        BasePersonDto resultUser = userService.createUser(basePersonDto);
        return ResponseEntity.ok(resultUser);
    }
    @GetMapping("/getAll")
    public HttpEntity<List<BasePersonDto>> getAll(){
        List<BasePersonDto> allUser = userService.getAllUsers();
        return ResponseEntity.ok(allUser);
    }
    @GetMapping("/getById/{id}")
    public  HttpEntity<BasePersonDto> getById(@PathVariable("id") int id){
        BasePersonDto basePersonDto = userService.getUserById(id);
        return ResponseEntity.ok(basePersonDto);
    }
    @PutMapping("/update/{id}")
    public HttpEntity<BasePersonDto> update(@PathVariable("id") int id, @RequestBody BasePersonDto basePersonDto){
        BasePersonDto resultBasePersonDto = userService.updateUser(id, basePersonDto);
        return ResponseEntity.ok(resultBasePersonDto);
    }
    @DeleteMapping("/delete/{id}")
    public HttpEntity<Boolean> delete(@PathVariable("id") int id){
        boolean resultUserDelete = userService.deleteUser(id);
        return  ResponseEntity.ok(resultUserDelete);
    }

    @Override
    @DeleteMapping("/delete/all")
    public HttpEntity<Integer> deleteAll() {
        return ResponseEntity.ok(userService.deleteAll());
    }
}
