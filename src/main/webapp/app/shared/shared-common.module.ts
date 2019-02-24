import { NgModule } from '@angular/core';

import { TodolistSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TodolistSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TodolistSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TodolistSharedCommonModule {}
