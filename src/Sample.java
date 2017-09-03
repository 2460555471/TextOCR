import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "9714862";
    public static final String API_KEY = "bbaZFtieshGoOBo6hGf0z5Vd";
    public static final String SECRET_KEY = "sy8GiBzU8xzcUPENEr4GvjQrQvbUhicv";

    public static void main(String[] args) 
    {
    	
        // 初始化一个OcrClient
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


//        // 调用通用识别接口
//        String genFilePath1 = "1.jpg";
//        JSONObject genRes1 = client.basicGeneral(genFilePath1, new HashMap<String, String>());
//        System.out.println(genRes1.toString(2));
//        
        String genFilePath = "C:/Users/hp/Desktop/1.jpg";
        JSONObject genRes = client.basicGeneral(genFilePath, new HashMap<String, String>());
        System.out.println(genRes.toString(2));
        


//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("detect_direction", "false");
//        options.put("language_type", "CHN_ENG");
//
//        // 参数为本地图片路径
//        String imagePath = "2.jpg";
//        JSONObject response = client.enhancedGeneral(imagePath, options);
//        System.out.println(response.toString());
//        
        // 调用通用识别（含位置信息）接口
//        String genFilePath = "1.jpg";
//        JSONObject genRes = client.general(genFilePath, new HashMap<String, String>());
//        System.out.println(genRes.toString(2));
//        String genFilePath2 = "2.jpg";
//        JSONObject genRes2 = client.general(genFilePath2, new HashMap<String, String>());
//        System.out.println(genRes2.toString(2));
        

    }
   
}