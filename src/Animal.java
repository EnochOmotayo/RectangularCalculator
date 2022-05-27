public class Animal {
    // encapsulation
    // attribute/member/property
    // beginning of attributes/properties
    private String group;
    private String[] features;
    // end

    // methods //creating methods
    public String getGroup() {
        return group;
    }

    public void setGroup(String gr) {
        group = gr;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] feat) {
        features = feat; // the body of the method
    }

    public static void whoAmI() {
        System.out.println("I am an animal class");
    }
    // end of method
}