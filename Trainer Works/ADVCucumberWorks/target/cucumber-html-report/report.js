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
formatter.scenarioOutline({
  "comments": [
    {
      "line": 9,
      "value": "# this is my comment"
    }
  ],
  "line": 11,
  "name": "To issue the loan for the customer who is full time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "Employee has a \"creditvalue\" score",
  "rows": [
    {
      "cells": [
        "creditvalue"
      ],
      "line": 13
    },
    {
      "cells": [
        "100"
      ],
      "line": 14
    },
    {
      "cells": [
        "200"
      ],
      "line": 15
    },
    {
      "cells": [
        "300"
      ],
      "line": 16
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "# we say full, part, contractor, consultant with timed variable"
    }
  ],
  "line": 19,
  "name": "Customer has \"\u003ctimed\u003e\" time work",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "# it shall be like govt, private or semigovt with officetype variable"
    }
  ],
  "line": 21,
  "name": "in \"\u003cofficetype\u003e\" office",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "# number of years to repay"
    }
  ],
  "line": 24,
  "name": "should repay within \"\u003cnoofyears\u003e\" years",
  "keyword": "But "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;",
  "rows": [
    {
      "cells": [
        "timed",
        "officetype",
        "noofyears"
      ],
      "line": 28,
      "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;1"
    },
    {
      "cells": [
        "full",
        "govt",
        "25"
      ],
      "line": 29,
      "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;2"
    },
    {
      "cells": [
        "full",
        "private",
        "22"
      ],
      "line": 30,
      "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;3"
    },
    {
      "cells": [
        "part",
        "govt",
        "14"
      ],
      "line": 31,
      "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;4"
    },
    {
      "cells": [
        "part",
        "private",
        "7"
      ],
      "line": 32,
      "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 286906,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# all backgrounds are pre conditions"
    }
  ],
  "line": 7,
  "name": "load chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreStep.load_chrome_browser()"
});
formatter.result({
  "duration": 187909562,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "To issue the loan for the customer who is full time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Employee has a \"creditvalue\" score",
  "rows": [
    {
      "cells": [
        "creditvalue"
      ],
      "line": 13
    },
    {
      "cells": [
        "100"
      ],
      "line": 14
    },
    {
      "cells": [
        "200"
      ],
      "line": 15
    },
    {
      "cells": [
        "300"
      ],
      "line": 16
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "# we say full, part, contractor, consultant with timed variable"
    }
  ],
  "line": 19,
  "name": "Customer has \"full\" time work",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "# it shall be like govt, private or semigovt with officetype variable"
    }
  ],
  "line": 21,
  "name": "in \"govt\" office",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "# number of years to repay"
    }
  ],
  "line": 24,
  "name": "should repay within \"25\" years",
  "matchedColumns": [
    2
  ],
  "keyword": "But "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "full",
      "offset": 14
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "govt",
      "offset": 4
    }
  ],
  "location": "CreditScoreStep.in_gove_office(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"25\"",
      "offset": 20
    }
  ],
  "location": "CreditScoreStep.should_repay_within_5_years(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 99060,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# all backgrounds are pre conditions"
    }
  ],
  "line": 7,
  "name": "load chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreStep.load_chrome_browser()"
});
formatter.result({
  "duration": 74845,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "To issue the loan for the customer who is full time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Employee has a \"creditvalue\" score",
  "rows": [
    {
      "cells": [
        "creditvalue"
      ],
      "line": 13
    },
    {
      "cells": [
        "100"
      ],
      "line": 14
    },
    {
      "cells": [
        "200"
      ],
      "line": 15
    },
    {
      "cells": [
        "300"
      ],
      "line": 16
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "# we say full, part, contractor, consultant with timed variable"
    }
  ],
  "line": 19,
  "name": "Customer has \"full\" time work",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "# it shall be like govt, private or semigovt with officetype variable"
    }
  ],
  "line": 21,
  "name": "in \"private\" office",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "# number of years to repay"
    }
  ],
  "line": 24,
  "name": "should repay within \"22\" years",
  "matchedColumns": [
    2
  ],
  "keyword": "But "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "full",
      "offset": 14
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "private",
      "offset": 4
    }
  ],
  "location": "CreditScoreStep.in_gove_office(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"22\"",
      "offset": 20
    }
  ],
  "location": "CreditScoreStep.should_repay_within_5_years(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 79982,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# all backgrounds are pre conditions"
    }
  ],
  "line": 7,
  "name": "load chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreStep.load_chrome_browser()"
});
formatter.result({
  "duration": 70443,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "To issue the loan for the customer who is full time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Employee has a \"creditvalue\" score",
  "rows": [
    {
      "cells": [
        "creditvalue"
      ],
      "line": 13
    },
    {
      "cells": [
        "100"
      ],
      "line": 14
    },
    {
      "cells": [
        "200"
      ],
      "line": 15
    },
    {
      "cells": [
        "300"
      ],
      "line": 16
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "# we say full, part, contractor, consultant with timed variable"
    }
  ],
  "line": 19,
  "name": "Customer has \"part\" time work",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "# it shall be like govt, private or semigovt with officetype variable"
    }
  ],
  "line": 21,
  "name": "in \"govt\" office",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "# number of years to repay"
    }
  ],
  "line": 24,
  "name": "should repay within \"14\" years",
  "matchedColumns": [
    2
  ],
  "keyword": "But "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "part",
      "offset": 14
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "govt",
      "offset": 4
    }
  ],
  "location": "CreditScoreStep.in_gove_office(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"14\"",
      "offset": 20
    }
  ],
  "location": "CreditScoreStep.should_repay_within_5_years(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 98326,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# all backgrounds are pre conditions"
    }
  ],
  "line": 7,
  "name": "load chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreStep.load_chrome_browser()"
});
formatter.result({
  "duration": 78514,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "To issue the loan for the customer who is full time govt emp",
  "description": "",
  "id": "to-sanction-loan-for-the-customer;to-issue-the-loan-for-the-customer-who-is-full-time-govt-emp;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Employee has a \"creditvalue\" score",
  "rows": [
    {
      "cells": [
        "creditvalue"
      ],
      "line": 13
    },
    {
      "cells": [
        "100"
      ],
      "line": 14
    },
    {
      "cells": [
        "200"
      ],
      "line": 15
    },
    {
      "cells": [
        "300"
      ],
      "line": 16
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "according to bank standard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "# we say full, part, contractor, consultant with timed variable"
    }
  ],
  "line": 19,
  "name": "Customer has \"part\" time work",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "# it shall be like govt, private or semigovt with officetype variable"
    }
  ],
  "line": 21,
  "name": "in \"private\" office",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Sanction loan",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "# number of years to repay"
    }
  ],
  "line": 24,
  "name": "should repay within \"7\" years",
  "matchedColumns": [
    2
  ],
  "keyword": "But "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CreditScoreStep.according_to_bank_standard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "part",
      "offset": 14
    }
  ],
  "location": "CreditScoreStep.customer_has_full_time_work(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "private",
      "offset": 4
    }
  ],
  "location": "CreditScoreStep.in_gove_office(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreditScoreStep.sanction_loan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"7\"",
      "offset": 20
    }
  ],
  "location": "CreditScoreStep.should_repay_within_5_years(String)"
});
formatter.result({
  "status": "skipped"
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
formatter.before({
  "duration": 79248,
  "status": "passed"
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
  "duration": 7711992,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.login_successful()"
});
formatter.result({
  "duration": 325797,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 70076,
  "status": "passed"
});
formatter.before({
  "duration": 74112,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-feature;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@AfterSuccessLogin"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user logs in successfully",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});