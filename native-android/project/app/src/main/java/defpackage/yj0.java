package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yj0 implements nd0 {
    public static final yj0 c = null;
    public int a;
    public final Map b;

    static {
        c = new yj0(Collections.EMPTY_MAP);
    }

    public yj0(Map r1) {
        this.b = Collections.unmodifiableMap(r1);
    }

    public static boolean c(Map r3, Map r4) {
        if (r3.size() == r4.size()) goto L5;
        return false;
    L5:
        Iterator r5 = r3.entrySet().iterator();
    L7:
        if (r5.hasNext() == false) goto L11;
        Map.Entry r0 = (Map.Entry) r5.next();
        if (Arrays.equals((byte[]) r0.getValue(), (byte[]) r4.get(r0.getKey())) == true) goto L7;
        return false;
    L11:
        return true;
    }

    public final yj0 b(xc5 r8) {
        Map r1 = this.b;
        HashMap r0 = new HashMap(r1);
        List r2 = Collections.unmodifiableList(new ArrayList((ArrayList) r8.p));
        int r3 = 0;
    L4:
        if (r3 >= r2.size()) goto L6;
        r0.remove(r2.get(r3));
        r3 = r3 + 1;
        goto L4
    L6:
        HashMap r4 = new HashMap((HashMap) r8.o);
        Iterator r9 = r4.entrySet().iterator();
    L8:
        if (r9.hasNext() == false) goto L12;
        Map.Entry r5 = (Map.Entry) r9.next();
        Object r6 = r5.getValue();
        if ((r6 instanceof byte[]) == false) goto L8;
        byte[] r7 = (byte[]) r6;
        r5.setValue(Arrays.copyOf(r7, r7.length));
        goto L8
    L12:
        Iterator r10 = Collections.unmodifiableMap(r4).entrySet().iterator();
    L14:
        if (r10.hasNext() == false) goto L28;
        Map.Entry r11 = (Map.Entry) r10.next();
        String r12 = (String) r11.getKey();
        Object r13 = r11.getValue();
        if ((r13 instanceof Long) == false) goto L19;
        byte[] r14 = ByteBuffer.allocate(8).putLong(((Long) r13).longValue()).array();
    L24:
        r0.put(r12, r14);
        goto L14
    L19:
        if ((r13 instanceof String) == false) goto L22;
        r14 = ((String) r13).getBytes(StandardCharsets.UTF_8);
        goto L24
    L22:
        if ((r13 instanceof byte[]) == false) goto L25;
        r14 = (byte[]) r13;
        goto L24
    L25:
        nz2.c();
        return null;
    L28:
        if (c(r1, r0) == false) goto L31;
        return this;
    L31:
        return new yj0(r0);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (yj0.class != r3.getClass()) goto L13;
        Map r4 = ((yj0) r3).b;
        return c(this.b, r4);
    L13:
        return false;
    }

    public final int hashCode() {
        if (this.a != 0) goto L10;
        Iterator r0 = this.b.entrySet().iterator();
        int r1 = 0;
    L6:
        if (r0.hasNext() == false) goto L8;
        Map.Entry r2 = (Map.Entry) r0.next();
        int r3 = ((String) r2.getKey()).hashCode();
        r1 = r1 + (Arrays.hashCode((byte[]) r2.getValue()) ^ r3);
        goto L6
    L8:
        this.a = r1;
    L10:
        return this.a;
    }
}
