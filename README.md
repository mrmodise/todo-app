# To-do List

All application components (back-end and
front-end) are generated using JHipster.
The back-end is a <b>Maven 3.0</b> project with <b>Spring Boot 2.0.8.RELEASE</b> and <b>Java 1.8</b>
as illustrated in the pom.xml. The front-end is an <b>Angular 7.2.2</b> project, see package.json.

The key components of the application are 2 components <b>Task</b> and <b>Category</b>. The back-end
uses <b>Spring JPA</b> to generate database tables inside of <b>H2 in-memory</b>.
Once the database and its associated tables are generated Spring uses JpaRepositories to perform
CRUD operations. Interfacing the front-end is the Web REST API located under <b>/web/rest</b>
directory

In addition to the above components, the back-end includes a Service to enable searching of Tasks.
This is a functionality that comes out-of-the-box with JHipster. The motive was to utilize as much of
JHipster's OOTB
functionality as possible

The front-end has 2 Angular components (again putting emphasis on Task and Category) that the user
interacts with. Again, JHipster OOTB functionality is maintained, as it follows best practices.
Therefore, the user
interacts with Angular components, which retrieves data via Services that utilizes an HTTP
interceptor to filter requests</p>

For automated UI tests, Cypress is added as an additional testing framework over Protractor for the
benefit of recording test data, screenshots and video - and view aggregated, next-level insights in
a dashboard. This functionality in common OSS automated UI testing frameworks does not come by default.

Lastly, Security has been disabled to simplify the application work-flow.

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

1.  [Node.js][]: Node is used to run a development web server and build the project.
    Depending on the system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

    npm install

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

    ./mvnw
    npm start

## Testing

To launch the back-end application tests, run:

    ./mvnw clean test

### Client tests

Unit tests are run by [Jest][] and written with [Jasmine][]. They're located in [src/test/javascript/](src/test/javascript/) and can be run with:

    npm test

Cypress consists of a free, open source, locally installed Test Runner and a Dashboard Service for recording tests. To execute automated UI tests with Cypress, run:

         npm run cypress:open
