package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 extends zz1 {
    public static final Pattern p = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder n = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder o = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.zz1
    public final qv2 k(uv2 uv2Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.o;
        CharsetDecoder charsetDecoder2 = this.n;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new qv2(new jv1(bArr, null, null));
        }
        Matcher matcher = p.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strU = rr2.U(strGroup);
                strU.getClass();
                if (strU.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strU.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new qv2(new jv1(bArr, str, str2));
    }
}
