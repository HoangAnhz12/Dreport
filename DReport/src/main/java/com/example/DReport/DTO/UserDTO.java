package com.example.DReport.DTO;

import com.example.DReport.Model.User;

public class UserDTO {
    private Long id;
    private String name;
    private String taikhoan;
    private String matkhau;

    public UserDTO(Long id, String name, String taikhoan, String matkhau) {
        this.id = id;
        this.name = name;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }

    public UserDTO() {
    }

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

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taikhoan='" + taikhoan + '\'' +
                ", matkhau='" + matkhau + '\'' +
                '}';
    }
}
