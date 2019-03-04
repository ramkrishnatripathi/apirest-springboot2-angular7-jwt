import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LayoutComponent } from './layout.component';

const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: '',
        redirectTo: 'dashboard'
      },
      {
        path: 'dashboard',
        loadChildren: './dashboard/dashboard.module#DashboardModule'
      },
      {
        path: 'user',
        loadChildren: './user/user.module#UserModule'
      },
      {
        path: 'project',
        loadChildren: './project/project.module#ProjectModule'
      },
      {
        path: 'charts',
        loadChildren: './charts/charts.module#ChartsModule'
      }
      // {
      //   path: 'material',
      //   loadChildren: './material-components/material-components.module#MaterialComponentsModule'
      // }
      // {
      //   path: 'forms',
      //   loadChildren: './forms/forms.module#FormsModule'
      // },
      // {
      //   path: 'grid',
      //   loadChildren: './grid/grid.module#GridModule'
      // },
      // {
      //   path: 'blank-page',
      //   loadChildren: './blank-page/blank-page.module#BlankPageModule'
      // },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LayoutRoutingModule {}
