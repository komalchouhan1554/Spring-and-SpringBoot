package vj;

import java.util.Locale;

public class Main4 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		// Locale myLocale = Locale.JAPANESE;
		// Locale myLocale = Locale.CHINESE;
		Locale myLocale = new Locale("hi");
		
		String[] CountryCode_Arr = Locale.getISOCountries();
		
		for (String CountryCode : CountryCode_Arr) 
		{
			Locale l = new Locale("",CountryCode);
			System.out.println(CountryCode + " -> "+ l.getDisplayCountry() + " - " + l.getDisplayCountry(myLocale));
		}
	}
}


//Output:-

/*

AD -> Andorra - アンドラ
AE -> United Arab Emirates - アラブ首長国連邦
AF -> Afghanistan - アフガニスタン
AG -> Antigua & Barbuda - アンティグア・バーブーダ
AI -> Anguilla - アンギラ
AL -> Albania - アルバニア
AM -> Armenia - アルメニア
AO -> Angola - アンゴラ
AQ -> Antarctica - 南極
AR -> Argentina - アルゼンチン
AS -> American Samoa - 米領サモア
AT -> Austria - オーストリア
AU -> Australia - オーストラリア
AW -> Aruba - アルバ
AX -> Åland Islands - オーランド諸島
AZ -> Azerbaijan - アゼルバイジャン
BA -> Bosnia & Herzegovina - ボスニア・ヘルツェゴビナ
BB -> Barbados - バルバドス
BD -> Bangladesh - バングラデシュ
BE -> Belgium - ベルギー
BF -> Burkina Faso - ブルキナファソ
BG -> Bulgaria - ブルガリア
BH -> Bahrain - バーレーン
BI -> Burundi - ブルンジ
BJ -> Benin - ベナン
BL -> St Barthélemy - サン・バルテルミー
BM -> Bermuda - バミューダ
BN -> Brunei - ブルネイ
BO -> Bolivia - ボリビア
BQ -> Caribbean Netherlands - オランダ領カリブ
BR -> Brazil - ブラジル
BS -> Bahamas - バハマ
BT -> Bhutan - ブータン
BV -> Bouvet Island - ブーベ島
BW -> Botswana - ボツワナ
BY -> Belarus - ベラルーシ
BZ -> Belize - ベリーズ
CA -> Canada - カナダ
CC -> Cocos (Keeling) Islands - ココス(キーリング)諸島
CD -> Congo - Kinshasa - コンゴ民主共和国(キンシャサ)
CF -> Central African Republic - 中央アフリカ共和国
CG -> Congo - Brazzaville - コンゴ共和国(ブラザビル)
CH -> Switzerland - スイス
CI -> Côte d’Ivoire - コートジボワール
CK -> Cook Islands - クック諸島
CL -> Chile - チリ
CM -> Cameroon - カメルーン
CN -> China - 中国
CO -> Colombia - コロンビア
CR -> Costa Rica - コスタリカ
CU -> Cuba - キューバ
CV -> Cape Verde - カーボベルデ
CW -> Curaçao - キュラソー
CX -> Christmas Island - クリスマス島
CY -> Cyprus - キプロス
CZ -> Czechia - チェコ
DE -> Germany - ドイツ
DJ -> Djibouti - ジブチ
DK -> Denmark - デンマーク
DM -> Dominica - ドミニカ国
DO -> Dominican Republic - ドミニカ共和国
DZ -> Algeria - アルジェリア
EC -> Ecuador - エクアドル
EE -> Estonia - エストニア
EG -> Egypt - エジプト
EH -> Western Sahara - 西サハラ
ER -> Eritrea - エリトリア
ES -> Spain - スペイン
ET -> Ethiopia - エチオピア
FI -> Finland - フィンランド
FJ -> Fiji - フィジー
FK -> Falkland Islands - フォークランド諸島
FM -> Micronesia - ミクロネシア連邦
FO -> Faroe Islands - フェロー諸島
FR -> France - フランス
GA -> Gabon - ガボン
GB -> United Kingdom - イギリス
GD -> Grenada - グレナダ
GE -> Georgia - ジョージア
GF -> French Guiana - 仏領ギアナ
GG -> Guernsey - ガーンジー
GH -> Ghana - ガーナ
GI -> Gibraltar - ジブラルタル
GL -> Greenland - グリーンランド
GM -> Gambia - ガンビア
GN -> Guinea - ギニア
GP -> Guadeloupe - グアドループ
GQ -> Equatorial Guinea - 赤道ギニア
GR -> Greece - ギリシャ
GS -> South Georgia & South Sandwich Islands - サウスジョージア・サウスサンドウィッチ諸島
GT -> Guatemala - グアテマラ
GU -> Guam - グアム
GW -> Guinea-Bissau - ギニアビサウ
GY -> Guyana - ガイアナ
HK -> Hong Kong SAR China - 中華人民共和国香港特別行政区
HM -> Heard & McDonald Islands - ハード島・マクドナルド諸島
HN -> Honduras - ホンジュラス
HR -> Croatia - クロアチア
HT -> Haiti - ハイチ
HU -> Hungary - ハンガリー
ID -> Indonesia - インドネシア
IE -> Ireland - アイルランド
IL -> Israel - イスラエル
IM -> Isle of Man - マン島
IN -> India - インド
IO -> British Indian Ocean Territory - 英領インド洋地域
IQ -> Iraq - イラク
IR -> Iran - イラン
IS -> Iceland - アイスランド
IT -> Italy - イタリア
JE -> Jersey - ジャージー
JM -> Jamaica - ジャマイカ
JO -> Jordan - ヨルダン
JP -> Japan - 日本
KE -> Kenya - ケニア
KG -> Kyrgyzstan - キルギス
KH -> Cambodia - カンボジア
KI -> Kiribati - キリバス
KM -> Comoros - コモロ
KN -> St Kitts & Nevis - セントクリストファー・ネーヴィス
KP -> North Korea - 北朝鮮
KR -> South Korea - 韓国
KW -> Kuwait - クウェート
KY -> Cayman Islands - ケイマン諸島
KZ -> Kazakhstan - カザフスタン
LA -> Laos - ラオス
LB -> Lebanon - レバノン
LC -> St Lucia - セントルシア
LI -> Liechtenstein - リヒテンシュタイン
LK -> Sri Lanka - スリランカ
LR -> Liberia - リベリア
LS -> Lesotho - レソト
LT -> Lithuania - リトアニア
LU -> Luxembourg - ルクセンブルク
LV -> Latvia - ラトビア
LY -> Libya - リビア
MA -> Morocco - モロッコ
MC -> Monaco - モナコ
MD -> Moldova - モルドバ
ME -> Montenegro - モンテネグロ
MF -> St Martin - サン・マルタン
MG -> Madagascar - マダガスカル
MH -> Marshall Islands - マーシャル諸島
MK -> North Macedonia - 北マケドニア
ML -> Mali - マリ
MM -> Myanmar (Burma) - ミャンマー (ビルマ)
MN -> Mongolia - モンゴル
MO -> Macao SAR China - 中華人民共和国マカオ特別行政区
MP -> Northern Mariana Islands - 北マリアナ諸島
MQ -> Martinique - マルティニーク
MR -> Mauritania - モーリタニア
MS -> Montserrat - モントセラト
MT -> Malta - マルタ
MU -> Mauritius - モーリシャス
MV -> Maldives - モルディブ
MW -> Malawi - マラウイ
MX -> Mexico - メキシコ
MY -> Malaysia - マレーシア
MZ -> Mozambique - モザンビーク
NA -> Namibia - ナミビア
NC -> New Caledonia - ニューカレドニア
NE -> Niger - ニジェール
NF -> Norfolk Island - ノーフォーク島
NG -> Nigeria - ナイジェリア
NI -> Nicaragua - ニカラグア
NL -> Netherlands - オランダ
NO -> Norway - ノルウェー
NP -> Nepal - ネパール
NR -> Nauru - ナウル
NU -> Niue - ニウエ
NZ -> New Zealand - ニュージーランド
OM -> Oman - オマーン
PA -> Panama - パナマ
PE -> Peru - ペルー
PF -> French Polynesia - 仏領ポリネシア
PG -> Papua New Guinea - パプアニューギニア
PH -> Philippines - フィリピン
PK -> Pakistan - パキスタン
PL -> Poland - ポーランド
PM -> St Pierre & Miquelon - サンピエール島・ミクロン島
PN -> Pitcairn Islands - ピトケアン諸島
PR -> Puerto Rico - プエルトリコ
PS -> Palestinian Territories - パレスチナ自治区
PT -> Portugal - ポルトガル
PW -> Palau - パラオ
PY -> Paraguay - パラグアイ
QA -> Qatar - カタール
RE -> Réunion - レユニオン
RO -> Romania - ルーマニア
RS -> Serbia - セルビア
RU -> Russia - ロシア
RW -> Rwanda - ルワンダ
SA -> Saudi Arabia - サウジアラビア
SB -> Solomon Islands - ソロモン諸島
SC -> Seychelles - セーシェル
SD -> Sudan - スーダン
SE -> Sweden - スウェーデン
SG -> Singapore - シンガポール
SH -> St Helena - セントヘレナ
SI -> Slovenia - スロベニア
SJ -> Svalbard & Jan Mayen - スバールバル諸島・ヤンマイエン島
SK -> Slovakia - スロバキア
SL -> Sierra Leone - シエラレオネ
SM -> San Marino - サンマリノ
SN -> Senegal - セネガル
SO -> Somalia - ソマリア
SR -> Suriname - スリナム
SS -> South Sudan - 南スーダン
ST -> São Tomé & Príncipe - サントメ・プリンシペ
SV -> El Salvador - エルサルバドル
SX -> Sint Maarten - シント・マールテン
SY -> Syria - シリア
SZ -> Eswatini - エスワティニ
TC -> Turks & Caicos Islands - タークス・カイコス諸島
TD -> Chad - チャド
TF -> French Southern Territories - 仏領極南諸島
TG -> Togo - トーゴ
TH -> Thailand - タイ
TJ -> Tajikistan - タジキスタン
TK -> Tokelau - トケラウ
TL -> Timor-Leste - 東ティモール
TM -> Turkmenistan - トルクメニスタン
TN -> Tunisia - チュニジア
TO -> Tonga - トンガ
TR -> Türkiye - トルコ
TT -> Trinidad & Tobago - トリニダード・トバゴ
TV -> Tuvalu - ツバル
TW -> Taiwan - 台湾
TZ -> Tanzania - タンザニア
UA -> Ukraine - ウクライナ
UG -> Uganda - ウガンダ
UM -> US Outlying Islands - 合衆国領有小離島
US -> United States - アメリカ合衆国
UY -> Uruguay - ウルグアイ
UZ -> Uzbekistan - ウズベキスタン
VA -> Vatican City - バチカン市国
VC -> St Vincent & the Grenadines - セントビンセント及びグレナディーン諸島
VE -> Venezuela - ベネズエラ
VG -> British Virgin Islands - 英領ヴァージン諸島
VI -> US Virgin Islands - 米領ヴァージン諸島
VN -> Vietnam - ベトナム
VU -> Vanuatu - バヌアツ
WF -> Wallis & Futuna - ウォリス・フツナ
WS -> Samoa - サモア
YE -> Yemen - イエメン
YT -> Mayotte - マヨット
ZA -> South Africa - 南アフリカ
ZM -> Zambia - ザンビア
ZW -> Zimbabwe - ジンバブエ

*/

