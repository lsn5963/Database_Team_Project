import React, { Component, useEffect, useState } from 'react';
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

function Account_Name() {
    const params = useParams();
    const data = useFetch("/retrieveAccountByName/" + params.name);
    const [name, setName] = useState([]);

    const onSubmit = async () => {
      window.location.href = "/retrieveAccountByName/" + name;
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
                  <li className="active"><Link to={"/account"}>계좌 조회</Link></li>
                  <li><Link to={"/transaction"}>거래 조회</Link></li>
                </ul>
              </div>
            </div>
          </nav>
          <div className="page-header" style={{paddingLeft: '50px'}}>
            <h2>계좌 정보 조회</h2>
          </div>
          <form className="form-horizontal">
            <div className="form-group">
              <button type="button" className="btn btn-default pull-right" id="searchName"
                onClick={() => {
                onSubmit();
              }}>검색</button>
              <div className="col-xs-4 pull-right">
                <input type="text" className="form-control" id="inputName"
                  onChange={(e) => {
                  setName(e.target.value);
                  console.log(name);
                }}/>
              </div>
              <label htmlFor="inputName" className="col-sm-2 control-label pull-right" style={{textAlign: 'right'}}>이름</label>
            </div>
            <div className="form-group">
              <button type="button" className="btn btn-default pull-right" id="sortDate"
                onClick={() => {
                window.open(`/sortAccountByNameAndDate/${params.name}`, "_self");
              }}>개설 순 정렬</button>
            </div>
          </form>
          <table className="table">
            <tbody style={{textAlign: 'left'}}>
              <tr>
                <th>ID</th>
                <th>계좌종류</th>
                <th>잔고</th>
                <th>카드신청여부</th>
                <th>개설일자</th>
                <th>이름</th>
                <th>전화번호</th>
                <th>이메일</th>
                <th>주민번호</th>
              </tr>
              {data.map( data =>
              <tr>
                <td>{data.id}</td>
                <td>{data.type}</td>
                <td>{data.balance}</td>
                <td>{data.apply.toString()}</td>
                <td>{data.openingDate}</td>
                <td>{data.name}</td>
                <td>{data.phoneNumber}</td>
                <td>{data.email}</td>
                <td>{data.regNumber}
                  <button type="button" className="btn btn-default" id="searchAccount" style={{marginLeft: '20px'}}
                    onClick={() => {
                    window.open(`/retrieveDetail/${data.id}`, "_self");
                  }}>거래 내역 이동</button>
                </td>
              </tr>
              )}
            </tbody>
          </table>
        </div>
      );

}

export default Account_Name;