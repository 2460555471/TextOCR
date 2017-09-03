import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

public class Sample {
    //����APPID/AK/SK
    public static final String APP_ID = "9714862";
    public static final String API_KEY = "bbaZFtieshGoOBo6hGf0z5Vd";
    public static final String SECRET_KEY = "sy8GiBzU8xzcUPENEr4GvjQrQvbUhicv";

    public static void main(String[] args) 
    {
    	
        // ��ʼ��һ��OcrClient
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // ��ѡ�������������Ӳ���
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


//        // ����ͨ��ʶ��ӿ�
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
//        // ����Ϊ����ͼƬ·��
//        String imagePath = "2.jpg";
//        JSONObject response = client.enhancedGeneral(imagePath, options);
//        System.out.println(response.toString());
//        
        // ����ͨ��ʶ�𣨺�λ����Ϣ���ӿ�
//        String genFilePath = "1.jpg";
//        JSONObject genRes = client.general(genFilePath, new HashMap<String, String>());
//        System.out.println(genRes.toString(2));
//        String genFilePath2 = "2.jpg";
//        JSONObject genRes2 = client.general(genFilePath2, new HashMap<String, String>());
//        System.out.println(genRes2.toString(2));
        

    }
   
}