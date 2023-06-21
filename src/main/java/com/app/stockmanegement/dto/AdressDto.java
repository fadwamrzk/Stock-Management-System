package com.app.stockmanegement.dto;

import com.app.stockmanegement.Model.Address;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdressDto {
    private Integer id;
    private String addresse1;
    private String addresse2;
    private String ville;
    private  String codePostale;
    private String pays;
    public AdressDto fromEntiy(Address address) {
        if (address== null) {
            //throw an exception
            return null;
        }
       return AdressDto.builder()
                .addresse1(address.getAddresse1())
                .addresse2(address.getAddresse2())
               .codePostale(address.getCodePostale())
               .ville(address.getVille())
               .pays(address.getPays())
               .build();
    }
    public Address toEntiy(AdressDto adressDto){

        if (adressDto == null) {
            //throw an exception
            return null;
        }

        Address address = new Address();
        address.setAddresse1(adressDto.getAddresse1());
        address.setAddresse2(adressDto.getAddresse2());
        address.setCodePostale(adressDto.getCodePostale());
        address.setVille(adressDto.getVille());
        address.setPays(adressDto.getPays());
        return address;
    }
}
