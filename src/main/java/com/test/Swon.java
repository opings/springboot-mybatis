package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/24.
 */
public class Swon {

    public static void main(String[] args) {
        // 插入3级渠道
/*        String str = "会员事业部,超级会员,超级会员项目=会员事业部,专享权益活动优惠券,会员等级活动=会员事业部,11月会员等级权益券,会员等级活动=会员事业部,19年01月会员等级权益,会员等级活动=会员事业部,会员权益专享,会员等级活动=会员事业部,8月会员等级权益,会员等级活动=会员事业部,10月会员等级权益券,会员等级活动=会员事业部,11月会员等级权益券,会员等级活动=会员事业部,专享权益活动优惠券,会员等级活动=会员事业部,360优惠券,会员等级活动=会员事业部,分享有礼,会员等级活动=会员事业部,注册周年,会员等级活动=会员事业部,APP新手礼包,老带新=会员事业部,PC新手礼包,老带新=会员事业部,推荐有礼,老带新=会员事业部,异业合作,异业拉新=会员事业部,江苏移动有价会员,异业拉新=会员事业部,电信驴粉卡2017,异业拉新=会员事业部,品牌会员-李欧頔,异业拉新=会员事业部,湖北电信特惠,异业拉新=会员事业部,异业合作,异业拉新=会员事业部,通用,异业拉新=会员事业部,陆金所企业合作,异业拉新=会员事业部,元宝亿家无门槛优惠券采购,异业拉新=会员事业部,大都会专题,异业拉新=会员事业部,晨光文具樱花季联合活动,异业拉新=会员事业部,异业渠道一季度,异业拉新=会员事业部,国米2018,异业拉新=会员事业部,伯乔2018,异业拉新=会员事业部,异业合作,异业拉新=会员事业部,苏宁818会员日,异业拉新=会员事业部,江苏移动,异业回收=会员事业部,伯乔2018,异业回收=平台运营中心,19年02月会员等级权益,会员等级活动=市场品牌中心,王皓-新东方,异业回收=市场品牌中心,王鑫半年项,异业拉新=市场品牌中心,白凰常规异业优惠券,异业拉新=网站运营中心,过期奖金转优惠券,会员等级活动=会员事业部,320异业,异业拉新=会员事业部,mcake蛋糕,异业拉新=会员事业部,巴黎春天,异业拉新=会员事业部,宝象金融,异业拉新=会员事业部,兑吧,异业拉新=会员事业部,返利网,异业拉新=会员事业部,菲仕兰,异业拉新=会员事业部,红星美凯龙,异业拉新=会员事业部,交通银行,异业拉新=会员事业部,克兰钻石,异业拉新=会员事业部,克莉丝汀,异业拉新=会员事业部,奶酪lolla lolla 2018,异业拉新=会员事业部,品牌会员权益,异业拉新=会员事业部,平安车险,异业拉新=会员事业部,企业会员权益,异业拉新=会员事业部,企业员工福利,异业拉新=会员事业部,雀巢五羊异业,异业拉新=会员事业部,上海电信飞young 2017,异业拉新=会员事业部,养乐多2017,异业拉新=会员事业部,养乐多2018,异业拉新=会员事业部,永乐票务,异业拉新=会员事业部,浙江电信,异业拉新=会员事业部,浙江移动掌厅,异业拉新=会员事业部,12月上海冬季婚博会,异业拉新=会员事业部,2018年文惠卡,异业拉新=会员事业部,519丰盛股东大会奖品优惠券,异业拉新=会员事业部,KFC,异业拉新=会员事业部,VIP JR,异业拉新=会员事业部,vipjr,异业拉新=会员事业部,安吉星,异业拉新=会员事业部,棒棒贝贝教育,异业拉新=会员事业部,贝思客拉新,异业拉新=会员事业部,伯乔金融信息,异业拉新=会员事业部,大区统筹华东组,异业拉新=会员事业部,滴滴江苏,异业拉新=会员事业部,兑吧,异业拉新=会员事业部,二十一世纪校园电影院线,异业拉新=会员事业部,返利网,异业拉新=会员事业部,飞凡2017,异业拉新=会员事业部,飞驴,异业拉新=会员事业部,分众传媒,异业拉新=会员事业部,广州银行2017,异业拉新=会员事业部,国庆红包,异业拉新=会员事业部,好奇星球折纸卡,异业拉新=会员事业部,和顺公益,异业拉新=会员事业部,花集,异业拉新=会员事业部,华东好乐迪-10月,异业拉新=会员事业部,会员拉新,异业拉新=会员事业部,迦宜商务咨询,异业拉新=会员事业部,江苏电信公众号红包,异业拉新=会员事业部,江苏苏宁球迷卡,异业拉新=会员事业部,交通银行APP,异业拉新=会员事业部,金恪集团,异业拉新=会员事业部,酒店扫码GO-华东,异业拉新=会员事业部,酒店扫码GO-华南,异业拉新=会员事业部,来伊份2017.3,异业拉新=会员事业部,来伊份2017.3月份,异业拉新=会员事业部,来伊份-统筹部,异业拉新=会员事业部,码上游2017,异业拉新=会员事业部,麦田摄影,异业拉新=会员事业部,蜜芽,异业拉新=会员事业部,民生银行,异业拉新=会员事业部,南京移动校园迎新社,异业拉新=会员事业部,品牌会员权益,异业拉新=会员事业部,平安银行,异业拉新=会员事业部,企业会员权益,异业拉新=会员事业部,企业拉新,异业拉新=会员事业部,企业员工福利,异业拉新=会员事业部,如家&首旅,异业拉新=会员事业部,扫码购复购7月,异业拉新=会员事业部,上海电信,异业拉新=会员事业部,社区地推-华东-Q3,异业拉新=会员事业部,深圳佳兆业足球俱乐部球迷卡,异业拉新=会员事业部,十一城国内试点专题（8月）,异业拉新=会员事业部,暑期大促,异业拉新=会员事业部,万达飞凡,异业拉新=会员事业部,万益通,异业拉新=会员事业部,温泉季红包,异业拉新=会员事业部,无锡移动,异业拉新=会员事业部,武汉卓尔球迷卡,异业拉新=会员事业部,小鸣单车,异业拉新=会员事业部,写字楼地推12月-华北区,异业拉新=会员事业部,写字楼地推12月-华东区,异业拉新=会员事业部,写字楼地推12月-华南区,异业拉新=会员事业部,写字楼地推12月-西南区,异业拉新=会员事业部,写字楼地推8月华东,异业拉新=会员事业部,写字楼地推8月华中,异业拉新=会员事业部,写字楼地推9月-华北,异业拉新=会员事业部,写字楼地推9月华东,异业拉新=会员事业部,写字楼地推9月-华南,异业拉新=会员事业部,写字楼地推9月西南,异业拉新=会员事业部,写字楼地推9月-西南,异业拉新=会员事业部,写字楼地推华中,异业拉新=会员事业部,音米眼镜,异业拉新=会员事业部,永乐票务,异业拉新=会员事业部,优拜单车,异业拉新=会员事业部,企业会员权益,异业拉新=会员事业部,企业员工福利,异业拉新=会员事业部,微信公众号2017,异业拉新=会员事业部,企业会员权益,异业拉新=会员事业部,企业员工福利,异业拉新=会员事业部,武汉暑期特卖会,异业拉新=会员事业部,异业合作-陈文峙,异业拉新=会员事业部,北京现代,异业拉新=会员事业部,企业员工福利,异业拉新=会员事业部,大都会国庆活动,异业拉新=会员事业部,大都会中秋活动,异业拉新=会员事业部,异业合作,异业拉新=会员事业部,139邮箱2018,异业拉新=会员事业部,139邮箱合作,异业拉新=会员事业部,电信欢GO双十一,异业拉新=会员事业部,江苏移动企业合作,异业拉新=会员事业部,2018驴悦亲子联票,异业拉新=会员事业部,电信欢go2018,异业拉新=会员事业部,金宝贝,异业拉新=会员事业部,廊下亲子,异业拉新=会员事业部,联享家,异业拉新=会员事业部,亲子类异业合作渠道2018,异业拉新=会员事业部,屈臣氏2018,异业拉新=会员事业部,上海书展,异业拉新=会员事业部,上海顺丰2018,异业拉新=会员事业部,上海移动2018,异业拉新=会员事业部,苏宁易购,异业拉新=会员事业部,侠侣亲子,异业拉新=市场品牌中心,白凰 常规合作,异业拉新=市场品牌中心,弘康保险承担,异业拉新=市场品牌中心,王皓-半年项,异业拉新=市场品牌中心,章孟微-半年项,异业拉新=";
        String[] split = str.split(",");


        for (String s : split) {
            System.out.println("insert into LVMAMA_PET.MARK_CHANNEL(channel_id, channel_name, channel_code, create_time, father_id, valid, layer, channel_comment, range, profit_sharing, application_type, update_time)\n" +
                    "\tvalues (MARK_CHANNEL_SEQ.nextval, '" + s + "', MARK_CHANNEL_SEQ.nextval, SYSDATE, 332307, 'Y', 3, '', 'INNER', 'false', '', SYSDATE);\t");
        }*/
        // 修复3级渠道
/*
//        String str1 = "332354,332355,332356,332357,332358,332359,332360,332361,332362,332363,332364,332365,332366,332367,332368,332369,332370,332371,332372,332373,332374,332375,332376,332377,332378,332379,332380,332381,332382,332383,332384,332385,332386,332387,332388,332390,332392,332393,332394,332395,332396,332397,332398,332399,332400,332401,332402,332403,332404,332405,332406,332407,332408,332409,332410,332411,332412,332413,332414,332415,332416,332418,332420,332422,332423,332424,332425,332426,332427,332428,332429,332430,332431,332432,332433,332434,332435,332436,332437,332438,332439,332440,332441,332442,332443,332444,332445,332446,332447,332449,332452,332455,332456,332457,332459,332460,332462,332463,332464,332465,332466,332467,332468,332469,332470,332471,332472,332473,332474,332475,332476,332477";
        String str1 = "329857,329984,329520,329519";
        String[] split = str1.split(",");
        for (String s : split) {
            System.out.println("update LVMAMA_PET.MARK_CHANNEL set range = '', profit_sharing = 'true', application_type = 'coupon' where channel_id =" + s + ";");
//            System.out.println("update LVMAMA_PET.MARK_CHANNEL set range = '', profit_sharing = 'true', application_type = 'coupon' where channel_id =\n (" +
//                    "SELECT channel_id  FROM LVMAMA_PET.MARK_CHANNEL where layer = 3  and father_id = 332304 and channel_name = '" + s + "');");
//            System.out.println("delete from LVMAMA_PET.MARK_CHANNEL where channel_id = " + s + ";");
        }*/
        // 旧3级渠道id=新3级渠道id
        Map<String, String> stringStringHashMap = new HashMap<>();
        String strb = "317515=332238,325492=332312,325488=332313,327774=332314,120252=332315,320098=332316,323893=332317,325487=332313,325491=332312,321891=332318,312279=332346,226388=332319,314274=332320,314275=332321,223174=332322,305135=332323,309605=332325,273672=332326,307710=332327,304116=332328,309419=332323,309392=332329,319432=332330,322452=332331,322007=332332,323568=332333,327043=332334,322675=332335,327282=332336,319393=332323,318275=332337,223107=332338,327282=332339,330263=332340,329781=332341,329340=332342,329698=332343,46612=332344,303795=332354,244397=332355,311951=332356,235326=332357,236651=332358,243050=332359,309277=332360,240787=332361,240748=332362,241674=332363,308433=332364,304115=332365,307566=332366,262119=332367,270371=332368,244502=332369,306915=332370,273683=332371,277013=332372,301478=332373,233137=332374,254326=332375,244193=332376,271694=332377,309582=332378,225684=332379,220385=332380,136353=332381,220465=332382,241339=332383,235839=332384,226498=332385,180476=332386,220480=332387,216974=332388,139156=332358,219154=332390,237768=332359,139138=332392,238475=332393,222754=332394,229286=332395,244402=332396,239438=332397,225179=332398,219167=332399,254794=332400,135160=332401,231208=332402,255013=332403,222935=332404,221612=332405,230143=332406,241762=332407,254993=332408,136352=332409,137087=332410,232232=332411,137060=332412,226378=332413,222246=332414,238326=332415,236897=332416,306742=332366,225138=332418,233639=332368,227102=332420,225494=332369,137375=332422,236805=332423,234891=332424,244194=332425,222931=332426,239084=332427,238476=332428,231256=332429,235459=332430,261154=332431,239435=332432,222922=332433,220643=332434,272690=332435,272689=332436,272692=332437,272691=332438,238546=332439,242748=332440,253188=332441,244138=332442,253191=332443,252781=332444,253192=332445,244370=332446,220572=332447,222874=332374,220490=332449,270382=332368,244504=332369,237986=332452,270387=332368,244503=332369,236760=332455,312285=332456,233006=332457,244506=332369,322457=332459,322006=332460,319928=332323,320962=332462,320126=332463,324081=332464,319355=332465,316763=332466,318207=332467,316337=332468,316939=332469,315211=332470,319366=332471,316353=332472,316937=332473,319282=332474,319365=332475,317478=332476,316938=332477,329857=329857,329984=329984,329520=329520,329519=329519,135536=332499,220666=332500,220669=332501,232072=332502,253027=332503,253093=332504,309385=332505,309390=332506,312067=332507,313743=332508,314067=332509,";
        String[] splitb = strb.split(",");
        for (String s : splitb) {
            String[] split1 = s.split("=");
            String olda = split1[0];
            String newa = split1[1];
            stringStringHashMap.put(olda, newa);
        }

        // 优惠券批次号=渠道
        String stra = "5844=46612,5845=46612,5846=46612,10361=135160,10434=135536,10458=136352,10459=136353,10482=137060,10483=137087,10509=137375,10510=137375,10511=137375,10512=137375,10513=137087,10514=137087,10515=137087,10528=139138,10529=139138,10530=139138,10531=139156,10532=139156,10533=139156,10534=139156,10540=180476,10541=180476,10542=216974,10543=216974,10544=216974,10545=216974,10546=216974,10547=216974,10548=216974,10549=216974,10550=216974,10551=216974,10552=216974,10553=216974,10554=216974,10555=216974,10556=216974,10557=216974,10558=216974,10560=180476,10601=219154,10602=219167,10607=220211,10608=220211,10609=220211,10610=220385,10611=220385,10612=220385,10613=220385,10623=220465,10624=220480,10625=220490,10627=220465,10628=220572,10629=220572,10641=220643,10642=220666,10643=220669,10649=221612,10654=222246,10655=222246,10656=222246,10664=139156,10665=139156,10666=222754,10673=222874,10682=222922,10683=222931,10684=222935,10685=223107,10686=223107,10687=223107,10688=223107,10690=137060,10749=225138,10751=221612,10752=225138,10753=225179,10760=225494,10761=225494,10762=225494,10763=225494,10767=221612,10768=225684,10787=226378,10788=226378,10789=226378,10792=226388,10797=226388,10799=226498,10842=227102,10882=229286,10901=230143,10902=230143,10948=231208,10949=231208,10950=231256,10962=232072,10964=232232,10965=232232,10966=232232,10979=233006,10980=233006,10981=233006,10982=233006,10983=233006,10984=233006,10985=233006,10986=233006,10987=233006,10988=233137,10989=233137,10991=233006,10992=233006,10997=232232,11004=233639,11005=233639,11006=233639,11007=233639,11008=233639,11009=233639,11013=223174,11030=234891,11031=234891,11032=234891,11033=234891,11034=234891,11035=234891,11036=234891,11037=234891,11038=234891,11051=235326,11052=235326,11053=234891,11054=234891,11055=235459,11072=234891,11073=234891,11074=234891,11075=234891,11076=234891,11077=234891,11078=234891,11080=235839,11081=235839,11092=236651,11093=236651,11094=236651,11096=236760,11097=236805,11098=236805,11099=236805,11100=236805,11101=236805,11102=236805,11103=236805,11104=236805,11105=236805,11106=236805,11107=236897,11108=236897,11109=236897,11110=236897,11111=236897,11112=237768,11156=237986,11157=237986,11158=237986,11159=237986,11160=237986,11172=235459,11174=238326,11175=238326,11178=238475,11179=238476,11180=238476,11181=238476,11182=238475,11183=236805,11184=236805,11185=238546,11186=238546,11188=239084,11189=237768,11190=237768,11191=237768,11192=225138,11193=225138,11194=225138,11195=225138,11196=225138,11199=239435,11200=239435,11201=239435,11202=239435,11203=239435,11204=239435,11205=239435,11206=239435,11207=239438,11208=239438,11209=239438,11210=238546,11211=238546,11212=239584,11226=240748,11232=240787,11233=240787,11234=240787,11235=240787,11248=241339,11249=241339,11250=241339,11251=241339,11252=241339,11253=241339,11254=241674,11259=241762,11268=242748,11269=242748,11273=238475,11274=238475,11315=243050,11316=243050,11319=236760,11324=244138,11325=244138,11326=244138,11327=244138,11328=244138,11329=244138,11330=244138,11331=244138,11332=244138,11333=244138,11341=244193,11342=244193,11343=244193,11344=244194,11351=244370,11352=244370,11353=244397,11355=244402,11356=244402,11357=244402,11358=244502,11360=244503,11361=244504,11362=244506,11363=244502,11365=244503,11366=244504,11367=244506,11368=244502,11370=244503,11371=244504,11372=244506,11373=244502,11375=244503,11376=244504,11377=244506,11378=244502,11380=244503,11381=244504,11382=244506,11383=244502,11385=244503,11386=244504,11387=244506,11388=244502,11390=244503,11391=244504,11392=244506,11411=252781,11412=252781,11413=252781,11414=252781,11415=253027,11416=253027,11417=253093,11418=253093,11419=253093,11429=244138,11430=244370,11431=253188,11432=253191,11433=253192,11434=244138,11435=244370,11436=253188,11437=253191,11438=253192,11448=254326,11458=254794,11459=254794,11460=254794,11461=254993,11462=255013,11524=261154,11525=261154,11526=261154,11571=233639,11589=262119,11590=262119,11591=262119,11592=262119,11593=262119,11615=233639,11624=270371,11625=270382,11628=270387,11629=270371,11630=270382,11632=270387,11634=238475,11640=270371,11641=270371,11642=270371,11643=270371,11644=270371,11645=270371,11646=270371,11647=270371,11648=270371,11649=270371,11654=271694,11655=271694,11656=271694,11657=271694,11659=271695,11660=271695,11661=271695,11662=271695,11663=271695,11665=271695,11695=272689,11696=272690,11697=272690,11698=272691,11699=272692,11700=272689,11701=272690,11702=272691,11703=272692,11720=273672,11721=273672,11722=273672,11723=273672,11724=273683,11725=273683,11726=273683,11751=271694,11752=271694,11753=271694,11754=271694,11769=271694,11770=274922,11780=270371,11781=270382,11784=270387,11849=277013,11850=277013,11898=294602,12029=301478,12030=301478,12061=270371,12090=301622,12123=270371,12124=303795,12125=303795,12126=303795,12132=270371,12158=270371,12159=304116,12160=304115,12161=304115,12162=304115,12163=304115,12164=304115,12165=270371,12185=305135,12214=306742,12215=306742,12216=306742,12217=306742,12218=306742,12219=306742,12220=306915,12221=306915,12222=306915,12223=306915,12224=306915,12247=307566,12248=305135,12249=305135,12250=305135,12251=305135,12252=305135,12256=307710,12257=307710,12259=307710,12261=307710,12262=307710,12267=308433,12268=308433,12269=308433,12311=309277,12312=309277,12314=309385,12315=309385,12316=309385,12317=309385,12318=309385,12319=309385,12320=309385,12321=309385,12322=309385,12323=309385,12324=309390,12325=309390,12326=309390,12327=309390,12328=309390,12329=309390,12330=309391,12331=309391,12332=309391,12333=309391,12334=309391,12335=309392,12336=309392,12337=309392,12340=309419,12341=309419,12367=309582,12368=305135,12369=305135,12370=305135,12371=305135,12372=305135,12373=305135,12374=305135,12377=309605,12389=305135,12390=305135,12391=305135,12397=223174,12406=311951,12411=312179,12412=312067,12413=312067,12414=312067,12415=312067,12416=312067,12417=312067,12418=312067,12419=312067,12428=312279,12429=312279,12431=312279,12434=312279,12435=312280,12436=312285,12437=312285,12438=312285,12439=312285,12440=312285,12445=304116,12446=304116,12463=312288,12464=312288,12472=303518,12528=313743,12529=313743,12530=313743,12531=313743,12532=313743,12538=314067,12539=314067,12540=314067,12541=314067,12542=314067,12543=314067,12544=314067,12546=314070,12547=314070,12548=314274,12549=314274,12550=314274,12551=314274,12552=314274,12553=314274,12555=314274,12556=314274,12557=314274,12558=314274,12559=314274,12560=314274,12561=314274,12562=314275,12563=314275,12564=314275,12565=314275,12566=314275,12567=314275,12579=312288,12622=315211,12638=316337,12639=316353,12640=316353,12641=316353,12642=316353,12643=316353,12644=316353,12663=316763,12665=316937,12666=316938,12667=316939,12674=317425,12679=317515,12680=317515,12681=317515,12682=317515,12683=317515,12685=317478,12691=317478,12692=318207,12693=318207,12694=318207,12695=317478,12696=317478,12697=317478,12698=318275,12699=318275,12700=318275,12701=318275,12702=318275,12703=318275,12704=318275,12705=318275,12735=319355,12736=319355,12737=319355,12738=319355,12739=319355,12740=319355,12741=319282,12742=319365,12743=319366,12747=319393,12748=319393,12749=319393,12750=319393,12751=319393,12752=319393,12753=319393,12754=319393,12755=319393,12756=319393,12757=319393,12758=319393,12759=319393,12769=319432,12770=319432,12771=319432,12772=319432,12773=319432,12774=319432,12788=319542,12789=319542,12792=317515,12793=317515,12794=317515,12795=317515,12804=319928,12805=319928,12806=319928,12807=319928,12808=319928,12809=319928,12810=319928,12825=320098,12826=320126,12827=320126,12828=320126,12829=320126,12834=320126,12835=320126,12836=320126,12837=320126,12838=320126,12846=320962,12847=320962,12848=320962,12849=320962,12858=320975,12859=320975,12861=320975,12915=321891,12923=321937,12926=322007,12927=322007,12928=322007,12929=322007,12930=322006,12931=322006,12932=322006,12933=322006,12934=322006,12940=322048,12942=322048,12949=322136,12961=322452,12962=322457,12963=322457,12964=322457,12965=322457,12971=322675,12972=322675,12973=322675,12985=323497,12988=323568,12989=323568,12990=323568,12991=323568,12992=323568,12993=323568,12994=323568,13000=323585,13010=320835,13018=323893,13024=324000,13026=324000,13028=324000,13029=324000,13036=324081,13037=324081,13038=324081,13039=324081,13040=324081,13041=324081,13047=320835,13060=324342,13062=324342,13063=324342,13079=320835,13092=324885,13093=324885,13094=324885,13095=324885,13098=324148,13099=324148,13100=324148,13101=324148,13107=325487,13108=325487,13109=325488,13114=325487,13116=325487,13117=325487,13118=325487,13119=325491,13121=325492,13122=325492,13124=325491,13125=325491,13126=325491,13127=325491,13128=325491,13129=325491,13130=325539,13131=320835,13132=320835,13133=320835,13155=325745,13156=325745,13157=325745,13158=120252,13162=325745,13203=325896,13204=325896,13205=325896,13206=325896,13207=325896,13208=325896,13209=325896,13210=325896,13211=325896,13212=325896,13213=325896,13214=324148,13215=320835,13217=320835,13218=320835,13228=326273,13236=320835,13237=326629,13242=327043,13243=327043,13244=327043,13245=327043,13246=327043,13247=327043,13249=327282,13250=327282,13251=327282,13253=327401,13254=327401,13255=327401,13257=327401,13258=120252,13260=120252,13261=327401,13263=120252,13264=120252,13271=325896,13273=327452,13274=320835,13275=320835,13284=327774,13285=327774,13286=327774,13287=327774,13288=327774,13289=327774,13290=327774,13291=327774,13292=327774,13293=320835,13294=320835,13295=320835,13296=320835,13301=328831,13302=328831,13303=328831,13304=328831,13305=328831,13306=328831,13307=328831,13308=328831,13309=328831,13310=328831,13311=328831,13312=328831,13318=329201,13320=329215,13321=329215,13322=329215,13323=329215,13324=329215,13325=329215,13326=329215,13327=329215,13328=329215,13329=329215,13330=329215,13331=329215,13335=329215,13336=329215,13337=329215,13338=329215,13357=329215,13358=329215,13359=329215,13361=329215,13366=328814,13367=328814,13368=328814,13369=328814,13370=328814,13371=328814,13372=329340,13373=329340,13374=329340,13375=329340,13376=329340,13377=329340,13378=329340,13379=329340,13380=329340,13381=329340,13382=329340,13383=329340,13384=329340,13385=329340,13386=329340,13387=329340,13388=329340,13389=329519,13390=329520,13391=329519,13392=329520,13393=329519,13394=329520,13395=329519,13396=329520,13397=329519,13398=329520,13399=329519,13400=329520,13401=329519,13402=329520,13403=329519,13404=329520,13405=329698,13406=329698,13407=329698,13408=329698,13409=329698,13410=329698,13411=329781,13412=329828,13413=329828,13414=329828,13416=329828,13419=329828,13423=329857,13424=329857,13425=329857,13426=329984,13427=329984,13428=329984,13429=328814,13430=328814,13431=328814,13432=328814,13433=328814,13434=330263,13435=330263,13436=330263,13437=330263,13438=330263,13439=330263,13440=330263,13441=330263,13442=330263,13444=330296,13445=330296,13446=330296,13447=330296,13448=330296,13449=329857,13450=329857";
        String[] split = stra.split(",");
        for (String s : split) {
            String[] split1 = s.split("=");
            String couponId = split1[0];
            String channelId = split1[1];

            String s1 = stringStringHashMap.get(channelId);
            if (s1 != null) {
                System.out.println(couponId);
//                System.out.println("UPDATE lvmama_coupon.mark_coupon SET channel_id = " + s1 +" where coupon_id=" + couponId + ";");
            } else {
//                System.out.println("couponId:" + couponId +"   channelId:" + channelId);
            }


        }






    }




}
