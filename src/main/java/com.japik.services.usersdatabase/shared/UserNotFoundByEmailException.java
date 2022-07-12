package com.japik.services.usersdatabase.shared;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserNotFoundByEmailException extends UserNotFoundException {
    private final String email;
}