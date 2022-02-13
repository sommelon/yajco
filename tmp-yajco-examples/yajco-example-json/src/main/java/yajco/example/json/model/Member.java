package yajco.example.json.model;

import yajco.annotation.*;

public class Member {

    private JsonString name;
    private JsonValue value;

    public Member(JsonString string,
                  @Before(":") JsonValue value) {
        this.name = string;
        this.value = value;
    }

    public JsonString getName() {
        return name;
    }

    public void setName(JsonString name) {
        this.name = name;
    }

    public JsonValue getValue() {
        return value;
    }

    public void setValue(JsonValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        return name.equals(member.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
