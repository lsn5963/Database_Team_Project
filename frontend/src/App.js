import React, { Component, useEffect, useState } from 'react';
import './App.css';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Main from './component/main';
import Register_Client from './component/register_client';
import Client from './component/client';
import Client_Birth from './component/client_birth';
import Card from './component/card';
import Card_Name from './component/card_name';
import Account from './component/account';
import Account_Name from './component/account_name';
import Account_ID from './component/account_id';
import Account_SortDate from './component/account_sortdate';
import Account_SortNameDate from './component/account_sortnameanddate';
import Transaction from './component/transaction';
import Transaction_AccountID from'./component/transaction_id';

function App() {
  return (
    <div className='App'>
      <BrowserRouter>
        <Switch>
          <Route exact path="/" component={Main}/>
          <Route path="/register_client" component={Register_Client}/>
          <Route path="/client" component={Client}/>
          <Route path="/retrieveClientByBirth/:birth" component={Client_Birth}/>
          <Route path="/card" component={Card}/>
          <Route path="/retrieveCardByName/:name" component={Card_Name}/>
          <Route path="/account" component={Account}/>
          <Route path="/retrieveAccountByName/:name" component={Account_Name}/>
          <Route path="/retrieveAccountByID/:id" component={Account_ID}/>
          <Route path="/sortAccountByDate" component={Account_SortDate}/>
          <Route path="/sortAccountByNameAndDate/:name" component={Account_SortNameDate}/>
          <Route path="/transaction" component={Transaction}/>
          <Route path="/retrieveDetail/:accountid" component={Transaction_AccountID}/>
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
