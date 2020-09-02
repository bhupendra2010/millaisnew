$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/Millais.co.uk/src/test/Resources/vacancy.feature");
formatter.feature({
  "line": 1,
  "name": "User want to search for the vacancy",
  "description": "",
  "id": "user-want-to-search-for-the-vacancy",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8679125700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "vacancy",
  "description": "",
  "id": "user-want-to-search-for-the-vacancy;vacancy",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigate to vacancies option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should easily find out available vacancy",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefVacany.user_is_on_homepage()"
});
formatter.result({
  "duration": 5477022000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefVacany.user_navigate_to_vacancies_option()"
});
formatter.result({
  "duration": 1256322400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefVacany.user_should_easily_find_out_available_vacancy()"
});
formatter.result({
  "duration": 31900,
  "status": "passed"
});
});