package br.com.treinaweb.twprojects.web.clients.dtos;

import br.com.treinaweb.twprojects.core.models.Client;
import br.com.treinaweb.twprojects.core.utils.StringsUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientViewModel {
    
    private Long id;
    private String name;
    private String phone;
    private String email;
    
    public static ClientViewModel of(Client client){
        return ClientViewModel.builder()
            .id(client.getId())
            .name(client.getName())
            .phone(StringsUtils.formatPhone(client.getPhone()))
            .email(client.getEmail())
            .build();
        }
}