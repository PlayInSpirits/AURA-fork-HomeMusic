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
    public static final Pattern p = null;
    public final CharsetDecoder n;
    public final CharsetDecoder o;

    static {
        p = Pattern.compile("(.+?)='(.*?)';", 32);
    }

    public hv1() {
        this.n = StandardCharsets.UTF_8.newDecoder();
        this.o = StandardCharsets.ISO_8859_1.newDecoder();
    }

    @Override // defpackage.zz1
    public final qv2 k(uv2 r7, ByteBuffer r8) {
        CharsetDecoder r9 = this.o;
        CharsetDecoder r6 = this.n;
        String r0 = null;
        String r10 = r6.decode(r8).toString();     // Catch: Throwable -> L5 CharacterCodingException -> L8
        r6.reset();
        r8.rewind();
    L15:
        byte[] r11 = new byte[r8.limit()];
        r8.get(r11);
        if (r10 == null) goto L18;
        Matcher r12 = p.matcher(r10);
        int r3 = 0;
        String r2 = null;
    L21:
        if (r12.find(r3) == false) goto L33;
        String r4 = r12.group(1);
        String r5 = r12.group(2);
        if (r4 == null) goto L31;
        String r13 = rr2.U(r4);
        r13.getClass();
        if (r13.equals("streamurl") == false) goto L27;
        r2 = r5;
        goto L31
    L27:
        if (r13.equals("streamtitle") == false) goto L31;
        r0 = r5;
    L31:
        r3 = r12.end();
        goto L21
    L33:
        return new qv2(new pv2[]{new jv1(r11, r0, r2)});
    L18:
        return new qv2(new pv2[]{new jv1(r11, null, null)});
    L8:
        r6.reset();
        r8.rewind();
        String r14 = r9.decode(r8).toString();     // Catch: Throwable -> L11 CharacterCodingException -> L14
        r9.reset();
        r8.rewind();
        r10 = r14;
        goto L15
    L14:
        r9.reset();
        r8.rewind();
        r10 = null;
    L11:
        th = move-exception;
        r9.reset();
        r8.rewind();
        throw th;
    L5:
        th = move-exception;
        r6.reset();
        r8.rewind();
        throw th;
    }
}
