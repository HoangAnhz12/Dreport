package com.example.DReport.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(value = "User")
public class User {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Id
    private Long id;
    private String name;
    private String taikhoan;
    private String matkhau;

    public User(Long id, String name, String taikhoan, String matkhau) {
        this.id = id;
        this.name = name;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }
}
