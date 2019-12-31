package com.demo.pattern.prototype.shallow;

import java.util.List;

/**
 * @program: pattern
 * @description: 具体原型类A
 * @author: LiuYunKai
 * @create: 2019-12-31 10:55
 **/
public class ConcretePrototypeA implements Prototype{

    String itemName;

    String userName;

    int agentId;

    List samples;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public List getSamples() {
        return samples;
    }

    public void setSamples(List samples) {
        this.samples = samples;
    }

    @Override
    public ConcretePrototypeA clone() {

        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();

        concretePrototype.setItemName(this.itemName);
        concretePrototype.setUserName(this.userName);
        concretePrototype.setAgentId(this.agentId);
        concretePrototype.setSamples(this.samples);


        return concretePrototype;
    }
}
