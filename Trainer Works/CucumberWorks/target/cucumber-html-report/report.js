$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("creditscore.feature");
formatter.feature({
  "line": 2,
  "name": "To sanction Loan for the customer",
  "description": "",
  "id": "to-sanction-loan-for-the-customer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "# this is my comment"
    }
  ],
  "line": 6,
  "name": "To issue the loan for the customer who is full time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Employee has a credit score",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Customer has full time work",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "in govt office",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "should repay within 5 years",
  "keyword": "But "
});
formatter.match({
  "location": "CreditScoreStep.employee_has_a_credit_score()"
});
formatter.result({
  "duration": 120450539,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "duration": 55767,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "full",
      "offset": 13
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "duration": 2255996,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.in_gove_office()"
});
formatter.result({
  "duration": 50264,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "duration": 42192,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.should_repay_within_5_years()"
});
formatter.result({
  "duration": 39991,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "To issue the loan for the customer who is private time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-private-time-govt-emp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Employee has a credit score",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Customer has part time work",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "in govt office",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "should repay within 5 years",
  "keyword": "But "
});
formatter.match({
  "location": "CreditScoreStep.employee_has_a_credit_score()"
});
formatter.result({
  "duration": 184178,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "duration": 91356,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "part",
      "offset": 13
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "duration": 207292,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.in_gove_office()"
});
formatter.result({
  "duration": 134281,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "duration": 42926,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.should_repay_within_5_years()"
});
formatter.result({
  "duration": 81083,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "To issue the loan for the customer who is full time private emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-private-emp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Employee has a credit score",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Customer has full time work",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "in private office",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "should repay within 5 years",
  "keyword": "But "
});
formatter.match({
  "location": "CreditScoreStep.employee_has_a_credit_score()"
});
formatter.result({
  "duration": 61637,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "duration": 33387,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "full",
      "offset": 13
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "duration": 79248,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.in_private_office()"
});
formatter.result({
  "duration": 50263,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "duration": 39257,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.should_repay_within_5_years()"
});
formatter.result({
  "duration": 35955,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Fannie"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "login-feature;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "username and password",
  "rows": [
    {
      "comments": [
        {
          "line": 6,
          "value": "# there shall be values which can be passed"
        }
      ],
      "cells": [
        "login",
        "pwd",
        "roles"
      ],
      "line": 7
    },
    {
      "cells": [
        "larry",
        "larrypwd",
        "manger"
      ],
      "line": 8
    },
    {
      "cells": [
        "harry",
        "harrypwd",
        "teamleader"
      ],
      "line": 9
    },
    {
      "cells": [
        "peter",
        "peterpwd",
        "developer"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "login successful",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.username_and_password(DataTable)"
});
formatter.result({
  "duration": 3387113,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.login_successful()"
});
formatter.result({
  "duration": 74112,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 85485,
  "status": "passed"
});
});