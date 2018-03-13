# Novice Track Challenges
### Basic Tests
This first challenge requires you to assert against the return value of each method within the BasicTestsChallenge class, one for each test. All tests should pass.

| Method | Return Value |
| ------ | ------------ |
| Sum of two numbers equals number | boolean |
| Sum of two numbers returns | number |
| Join two strings into | string |
| Reverse array of strings | string[] |

### SetUp & TearDown Tests
Build on the foundation examples by creating a test class with both class and test setup and teardown methods.

1. Create a class setup method and instantiate a new object of the challenge data class.
2. Create a test setup method to get the next data value by passing in the test number.
3. Create a test teardown method to post the value you used during testing.
4. Create a class teardown method to log a special message indicating your success.
5. Create 3 different tests validating a number between:
    - 1: 1 and 100.
    - 2: 101 and 1000.
    - 3: 1001 and 10000.

The order in which you create the required methods is up to you. Use the above list as a guide.
Refer to the challenge test class template for additional info.
