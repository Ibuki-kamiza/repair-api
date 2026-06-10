# 修理依頼管理API 仕様書　

## 1. 修理依頼一覧取得

メソッド：GET
URL：/repairs

レスポンス例：
[
  {
    "id": 1,
    "customerName": "山田太郎",
    "productName": "エアコン",
    "status": "受付"
  }
]

## 2. 修理依頼登録

メソッド：POST
URL：/repairs

リクエスト例：
{
  "id": 2,
  "customerName": "佐藤花子",
  "productName": "洗濯機",
  "status": "受付"
}

レスポンス例：
{
  "id": 2,
  "customerName": "佐藤花子",
  "productName": "洗濯機",
  "status": "受付"
}

## 3. 修理依頼更新

メソッド：PUT
URL：/repairs/{id}

リクエスト例：
{
  "status": "修理中"
}

レスポンス例：
{
  "id": 1,
  "customerName": "山田太郎",
  "productName": "エアコン",
  "status": "修理中"
}

## 4. 修理依頼削除

メソッド：DELETE
URL：/repairs/{id}

レスポンス例：
削除しました
