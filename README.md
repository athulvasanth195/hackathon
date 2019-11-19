# hackathon

Hi Applittols;

The test is written using selenium and cucumber with testNg as test runner.
Normal selenium tests are specified by tag "@selenium" and applitools tests by tag "applitools"

By default it will excute both normal and applitools tests.
If you only want to view the applitools tests please add "@applitools" tag in testrunner.

For running the tests use the below commands

mvn test -Dappversion=V1   ----------------------------- for test against version 1 of the ACME app
mvn test -Dappversion=V2   ----------------------------- for test against version 2 of the ACME app

Applitools result dashboard URL: https://eyes.applitools.com/app/test-results/?accountId=qoGJj8hxc0mEZSOJID-FVg~~

Thanks You.
Athul
