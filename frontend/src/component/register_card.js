import React, { Component } from 'react';
import { Link } from 'react-router-dom';

class Register_Card extends Component {
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
              <Link to={"/"} className="navbar-brand" href="#">명지 은행</Link>
            </div>
            <div className="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul className="nav navbar-nav">
                <li className="dropdown active">
                  <a href="#" className="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">정보 등록<span className="caret" /></a>
                  <ul className="dropdown-menu" role="menu">
                    <li><Link to={"/register_client"}>고객 정보</Link></li>
                    <li className="active"><Link to={"/register_card"}>카드 정보</Link></li>
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
        <div className="page-header" style={{paddingLeft: '50px'}}>
          <h2>카드 정보 등록</h2>
        </div>
        <form className="form-horizontal">
          <div className="form-group">
            <label htmlFor="inputDate" className="col-sm-2 control-label">신청일자</label>
            <div className="col-xs-4">
              <input type="date" className="form-control" id="inputDate" />
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputLimit" className="col-sm-2 control-label">한도금액</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" id="inputLimit" />
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputPay" className="col-sm-2 control-label">결제일자</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" id="inputPay" />
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputCard" className="col-sm-2 control-label">카드종류</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" id="inputCard" />
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputID" className="col-sm-2 control-label">주민등록번호</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" id="inputID" placeholder="010101-1234567" />
            </div>
          </div> 
          <div className="form-group">
            <div className="col-sm-offset-2 col-sm-10">
              <button type="submit" className="btn btn-default">등록</button>
            </div>
          </div>
        </form>
      </div>
    );
  }
}

export default Register_Card;