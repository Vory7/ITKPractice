
import java.util.Stack;

public class MyStringBuilder {

    private StringBuilder builder;
    private Stack<String> history;

    public MyStringBuilder() {
        builder = new StringBuilder();
        history = new Stack<>();
    }

    public MyStringBuilder(String str) {
        builder = new StringBuilder(str);
        history = new Stack<>();
    }

    private void saveSnapshot() {
        history.push(builder.toString());
    }

    public MyStringBuilder append(String str) {
        saveSnapshot();
        builder.append(str);
        return this;
    }

    public MyStringBuilder append(char ch) {
        saveSnapshot();
        builder.append(ch);
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        saveSnapshot();
        builder.delete(start, end);
        return this;
    }

    public MyStringBuilder insert(int offset, String str) {
        saveSnapshot();
        builder.insert(offset, str);
        return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
        saveSnapshot();
        builder.replace(start, end, str);
        return this;
    }

    public MyStringBuilder undo() {
        if (!history.isEmpty()) {
            String previousState = history.pop();
            builder = new StringBuilder(previousState);
        }

        return this;
    }

    public int length() {
        return builder.length();
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
