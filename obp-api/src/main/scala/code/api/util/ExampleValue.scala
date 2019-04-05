package code.api.util


import code.api.util.Glossary.{GlossaryItem, glossaryItems, makeGlossaryItem}

object ExampleValue {

  case class ConnectorField(value: String, description: String) {

//    def valueAndDescription: String = {
//      s"${value} : ${description}".toString
//    }

  }

  val bankIdGlossary = glossaryItems.find(_.title == "Bank.bank_id").map(_.textDescription)

  val bankIdExample = ConnectorField("GENODEM1GLS", s"A string that MUST uniquely identify the bank on this OBP instance. It COULD be a UUID but is generally a short string that easily identifies the bank / brand it represents.")

  val accountIdExample = ConnectorField("8ca8a7e4-6d02-40e3-a129-0b2bf89de9f0", s"A string that, in combination with the bankId MUST uniquely identify the account on this OBP instance. SHOULD be a UUID. MUST NOT be able to guess accountNumber from accountID. OBP-API or Adapter keeps a mapping between accountId and accountNumber. AccountId is a non reversible hash of the human readable account number.")

  val accountNumberExample = ConnectorField("546387432", s"A human friendly string that identifies the account at the bank, possibly in combination with the branch and account type.")

  val sessionIdExample = ConnectorField("b4e0352a-9a0f-4bfa-b30b-9003aa467f50", s"A string that MUST uniquely identify the session on this OBP instance, can be used in all cache. ")

  val userIdExample = ConnectorField("9ca9a7e4-6d02-40e3-a129-0b2bf89de9b1", s"A string that MUST uniquely identify the user on this OBP instance.")
  glossaryItems += makeGlossaryItem("Adapter.userId", userIdExample)


  val usernameExample = ConnectorField("felixsmith", s"The username the user uses to authenticate.")
  glossaryItems += makeGlossaryItem("Adapter.username", usernameExample)

  val correlationIdExample = ConnectorField("1flssoftxq0cr1nssr68u0mioj", s"A string generated by OBP-API that MUST uniquely identify the API call received by OBP-API. Used for debugging and logging purposes. It is returned in header to the caller.")
  glossaryItems += makeGlossaryItem("API.correlation_id", correlationIdExample)


   val customerIdExample = ConnectorField("7uy8a7e4-6d02-40e3-a129-0b2bf89de8uh", s"A non human friendly string that identifies the customer and is used in URLs. This SHOULD NOT be the customer number. The combination of customerId and bankId MUST be unique on an OBP instance. customerId SHOULD be unique on an OBP instance. Ideally customerId is a UUID. A mapping between customer number and customer id is kept in OBP.")
  glossaryItems += makeGlossaryItem("Adapter.customerId", customerIdExample)


  val customerNumberExample = ConnectorField("5987953", s"The human friendly customer identifier that MUST uniquely identify the Customer at the Bank ID. Customer Number is NOT used in URLs.")
  glossaryItems += makeGlossaryItem("Adapter.customerNumber", customerNumberExample)

  val labelExample = ConnectorField("My Account", s"A lable that describes the Account")
  val legalNameExample = ConnectorField("Eveline Tripman", s"The legal name of the Customer.")
  glossaryItems += makeGlossaryItem("Adapter.legalName", legalNameExample)

  val cbsTokenExample = ConnectorField("FYIUYF6SUYFSD", s"A token provided by the Gateway for use by the Core Banking System")
  glossaryItems += makeGlossaryItem("Adapter.cbsToken", cbsTokenExample)

  val counterpartyIdExample = ConnectorField("9fg8a7e4-6d02-40e3-a129-0b2bf89de8uh", s"The Counterparty ID used in URLs. This SHOULD NOT be a name of a Counterparty.")
  glossaryItems += makeGlossaryItem("Adapter.counterpartyId", counterpartyIdExample)

  val counterpartyNameExample = ConnectorField("John Smith Ltd.", s"The name of a Counterparty. Ideally unique for an Account")
  glossaryItems += makeGlossaryItem("Adapter.counterpartyName", counterpartyNameExample)

  val transactionIdExample = ConnectorField("2fg8a7e4-6d02-40e3-a129-0b2bf89de8ub", s"The Transaction ID used in URLs. Used to store Metadata for the Transaction.")
  glossaryItems += makeGlossaryItem("Adapter.transactionId", transactionIdExample)

