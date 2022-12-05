import React, { Component } from 'react';
import { Link } from 'react-router-dom';

class Main extends Component {
  render() {
    return (
      <div>      
        <nav className="navbar navbar-default navbar-static-top">
          <div className="container">
            <div className="navbar-header">
              <button type="button" className="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span className="sr-only">Toggle navigation</span>
                <span className="icon-bar" />
                <span className="icon-bar" />
                <span className="icon-bar" />
              </button>
              <Link to={"/"} className="navbar-brand">명지 은행</Link>
            </div>
            <div className="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul className="nav navbar-nav">
                <li className="dropdown">
                  <a href="#" className="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">정보 등록<span className="caret" /></a>
                  <ul className="dropdown-menu" role="menu">
                    <li><Link to={"/register_client"}>고객 정보</Link></li>
                    <li><Link to={"/register_card"}>카드 정보</Link></li>
                    <li><Link to={"/register_account"}>계좌 정보</Link></li>
                  </ul>
                </li>  
                <li><Link to={"/client"}>고객 조회</Link></li>
                <li><Link to={"/card"}>카드 조회</Link></li>
                <li><Link to={"/account"}>계좌 조회</Link></li>
                <li><Link to={"/transaction"}>거래 조회</Link></li>
              </ul>   
            </div>
          </div>
        </nav>
      </div>
    );
  }
}

export default Main;