/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kimoj
 */
public class Supplier {

    private String supplierId;
    private String name;
    private String phone;

    public Supplier(String supplierId,
                    String name,
                    String phone) {
        this.supplierId = supplierId;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
