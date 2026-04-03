
public class WhatsApp {
    private  static WhatsApp whatsApp=new WhatsApp();
    private WhatsApp(){
    }
    public static WhatsApp getInstance(){
        return whatsApp;
    }
}
