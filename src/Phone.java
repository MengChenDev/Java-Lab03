import java.util.ArrayList;
import java.util.List;

class Phone {
    private final String brand;
    private final String model;
    private String os;
    private int price;
    private final String memory;
    private final String storage;
    private final List<String> activeFeatures = new ArrayList<>();

    Phone(String brand, String model, String os, int price, String memory, String storage) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.price = price;
        this.memory = memory;
        this.storage = storage;
    }

    void displayInfo() {
        System.out.println("品牌: " + brand);
        System.out.println("型号: " + model);
        System.out.println("操作系统: " + os);
        System.out.println("价格: " + price);
        System.out.println("内存: " + memory);
        System.out.println("存储: " + storage);
    }

    void useFeature(String feature) {
        if (!activeFeatures.contains(feature)) {
            activeFeatures.add(feature);
            System.out.println("正在使用功能：" + feature);
        } else {
            System.out.println(feature + " 功能已在运行");
        }
    }

    void stopFeature(String feature) {
        if (activeFeatures.contains(feature)) {
            activeFeatures.remove(feature);
            System.out.println(feature + " 功能已退出");
        } else {
            System.out.println(feature + " 功能未在运行");
        }
    }

    void displayActiveFeatures() {
        if (activeFeatures.isEmpty()) {
            System.out.println("当前没有正在运行的功能");
        } else {
            System.out.println("当前正在运行的功能：");
            for (int i = 0; i < activeFeatures.size(); i++) {
                if (i > 0) {
                    System.out.print("、");
                }
                System.out.print(activeFeatures.get(i));
            }
            System.out.println();
        }
    }

    void call(String phoneNumber) {
        System.out.println("正在拨打电话至：" + phoneNumber);
    }
}