package br.com.treinaweb.twprojects.web.clients.dtos;

import br.com.treinaweb.twprojects.core.models.Client;
import br.com.treinaweb.twprojects.core.utils.StringsUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {
    
    private String name;

    private String email;

    private String phone;
    
    public Client toClient(){
        return Client.builder()
            .name(name)
            .phone(StringsUtils.cleanedPhone(phone))
            .email(email)
            .build();
    }
    public static ClientForm of(Client client){
        return ClientForm.builder()
            .name(client.getName())
            .phone(StringsUtils.formatPhone(client.getPhone()))
            .email(client.getEmail())
            .build();
    }
}
