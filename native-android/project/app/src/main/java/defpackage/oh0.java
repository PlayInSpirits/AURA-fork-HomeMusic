package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 {
    public static final oh0 b = null;
    public final HashMap a;

    static {
        oh0 r1 = new oh0(new LinkedHashMap());
        bu.E(r1);
        b = r1;
    }

    public oh0(oh0 r2) {
        r2.getClass();
        this.a = new HashMap(r2.a);
    }

    public static final oh0 a(byte[] r6) {
        r6.getClass();
        if (r6.length <= 10240) goto L5;
        kf2.o("Data cannot occupy more than 10240 bytes when serialized");
        return null;
    L5:
        if (r6.length == 0) goto L7;
        LinkedHashMap r1 = new LinkedHashMap();
        ByteArrayInputStream r2 = new ByteArrayInputStream(r6);     // Catch: ClassNotFoundException -> L26 IOException -> L28
        byte[] r7 = new byte[2];     // Catch: ClassNotFoundException -> L26 IOException -> L28
        r2.read(r7);     // Catch: ClassNotFoundException -> L26 IOException -> L28
        int r3 = 0;
        if (r7[0] != (-84)) goto L14;
        boolean r4 = true;
        if (r7[1] != (-19)) goto L14;
    L15:
        r2.reset();     // Catch: ClassNotFoundException -> L26 IOException -> L28
        if (r4 == false) goto L34;
        ObjectInputStream r8 = new ObjectInputStream(r2);     // Catch: ClassNotFoundException -> L26 IOException -> L28
        int r5 = r8.readInt();     // Catch: Throwable -> L22
    L19:
        if (r3 >= r5) goto L24;
        String r9 = r8.readUTF();     // Catch: Throwable -> L22
        r9.getClass();     // Catch: Throwable -> L22
        r1.put(r9, r8.readObject());     // Catch: Throwable -> L22
        r3 = r3 + 1;
        goto L19
    L24:
        r8.close();     // Catch: ClassNotFoundException -> L26 IOException -> L28
    L50:
        return new oh0(r1);
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        q05.h(r8, th);     // Catch: ClassNotFoundException -> L26 IOException -> L28
        throw th;     // Catch: ClassNotFoundException -> L26 IOException -> L28
    L34:
        DataInputStream r10 = new DataInputStream(r2);     // Catch: ClassNotFoundException -> L26 IOException -> L28
        bu.j(r10);     // Catch: Throwable -> L39
        int r11 = r10.readInt();     // Catch: Throwable -> L39
    L36:
        if (r3 >= r11) goto L41;
        Serializable r12 = bu.k(r10, r10.readByte());     // Catch: Throwable -> L39
        String r13 = r10.readUTF();     // Catch: Throwable -> L39
        r13.getClass();     // Catch: Throwable -> L39
        r1.put(r13, r12);     // Catch: Throwable -> L39
        r3 = r3 + 1;
        goto L36
    L41:
        r10.close();     // Catch: ClassNotFoundException -> L26 IOException -> L28
    L39:
        th = move-exception;
        throw th;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        q05.h(r10, th);     // Catch: ClassNotFoundException -> L26 IOException -> L28
        throw th;     // Catch: ClassNotFoundException -> L26 IOException -> L28
    L14:
        r4 = false;
    L28:
        e = move-exception;
        cx.f().e(ki0.a, "Error in Data#fromByteArray: ", e);
    L26:
        e = move-exception;
        cx.f().e(ki0.a, "Error in Data#fromByteArray: ", e);
        goto L50
    L7:
        return b;
    }

    public final boolean b(String r1) {
        Object r0 = this.a.get(r1);
        if (r0 != null) goto L5;
        return false;
    L5:
        if (String.class.isAssignableFrom(r0.getClass()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
    L31:
        return true;
    L6:
        if (r8 != null) goto L8;
    L32:
        return false;
    L8:
        if (oh0.class.equals(r8.getClass()) == false) goto L32;
        HashMap r9 = ((oh0) r8).a;
        HashMap r7 = this.a;
        Set r2 = r7.keySet();
        if (h12.c(r2, r9.keySet()) == false) goto L32;
        Iterator r3 = r2.iterator();
    L15:
        if (r3.hasNext() == false) goto L31;
        String r4 = (String) r3.next();
        Object r5 = r7.get(r4);
        Object r6 = r9.get(r4);
        if (r5 == null) goto L26;
        if (r6 == null) goto L26;
        if ((r5 instanceof Object[]) == false) goto L25;
        Object[] r10 = (Object[]) r5;
        if ((r6 instanceof Object[]) == false) goto L25;
        boolean r11 = ti.W(r10, (Object[]) r6);
    L29:
        if (r11 == true) goto L15;
    L25:
        r11 = r5.equals(r6);
    L26:
        if (r5 != r6) goto L28;
        r11 = true;
        goto L29
    L28:
        r11 = false;
        goto L29
    }

    public final int hashCode() {
        Iterator r4 = this.a.entrySet().iterator();
        int r0 = 0;
    L4:
        if (r4.hasNext() == false) goto L11;
        Map.Entry r1 = (Map.Entry) r4.next();
        Object r2 = r1.getValue();
        if ((r2 instanceof Object[]) == false) goto L8;
        int r3 = Objects.hashCode(r1.getKey()) ^ Arrays.deepHashCode((Object[]) r2);
    L9:
        r0 = r0 + r3;
        goto L4
    L8:
        r3 = r1.hashCode();
        goto L9
    L11:
        return r0 * 31;
    }

    public final String toString() {
        return b11.q(new StringBuilder("Data {"), q40.B0(this.a.entrySet(), null, null, null, k5.p, 31), "}");
    }

    public oh0(LinkedHashMap r2) {
        r2.getClass();
        this.a = new HashMap(r2);
    }
}
