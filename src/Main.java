public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Apple", "iPhone 16 Pro Max", "iOS 18", 13999, "8GB", "1TB");
        iPhone.displayInfo();
        iPhone.call("爷爷的手机号");
        iPhone.useFeature("相机");
        iPhone.useFeature("微信");
        iPhone.useFeature("Face Time");
        iPhone.displayActiveFeatures();
        iPhone.stopFeature("Face Time");
        iPhone.displayActiveFeatures();
        System.out.println("===================================");
        Phone huaWei = new Phone("HUAWEI", "Mate 70 Pro", "Harmony OS 4", 7999, "12GB", "512GB");
        huaWei.displayInfo();
        iPhone.call("奶奶的手机号");
        huaWei.useFeature("抖音");
        huaWei.useFeature("微信");
        huaWei.useFeature("QQ");
        huaWei.displayActiveFeatures();
        huaWei.stopFeature("抖音");
        huaWei.displayActiveFeatures();
        System.out.println("===================================");
        Phone xiaoMi = new Phone("Xiaomi", "15 Ultra", "Hyper OS 2", 7799, "16GB", "1TB");
        xiaoMi.displayInfo();
        iPhone.call("爸爸的手机号");
        xiaoMi.useFeature("飞书");
        xiaoMi.useFeature("哔哩哔哩");
        xiaoMi.useFeature("网易云音乐");
        xiaoMi.displayActiveFeatures();
        xiaoMi.stopFeature("飞书");
        xiaoMi.displayActiveFeatures();
    }
}