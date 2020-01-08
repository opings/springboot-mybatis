package com.test;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/30.
 */
public class HttpUtil {

    private static String POST = "POST";
    private static String GET = "GET";
    private static String CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded";
    private static String CONTENT_TYPE_JSON = "application/json";

    private static String httpRequest(String method, String contentType, String urlStr, HashMap<String,String> paras)
            throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Cookie", "JSESSIONID=6229DE9A58F9B10A75DD6759ED76AC17; _ga=GA1.2.2090614751.1536908839; _qzja=1.957142864.1537239113453.1537239113453.1537239113453.1537239113453.1537239113453.0.0.0.1.1; BSFIT_OkLJUJ=FFHx1TslVFYqdSIWGyWK4rnip22DSF5D; fingerprint=044afc08325f338efd15ec0e4e815856; cto_lwid=95cc19c7-d217-416d-9fe3-6b1a1f5bb1cc; _gscu_1059159971=37941883utbajh18; MY_SPACE_READ_IS_TRUE_f2d0c29a1ea13071011ea19a98cb0574=true; MY_SPACE_READ_IS_TRUE_ff808081361daa3101362eeb682d3033=true; MY_SPACE_READ_IS_TRUE_ff8080811fe782c4011fead422310454=true; fp_ver=4.5.2; MY_SPACE_READ_IS_TRUE_2c9486e665c944200165e67b1da7558c=true; CoreID6=86689084534315380293922&ci=52710000|PC_52710000|SEM_52710000|WAP_52710000|JQWL_52710000|TM; MY_SPACE_READ_IS_TRUE_f2d0c2991d489701011d4cd9738101aa=true; BDCCOOKIEID=yhKSCBSn3828587262; _ip_city_place_id=310000; _ip_province_place_id=310000; _ip_city_name=%E4%B8%8A%E6%B5%B7; ip_city_place_id=310000; ip_province_place_id=310000; ip_city_name=%25E4%25B8%258A%25E6%25B5%25B7; oIC=071326071326; oIT=01190119; uid=wKgAeVxxLX6FES20A5ChAg==; _gid=GA1.2.1743741327.1551757802; BSFIT_EXPIRATION=1552615926136; BSFIT_DEVICEID=CLbFdO8Hb9oxhMWtKVLp9b2FFreKtKQ8VsMfgamOscxPVnysoxKcv0-sb4Pn-BlpAWhvMN4Rp_r18Xz4GSJQLiI3eiiV0egJu62V_wBC9Jtc7V9yiKIQE4Z2FehNzxaz8A1wKGqxMo5fdvEWxgFr9m-HB0FU76Hm; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%221694bf9bff229a-06dd3cc685f654-551f3c12-2073600-1694bf9bff31f7%22%2C%22%24device_id%22%3A%221694bf9bff229a-06dd3cc685f654-551f3c12-2073600-1694bf9bff31f7%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_referrer%22%3A%22%22%2C%22%24latest_referrer_host%22%3A%22%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%7D%7D; _jzqx=1.1550029641.1551764636.4.jzqsr=super%2Elvmama%2Ecom|jzqct=/vst_order/order/ordermanage/showorderstatusmanage%2Edo.jzqsr=lvmama%2Ecom|jzqct=/; lvsessionid=c83a8b87-95c0-4a20-8f3d-8e8d1c09c6cc_19097028; _cookie_ip=116.236.89.90; BDCSESSIONID=BxYspMeMwJt1551843670463; _jzqc=1; ticket=ST-20250-MsB1m1taHY1nOE64aJ3i; EMV=U; __xsptplus443=443.6.1551843676.1551843746.2%234%7C%7C%7C%7C%7C%23%232Vk0FTWBYmFYyewGDhJ1MYSt6y_TIOQG%23; _jzqa=1.381809574390731900.1551856954.1551856954.1551856954.1; _jzqckmp=1; Hm_lvt_cb09ebb4692b521604e77f4bf0a61013=1551423503,1551843670,1551856954; _pzfxuvpc=1551856953856%7C5762179564136830779%7C5%7C1551857897358%7C1%7C%7C2590469050152326589; Hm_lpvt_cb09ebb4692b521604e77f4bf0a61013=1551857897");
        if(paras != null && !paras.isEmpty()){
            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(ParameterStringBuilder.getParamsString(paras));
            out.flush();
            out.close();
        }


        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        return content.toString();
    }

    private static class ParameterStringBuilder {
        public static String getParamsString(Map<String, String> params)
                throws UnsupportedEncodingException {
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            String resultString = result.toString();
            return resultString.length() > 0
                    ? resultString.substring(0, resultString.length() - 1)
                    : resultString;
        }
    }


    public static String httpGetRequest(String url){
        try {
            return httpRequest(GET, CONTENT_TYPE_URLENCODED, url, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String httpPostRequest(String url, HashMap<String,String> paras){
        try {
            return httpRequest(POST, CONTENT_TYPE_URLENCODED, url, paras);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 产品  templateId：138 templateSqlId：622和626    商品   templateId: 129  templateSqlId: 545
     * @param args
     */
    public static void main(String[] args) {
//        String str = "100028459,100029111,100028142,100028141,100000822,100028180,100000825,100000829,100029422,100028951,100000821,100000820,100000819,100000826,100029425,100029478,100000817,100013816,100000818,100029601,100029649,100030004,100028794,100011418,100028789,100011424,100011422,100011423,100011421,100011419,100028810,100028811,100028812,100028813,100028814,100028815,100028816,100028818,100028819,100028820,100028821,100029381,100029382,100029383,100029384,100029385,100029386,100029387,100029388,100029389,100029390,100029391,100029392,100029393,100029394,100029395,100029396,100028658,100016358,100016534,100016385,100014056,100028676,100002367,100000863,100000850,100011496,100000736,100000735,100000697,100015848,100016666,100010283,100013833,100013834,100029571,100034855,100010272,100011398,100000747,100000677,100000739,100011503,100034847,100027766,100011325,100002345,100002351,100034812,100034942,100034943,100034844,100034845,100034786,100028460,100028515,100028399,100028461,100028525,100028039,100028534,100029027,100028405,100028455,100028416,100028642,100029039,100029101,100029346,100029373,100028701,100028700,100028790,100028873,100029510,100029524,100029530,100029544,100029556,100029599,100029598,100029606,100029624,100029982,100029983,100029985,100030002,100030007,100034689,100034729,100034727,100034736,100034739,100034756,100034805,100034807,100034799,100034878,100034879,100034915,100034893,100027443,100029045,100029059,100030041,100034630,100034642,100029321,100029350,100029402,";
//        String[] split = str.split(",");
//        for (String s : split) {
////            HashMap<String, String> map = new HashMap<>();
////            map.put("templateId", "129");
////            map.put("templateSqlId", "545");
////            map.put("testSourceId", s);
////            map.put("testFieldOne", "");
////            map.put("testFieldTwo", "");
////            map.put("testFieldThree", "");
////            String result = httpPostRequest("http://super.lvmama.com/sync-web/sync/testSyncTemplateSql.do", map);
////            System.out.println(s + "---" + result);
//
//            HashMap<String, String> map1 = new HashMap<>();
//            map1.put("templateId", "138");
//            map1.put("templateSqlId", " 626");
//            map1.put("testSourceId", s);
//            map1.put("testFieldOne", "");
//            map1.put("testFieldTwo", "");
//            map1.put("testFieldThree", "");
//            String result1 = httpPostRequest("http://super.lvmama.com/sync-web/sync/testSyncTemplateSql.do", map1);
//            System.out.println(s + "---" + result1);
//        }


//        for (long i = 0; i < 550; i++) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("id", "4");
            String result1 = httpPostRequest("http://super.lvmama.com/coupon/v1/coupon/blackRoom/deleteById", map1);
        System.out.println(result1);
//        }


    }

}
