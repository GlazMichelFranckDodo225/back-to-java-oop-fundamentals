package com.dgmf.model;

// Modificateurs d'accès (visibilité) : "public", "protected", "package" et "package"
public class BankAccount {
    // par défaut (pas de visibilité précisée) ==> correspond à la
    // visibilité "package" ==> Attributs UNIQUEMENT accessibles depuis
    // les classes se trouvant dans le même package
    String accountId;
    double balance;
    String currency;
    String status;
}
