import React, { Component, useState } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';

function Register_Client() {

  const [name, setName] = useState([]);
  const [regNumber, setRegNumber] = useState([]);
  const [birth, setBirth] = useState([]);
  const [address, setAddress] = useState([]);
  const [email, setEmail] = useState([]);
  const [phoneNumber, setPhoneNumber] = useState([]);
  const [job, setJob] = useState([]);

  const clientCreate = (e) => {
    e.preventDefault();

    const data = {
      name: name,
      regNumber: regNumber,
      birth: birth,
      address: address,
      email: email,
      phoneNumber: phoneNumber,
      job: job
    };

    fetch("/clientCreate", {
      method: "post",
      headers: {"Content-Type": "application/json"},
      body: JSON.stringify(data),
    });

    alert("등록되었습니다.");
  };


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
                <li className="active"><Link to={"/register_client"}>고객 등록</Link></li>
                <li><Link to={"/client"}>고객 조회</Link></li>
                <li><Link to={"/card"}>카드 조회</Link></li>
                <li><Link to={"/account"}>계좌 조회</Link></li>
                <li><Link to={"/transaction"}>거래 조회</Link></li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="page-header" style={{paddingLeft: '50px'}}>
          <h2>고객 정보 등록</h2>
        </div>
        <form className="form-horizontal" onSubmit={clientCreate}>
          <div className="form-group">
            <label htmlFor="inputName" className="col-sm-2 control-label">이름</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" name="name" placeholder="Name"
              onChange={(e) => {e.preventDefault(); setName(e.target.value);}}/>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputID" className="col-sm-2 control-label">주민등록번호</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" name="regNumber" placeholder="Registration Number"
              onChange={(e) => {e.preventDefault(); setRegNumber(e.target.value);}}/>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputBirthday" className="col-sm-2 control-label">생년월일</label>
            <div className="col-xs-4">
              <input type="date" className="form-control" name="birth"
              onChange={(e) => {e.preventDefault(); setBirth(e.target.value);}}/>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputAddress" className="col-sm-2 control-label">주소</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" name="address" placeholder="Address"
              onChange={(e) => {e.preventDefault(); setAddress(e.target.value);}}/>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputEmail" className="col-sm-2 control-label">이메일</label>
            <div className="col-xs-4">
              <input type="email" className="form-control" name="email" placeholder="Email"
              onChange={(e) => {e.preventDefault(); setEmail(e.target.value);}}/>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputPhone" className="col-sm-2 control-label">전화번호</label>
            <div className="col-xs-4">
              <input type="tel" className="form-control" name="phoneNumber" placeholder="Phone Number"
              onChange={(e) => {e.preventDefault(); setPhoneNumber(e.target.value);}}/>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="inputJob" className="col-sm-2 control-label">직업</label>
            <div className="col-xs-4">
              <input type="text" className="form-control" name="job" placeholder="Job"
              onChange={(e) => {e.preventDefault(); setJob(e.target.value);}}/>
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

export default Register_Client;