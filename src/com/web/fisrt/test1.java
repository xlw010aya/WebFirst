package com.web.fisrt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test1 {

	public static void main(String[] args) {
		for(String todoString : todoStrings){
			new test1().split(todoString);
		}

	}
	
	private static class ValueComparator implements Comparator<Map.Entry<String, Integer>>{

		@Override
		public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			return o2.getValue()-o1.getValue();
		}
		
	}
	
	public void split(String a){
		System.out.print(a+"|");
		a = a.toUpperCase();
		HashMap<String, Integer> score = new HashMap<String, Integer>();
//		String a="12306官方版";
		
		char[] achar = a.toCharArray();
		
		for(String string:strings){
			score.put(string, 0);
		}
		
		for(String string:strings){
			String stringU = string.toUpperCase();
			String string1 = stringU;
			char[] stringchar = string.toCharArray();
			
			for(char a1:achar){
				if(a1!='(' & a1!=')'){
					int index = string1.indexOf(a1);
					if(index != -1){
						score.put(string, score.get(string)+1);
						string1 = string1.substring(0,index)+string1.substring(index+1,string1.length());
					}
				}

//				for(char string1:stringchar){
//					if(a1==string1){
//						if(a1==string1){
//							score.put(string, score.get(string)+1);
//							break;
//						}  
//					}
//				}
			}
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>();
		list.addAll(score.entrySet());
		test1.ValueComparator vc = new ValueComparator();
		Collections.sort(list,vc);
		

		for(int i=0;i<10;i++){
			System.out.print(list.get(i)+"|");
		}
		System.out.println("");

		
	}
	private static String[] todoStrings = {
		"魔豆—手机赚钱"
		,"国泰股指(国泰君安证券)"
		,"超级理财"
		,"万得理财"
		,"金阳光移动证券"
		,"卡卡记账"
		,"省钱通"
		,"掌股专家"
		,"手机证券-手机证券指南"
		,"三竹小股王"
		,"双色球助手"
		,"操盘手(腾讯操盘手)"
		,"涨乐理财"
		,"东莞银行"
		,"银联随行"
		,"平安口袋银行"
		,"和讯财经"
		,"自选股"
		,"工商银行"
		,"沃百富"
		,"中行手机银行(中国银行)"
		,"通达信(招商智慧远Pad)"
		,"益盟操盘手（经典版）"
		,"浦发手机银行（浦发银行）"
		,"牛股王（牛股王股票）"
		,"长江证券"
		,"优顾理财"
		,"农业银行"
		,"e动交行（交通银行）"
		,"贵金属行情系统"
		,"铜板街理财(铜粉节)"
		,"股票雷达"
		,"富邦證券-e點通"

};
	
	private String[] strings = {"100tv聚好看"
			,"100头条"
			,"108天-吃喝玩乐"
			,"114商旅"
			,"115"
			,"116114"
			,"12306铁路客户服务中心"
			,"12530WAP门户"
			,"12580"
			,"12580和旅行"
			,"139出行"
			,"139邮箱"
			,"17173"
			,"17K小说"
			,"189邮箱"
			,"1905电影网"
			,"19楼"
			,"1号店"
			,"1号药店-货到付款"
			,"1折包邮"
			,"2048精简加强版"
			,"21CN邮箱"
			,"21世纪经济报道"
			,"233 手游直播"
			,"2345天气王"
			,"2345影视大全"
			,"2345浏览器"
			,"2345网址导航"
			,"2346阅读王"
			,"263云通信"
			,"3+6您身边的超市"
			,"3366小游戏"
			,"360doc"
			,"360WiFi"
			,"360云盘"
			,"360免费WiFi"
			,"360图片"
			,"360天气"
			,"360安全快递"
			,"360安全浏览器"
			,"360安全通讯录"
			,"360度破解密码"
			,"360影视大全"
			,"360手机助手"
			,"360手机卫士"
			,"360手机桌面"
			,"360手游"
			,"360搜索"
			,"360清理大师"
			,"360贴吧"
			,"360超级root"
			,"360问股"
			,"365天天拦截"
			,"365日历"
			,"365淘房"
			,"39手机网"
			,"3D播播"
			,"3D暴力摩托-狂野飙车"
			,"3D版暴力飞车"
			,"3G网络电话"
			,"3G门户"
			,"4399游戏盒"
			,"500彩票"
			,"51.com"
			,"517旅行机票"
			,"51iRadio"
			,"51信用卡管家"
			,"51汽车"
			,"51用车"
			,"51账单"
			,"55闪淘"
			,"56网"
			,"56视频"
			,"58同城"
			,"58违章查询"
			,"59store"
			,"5sing音乐"
			,"5tv手机剧"
			,"66call"
			,"7060影视"
			,"753本地团"
			,"7digital"
			,"7k7k小游戏"
			,"7天连锁酒店"
			,"80s手机电影网"
			,"81PLAZA"
			,"8265邪恶漫画"
			,"8684公交查询"
			,"8tracks"
			,"9158手机视频聊天"
			,"9188彩票双色球"
			,"91农场"
			,"91助手"
			,"91彩票"
			,"91来电秀"
			,"91桌面"
			,"91熊猫阅读"
			,"91看电视直播"
			,"91锁屏"
			,"91黄历天气"
			,"99分期"
			,"9块9包邮购-楚楚街"
			,"A67影视网"
			,"AA拼车"
			,"AA租车"
			,"ABC"
			,"AcFun"
			,"Adobe AIR"
			,"Agoda"
			,"aillis相机"
			,"airAD"
			,"AirAsia-空中亚洲"
			,"Airbnb"
			,"AirDroid"
			,"aloha"
			,"Animal Sounds Ringtones"
			,"Anyview阅读"
			,"AppChina应用汇"
			,"AppStore"
			,"AR GPS 实景导航"
			,"around.me"
			,"Audio"
			,"AUSDOM"
			,"Autodesk Pixlr"
			,"AVG杀毒"
			,"AWAD"
			,"B612"
			,"B612小王子自拍"
			,"Bandsintown音乐会"
			,"BBC新闻"
			,"BBM"
			,"Beyou-专注星座娱乐"
			,"Blockchain"
			,"blued"
			,"Booking.com酒店预订"
			,"break.com"
			,"bShare分享"
			,"BSPlayer FREE"
			,"BT下载"
			,"bump"
			,"BUS365"
			,"CCTV"
			,"CCTV5"
			,"CCTV微视"
			,"CF原创视频站"
			,"CF掌游宝"
			,"ChinaDaily"
			,"ChineFrance"
			,"CNN"
			,"CNTV"
			,"CNZZ统计"
			,"cocar租车"
			,"COCO"
			,"csdn"
			,"Cultura China"
			,"DailyRoads 行车纪录器"
			,"Deezer"
			,"DiscoverHK"
			,"DIY个性锁屏"
			,"DJ音乐盒"
			,"DNF掌游宝"
			,"DOTA视频站"
			,"doubleTwist"
			,"DS audio"
			,"dumpert.nl"
			,"ebay"
			,"echo回声"
			,"eDonkey"
			,"ELLE"
			,"eMule"
			,"Endomondo"
			,"ES文件浏览器"
			,"Etsy"
			,"everyonTV"
			,"e代驾"
			,"e代驾洗车"
			,"FaceBook"
			,"FastTrack"
			,"feel"
			,"firefox"
			,"fittime"
			,"Flipboard"
			,"FLURRY"
			,"Frostwire"
			,"geenstijl.nl"
			,"GGBook看书"
			,"gmail"
			,"GO桌面"
			,"Gpark"
			,"GPS定位导航记录仪"
			,"grindr"
			,"Groove Mixer"
			,"Gtalk"
			,"G友"
			,"G家"
			,"H&M"
			,"hao123上网导航"
			,"HERE"
			,"Hong Kong Movie 香港電影"
			,"Hostelworld"
			,"HotelQuickly"
			,"hulu"
			,"i-Sim开心"
			,"iBody"
			,"Ibooks"
			,"ICQ"
			,"IHG优悦会"
			,"iKu"
			,"in"
			,"iRead"
			,"iSuperMap"
			,"IT之家"
			,"iuu"
			,"iWeekly周末画报"
			,"IzziRent"
			,"jack'd"
			,"JJ斗地主"
			,"JUJU"
			,"KAYAK"
			,"KC省钱电话"
			,"keep"
			,"KeepCap"
			,"KEYS"
			,"KingRoot"
			,"KK唱响视频交友"
			,"KK游戏直播"
			,"KMPlayer"
			,"KZNTV"
			,"K歌之王"
			,"K歌达人"
			,"Last.fm scrobbler"
			,"LBE安全大师"
			,"LESDO"
			,"LINE"
			,"LineCamera"
			,"live邮箱"
			,"Lofter"
			,"LOL掌游宝"
			,"LT来电闪光"
			,"LugangMazu"
			,"mamahome"
			,"MAPS.ME"
			,"Marriott"
			,"Marvel Unlimited-美国英雄"
			,"ME直播"
			,"milk Q 女性杂志"
			,"MissEvan"
			,"Mita动漫(布卡漫画控)"
			,"Mixcloud"
			,"MIX滤镜大师"
			,"MM商场"
			,"MoboPlayer"
			,"MoTripper"
			,"MSN"
			,"MU"
			,"mua美妆"
			,"MusicOne"
			,"MYOTee脸萌"
			,"N-Booking"
			,"NBA视频直播"
			,"netflix"
			,"nice"
			,"Nike+running"
			,"NRG Player"
			,"Nur.cn"
			,"N多市场"
			,"n次元漫画"
			,"ofo共享单车"
			,"Ok珠海"
			,"ooVoo"
			,"oppo应用商店"
			,"Orange"
			,"OVI音乐"
			,"Oz动漫"
			,"P2PSearcher"
			,"Padgram-Instagram图册"
			,"Paltalk"
			,"Path社交网络"
			,"Paypal"
			,"Pinkoi"
			,"pixiv"
			,"Player dreams"
			,"PlayMemories Mobile"
			,"PlayTo(播去)"
			,"POCO相机"
			,"pop star"
			,"PPS影音"
			,"PP助手"
			,"PP理财"
			,"QQ"
			,"qq voice"
			,"QQ农场"
			,"qq同步助手"
			,"QQ国际版"
			,"QQ安全中心"
			,"QQ安全助手"
			,"QQ彩票"
			,"QQ斗地主"
			,"QQ浏览器"
			,"QQ游戏"
			,"QQ秒赞管家"
			,"QQ空间"
			,"qq输入法"
			,"QQ邮箱"
			,"QQ阅读"
			,"QQ音乐"
			,"QT语音"
			,"QuickTime"
			,"QVOD快播"
			,"Q宠大乐斗"
			,"Radio"
			,"RATP"
			,"Rela热拉"
			,"RetailEnv"
			,"root验证"
			,"RSS阅读器FeedMe"
			,"RUNtastic"
			,"same"
			,"SBS电台"
			,"SeatGuru"
			,"Shazam"
			,"Shopurluq4"
			,"SKOUT"
			,"SKYPE"
			,"SNOW"
			,"SopCast"
			,"SOSO搜索"
			,"Sound Effects Ringtones"
			,"soundcloud"
			,"SoundHound"
			,"Spotify"
			,"StyleShare"
			,"superVPN"
			,"TalkBox"
			,"Tango"
			,"ted"
			,"the L"
			,"TimePlay"
			,"TinyPiano"
			,"TOM"
			,"Torch Music"
			,"TripAdvisor"
			,"Tripomatic"
			,"Tumblr"
			,"tunein radio"
			,"Tutu"
			,"TVants"
			,"TXT文本听书"
			,"U Magazine"
			,"UBER"
			,"UberHype"
			,"UC九游"
			,"UC头条"
			,"UC应用商店"
			,"UC浏览器"
			,"UC网站访问"
			,"UC迅雷"
			,"UC首页登录"
			,"UUSee电视"
			,"uu网络电话"
			,"Uyghurche Kirguzguch"
			,"UYNTV"
			,"U嗒旅游"
			,"V1圈"
			,"Viber"
			,"vimeo"
			,"VIVA手机杂志"
			,"vivo应用商店"
			,"VonRio"
			,"Voxer"
			,"VSCO Cam"
			,"Vsee"
			,"VST全聚合"
			,"Vtalk"
			,"Vyclone"
			,"Waze"
			,"WEBTOON"
			,"Wego机票酒店搜索"
			,"Weico"
			,"WhatsApp"
			,"widget平台"
			,"wifi万能密码神器"
			,"wifi万能钥匙"
			,"WiFi伴侣"
			,"wifi俠密码查看"
			,"WiFi密码暴力破解"
			,"WiFi猎手"
			,"WiFi管家"
			,"WiFi连接管理器"
			,"WIFi连网神器"
			,"WinEIM-助讯通"
			,"WPS Office"
			,"WTV电视直播"
			,"XDA助手"
			,"YiBo微博"
			,"YOHO!有货"
			,"YOHO!潮流志"
			,"you4video"
			,"Youni短信"
			,"YouTube"
			,"YY"
			,"YY语音"
			,"YY语音变声器-男变女"
			,"ZAKER"
			,"zank"
			,"ZZPlayer"
			,"《圣经.is?》"
			,"一丁手环"
			,"一个"
			,"一刻"
			,"一句心情签名"
			,"一号专车"
			,"一号房"
			,"一听音乐"
			,"一呆公寓"
			,"一嗨租车"
			,"一度蜜"
			,"一战到底"
			,"一折特卖"
			,"一步之遥"
			,"一淘"
			,"一点租车"
			,"一点资讯"
			,"一直播"
			,"一起作业学生端"
			,"一起动"
			,"一起沃"
			,"一起装修"
			,"一路乐旅行导游"
			,"一键导航"
			,"丁丁优惠"
			,"丁丁生活"
			,"七洲旅游"
			,"七骑士"
			,"万年历"
			,"万年历-日历农历"
			,"万得股票"
			,"万普世纪"
			,"万能影视"
			,"万能相机"
			,"万表"
			,"万达电影"
			,"三九养生堂"
			,"三剑豪2"
			,"三味书屋"
			,"三国之刃"
			,"三国志7"
			,"三国战神"
			,"三国杀"
			,"三国群英传"
			,"三星"
			,"三星应用商店"
			,"上悦租车"
			,"上海地铁"
			,"上海观察"
			,"上海银行"
			,"下厨房"
			,"不良人2"
			,"专心"
			,"世界帮旅行网"
			,"世界旅游导航地图"
			,"世界观旅行"
			,"世纪佳缘"
			,"世纪金花"
			,"丛林伏击战HD"
			,"东北新闻网"
			,"东吴秀财"
			,"东方价值线-炒股票"
			,"东方头条"
			,"东方票务"
			,"东方航空"
			,"东方财富网"
			,"个性头像"
			,"丫丫手机"
			,"丫丫旅途"
			,"中信建投证券"
			,"中信证劵手机开户"
			,"中信证劵高端版"
			,"中信银行"
			,"中关村在线"
			,"中兴应用商店"
			,"中华万年历"
			,"中华网"
			,"中华英才网"
			,"中华通电话"
			,"中原地产"
			,"中商情报网"
			,"中国专业人才网"
			,"中国二手车城"
			,"中国南博览会"
			,"中国售票网"
			,"中国国家地理"
			,"中国国航"
			,"中国天气"
			,"中国工商银行"
			,"中国搜索"
			,"中国新闻网"
			,"中国日报网"
			,"中国汉字听写大会"
			,"中国法院手机电视"
			,"中国游戏中心"
			,"中国矿行业门户"
			,"中国票务网"
			,"中国移动手机营业厅"
			,"中国签证网"
			,"中国经济网"
			,"中国网新闻"
			,"中国象棋"
			,"中国连锁经营官网"
			,"中国邮票百科"
			,"中国银行"
			,"中文书城"
			,"中文杂志"
			,"中日最前線"
			,"中演票务通"
			,"中粮我买网"
			,"中邮阅读"
			,"中金在线论坛"
			,"中银国际"
			,"丸子向导端"
			,"么么哒"
			,"么么嗖"
			,"么么答-炫酷答题"
			,"义乌网城"
			,"义乌购"
			,"之间聚合"
			,"乐云记事"
			,"乐享电视"
			,"乐分"
			,"乐动力跑步计步器"
			,"乐助手"
			,"乐变"
			,"乐商店"
			,"乐嗨秀场"
			,"乐安全"
			,"乐服务"
			,"乐淘"
			,"乐疯跑"
			,"乐省电"
			,"乐米追书"
			,"乐蜂网"
			,"乐行九寨"
			,"乐视体育"
			,"乐视应用商店"
			,"乐视视频"
			,"乐讯"
			,"乐词-新东方学单词"
			,"乐语音"
			,"乐趣手机助手"
			,"乐跑手环"
			,"乐马生活"
			,"乐鱼"
			,"乖离性百万亚瑟王"
			,"九元航空"
			,"九块九包邮"
			,"九天音乐"
			,"九妖笑话"
			,"九易租车"
			,"九月读书"
			,"九酷音乐"
			,"九阴"
			,"九龙战"
			,"也买酒红酒"
			,"书旗小说"
			,"书猫"
			,"书虫小说"
			,"书香云集"
			,"买单吧"
			,"买卖宝"
			,"买火车票-12306订票"
			,"买票网"
			,"买车达人"
			,"买车通"
			,"乱轰三国志"
			,"二手车"
			,"于斯课堂"
			,"云TV手机电视直播"
			,"云中书城"
			,"云南移动"
			,"云图TV电视直播"
			,"云地图"
			,"云帆搜索"
			,"云猴"
			,"云财经"
			,"云车生活"
			,"云速代驾"
			,"互动作业"
			,"互动电视"
			,"互易区"
			,"互联网周刊"
			,"亚马逊"
			,"交管12123"
			,"交通帮"
			,"交通银行"
			,"亦看"
			,"京东"
			,"京东金融"
			,"京东钱包"
			,"京东阅读"
			,"京彩生活"
			,"亲亲绘本"
			,"亲宝宝"
			,"人人"
			,"人人车二手车"
			,"人大经济论坛"
			,"人民日报"
			,"人民网"
			,"人脉通"
			,"亿房网"
			,"亿泊行"
			,"亿部书城"
			,"什么值得买"
			,"今日十大新闻 "
			,"今日头条"
			,"今日阅读"
			,"仙人掌股票"
			,"仙剑奇侠传3D回合"
			,"任行法兰西"
			,"企鹅FM"
			,"优信二手车"
			,"优度宽频"
			,"优栈"
			,"优物"
			,"优理宝"
			,"优米创业"
			,"优美图"
			,"优美时光"
			,"优衣库"
			,"优购商城"
			,"优购物"
			,"优途网"
			,"优酷"
			,"优酷拍客"
			,"伙伴商城"
			,"会说话的新闻"
			,"会说话的汤姆猫"
			,"会说话的皮埃尔"
			,"传奇归来OL"
			,"伪锁"
			,"伴旅"
			,"住哪儿-酒店预订"
			,"体坛周报"
			,"体育周报"
			,"体育头条"
			,"体育汇"
			,"体育疯"
			,"体育疯NBA英超直播"
			,"余味"
			,"佛音"
			,"作业帮"
			,"作业神器"
			,"你我贷"
			,"你来出境游"
			,"佣金宝"
			,"侠侣网"
			,"侠隐江湖"
			,"侬集市"
			,"保卫萝卜"
			,"信用卡之窗"
			,"倚天屠龙记"
			,"借贷宝"
			,"倩女幽魂"
			,"值邮么"
			,"健身宝典"
			,"傲游云浏览器"
			,"僵尸前线3D"
			,"儿歌"
			,"儿歌多多"
			,"儿童宝宝早教乐园"
			,"儿童拖拖乐游戏"
			,"儿童故事电台"
			,"儿童蛋糕厨师"
			,"儿童鞋子装饰"
			,"元气弹漫画"
			,"兄弟来一刀"
			,"充电桩"
			,"光大金阳光"
			,"光大银行"
			,"光明云媒"
			,"免费wifi电话"
			,"免费WiFi联盟"
			,"免费WiFi钥匙"
			,"免费个性艺术签名设计"
			,"免费学习语言busuu"
			,"免费小说"
			,"免费小说城"
			,"兜兜公交"
			,"兜兜友"
			,"入台证神器"
			,"全国汽车票"
			,"全国违章查询"
			,"全民K歌"
			,"全民奇迹-十年经典"
			,"全民小镇"
			,"全民打怪兽"
			,"全民数独"
			,"全民斗战神"
			,"全民无双"
			,"全民枪战"
			,"全民枪神"
			,"全民泡泡大战"
			,"全民炫舞"
			,"全民突击"
			,"全民飞机大战"
			,"全球华商名人堂"
			,"全球特价酒店-Hotels.com"
			,"全球电台"
			,"全球电台-FM收音机"
			,"全能相机"
			,"全能通网络电话"
			,"八字算命看风水"
			,"公主沙龙3女孩化妆"
			,"公交e路通"
			,"公交族"
			,"公务员考试题库"
			,"公务机联盟"
			,"六间房秀场"
			,"六龙争霸3D"
			,"兴业银行"
			,"养生商城网（盛凯元养生商城网）"
			,"养车点点"
			,"兼职库"
			,"兼职猫"
			,"兽药饲料（火爆兽药饲料网）"
			,"内涵段子"
			,"内酷漫画"
			,"冒险岛"
			,"冒险岛4"
			,"军事TV"
			,"军事头条"
			,"农信百事通"
			,"农村淘宝"
			,"农行掌上银行"
			,"冰雪消除"
			,"决战沙城"
			,"冷笑话精选"
			,"减压神器"
			,"凡客"
			,"凤凰FM"
			,"凤凰新闻"
			,"凤凰网"
			,"凤凰网房产"
			,"凤凰视频"
			,"凤凰论坛"
			,"凤凰财经"
			,"凯撒旅游"
			,"凯立德导航"
			,"凯迪拉克"
			,"凹凸共享租车"
			,"出发吧-旅行计划"
			,"出发点旅游"
			,"出门儿"
			,"刀塔传奇-50V50!全新团战模式"
			,"刀塔传奇攻略"
			,"刀锋无双"
			,"分期乐 "
			,"分红微店"
			,"分贝LIVE"
			,"创富锦囊"
			,"到喜啦"
			,"到家美食会"
			,"刷机助手"
			,"刷机大师"
			,"刷机精灵"
			,"前店后厂"
			,"前沿"
			,"前程无忧"
			,"剑与魔法"
			,"剑侠世界"
			,"剑侠情缘"
			,"剑道风云"
			,"剑魂之刃"
			,"剧吧视频"
			,"功夫熊猫"
			,"功夫熊猫3"
			,"加气导航"
			,"动听铃声"
			,"化工行业网"
			,"北京地铁（官方）"
			,"北京实时公交"
			,"北京时间"
			,"北京移动服务"
			,"医学深造"
			,"医网"
			,"十个"
			,"十八玩具"
			,"十六番"
			,"十分钟微信精选"
			,"千寻影视"
			,"千炮捕鱼OL"
			,"千牛"
			,"半糖"
			,"华为商城"
			,"华为应用市场"
			,"华为游戏中心"
			,"华住"
			,"华商播报"
			,"华声论坛"
			,"华夏基金管家"
			,"华夏活期通"
			,"华夏银行"
			,"华安微赢"
			,"华尔街见闻"
			,"华彩人生"
			,"华数 TV"
			,"华数TV"
			,"华股财经手机炒股票软件"
			,"华讯财经"
			,"卓意听书-有声小说"
			,"卓易市场"
			,"卓易彩票"
			,"单机斗地主"
			,"单读"
			,"单身GO"
			,"卖客疯"
			,"卖座电影"
			,"南京证劵大智慧版"
			,"南方+"
			,"南方周末"
			,"南方航空"
			,"南都周刊"
			,"南都网"
			,"博客园"
			,"博客网"
			,"博库网"
			,"卡巴斯基"
			,"卡游"
			,"卡牛信用卡管家"
			,"卢浮宫指南"
			,"卧龙吟-HD"
			,"卫斯行"
			,"印度歌曲Saavn"
			,"印象笔记"
			,"即时到"
			,"卷皮购物"
			,"原子播放器"
			,"原油宝"
			,"去兜风"
			,"去吧皮卡丘(全民宝贝)"
			,"去哪儿旅行"
			,"参考消息"
			,"又拍"
			,"友加"
			,"友友租车"
			,"友盟"
			,"友车拼车"
			,"友阅"
			,"发型宝典DIY"
			,"发型屋"
			,"发现大理"
			,"变形金刚TF4 Game"
			,"变身吧！主公"
			,"口碑"
			,"口碑旅行"
			,"口袋之旅"
			,"口袋乐居"
			,"口袋历史"
			,"口袋妖怪VS"
			,"口袋妖怪复刻"
			,"口袋妖怪漆黑魅影"
			,"口袋故事听听"
			,"口袋段子"
			,"口袋英雄"
			,"口袋购物"
			,"口袋香港"
			,"古诗词三百首鉴赏"
			,"古诗词典"
			,"叫叫动画儿歌"
			,"叫我猛将"
			,"可可直播"
			,"可可英语"
			,"可可软件商店"
			,"可牛电视直播"
			,"可米酷漫画"
			,"台湾民宿"
			,"史上最坑爹的游戏"
			,"号码百事通"
			,"合肥城泊"
			,"吉他教学视频"
			,"吉吉影音先锋"
			,"吉屋"
			,"吉林省职业教育信息网"
			,"吉通韩国"
			,"同同"
			,"同城游"
			,"同楼拼车"
			,"同步推"
			,"同程旅游"
			,"同网汇"
			,"同花顺"
			,"同路"
			,"名刊会"
			,"名片全能王"
			,"向上理财"
			,"君临天下-首款全球同服三国志"
			,"听云"
			,"听果"
			,"听游台湾"
			,"听说FM电台"
			,"听音辨曲 Shazam"
			,"周公解梦"
			,"周末去哪儿"
			,"周末酒店"
			,"呱呱视频-美女交友直播"
			,"呼应电话"
			,"和动漫"
			,"和地图"
			,"和天气"
			,"和彩云"
			,"和我信"
			,"和游戏"
			,"和生活"
			,"和笔记"
			,"和聚宝"
			,"和讯基金"
			,"和讯网"
			,"和讯股票"
			,"和通讯录"
			,"咕叽动画"
			,"咕咚"
			,"咕噜TV"
			,"咪咕善跑"
			,"咪咕影院"
			,"咪咕斗地主"
			,"咪咕游戏"
			,"咪咕直播"
			,"咪咕视频"
			,"咪咕铃声"
			,"咪咕阅读"
			,"咪咕音乐"
			,"品牌排行网"
			,"哈你直播"
			,"响巢看看"
			,"哔哩哔哩动画"
			,"哪好玩"
			,"哼哼"
			,"唐僧英语"
			,"唐诗宋词"
			,"唯一优品"
			,"唯品会"
			,"唯美动态壁纸"
			,"唱吧"
			,"商业周刊"
			,"商启通"
			,"啪啪"
			,"喂车车"
			,"善听听书"
			,"喆喆兔"
			,"喜搭搭-拼车出行"
			,"喜瓜-手机拍照分享"
			,"喜马拉雅FM"
			,"喵播直播"
			,"嗒嗒巴士"
			,"嗨淘"
			,"嗨漫画"
			,"嘀嗒拼车"
			,"囚徒健身"
			,"四万公里"
			,"四季电台"
			,"四川移动手机营业厅"
			,"四川航空"
			,"因味-美食相机"
			,"团800"
			,"团800电影"
			,"团游"
			,"团购大全"
			,"围棋宝典"
			,"国元点金"
			,"国元点金移动证劵（智慧版）"
			,"国家地理"
			,"国泰基金"
			,"国王的战争HD版"
			,"国笔输入法"
			,"国美电器"
			,"国联尊宝"
			,"图吧地图"
			,"图吧导航一号"
			,"图虫网"
			,"图解电影"
			,"图说"
			,"土巴兔"
			,"土拨鼠"
			,"土豆视频"
			,"圣佳太阳翼"
			,"圣才学霸"
			,"圣斗士星矢-正版授权"
			,"在外"
			,"在线学习Quizlet"
			,"在路上"
			,"在途"
			,"地下城与勇士"
			,"地图软件"
			,"地球村"
			,"地纬商机网"
			,"地铁查价"
			,"地铁跑酷图文攻略"
			,"地铁通"
			,"地铁酷跑"
			,"坐车网"
			,"坦克帝国"
			,"城堡密室逃亡"
			,"城市地铁"
			,"城市岛屿2：建筑故事"
			,"城市房产"
			,"城市指南-长滩岛"
			,"基督徒阅读"
			,"基础韩语口语"
			,"堆糖—万能口袋"
			,"塔读文学"
			,"墨迹天气"
			,"壁纸多多"
			,"壁纸库"
			,"声控锁屏"
			,"壹剧本"
			,"壹钱包"
			,"外卖大咖"
			,"外卖超人"
			,"多一条线 One More Line"
			,"多乐听书"
			,"多乐够级"
			,"多听FM"
			,"多多"
			,"多多计算器"
			,"多屏看看"
			,"多点GPS户外导航"
			,"多玩我的世界盒子"
			,"多玩游戏"
			,"多玩论坛"
			,"多玩饭盒"
			,"多盟"
			,"多看阅读"
			,"多米音乐"
			,"多趣悦读"
			,"多邻国"
			,"夜猫小说"
			,"夜都市-交友夜生活"
			,"大主宰"
			,"大众养生网"
			,"大众点评"
			,"大圣之怒 "
			,"大姨吗"
			,"大娱娱乐"
			,"大富翁9"
			,"大师算命馆"
			,"大掌门"
			,"大旗网"
			,"大智慧"
			,"大熊跑酷"
			,"大码美衣"
			,"大街"
			,"大话西游"
			,"大象册-共享相册"
			,"大韩航空Korean Air"
			,"大鱼吃小鱼"
			,"大麦"
			,"天下"
			,"天下HD"
			,"天下电子书"
			,"天和泰宝"
			,"天圆网"
			,"天域幻想"
			,"天堂II"
			,"天堂草原"
			,"天天P图"
			,"天天U惠"
			,"天天动听"
			,"天天基金网"
			,"天天富翁"
			,"天天弹钢琴"
			,"天天快报"
			,"天天挂机"
			,"天天斗地主（真人版）"
			,"天天果园"
			,"天天水果消除"
			,"天天炫斗"
			,"天天炫舞-华晨宇代言"
			,"天天爱消除"
			,"天天特价"
			,"天天用车"
			,"天天练"
			,"天天背单词"
			,"天天英语"
			,"天天英雄-撸啊撸"
			,"天天视频"
			,"天天跑酷3D"
			,"天天锁屏"
			,"天天风之旅助手"
			,"天天飞车"
			,"天天飞车攻略大全"
			,"天子"
			,"天巡网"
			,"天极数码"
			,"天气通"
			,"天涯客"
			,"天涯社区"
			,"天涯论坛"
			,"天猫"
			,"天真养生"
			,"天籁K歌"
			,"天翼Live"
			,"天翼WiFi"
			,"天翼云"
			,"天翼客服"
			,"天翼导航"
			,"天翼手机"
			,"天翼掌厅"
			,"天翼生活"
			,"天翼空间"
			,"天翼视讯"
			,"天翼阅读"
			,"天虹微品"
			,"天行听书"
			,"天裁设计师"
			,"天道"
			,"天魔幻想"
			,"天龙八部"
			,"太平洋亲子网"
			,"太平洋汽车网"
			,"太平洋游戏网"
			,"太平洋电脑网"
			,"太极熊猫"
			,"太极熊猫2"
			,"央广手机电视"
			,"央视体育"
			,"央视影音"
			,"央视悦动"
			,"央视戏曲"
			,"央视新闻"
			,"央视财经"
			,"头像淘淘"
			,"头条快报"
			,"头条视频"
			,"头版"
			,"奇妙清单"
			,"奇思壁纸"
			,"奇悠阅读"
			,"奇扒"
			,"奇橙"
			,"奇米影视播放器"
			,"奇迹暖暖"
			,"奇速英语"
			,"奔跑吧兄弟4"
			,"奥特曼跑酷"
			,"女生志"
			,"女神叫你起床"
			,"女神联盟-送小米4"
			,"女装穿搭"
			,"她社区"
			,"好123"
			,"好123官方贴吧"
			,"好乐买"
			,"好书淘"
			,"好代驾"
			,"好唱"
			,"好多动漫图片"
			,"好多铃声"
			,"好奇心日报"
			,"好好租"
			,"好漫画"
			,"好豆菜谱"
			,"好车主"
			,"好轻"
			,"好铃声"
			,"妈妈圈"
			,"妈妈帮"
			,"妈妈必备"
			,"妈妈淘"
			,"妈富隆"
			,"娱乐沸点"
			,"娱票儿"
			,"婚宴酒店大全"
			,"婚礼猫"
			,"婚礼纪"
			,"媚婍全球优选"
			,"孕妈助手"
			,"孕期提醒 - 怀孕必备"
			,"孕育管家"
			,"字体管家"
			,"孝品"
			,"学习宝"
			,"学优高考网"
			,"学霸君"
			,"宁波通-公交地图"
			,"宅微店"
			,"安代驾"
			,"安兔兔验机"
			,"安全先锋"
			,"安全管家"
			,"安医生"
			,"安卓一键锁屏"
			,"安卓动态壁纸"
			,"安卓壁纸"
			,"安卓市场"
			,"安卓电池医生"
			,"安卓美化主题"
			,"安卓解压"
			,"安卓读书"
			,"安居客"
			,"安徽移动"
			,"安投宝"
			,"安智市场"
			,"安飞士租车"
			,"安驾电子狗"
			,"完美世界"
			,"完美世界3D"
			,"完美钢琴"
			,"定位宝"
			,"宜人贷借款"
			,"宜人贷理财"
			,"宜居通"
			,"宜搜小说"
			,"宜搜搜索"
			,"宝宝养成好习惯"
			,"宝宝学汉字(学前识字)"
			,"宝宝巴士"
			,"宝宝树"
			,"宝宝爱卫生"
			,"宝宝知道"
			,"宝贝听听"
			,"宝贝爱跳舞"
			,"宝驾租车"
			,"客栈通"
			,"客运站"
			,"家长帮"
			,"家长通"
			,"宽带山"
			,"对面（交友）"
			,"寺库网"
			,"寻医问药"
			,"寻爱婚恋"
			,"导航犬"
			,"射雕英雄传3D"
			,"小二团"
			,"小人书大本营"
			,"小伴龙"
			,"小咖秀"
			,"小小指挥官2"
			,"小布丁音乐"
			,"小影"
			,"小恩爱"
			,"小木虫"
			,"小桔山"
			,"小桔科技"
			,"小漫WiFi"
			,"小猪巴士"
			,"小猪短租"
			,"小猿搜题"
			,"小看"
			,"小米WIFI"
			,"小米分享"
			,"小米司机"
			,"小米商城"
			,"小米小说"
			,"小米应用商店"
			,"小米智能家庭"
			,"小米生活"
			,"小米网"
			,"小米路由器"
			,"小米运动"
			,"小米违章查询"
			,"小红书"
			,"小美生活"
			,"小荷特卖"
			,"小蓝单车"
			,"小虫FM"
			,"小说阅读网"
			,"小酷拼车"
			,"小金理财-活期理财"
			,"小鸟爆破"
			,"小鸡模拟器"
			,"小鸣单车"
			,"少女咖啡枪"
			,"少年三国志"
			,"尚听FM"
			,"尚品网"
			,"尚德机构"
			,"就爱运动"
			,"尾票网"
			,"屏客来电秀"
			,"山东24小时"
			,"山东会计信息网"
			,"山东师范大学"
			,"山东移动掌上营业厅"
			,"山东航空"
			,"山航掌尚飞"
			,"山西旅游"
			,"崩坏3"
			,"崩坏学园2"
			,"巅峰战舰"
			,"左左"
			,"巴啦啦魔法变身"
			,"巴巴熊安徒生童话"
			,"巴适公交"
			,"市民主页"
			,"布丁优惠券"
			,"布丁动画"
			,"布丁酒店"
			,"布卡漫画"
			,"布袋漫画"
			,"干净宝宝 Pepi Bath Lite"
			,"平安WiFi"
			,"平安人寿（平安金管家）"
			,"平安好医生"
			,"平安普惠"
			,"平安证券"
			,"平安证劵"
			,"平安银行"
			,"平安随行-导航版"
			,"幻城"
			,"广东交通"
			,"广东亲情通"
			,"广东移动手机营业厅"
			,"广发手机证券"
			,"广发手机证劵"
			,"广发银行"
			,"广告平台"
			,"广场舞视频"
			,"广州地铁"
			,"广州移动频道"
			,"广汽传祺"
			,"广西移动"
			,"广西移动掌上营业厅"
			,"库客音乐"
			,"应届生招聘"
			,"应用宝"
			,"应用汇"
			,"度周末"
			,"康爱多掌上药店"
			,"建设银行"
			,"开卷有益"
			,"开奇商店"
			,"开心泡泡猫"
			,"开心消消乐-送米4"
			,"开心熊宝"
			,"开心熊猫"
			,"开心糖果消消乐"
			,"开心网"
			,"开心酷跑"
			,"开迅视频"
			,"弹吧APP"
			,"弹琴吧"
			,"弹簧跳跃-Springer"
			,"弹钢琴学儿歌"
			,"强国网"
			,"强国论坛"
			,"当乐游戏中心"
			,"当当网"
			,"当当读书"
			,"彩88彩票"
			,"彩信"
			,"彩信相册WAP访问"
			,"彩猫彩票"
			,"彩票2元"
			,"彩票365"
			,"彩票宝"
			,"彩票迷"
			,"彩虹佳缘"
			,"彩虹公交"
			,"彩铃多多"
			,"彭博商业周刊"
			,"影之刃2"
			,"影映生活"
			,"影视大全"
			,"影音先锋大全"
			,"影音先锋手机版"
			,"征途"
			,"徒步去旅行"
			,"御龙在天"
			,"微乐动态壁纸"
			,"微云"
			,"微人脉"
			,"微代驾"
			,"微价"
			,"微会"
			,"微信"
			,"微信电话本"
			,"微信聊天动态表情"
			,"微兼职"
			,"微医"
			,"微博"
			,"微吼直播"
			,"微密"
			,"微差事_手机赚钱"
			,"微店买家版"
			,"微微"
			,"微微拼车"
			,"微性"
			,"微性-美女情趣商城"
			,"微拍"
			,"微桌面"
			,"微爱"
			,"微票儿"
			,"微米浏览器"
			,"微聚"
			,"微视"
			,"微话"
			,"微话地图"
			,"微读-公众号阅读"
			,"微车违章查询"
			,"微铺"
			,"微阅读"
			,"微音乐"
			,"心理FM"
			,"心理医生"
			,"心理测试"
			,"心血管内科专家"
			,"必应搜索"
			,"必应词典"
			,"必胜宅急送"
			,"必胜客"
			,"必赢彩票"
			,"必趣旅行"
			,"必通"
			,"忍者之剑"
			,"忍者无极"
			,"快代驾"
			,"快传"
			,"快听小说"
			,"快巴汽车票"
			,"快店"
			,"快快租车"
			,"快手"
			,"快手下载"
			,"快手动漫"
			,"快手美女"
			,"快拍二维码"
			,"快牙"
			,"快的司机"
			,"快的打车"
			,"快盘"
			,"快看"
			,"快看影视"
			,"快看漫画"
			,"快眼看书"
			,"快科技"
			,"快美妆"
			,"快讯(DCD)"
			,"快说语音助手"
			,"快读小说"
			,"快赚"
			,"快超"
			,"快递100"
			,"快钱"
			,"怀孕管家"
			,"思维简图"
			,"性多多"
			,"性趣"
			,"怪物弹珠"
			,"恋爱学院（音爱而生）官方中文版"
			,"悟空遥控器"
			,"悠哉旅游"
			,"悠悠导航"
			,"悠鹿自主网"
			,"悦动圈"
			,"悦动浏览器"
			,"悦纳视频"
			,"悦美"
			,"悦跑圈"
			,"惠品折"
			,"惠家有"
			,"惠惠"
			,"惠锁屏"
			,"想去"
			,"愚公移山"
			,"慈元阁"
			,"懂球帝"
			,"懂球帝-足球迷必备"
			,"懒人听书"
			,"懒人周末"
			,"我叫MT2"
			,"我在大清当皇帝HD"
			,"我是妈咪"
			,"我有车"
			,"我有车·拼车"
			,"我朝有马"
			,"我查查"
			,"我爱卡"
			,"我爱学英语"
			,"我爱我家"
			,"我的世界杯"
			,"我的世界联机盒子"
			,"我的医生-在线问诊"
			,"我的南京"
			,"我的城市"
			,"我的日照"
			,"我的航空世界3D"
			,"我秀美女直播"
			,"我要外卖"
			,"我要当学霸"
			,"我趣购物"
			,"战国天下"
			,"战旗直播"
			,"战略网"
			,"战舰帝国"
			,"扇贝单词"
			,"手机乐园市场"
			,"手机冲浪"
			,"手机加速神器"
			,"手机动漫视频"
			,"手机微漫画"
			,"手机报"
			,"手机搜片神器"
			,"手机游戏下载"
			,"手机电影"
			,"手机电池优化大师"
			,"手机电视"
			,"手机电视MBBMS"
			,"手机电视直播"
			,"手机电视高清直播"
			,"手机百度"
			,"手机知网"
			,"手机管家"
			,"手机证券指南针版"
			,"手机铃声酷"
			,"手游礼包大全"
			,"手电筒"
			,"手表之家"
			,"扫描全能王"
			,"扭乐"
			,"批发佬"
			,"找个P"
			,"找作文"
			,"找我婚礼"
			,"投资堂"
			,"折800"
			,"抢购助手(加强版)"
			,"护目镜增强版"
			,"护花网"
			,"抱抱"
			,"拇指游"
			,"拇指玩"
			,"拇指阅读"
			,"拉勾网"
			,"拉卡拉钱包"
			,"拉手团购"
			,"拉拉"
			,"拉拉公园"
			,"拉风锁屏"
			,"拍大师"
			,"拍我吖"
			,"拍拍"
			,"拍拍贷借款"
			,"拍鞋网"
			,"拓词"
			,"招商银行"
			,"拳皇98"
			,"拳皇98终极之战OL"
			,"拼友"
			,"拼多多"
			,"拼立得"
			,"拼车去旅行"
			,"拼车帮"
			,"指旺理财-新手送红包"
			,"指纹解锁"
			,"指间足球 Slide Soccer"
			,"按键精灵"
			,"挑战2048"
			,"挖财"
			,"捏捏"
			,"捕鱼大赛"
			,"捕鱼来了"
			,"捕鱼达人"
			,"捡人"
			,"换发型"
			,"授权管理 "
			,"掌上书院"
			,"掌上买车"
			,"掌上公交—搜谷"
			,"掌上医讯"
			,"掌上图书"
			,"掌上基金"
			,"掌上如家"
			,"掌上宝电话"
			,"掌上猫扑"
			,"掌上生活"
			,"掌上航旅"
			,"掌上英雄联盟"
			,"掌上药店"
			,"掌上金鹰"
			,"掌中天涯"
			,"掌中头条"
			,"掌中娱乐"
			,"掌中新浪"
			,"掌中英语"
			,"掌厨-美食菜谱"
			,"掌心管家"
			,"掌通家园"
			,"掌钱"
			,"掌阅iReader"
			,"掠夺者"
			,"探探"
			,"接我"
			,"推翻那部落"
			,"掼蛋"
			,"搜库视频"
			,"搜房帮"
			,"搜房网房天下"
			,"搜搜音乐"
			,"搜狐二手车"
			,"搜狐微博"
			,"搜狐新闻"
			,"搜狐母婴频道"
			,"搜狐汽车"
			,"搜狐焦点"
			,"搜狐社区"
			,"搜狐网"
			,"搜狐视频"
			,"搜狐财经"
			,"搜狐邮箱"
			,"搜狐随身看"
			,"搜狗号码通"
			,"搜狗地图"
			,"搜狗壁纸"
			,"搜狗手机助手"
			,"搜狗搜索"
			,"搜狗浏览器"
			,"搜狗语音助手"
			,"搜狗购物"
			,"搜狗输入法"
			,"搜狗问问"
			,"搜狗阅读"
			,"搜狗音乐"
			,"搞笑妹子"
			,"搞笑视频"
			,"搭一程拼车"
			,"搭伴玩"
			,"搭搭拼车"
			,"搭配师"
			,"携程攻略"
			,"携程旅行"
			,"摇号啦"
			,"摩天轮"
			,"摩拜单车"
			,"播霸-高清影视大全"
			,"支付宝"
			,"收留我"
			,"放开那三国"
			,"放开那三国2"
			,"放松音乐 加强版"
			,"教育心理学"
			,"敢聊"
			,"数码宝贝"
			,"数米基金宝"
			,"整形思密达"
			,"文件管理器"
			,"文化苏州"
			,"文华财经"
			,"文明中国"
			,"斗破苍穹"
			,"斗鱼"
			,"斗鱼TV"
			,"断天书城"
			,"新一站保险"
			,"新世纪福音战士OL"
			,"新京报"
			,"新华字典"
			,"新华炫闻"
			,"新华社"
			,"新华网"
			,"新华网论坛"
			,"新微云"
			,"新时代通信达"
			,"新梦网"
			,"新氧美容"
			,"新浪SHOW"
			,"新浪UC语音"
			,"新浪乐居"
			,"新浪体育"
			,"新浪图片"
			,"新浪彩票-送103彩金"
			,"新浪新闻"
			,"新浪汽车"
			,"新浪游戏"
			,"新浪网"
			,"新浪视频"
			,"新浪论坛"
			,"新浪读书"
			,"新浪财经"
			,"新浪邮箱"
			,"新生命"
			,"新田团"
			,"新美互通"
			,"新苍穹之剑"
			,"新苏报"
			,"新闻画报"
			,"方格1010+"
			,"方正证券小方"
			,"旅宿特价酒店"
			,"旅游百事通掌旅通"
			,"旅游结伴"
			,"旅游顾问-线路行"
			,"旅行加"
			,"旅行派"
			,"旅行真人译"
			,"旅视旅游"
			,"无忧停车"
			,"无敌弹珠"
			,"无期途行"
			,"无秘"
			,"无线苏州"
			,"日语学习"
			,"旧金山"
			,"时光相册"
			,"时光网"
			,"时刻新闻"
			,"时尚新娘"
			,"时空猎人"
			,"旺信"
			,"明星斗地主"
			,"明星梦工厂"
			,"明星衣橱"
			,"易信"
			,"易停车"
			,"易到用车-出行必备"
			,"易到用车司机版"
			,"易听收音机"
			,"易呗背单词"
			,"易周游"
			,"易淘金"
			,"易直播"
			,"易聊"
			,"易视手机电视直播"
			,"易购网"
			,"易车"
			,"易达火车票"
			,"易迅网"
			,"易邮天下"
			,"易阳指"
			,"易驾考"
			,"星愿汇"
			,"星球TV"
			,"映客"
			,"映客直播"
			,"春晚小品大全"
			,"春水堂"
			,"春秋旅游"
			,"春秋航空"
			,"春雨医生"
			,"晋江小说阅读"
			,"智惠阅读"
			,"智慧树"
			,"智房网"
			,"智汇云应用商场"
			,"智游啦"
			,"智联招聘"
			,"智能停车"
			,"智行南京"
			,"智行火车票"
			,"智远一户通"
			,"智通人才"
			,"暖暖环游世界攻略"
			,"暖暖的换装物语"
			,"暗影之枪中文版"
			,"暗黑黎明(范冰冰代言)"
			,"暴走日报"
			,"暴走漫画"
			,"暴风影音"
			,"暴风魔镜"
			,"曝工资"
			,"更美"
			,"最美壁纸"
			,"最美天气"
			,"最美搜衣-换脸试衣"
			,"最美装修"
			,"最美锁屏"
			,"最酷网"
			,"有伴网"
			,"有你"
			,"有信电话"
			,"有吃友玩"
			,"有妖气动漫"
			,"有意思吧"
			,"有用旅行贴士"
			,"有缘网"
			,"有聊电话"
			,"有话通网络电话"
			,"有赞"
			,"有趣岛漫画"
			,"有路网"
			,"有道云笔记"
			,"有道口语大师"
			,"有道汉语词典"
			,"有道词典"
			,"有间房"
			,"朋友网"
			,"期权全真交易"
			,"木蚂蚁市场"
			,"木鸟房东助手"
			,"本地头条"
			,"机锋市场"
			,"条码识别"
			,"来乐驾过"
			,"来往"
			,"来电"
			,"来电通"
			,"来电防火墙"
			,"来疯直播秀"
			,"来这游"
			,"极品小说"
			,"极品时刻表"
			,"极无双"
			,"极简汇率"
			,"极速随身看"
			,"果冻刷机"
			,"果合"
			,"果壳"
			,"果宝三国"
			,"果汁四溅"
			,"枪战王者"
			,"柚子相机"
			,"校园易购"
			,"格拉瓦@电影"
			,"格林豪泰"
			,"格瓦拉@生活"
			,"格瓦拉@电影"
			,"桂林字牌"
			,"梦幻西游"
			,"梦幻诛仙"
			,"梦想世界"
			,"梦环音乐播放器"
			,"梨视频"
			,"植物大战小昆虫"
			,"楼盘网"
			,"榫卯"
			,"榴芒视频"
			,"模拟炒股"
			,"横扫千军"
			,"樱桃同志"
			,"橙光游戏"
			,"欢乐KTV"
			,"欢乐吧多人视频空间"
			,"欢乐斗地主-QQ游戏官方版"
			,"欢乐斗牛"
			,"欢乐麻将全集"
			,"欧朋浏览器"
			,"欧美淘"
			,"正品折扣HD"
			,"正常的大冒险"
			,"正点小说"
			,"正点工具箱"
			,"正点日历"
			,"正点闹钟"
			,"武动乾坤"
			,"武娘"
			,"武安淘"
			,"武汉中国旅行社"
			,"武汉地铁生活圈"
			,"母婴之家-海淘特卖"
			,"每日一文"
			,"每日一读"
			,"每日新款"
			,"每日晨读"
			,"每日瑜伽"
			,"每日英语听力"
			,"比邻"
			,"民生商城"
			,"民生银行"
			,"氧气听书"
			,"水印相机"
			,"水木社区"
			,"水果派对"
			,"水浒Q传"
			,"永乐票务"
			,"永安行"
			,"永恒之歌"
			,"永恒纪元：戒"
			,"永生门 (仙侠精品)"
			,"求医网"
			,"求攻略-旅游指南"
			,"求激情"
			,"江苏快3"
			,"江苏移动手机营业厅"
			,"江苏银行"
			,"江苏银行直销银行"
			,"江西手机报"
			,"江西移动掌上营业厅"
			,"汤圆创作"
			,"汤姆爱安吉拉"
			,"汽车之家"
			,"汽车头条"
			,"汽车应急助手"
			,"汽车报价"
			,"汽车报价大全"
			,"汽车点评"
			,"沃·行讯通"
			,"沃乐"
			,"沃商店"
			,"沃家视频"
			,"沃邮箱"
			,"沃阅读"
			,"沃音乐"
			,"沙发管家手机版"
			,"沪江开心词场"
			,"沱沱工社"
			,"河南党员教育"
			,"河南移动营业厅"
			,"泉州通"
			,"泊泊停车"
			,"泡泡网"
			,"泡泡龙官方正版"
			,"波奇宠物"
			,"波妹斗地主赢话费"
			,"泰捷视频"
			,"洋码头"
			,"洋葱旅行"
			,"派派同城交友聊天"
			,"流流顺"
			,"流量助手"
			,"流量宝"
			,"流量汇"
			,"流量熊"
			,"济南公交"
			,"浙商证劵手机开户"
			,"浙江新闻"
			,"浙江移动手机营业厅"
			,"浦发手机银行"
			,"浩方电竞平台"
			,"浪漫庄园"
			,"海南航空"
			,"海客新闻"
			,"海岛奇兵"
			,"海报工厂"
			,"海欧"
			,"海澜之家"
			,"海玩"
			,"海玩香港"
			,"海绵宝宝大冒险"
			,"海航会"
			,"海词词典"
			,"海豚浏览器"
			,"海豹村"
			,"海通e海通财"
			,"海通e财富"
			,"涨乐财富通"
			,"淘800"
			,"淘北海"
			,"淘在路上"
			,"淘宝"
			,"淘宝电影"
			,"淘宝论坛"
			,"淘房网"
			,"淘打折"
			,"淘最上海"
			,"淘淘搜"
			,"淘爱"
			,"淘金子掌柜"
			,"深圳合租记"
			,"深圳航空"
			,"混"
			,"渤海手机银行"
			,"港铁行车资讯"
			,"游上海"
			,"游侠网"
			,"游历世界"
			,"游啊游"
			,"游多多客栈"
			,"游天下"
			,"游戏堡"
			,"游谱旅行"
			,"游趣来"
			,"湖北农信"
			,"满堂红"
			,"滤镜大师FilterGrid"
			,"滨州市人力资源和社会保障网"
			,"滴滴代驾司机"
			,"滴滴出行"
			,"滴滴司机-专车"
			,"滴滴司机-出租车"
			,"演出网"
			,"演唱汇-视频k歌"
			,"漫吧漫画"
			,"漫悠悠漫画"
			,"漫果"
			,"漫漫漫画"
			,"漫漫看"
			,"漫画人"
			,"漫画小人书"
			,"漫画岛"
			,"漫画帮"
			,"漫画控"
			,"漫画盒子"
			,"漫画阅读 Comics"
			,"潇湘书院"
			,"潇湘晨报网"
			,"潮自拍"
			,"澎湃新闻"
			,"澳乐旅游"
			,"激动网"
			,"激萌"
			,"火影忍者"
			,"火柴盒"
			,"火线指令2"
			,"火车查询"
			,"火车票"
			,"火车票网"
			,"灵犀语音助手"
			,"灿烂阳光航空旅行网"
			,"炉石传说视频站"
			,"点心桌面"
			,"点心省电国际版"
			,"点点运动"
			,"烟台论坛"
			,"烟雨红尘网 "
			,"烧饼工具箱"
			,"热血传奇"
			,"热血江湖"
			,"热血英豪"
			,"煎蛋"
			,"照片拼图Shape Collage"
			,"照片滤镜相机 - EyeEm"
			,"照片编辑器"
			,"照片艺术家PicsArt"
			,"熊猫TV"
			,"熊猫公交"
			,"熊猫快跑"
			,"熊猫桌面"
			,"熊猫看书和阅读版"
			,"熊猫驾信"
			,"熟店宝"
			,"爆米花视频"
			,"爱乐透彩票"
			,"爱代驾"
			,"爱动漫"
			,"爱卡汽车"
			,"爱听4G "
			,"爱周边"
			,"爱唱"
			,"爱壁纸"
			,"爱奇艺PPS"
			,"爱奇艺头条"
			,"爱奇艺视频"
			,"爱家TV"
			,"爱帮公交"
			,"爱思助手"
			,"爱惠"
			,"爱折客"
			,"爱折扣-淘年货"
			,"爱抢购"
			,"爱拍-火爆视频社区"
			,"爱推理"
			,"爱播听书"
			,"爱旅行"
			,"爱无线"
			,"爱易租"
			,"爱漫画"
			,"爱瘦"
			,"爱看4G"
			,"爱看儿童乐园"
			,"爱看免费小说"
			,"爱看小说"
			,"爱看电视直播"
			,"爱稀饭动画"
			,"爱聊"
			,"爱诗词"
			,"爱豆蔻音乐"
			,"爱赚乐导购"
			,"爱金花"
			,"爱阅读"
			,"爱音乐"
			,"爱鲜蜂"
			,"父母邦"
			,"片刻"
			,"牛股头条"
			,"牛股王股票"
			,"物流控"
			,"物色"
			,"特价会"
			,"特种部队"
			,"犀牛故事"
			,"狂暴之翼"
			,"狗狗书籍"
			,"猎豹安全大师"
			,"猎豹浏览器"
			,"猎豹清理大师"
			,"猜歌王"
			,"猜火车"
			,"猫和老鼠跑酷"
			,"猫团动漫"
			,"猫扑贴贴"
			,"猫眼电影"
			,"猿题库"
			,"率土之滨"
			,"王国纪元"
			,"王者荣耀"
			,"玖富理财"
			,"玖果视频"
			,"玩图"
			,"玩家网"
			,"玩机宝典"
			,"玩美彩妆"
			,"玩转巴东"
			,"玩转泰安"
			,"环球时报"
			,"环球阅读"
			,"珍爱网"
			,"球探体育比分"
			,"球球大作战"
			,"理财魔方"
			,"瑞丽"
			,"瑞卡租车"
			,"瑞星手机安全助手"
			,"瓜子二手车直卖网"
			,"瓦力抢红包"
			,"瓦力短信"
			,"生日派对-宝宝巴士"
			,"生日管家"
			,"生死狙击"
			,"申万宏源赢家理财高端版"
			,"电信营业厅"
			,"电子竞技"
			,"电影票比价"
			,"电玩巴士"
			,"电视家2.0"
			,"电视猫"
			,"电视粉"
			,"画中画相机"
			,"畅无线"
			,"畅读"
			,"畅读书城"
			,"畅途网"
			,"畅驾"
			,"界面"
			,"疯狂冒险岛"
			,"疯狂洗车"
			,"疯狂猜图"
			,"疯狂猜成语"
			,"疯狂追书"
			,"疯狂麻将"
			,"白菜价折扣"
			,"百变小樱换装"
			,"百合婚恋"
			,"百城求职宝"
			,"百姓网"
			,"百度hi"
			,"百度乐彩彩票"
			,"百度乐播"
			,"百度书城"
			,"百度传课"
			,"百度公交"
			,"百度团购"
			,"百度图片"
			,"百度地图"
			,"百度外卖"
			,"百度天眼"
			,"百度好看"
			,"百度导航"
			,"百度手机助手"
			,"百度手机卫士"
			,"百度手机输入法"
			,"百度文库"
			,"百度新闻"
			,"百度旅游"
			,"百度浏览器"
			,"百度游戏"
			,"百度理财"
			,"百度百科"
			,"百度知道"
			,"百度糯米"
			,"百度网址大全"
			,"百度网盘"
			,"百度翻译"
			,"百度聚聚"
			,"百度视频"
			,"百度论坛"
			,"百度语音助手"
			,"百度贴吧"
			,"百度输入法"
			,"百度钱包"
			,"百度阅读"
			,"百度音乐"
			,"百度魔图"
			,"百思不得姐"
			,"百程旅行"
			,"百老汇影城"
			,"百词斩"
			,"百达屋"
			,"百阅"
			,"皇室战争"
			,"皮皮影视"
			,"皮皮音乐"
			,"盈盈理财"
			,"益动GPS"
			,"益盟操盘手"
			,"盛名时刻表"
			,"盛生网"
			,"直升机空战 CHAOS"
			,"直播8"
			,"直播党-有料贴吧"
			,"直播吧"
			,"相机360"
			,"盼达用车"
			,"省电任务管理器"
			,"省钱助手"
			,"看动漫"
			,"看天下"
			,"看客影视"
			,"看房(腾讯房产)"
			,"看见音乐"
			,"真优美"
			,"真心点歌"
			,"瞭望"
			,"瞭望东方周刊"
			,"知乎"
			,"知乎日报"
			,"知米背单词"
			,"知趣天气"
			,"石榴直播"
			,"硬件管家"
			,"礼物说"
			,"祖玛"
			,"神之刃"
			,"神仙道"
			,"神器指纹锁"
			,"神州专车"
			,"神州租车"
			,"神庙逃亡"
			,"神马搜索"
			,"神马阅读"
			,"神魔"
			,"神魔之塔"
			,"票夹子"
			,"福建掌上客运"
			,"福音广播"
			,"秀色直播"
			,"私人衣橱"
			,"私信"
			,"科学之家"
			,"秒拍"
			,"秒赞秒评"
			,"秘密"
			,"租房"
			,"租租车"
			,"秦刚"
			,"秦时明月HD"
			,"移动MM"
			,"移动MOMO"
			,"移动农信通"
			,"移动图书馆"
			,"移动微博"
			,"移动手机医疗"
			,"移动手机卫士"
			,"移动手机商界"
			,"移动手机支付"
			,"移动手机钱包"
			,"移动服务平台"
			,"移动梦网"
			,"移动练歌房"
			,"穷游"
			,"空中网"
			,"空中英语"
			,"空间宝"
			,"穿衣助手"
			,"穿衣打扮"
			,"穿越火线"
			,"窗记校园"
			,"窝窝团"
			,"立韬广告"
			,"竞彩258彩票"
			,"章鱼TV"
			,"童说童画"
			,"笑林寺"
			,"笑话大王"
			,"笑霸来了"
			,"笔趣网"
			,"笨鸟漫画"
			,"第一视听"
			,"第一财经 "
			,"第二人生游戏"
			,"筷子旅行"
			,"简书"
			,"简单广播 Easy Radio Delayer"
			,"简易控制-Easy Control"
			,"篱笆社区"
			,"米尔军事"
			,"米尔要塞商城"
			,"米折"
			,"米聊"
			,"米赚"
			,"米键"
			,"粉粉日记"
			,"精品手电筒"
			,"精品美女图片"
			,"精品购物"
			,"精灵大冒险"
			,"精灵宝可梦GO"
			,"精选日报"
			,"糖果传奇"
			,"糖果萌萌消"
			,"糖果连线 candy line"
			,"糖豆广场舞"
			,"糗事百科"
			,"糯米团购"
			,"紫微大师-占卜八字"
			,"繁星直播"
			,"红薯小说"
			,"红袖添香"
			,"约爱"
			,"约票"
			,"约车"
			,"纪录片大全"
			,"纳米盒"
			,"纵横小说"
			,"纹字锁屏"
			,"纽扣助手"
			,"纽约时报"
			,"终端管理(DM)"
			,"经典电视剧"
			,"经典童话"
			,"经纬名片通"
			,"经纬购"
			,"结婚助手"
			,"给孩子的诗"
			,"维也纳酒店"
			,"维基百科"
			,"绿色先锋"
			,"绿茶浏览器"
			,"编剧宝"
			,"缘分同城交友"
			,"缘来网"
			,"网上厨房"
			,"网上车市"
			,"网易BoBo"
			,"网易CC"
			,"网易POPO"
			,"网易云课堂"
			,"网易云阅读"
			,"网易云音乐"
			,"网易公开课"
			,"网易将军令"
			,"网易彩票"
			,"网易微博"
			,"网易房产"
			,"网易新闻"
			,"网易时尚杂志"
			,"网易火车票-抢票版"
			,"网易电影"
			,"网易网"
			,"网易视频"
			,"网易论坛"
			,"网易财经"
			,"网易邮箱"
			,"网购潮"
			,"网速测试"
			,"羊城派"
			,"美丽拍"
			,"美丽私人医生"
			,"美丽约·约会交友"
			,"美丽街"
			,"美丽说"
			,"美乐时光"
			,"美人相机"
			,"美划算"
			,"美味不用等"
			,"美咖相机"
			,"美啦"
			,"美团"
			,"美团外卖"
			,"美团开店宝"
			,"美图文字"
			,"美图秀秀"
			,"美图贴贴"
			,"美女图片精选"
			,"美妆相机"
			,"美文"
			,"美柚"
			,"美甲秀-美丽女人"
			,"美秒秀秀"
			,"美篇"
			,"美美箱"
			,"美美豆发型"
			,"美色直播"
			,"美芽"
			,"美鞋家"
			,"美颜相机"
			,"美食天下"
			,"美食杰"
			,"翱翔"
			,"翻漫画"
			,"翻牌子"
			,"翼健康"
			,"翼支付"
			,"老九门"
			,"老虎地图"
			,"考拉FM电台"
			,"考拉海购"
			,"考拉电子狗"
			,"考研帮"
			,"聊天女仆"
			,"聊聊"
			,"联众世界"
			,"联想乐商店"
			,"联想日历"
			,"联连免费WiFi"
			,"联通手机营业厅"
			,"联邦快递 FedEx Mobile"
			,"聚会玩"
			,"聚划算"
			,"聚力体育"
			,"聚力视频"
			,"聚合基站"
			,"聚橙网"
			,"聚美优品"
			,"股市热点"
			,"股票入门"
			,"肥城房产网"
			,"肯德基"
			,"肯德基优惠券"
			,"胶东在线"
			,"脑力健康训练师Fit Brains"
			,"脱兔"
			,"脸优"
			,"腾讯体育"
			,"腾讯充值"
			,"腾讯动漫"
			,"腾讯地图"
			,"腾讯实时公交"
			,"腾讯微博"
			,"腾讯手机管家"
			,"腾讯新闻"
			,"腾讯汽车"
			,"腾讯照片管家"
			,"腾讯网"
			,"腾讯自选股"
			,"腾讯视频"
			,"腾讯课堂"
			,"腾讯财经"
			,"腾讯路宝"
			,"腾远用车"
			,"自游宝旅行"
			,"自游无限"
			,"臭美发型"
			,"至尊用车"
			,"臻致珠宝"
			,"舌尖旅行"
			,"舒适时光"
			,"航旅纵横"
			,"航海王强者之路"
			,"航班管家"
			,"艺术商业"
			,"艺术签名大师"
			,"艺粹"
			,"艺考在线"
			,"艺龙旅行"
			,"艾泽拉斯大百科"
			,"艾美阅读"
			,"节奏大师"
			,"节操百科"
			,"节操精选"
			,"芒果TV"
			,"芒果旅游"
			,"花动传媒"
			,"花千骨"
			,"花样直播"
			,"花椒直播"
			,"花瓣网"
			,"花田"
			,"苍穹之刃"
			,"苏宁易购"
			,"苏宁阅读"
			,"苏州新闻"
			,"苏州行"
			,"苏州银行"
			,"若初文学"
			,"英语六级君"
			,"英语六级听力"
			,"英语流利说"
			,"英语趣配音"
			,"英语音标"
			,"英雄之剑"
			,"英雄杀"
			,"英雄联盟视频"
			,"英雄难过棍子关2"
			,"苹果天气预报"
			,"茄子快传"
			,"荔枝FM"
			,"荔枝新闻"
			,"萌店"
			,"萌我-微信表情DIY"
			,"萤石云视频"
			,"落网"
			,"葛小姐"
			,"葩旅行"
			,"葫芦侠"
			,"葫芦侠3楼"
			,"葫芦侠我的世界"
			,"蒙古音乐"
			,"薄荷"
			,"藏密梵音-佛教"
			,"蘑菇街"
			,"虎哥打车"
			,"虎嗅网"
			,"虎扑体育"
			,"虎扑看球"
			,"虎扑跑步"
			,"虎牙直播"
			,"虚拟试衣间"
			,"虾米音乐"
			,"蚂蚁短租"
			,"蚂蚁聚宝"
			,"蚂蜂窝自由行"
			,"蛙趣儿童视频"
			,"蛙趣视频"
			,"蜀山战纪"
			,"蜘蛛电影票"
			,"蜘蛛精"
			,"蜜芽宝贝"
			,"蜜蜂导视"
			,"蜜蜂新闻"
			,"蜜阅"
			,"蜻蜓FM"
			,"蜻蜓听书"
			,"蝉游攻略"
			,"蝉游画报"
			,"蝉游记"
			,"融360"
			,"蠢蠢的死法-Dumb Ways"
			,"行动派"
			,"行我行"
			,"行程大师"
			,"行者-在路上约伴"
			,"街头篮球"
			,"街旁"
			,"街机三国"
			,"街蓝"
			,"装B神器"
			,"装修百科"
			,"装修管家"
			,"裹裹"
			,"西安市手机导游"
			,"西祠胡同"
			,"要出发周边游"
			,"观察者"
			,"视频剪辑V-Edit"
			,"解放军报"
			,"触宝电话"
			,"触宝输入法"
			,"触手TV"
			,"言情小说吧"
			,"订房宝"
			,"讯飞输入法"
			,"许鲜"
			,"设计头条"
			,"设计本"
			,"证券之星"
			,"识货"
			,"译人口译"
			,"试货-九块九返利"
			,"诚信邮"
			,"诛仙2"
			,"语音设置"
			,"说吧"
			,"说走就走"
			,"请吃饭-约饭神器"
			,"诺基亚OVI"
			,"诺顿"
			,"读书巴士"
			,"读文章网散文诗歌"
			,"读者"
			,"课程格子"
			,"谷歌地图"
			,"谷歌搜索"
			,"豆丁书房"
			,"豆果美食"
			,"豆瓣"
			,"豆瓣FM"
			,"豆瓣东西"
			,"豆瓣小组"
			,"豆瓣广播"
			,"豆瓣电影"
			,"豆瓣阅读"
			,"豆瓣音乐人"
			,"豆角优惠券"
			,"豌豆荚"
			,"贝瓦儿歌"
			,"贝瓦听听"
			,"贝聊"
			,"贝贝-贝购科技"
			,"贝贝特卖"
			,"财付通"
			,"财经头条"
			,"财经杂志"
			,"财通证劵"
			,"贪吃蛇大作战"
			,"购嗨嗨"
			,"购推荐返利"
			,"贰货"
			,"贱神段子"
			,"赛尔号"
			,"赢话费斗地主"
			,"赤月封魔"
			,"赵湧在线"
			,"赶集生活"
			,"起名大师"
			,"起点女生网"
			,"起点读书"
			,"超次元新番"
			,"超级减肥王"
			,"超级火车票"
			,"超级课程表"
			,"超级马里奥"
			,"超阅小说"
			,"越狱大冒险"
			,"趣分期"
			,"趣吧"
			,"趣头条"
			,"趣拍"
			,"趣游"
			,"趣运动"
			,"足球魔方"
			,"足记"
			,"跑跑卡丁车"
			,"跟谁学"
			,"路况交通眼"
			,"路友同行"
			,"路由管家"
			,"路路通"
			,"轉乘通"
			,"车e行及手机导航"
			,"车主通"
			,"车况检测大师"
			,"车托帮"
			,"车来了"
			,"车王之王"
			,"车秘油耗"
			,"车行无忧"
			,"车行者"
			,"车轮查违"
			,"车轮考驾照"
			,"车陛下"
			,"转转"
			,"转转秀-3D拍照"
			,"轱辘"
			,"轻工商城"
			,"轻松学钢琴"
			,"轻松时刻"
			,"轻漫画"
			,"辣妈商城"
			,"辣妈商城-母婴特卖"
			,"辣妈帮"
			,"辣妈汇"
			,"辣椒直播"
			,"辣舞直播"
			,"达令全球好货"
			,"达达用车"
			,"迅雷"
			,"迅雷阅读"
			,"运满满"
			,"返利网"
			,"返还网"
			,"进化Go"
			,"进步主义"
			,"远游"
			,"违章代办-车行易违章查询"
			,"违章查询助手"
			,"连我相机 LINE camera"
			,"迪信通"
			,"迷上铃声"
			,"迷你地图"
			,"追书神器"
			,"追帖神器"
			,"追番神器"
			,"追追漫画"
			,"追阅小说"
			,"途友"
			,"途图乐"
			,"途家"
			,"途游斗地主"
			,"途牛旅游"
			,"途牛自驾"
			,"途虎养车网"
			,"逗拍"
			,"通通电话"
			,"逛商城"
			,"逛街趣"
			,"造梦西游"
			,"遇见"
			,"道听途说"
			,"道客巴巴"
			,"道说导游商家"
			,"遛达"
			,"遥看万能遥控器"
			,"遨播听书"
			,"遨游旅行"
			,"那年"
			,"邮储银行"
			,"邮箱大师"
			,"邻店汇"
			,"邻趣"
			,"部落冲突"
			,"部落探险"
			,"都市妈妈网"
			,"都秀"
			,"配音秀"
			,"酒仙网"
			,"酒运达"
			,"酷6视频"
			,"酷云"
			,"酷划（酷划锁屏）"
			,"酷听听书"
			,"酷学习"
			,"酷家乐"
			,"酷我K歌-手机ktv"
			,"酷我听书"
			,"酷我音乐"
			,"酷狗FM电台收音机"
			,"酷狗手机铃声"
			,"酷狗音乐"
			,"酷米客公交"
			,"酷讯旅游"
			,"酷讯机票"
			,"酷讯网"
			,"酷音铃声"
			,"酷骑单车"
			,"酷鸟"
			,"采淘"
			,"重庆移动手机营业厅"
			,"野糖"
			,"野马模拟"
			,"金太阳"
			,"金山手机卫士"
			,"金山电池医生"
			,"金山词霸"
			,"金庸听书"
			,"金拇指购"
			,"金立手机"
			,"金融界"
			,"金鹰美乐"
			,"鑫财通"
			,"钉钉"
			,"钓鱼-宝宝巴士"
			,"钓鱼发烧友"
			,"钓鱼看漂"
			,"钢琴块2"
			,"钢琴大师"
			,"钢琴教练"
			,"钢琴谱大全"
			,"钱大掌柜"
			,"钱来网"
			,"钱龙"
			,"铁友火车票"
			,"铁血军事"
			,"铁血网"
			,"铁路12306（官方）"
			,"铂涛会"
			,"铃声多多"
			,"铜板街"
			,"银信宝"
			,"银天下-黄金白银"
			,"银河玖乐"
			,"银河证券"
			,"银泰网"
			,"银联在线"
			,"银联手机支付（专业版）"
			,"链家"
			,"锁屏宝"
			,"锁屏精灵"
			,"锤子日历"
			,"锦江礼享"
			,"长江e号"
			,"长江云"
			,"闪传"
			,"闪兔漫画"
			,"问他作业"
			,"问医生"
			,"问道"
			,"闲鱼"
			,"闺蜜美妆"
			,"闽教英语"
			,"阅读星"
			,"阅读王"
			,"阳春特产"
			,"阴阳师"
			,"阿凡题"
			,"阿基米德FM"
			,"阿帕比阅读器"
			,"阿甘跑步"
			,"阿里小号"
			,"阿里巴巴"
			,"阿里旅行"
			,"阿里星球天天动听"
			,"阿里通网络电话"
			,"阿里钱盾"
			,"陆金所"
			,"陌陌"
			,"陕西头条"
			,"随e行"
			,"随便走"
			,"随手记"
			,"随身购"
			,"雅娜购"
			,"雅虎"
			,"雅虎天气"
			,"雅虎通"
			,"雅虎邮箱"
			,"雪球 - 炒股神器"
			,"零钱夺宝"
			,"雷电手机搜索"
			,"雷神之锤"
			,"雷霆战机-弹幕无双"
			,"青云志"
			,"青岛公交查询"
			,"青柠桌面"
			,"青番茄"
			,"青芒果酒店预订"
			,"靠垫"
			,"面包旅行"
			,"面对面"
			,"韩剧tv宝云"
			,"韩友赞"
			,"音乐雷达"
			,"音悦台"
			,"顶级素材网"
			,"顺丰优选"
			,"顺丰速运通"
			,"颜值"
			,"风云"
			,"风云直播"
			,"风水命理大师"
			,"风水罗盘实景"
			,"风行影视"
			,"飞信"
			,"飞常准"
			,"飞牛网"
			,"飞碟说"
			,"飞聊"
			,"飞芒精读"
			,"飞语"
			,"飞音电话"
			,"飞鸽传书"
			,"食神摇摇"
			,"食色·美食水印相机"
			,"饭否"
			,"饭统网"
			,"饼干背单词 Biscuit"
			,"饿了么"
			,"首都机场"
			,"香哈菜谱"
			,"香港巴士通"
			,"马来西亚航空MHmobile"
			,"马蹄运动"
			,"驱家新闻"
			,"驴妈妈旅游"
			,"驾校一点通"
			,"驾考宝典"
			,"骑士助手"
			,"高德地图"
			,"高职单招网"
			,"高能贩"
			,"高铁管家"
			,"魅拍"
			,"魅族"
			,"魔伴桌面"
			,"魔兽世界"
			,"魔力宝贝"
			,"魔力视频播放器"
			,"魔力镇"
			,"魔力高清影视"
			,"魔发相机"
			,"魔屏漫画"
			,"魔方格"
			,"魔漫相机-“送红包”"
			,"魔王听书"
			,"魔眼 (junaio)"
			,"魔秀壁纸"
			,"魔秀桌面"
			,"鱼说"
			,"鱼阅"
			,"鲁大师"
			,"鹰漠旅行"
			,"麒麟电话"
			,"麦乐购"
			,"麦包包"
			,"麦唱"
			,"麦当劳优惠券完美版"
			,"麦当劳麦乐送"
			,"麦考林"
			,"麻客菠萝"
			,"黄油相机"
			,"黎明之光"
			,"黑岩阅读"
			,"黑桃互动"
			,"齐家"
			,"齐鲁网"
			,"龙珠激斗"
			,"龙珠直播"
			,"龙赢天下"
			,"龙骑士"
			,"龙龙直播" };

}
