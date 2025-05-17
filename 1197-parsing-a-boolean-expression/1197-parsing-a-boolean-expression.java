public class Solution {
public boolean parseBoolExpr(String expression) {
Stack<Character> st = new Stack<Character>();
for (int i = 0; i < expression.length(); i++) {
char c = expression.charAt(i);
if (c == ',' || c == '(') {
continue;
}
if (c == 't' || c == 'f' || c == '!' || c == '&' || c == '|') {
st.push(c);
} else if (c == ')') {
boolean hasTrue = false;
boolean hasFalse = false;
while (st.peek() != '!' && st.peek() != '&' && st.peek() != '|') {
char topValue = st.pop();
if (topValue == 't') {
hasTrue = true;
}
if (topValue == 'f') {
hasFalse = true;
}
}
char op = st.pop();
if (op == '!') {
if (hasTrue) {
st.push('f');
} else {
st.push('t');
}
} else if (op == '&') {
if (hasFalse) {
st.push('f');
} else {
st.push('t');
}
} else if (op == '|') {
if (hasTrue) {
st.push('t');
} else {
st.push('f');
}
}
}
}
return st.peek() == 't';
}
}