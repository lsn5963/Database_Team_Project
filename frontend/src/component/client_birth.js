import React, { Component, useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import { useParams } from 'react-router';

function useFetch(url) {
    const [data, setData] = useState([]);

    async function fetchUrl() {
        const response = await fetch(url);
        const json = await response.json();

        setData(json);
    }

    useEffect(() => {
        fetchUrl();
    }, []);
    return data;
}

function Client_Birth() {
    const params = useParams();
    const data = useFetch("/retrieveClientByBirth/" + params.birth);
    const arr = new Array(data);
    const [birth, setBirth] = useState([]);

    const onSubmit = async () => {
      window.location.href = "/retrieveClientByBirth/" + birth;
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
                <li><Link to={"/register_client"}>고객 등록</Link></li>
                <li className="active"><Link to={"/client"}>고객 조회</Link></li>
                <li><Link to={"/card"}>카드 조회</Link></li>
                <li><Link to={"/account"}>계좌 조회</Link></li>
                <li><Link to={"/transaction"}>거래 조회</Link></li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="page-header" style={{paddingLeft: '50px'}}>
          <h2>고객 정보 조회</h2>
        </div>
        <div className="form-group">
          <button type="button" className="btn btn-default pull-right" id="searchBirthday"
          onClick={() => {
          onSubmit();
          }}>검색</button>
          <div className="col-xs-4 pull-right">
            <input type="date" className="form-control" id="inputBirthday"
             onChange={(e) => {
             setBirth(e.target.value);
             console.log(birth);
             }}/>
          </div>
          <label htmlFor="inputBirthday" className="col-sm-2 control-label pull-right" style={{textAlign: 'right'}}>날짜</label>
        </div>
        <table className="table">
          <tbody style={{textAlign: 'left'}}>
            <tr>
              <th>ID</th>
              <th>주민번호</th>
              <th>이름</th>
              <th>주소</th>
              <th>생일</th>
              <th>이메일</th>
              <th>전화번호</th>
              <th>직업</th>
            </tr>
            {arr && arr.map( data =>
              <tr>
                <td>{data.id}</td>
                <td>{data.regNumber}</td>
                <td>{data.name}</td>
                <td>{data.address}</td>
                <td>{data.birth}</td>
                <td>{data.email}</td>
                <td>{data.phoneNumber}</td>
                <td>{data.job}</td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    );

}

export default Client_Birth;