  val transactionDescriptionExample = ConnectorField("For the piano lesson in June 2018 - Invoice No: 68", s"A description or reference for the transaction")
  glossaryItems += makeGlossaryItem("Adapter.transactionDescription", transactionDescriptionExample)

  val transactionTypeExample = ConnectorField("DEBIT", s"A code for the type of transaction")
  glossaryItems += makeGlossaryItem("Adapter.transactionType", transactionTypeExample)


  val ibanExample = ConnectorField("DE91 1000 0000 0123 4567 89", s"MUST uniquely identify the bank account globally.")
  glossaryItems += makeGlossaryItem("Adapter.iban", ibanExample)

  val gitCommitExample = ConnectorField("59623811dd8a41f6ffe67be46954eee11913dc28", "Identifies the code running on the OBP-API (Connector) or Adapter.")

  val emailExample = ConnectorField("eveline@example.com", "An email address.")

  val branchIdExample = ConnectorField("DERBY6", "Uniquely identifies the Branch in combination with the bankId.")
  glossaryItems += makeGlossaryItem("Branch.branch_id", branchIdExample)

  val accountTypeExample = ConnectorField("AC","A short code that represents the type of the account as provided by the bank.")

  val balanceAmountExample = ConnectorField("50.89", "The balance on the account.")
  
  val creditLimitAmountExample = ConnectorField("1000.00", "The credit limit on the accounts of a customer.")

  val transactionAmountExample = ConnectorField("19.64", "A Transaction Amount.")

  val transactionPostedDateExample = ConnectorField("20180127", "The Posted date of a transaction in the format: yyyyMMdd")
  val transactionCompletedDateExample = ConnectorField("20180128", "The Completed date of a transaction in the format: yyyyMMdd")

  val transactionRequestTypeExample = ConnectorField("SEPA", "The Transaction Request Type defines the request body that is required - and the logic / flow of the Transaction Request. Allowed values include SEPA, COUNTERPARTY and SANDBOX_TAN.")
  glossaryItems += makeGlossaryItem("Transaction Requests.Transaction Request Type", transactionRequestTypeExample)

  val currencyExample = ConnectorField("EUR", "The currency of the account.")


  val owner1Example = ConnectorField("SusanSmith", "A username that is the owner of the account.")
  glossaryItems += makeGlossaryItem("Account.owner", owner1Example)






  val owner2Example = ConnectorField("JaneSmith", "A username that is the owner of the account.")

  val bankRoutingSchemeExample = ConnectorField("BIC", "The scheme that the bank_routing_address / bankRoutingAddress is an example of.")
  glossaryItems += makeGlossaryItem("Bank.bank_routing_scheme", bankRoutingSchemeExample)

  val bankRoutingAddressExample = ConnectorField("GENODEM1GLS", "An identifier that conforms to bank_routing_scheme / bankRoutingScheme")
  glossaryItems += makeGlossaryItem("Bank.bank_routing_address", bankRoutingAddressExample)

  val branchRoutingSchemeExample = ConnectorField("BRANCH-CODE", "The scheme that the branch_routing_address / branchRoutingAddress is an example of.")
  glossaryItems += makeGlossaryItem("Branch.branch_routing_scheme", branchRoutingSchemeExample)

  val branchRoutingAddressExample = ConnectorField("DERBY6", "An address that conforms to branch_routing_scheme / branchRoutingScheme")
  glossaryItems += makeGlossaryItem("Branch.branch_routing_address", branchRoutingAddressExample)

  val accountRoutingSchemeExample = ConnectorField("IBAN", "The scheme that the account_routing_address / accountRoutingAddress is an example of.")
  glossaryItems += makeGlossaryItem("Account.account_routing_scheme",accountRoutingSchemeExample)

  val accountRoutingAddressExample = ConnectorField("DE91 1000 0000 0123 4567 89", "An identifier that conforms to account_routing_scheme / accountRoutingScheme")
  glossaryItems += makeGlossaryItem("Account.account_routing_address", accountRoutingAddressExample)

  val cbsErrorCodeExample = ConnectorField("500-OFFLINE", "An error code returned by the CBS")


}



