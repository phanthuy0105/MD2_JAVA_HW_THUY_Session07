package ra.practice03_session06.entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Categories {
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Categories() {
    }

    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData(Scanner scanner, Categories[] arrCategories, int index) {
        // Mã danh mục
        this.catalogId = generateIdIdentity(arrCategories, index);
        // Tên danh mục: không trùng lặp, 50 ký tự
        this.catalogName = inputCatalogName(scanner, arrCategories, index);
        // Mô tả danh mục
        this.descriptions = inputDescriptions(scanner);
        // Trạng thái danh mục
        this.catalogStatus = inputCatalogStatus(scanner);
    }

    public int generateIdIdentity(Categories[] arrCategories, int index) {
        if (index == 0) {
            return 1;
        } else {
            //1. Tìm mã lớn nhất
            int max = arrCategories[0].getCatalogId();
            for (int i = 1; i < index; i++) {
                if (max < arrCategories[i].getCatalogId()) {
                    max = arrCategories[i].getCatalogId();
                }
            }
            return max + 1;
        }
    }

    public String inputCatalogName(Scanner scanner, Categories[] arrCategories, int index) {
        //Validate dữ liệu tên danh: không trùng lặp, gồm 50 ký tự
        System.out.println("Nhập vào tên sách: ");
        String catalogName;
        do {
            catalogName = scanner.nextLine();
            //Kiểm tra duy nhất
            boolean isExist = false;
            for (int i = 0; i < index; i++) {
                if (arrCategories[index].getCatalogName().equals(catalogName)) {
                    isExist = true;
                    break;
                }
            }
            //C1: Bắt theo regex
            String catalogNameRegex = "[\\w]{1,50}";
            if (Pattern.matches(catalogNameRegex, catalogName)) {
                if (isExist) {
                    System.err.println("Tên danh mục đã tồn tại, vui lòng nhập lại");
                } else {
                    break;
                }
            } else {
                System.err.println("Tên danh mục có độ dài tối đa 50 ký tự, vui lòng nhập lại");
            }
        } while (true);
        return catalogName;
    }

    public String inputDescriptions(Scanner scanner) {
        System.out.println("Nhập vào mô tả danh mục: ");
        return scanner.nextLine();
    }

    public boolean inputCatalogStatus(Scanner scanner) {
        System.out.println("Nhập vào trạng thái danh mục: ");
        return Boolean.parseBoolean(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("Categories ID: %d - Categories Name: %s - Categories Descriptions: %s - Categories Status: %s\n", this.catalogId, this.catalogName, this.descriptions, this.catalogStatus ? "Hoạt động" : "Không hoạt động");
    }
}
