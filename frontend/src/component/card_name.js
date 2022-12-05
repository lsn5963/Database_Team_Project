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

function Card_Name() {
    const params = useParams();
    const data = useFetch("/retrieveCardByName/" + params.name);
    const [name, setName] = useState([]);

    const onSubmit = async () => {
      window.location.href = "/retrieveCardByName/" + name;
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
              <Link to={"/"} className="navbar-brand" href="#">명지 은행</Link>
            </div>
            <div className="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul className="nav navbar-nav">
                <li><Link to={"/register_client"}>고객 등록</Link></li>
                <li><Link to={"/client"}>고객 조회</Link></li>
                <li className="active"><Link to={"/card"}>카드 조회</Link></li>
                <li><Link to={"/account"}>계좌 조회</Link></li>
                <li><Link to={"/transaction"}>거래 조회</Link></li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="page-header" style={{paddingLeft: '50px'}}>
          <h2>카드 정보 조회</h2>
        </div>
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
        <table className="table">
          <tbody style={{textAlign: 'left'}}>
            <tr>
              <th>ID</th>
              <th>신청일자</th>
              <th>한도금액</th>
              <th>결제일자</th>
              <th>카드종류</th>
              <th>주민번호</th>
              <th>예금계좌ID</th>
            </tr>
            {data && data.map( data =>
              <tr>
                <td>{data.id}</td>
                <td>{data.applyDate}</td>
                <td>{data.cardLimit}</td>
                <td>{data.payDate}</td>
                <td>{data.type}</td>
                <td>{data.regNumber}</td>
                <td>{data.account_Id}
                  <button type="button" className="btn btn-default" id="searchAccount" style={{marginLeft: '20px'}}
                  onClick={() => {
                  window.open(`/retrieveAccountByID/${data.account_Id}`, "_self");
                  }}>연결 계좌 이동</button>
                </td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    );

}

export default Card_Name;