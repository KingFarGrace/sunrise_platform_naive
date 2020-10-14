package team.sunrise.managementplatform.entity.response;

import java.util.Objects;

public abstract class Response {
    private int code;
    private String message;

    protected abstract int groupCode();

    protected int groupCodeMultiplier() {
        return 100;
    }

    public Response() {}

    public Response(int code, String message) {
        this.code = code + groupCode() * groupCodeMultiplier();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return code == response.code &&
                Objects.equals(message, response.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }
}
