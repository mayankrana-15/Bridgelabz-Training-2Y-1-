package Stack;

public class Main {
    static void main(String[] args) {
        StackOps2 st = new StackOps2();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.display();
    }
}
