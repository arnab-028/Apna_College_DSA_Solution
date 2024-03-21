class removeConsecutiveCharacter{
    public:
    string remove(string S) {
        string result = "";
        for (int i = 0; i < S.length(); i++) {
            if (i == 0 || S[i] != S[i - 1]) {
                result += S[i];
            }
        }
        return result;
    }
}