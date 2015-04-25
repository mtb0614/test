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
	<div class="xs-12 header">
		<div class="xs-10 container" >
			<h1>店舗検索</h1>
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
</header>

</body>
</html>