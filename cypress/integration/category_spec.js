/**
 * These are high level tests to demonstrate the power of CypressJS. The tests are not complete but they
 * demonstrate how easy it is to work with Cypress, which out-of-the-box offers the ability take screenshots and record
 * videos without need for configuration.
 */

// auto-generates test data
var Chance = require('chance');
context('Category Page', function () {

    var chance;

    before(function () {
        chance = new Chance();
        cy.visit('/#/category');
    });

    specify('should open add Category page', function () {
        cy.get('#jh-create-entity').click();
        cy.get('#jhi-category-heading').should('have.text', 'Create or edit a Category');
    });

    specify('should add a new category', function () {
        var category = chance.word();
        cy.get('#editForm').within(function () {
            cy.get('#field_name').type(category);
            cy.root().submit();
        });
        cy.get('#jhi-alert-confirm').contains('A new category ' + category + ' has been created');
    });

    specify('should open create category menu then cancel', function () {
        cy.get('#jh-create-entity').click();
        cy.get('#jhi-category-heading').should('have.text', 'Create or edit a Category');
        cy.get('#cancel-save').click();
        cy.get('#cat-page-title').should('have.text', 'Categories');
    });
});
