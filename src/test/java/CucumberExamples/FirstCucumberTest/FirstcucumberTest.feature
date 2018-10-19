Feature: verify google.in site is accessible

    Scenario: open google.in

      Given chrome driver is open
      When url is entered
      Then title contains google
# fail scenario
    Scenario: Open google.com
      Given chrome driver is open
      When url is entered
      Then title contains googleIndia
