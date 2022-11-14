package vcpe.st10118615.geostratpoe;

// TODO: DOCUMENT MODELS
public class UserModel {
    private String email;
    private String username;
    private String image;
    private String unit;
    private boolean isNotificationEnable;
    public static String unitType;

    public UserModel() {
    }

    public UserModel(String email, String username, boolean isNotificationEnable, String unit) {
        this.email = email;
        this.username = username;
        this.isNotificationEnable = isNotificationEnable;
        this.unit = unit;
    }
    public UserModel(String email, String username, boolean isNotificationEnable) {
        this.email = email;
        this.username = username;
        this.isNotificationEnable = isNotificationEnable;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isNotificationEnable() {
        return isNotificationEnable;
    }

    public void setNotificationEnable(boolean notificationEnable) {
        isNotificationEnable = notificationEnable;
    }
}
