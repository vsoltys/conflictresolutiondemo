package com.example.conflictresolvedemo.command.api;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PersonCreatedEvt {

    UUID id;
    String name;
    LocalDate dateOfBirth;

}
