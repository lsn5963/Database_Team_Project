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

function Transaction_AccountID() {
  const params = useParams();
  const data = useFetch("/retrieveDetail/" + params.accountid);

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
                <li className="active"><Link to={"/transaction"}>거래 조회</Link></li>
              </ul>   
            </div>
          </div>
        </nav>
        <div className="page-header" style={{paddingLeft: '50px'}}>
          <h2>거래 내역 조회</h2>
        </div>
        <table className="table">
          <tbody style={{textAlign: 'left'}}>
            <tr>
              <th>ID</th>
              <th>계좌ID</th>
              <th>입출금날짜</th>
              <th>예금구분</th>
              <th>예금내용</th>
              <th>거래금액</th>
              <th>예금잔액</th>
            </tr>
            {data.map( data =>
              <tr>
                <td>{data.id}</td>
                <td>{data.accountId}</td>
                <td>{data.dawDate}</td>
                <td>{data.depositType}</td>
                <td>{data.depositContents}</td>
                <td>{data.amount}</td>
                <td>{data.balance}</td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    );
}

export default Transaction_AccountID;