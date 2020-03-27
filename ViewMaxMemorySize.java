public class ViewMaxMemorySize {
    public static void main(String[] args) {
        System.out.println(java.lang.Runtime.getRuntime().maxMemory() / 1024 / 1024 + " MiB");
    }
}
