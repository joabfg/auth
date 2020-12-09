package com.galsystem.auth.vo;

import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserVO implements Serializable {


    private String userName;

    private String password;
}
