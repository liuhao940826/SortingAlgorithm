package model;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 6:14 PM 2019/3/11
 */
public class Apple {


    private String name;

    private Integer size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Apple() {
    }

    public Apple(String name, Integer size) {
        this.name = name;
        this.size = size;
    }
}