/*
 
 AD -> Andorra - एंडोरा
AE -> United Arab Emirates - संयुक्त अरब अमीरात
AF -> Afghanistan - अफ़गानिस्तान
AG -> Antigua & Barbuda - एंटिगुआ और बरबुडा
AI -> Anguilla - एंग्विला
AL -> Albania - अल्बानिया
AM -> Armenia - आर्मेनिया
AO -> Angola - अंगोला
AQ -> Antarctica - अंटार्कटिका
AR -> Argentina - अर्जेंटीना
AS -> American Samoa - अमेरिकी समोआ
AT -> Austria - ऑस्ट्रिया
AU -> Australia - ऑस्ट्रेलिया
AW -> Aruba - अरूबा
AX -> Åland Islands - एलैंड द्वीपसमूह
AZ -> Azerbaijan - अज़रबैजान
BA -> Bosnia & Herzegovina - बोस्निया और हर्ज़ेगोविना
BB -> Barbados - बारबाडोस
BD -> Bangladesh - बांग्लादेश
BE -> Belgium - बेल्जियम
BF -> Burkina Faso - बुर्किना फ़ासो
BG -> Bulgaria - बुल्गारिया
BH -> Bahrain - बहरीन
BI -> Burundi - बुरुंडी
BJ -> Benin - बेनिन
BL -> St Barthélemy - सेंट बार्थेलेमी
BM -> Bermuda - बरमूडा
BN -> Brunei - ब्रूनेई
BO -> Bolivia - बोलीविया
BQ -> Caribbean Netherlands - कैरिबियन नीदरलैंड
BR -> Brazil - ब्राज़ील
BS -> Bahamas - बहामास
BT -> Bhutan - भूटान
BV -> Bouvet Island - बोवेत द्वीप
BW -> Botswana - बोत्स्वाना
BY -> Belarus - बेलारूस
BZ -> Belize - बेलीज़
CA -> Canada - कनाडा
CC -> Cocos (Keeling) Islands - कोकोस (कीलिंग) द्वीपसमूह
CD -> Congo - Kinshasa - कांगो - किंशासा
CF -> Central African Republic - मध्य अफ़्रीकी गणराज्य
CG -> Congo - Brazzaville - कांगो – ब्राज़ाविल
CH -> Switzerland - स्विट्ज़रलैंड
CI -> Côte d’Ivoire - कोत दिवुआर
CK -> Cook Islands - कुक द्वीपसमूह
CL -> Chile - चिली
CM -> Cameroon - कैमरून
CN -> China - चीन
CO -> Colombia - कोलंबिया
CR -> Costa Rica - कोस्टारिका
CU -> Cuba - क्यूबा
CV -> Cape Verde - केप वर्ड
CW -> Curaçao - कुरासाओ
CX -> Christmas Island - क्रिसमस द्वीप
CY -> Cyprus - साइप्रस
CZ -> Czechia - चेकिया
DE -> Germany - जर्मनी
DJ -> Djibouti - जिबूती
DK -> Denmark - डेनमार्क
DM -> Dominica - डोमिनिका
DO -> Dominican Republic - डोमिनिकन गणराज्य
DZ -> Algeria - अल्जीरिया
EC -> Ecuador - इक्वाडोर
EE -> Estonia - एस्टोनिया
EG -> Egypt - मिस्र
EH -> Western Sahara - पश्चिमी सहारा
ER -> Eritrea - इरिट्रिया
ES -> Spain - स्पेन
ET -> Ethiopia - इथियोपिया
FI -> Finland - फ़िनलैंड
FJ -> Fiji - फ़िजी
FK -> Falkland Islands - फ़ॉकलैंड द्वीपसमूह
FM -> Micronesia - माइक्रोनेशिया
FO -> Faroe Islands - फ़ेरो द्वीपसमूह
FR -> France - फ़्रांस
GA -> Gabon - गैबॉन
GB -> United Kingdom - यूनाइटेड किंगडम
GD -> Grenada - ग्रेनाडा
GE -> Georgia - जॉर्जिया
GF -> French Guiana - फ़्रेंच गुयाना
GG -> Guernsey - गर्नसी
GH -> Ghana - घाना
GI -> Gibraltar - जिब्राल्टर
GL -> Greenland - ग्रीनलैंड
GM -> Gambia - गाम्बिया
GN -> Guinea - गिनी
GP -> Guadeloupe - ग्वाडेलूप
GQ -> Equatorial Guinea - इक्वेटोरियल गिनी
GR -> Greece - यूनान
GS -> South Georgia & South Sandwich Islands - दक्षिण जॉर्जिया और दक्षिण सैंडविच द्वीपसमूह
GT -> Guatemala - ग्वाटेमाला
GU -> Guam - गुआम
GW -> Guinea-Bissau - गिनी-बिसाउ
GY -> Guyana - गुयाना
HK -> Hong Kong SAR China - हाँग काँग (चीन विशेष प्रशासनिक क्षेत्र)
HM -> Heard & McDonald Islands - हर्ड द्वीप और मैकडोनॉल्ड द्वीपसमूह
HN -> Honduras - होंडूरास
HR -> Croatia - क्रोएशिया
HT -> Haiti - हैती
HU -> Hungary - हंगरी
ID -> Indonesia - इंडोनेशिया
IE -> Ireland - आयरलैंड
IL -> Israel - इज़राइल
IM -> Isle of Man - आइल ऑफ़ मैन
IN -> India - भारत
IO -> British Indian Ocean Territory - ब्रिटिश हिंद महासागरीय क्षेत्र
IQ -> Iraq - इराक
IR -> Iran - ईरान
IS -> Iceland - आइसलैंड
IT -> Italy - इटली
JE -> Jersey - जर्सी
JM -> Jamaica - जमैका
JO -> Jordan - जॉर्डन
JP -> Japan - जापान
KE -> Kenya - केन्या
KG -> Kyrgyzstan - किर्गिज़स्तान
KH -> Cambodia - कंबोडिया
KI -> Kiribati - किरिबाती
KM -> Comoros - कोमोरोस
KN -> St Kitts & Nevis - सेंट किट्स और नेविस
KP -> North Korea - उत्तर कोरिया
KR -> South Korea - दक्षिण कोरिया
KW -> Kuwait - कुवैत
KY -> Cayman Islands - कैमेन द्वीपसमूह
KZ -> Kazakhstan - कज़ाखस्तान
LA -> Laos - लाओस
LB -> Lebanon - लेबनान
LC -> St Lucia - सेंट लूसिया
LI -> Liechtenstein - लिचेंस्टीन
LK -> Sri Lanka - श्रीलंका
LR -> Liberia - लाइबेरिया
LS -> Lesotho - लेसोथो
LT -> Lithuania - लिथुआनिया
LU -> Luxembourg - लग्ज़मबर्ग
LV -> Latvia - लातविया
LY -> Libya - लीबिया
MA -> Morocco - मोरक्को
MC -> Monaco - मोनाको
MD -> Moldova - मॉल्डोवा
ME -> Montenegro - मोंटेनेग्रो
MF -> St Martin - सेंट मार्टिन
MG -> Madagascar - मेडागास्कर
MH -> Marshall Islands - मार्शल द्वीपसमूह
MK -> North Macedonia - उत्तरी मकदूनिया
ML -> Mali - माली
MM -> Myanmar (Burma) - म्यांमार (बर्मा)
MN -> Mongolia - मंगोलिया
MO -> Macao SAR China - मकाऊ (विशेष प्रशासनिक क्षेत्र चीन)
MP -> Northern Mariana Islands - उत्तरी मारियाना द्वीपसमूह
MQ -> Martinique - मार्टीनिक
MR -> Mauritania - मॉरिटानिया
MS -> Montserrat - मोंटसेरात
MT -> Malta - माल्टा
MU -> Mauritius - मॉरीशस
MV -> Maldives - मालदीव
MW -> Malawi - मलावी
MX -> Mexico - मैक्सिको
MY -> Malaysia - मलेशिया
MZ -> Mozambique - मोज़ांबिक
NA -> Namibia - नामीबिया
NC -> New Caledonia - न्यू कैलेडोनिया
NE -> Niger - नाइजर
NF -> Norfolk Island - नॉरफ़ॉक द्वीप
NG -> Nigeria - नाइजीरिया
NI -> Nicaragua - निकारागुआ
NL -> Netherlands - नीदरलैंड
NO -> Norway - नॉर्वे
NP -> Nepal - नेपाल
NR -> Nauru - नाउरु
NU -> Niue - नीयू
NZ -> New Zealand - न्यूज़ीलैंड
OM -> Oman - ओमान
PA -> Panama - पनामा
PE -> Peru - पेरू
PF -> French Polynesia - फ़्रेंच पोलिनेशिया
PG -> Papua New Guinea - पापुआ न्यू गिनी
PH -> Philippines - फ़िलिपींस
PK -> Pakistan - पाकिस्तान
PL -> Poland - पोलैंड
PM -> St Pierre & Miquelon - सेंट पिएरे और मिक्वेलान
PN -> Pitcairn Islands - पिटकैर्न द्वीपसमूह
PR -> Puerto Rico - पोर्टो रिको
PS -> Palestinian Territories - फ़िलिस्तीनी क्षेत्र
PT -> Portugal - पुर्तगाल
PW -> Palau - पलाऊ
PY -> Paraguay - पराग्वे
QA -> Qatar - क़तर
RE -> Réunion - रियूनियन
RO -> Romania - रोमानिया
RS -> Serbia - सर्बिया
RU -> Russia - रूस
RW -> Rwanda - रवांडा
SA -> Saudi Arabia - सऊदी अरब
SB -> Solomon Islands - सोलोमन द्वीपसमूह
SC -> Seychelles - सेशेल्स
SD -> Sudan - सूडान
SE -> Sweden - स्वीडन
SG -> Singapore - सिंगापुर
SH -> St Helena - सेंट हेलेना
SI -> Slovenia - स्लोवेनिया
SJ -> Svalbard & Jan Mayen - स्वालबार्ड और जान मायेन
SK -> Slovakia - स्लोवाकिया
SL -> Sierra Leone - सिएरा लियोन
SM -> San Marino - सैन मेरीनो
SN -> Senegal - सेनेगल
SO -> Somalia - सोमालिया
SR -> Suriname - सूरीनाम
SS -> South Sudan - दक्षिण सूडान
ST -> São Tomé & Príncipe - साओ टोम और प्रिंसिपे
SV -> El Salvador - अल सल्वाडोर
SX -> Sint Maarten - सिंट मार्टिन
SY -> Syria - सीरिया
SZ -> Eswatini - एस्वाटिनी
TC -> Turks & Caicos Islands - तुर्क और कैकोज़ द्वीपसमूह
TD -> Chad - चाड
TF -> French Southern Territories - फ़्रांसीसी दक्षिणी क्षेत्र
TG -> Togo - टोगो
TH -> Thailand - थाईलैंड
TJ -> Tajikistan - ताजिकिस्तान
TK -> Tokelau - तोकेलाउ
TL -> Timor-Leste - तिमोर-लेस्त
TM -> Turkmenistan - तुर्कमेनिस्तान
TN -> Tunisia - ट्यूनीशिया
TO -> Tonga - टोंगा
TR -> Türkiye - तुर्किये
TT -> Trinidad & Tobago - त्रिनिदाद और टोबैगो
TV -> Tuvalu - तुवालू
TW -> Taiwan - ताइवान
TZ -> Tanzania - तंज़ानिया
UA -> Ukraine - यूक्रेन
UG -> Uganda - युगांडा
UM -> US Outlying Islands - यू॰एस॰ आउटलाइंग द्वीपसमूह
US -> United States - संयुक्त राज्य
UY -> Uruguay - उरूग्वे
UZ -> Uzbekistan - उज़्बेकिस्तान
VA -> Vatican City - वेटिकन सिटी
VC -> St Vincent & the Grenadines - सेंट विंसेंट और ग्रेनाडाइंस
VE -> Venezuela - वेनेज़ुएला
VG -> British Virgin Islands - ब्रिटिश वर्जिन द्वीपसमूह
VI -> US Virgin Islands - यू॰एस॰ वर्जिन द्वीपसमूह
VN -> Vietnam - वियतनाम
VU -> Vanuatu - वनुआतू
WF -> Wallis & Futuna - वालिस और फ़्यूचूना
WS -> Samoa - समोआ
YE -> Yemen - यमन
YT -> Mayotte - मायोते
ZA -> South Africa - दक्षिण अफ़्रीका
ZM -> Zambia - ज़ाम्बिया
ZW -> Zimbabwe - ज़िम्बाब्वे

*/
