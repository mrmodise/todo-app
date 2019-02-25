/**
 * These are high level tests to demonstrate the power of CypressJS. The tests are not complete but they
 * demonstrate how easy it is to work with Cypress, which out-of-the-box offers the ability take screenshots and record
 * videos without need for configuration.
 */

context('Task Page', function () {
    before(function () {
        cy.visit('/#/task');
    });
    specify('should search for Cleaning task', function () {
        cy.get('#searchField').type('Cleaning');
        cy.get('#task-title').should('have.text', 'Cleaning');
    });

    specify('should expand the Cleaning', function () {
        cy.get('#open-task').click();
        cy.get('#preview-task-title').should('have.text', 'Cleaning');
    });

    specify('should cancel search criteria', function () {
        cy.get('#searchField').clear();
    });

});
