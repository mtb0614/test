<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/skyblue.css">
<link rel="stylesheet" href="css/basic.css">
</head>
<body>
<header>
  <div class="header_dark padding-y-20">
    <div class="container">
        <div class="row">
          <div class="col md-3">
          ページタイトル
          </div>
        </div>
    </div>
  </div>
</header>
<div class="main_dark">
  <div class="container padding-bottom-100">
    <div class="row">
      <div class="col md-3">
      <ul class="menu padding-left-0">
        <li>リスト1</li>
        <li>リスト1</li>
        <li>リスト1</li>
        <li>リスト1</li>
        <li>リスト1</li>
        <li>リスト1</li>
        <li>リスト1</li>
        <li>リスト1</li>
      </ul>
      </div>
      <div class="col md-9 bg_white padding-left-minus-20">
          <h1 class="row bg_mint padding-top-20 padding-bottom-20">タイプタイトル</h1>
          <p class="cl_mint">テストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプルテストサンプル</p>
			<form method="post" action="/Store/SearchServlet">
				<input type="hidden" name="action" value="search">
				<div class="xs-12">
				    <label>店舗名</label>
				    <input class="form-control" type="text" name="storeName">
				</div>
				<div class="xs-12">
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeArea" value="0" checked><span>渋谷</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeArea" value="1"><span>新宿</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeArea" value="2"><span>五反田</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeArea" value="3"><span>北野</span>
					</label>
				</div>
				<div class="xs-12">
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeCategory" value="0" checked><span>パスタ</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeCategory" value="1"><span>パスタ</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeCategory" value="2"><span>パスタ</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeCategory" value="3"><span>パスタ</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeCategory" value="4"><span>パスタ</span>
					</label>
					<label class="xs-2 fancy-checkbox">
					    <input type="checkbox" name="storeCategory" value="5"><span>パスタ</span>
					</label>
				</div>
				<div class="xs-12">
				<input class="btn btn-light" type="submit" value="検索">
				</div>
			</form>
      </div>
    </div>
  </div>
</div>

</body>
</html>