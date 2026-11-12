package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tf4 {
    public static final Bitmap.Config[] d = null;
    public static final Bitmap.Config[] e = null;
    public static final Bitmap.Config[] f = null;
    public static final Bitmap.Config[] g = null;
    public static final Bitmap.Config[] h = null;
    public final mf2 a;
    public final hd5 b;
    public final HashMap c;

    static {
        Bitmap.Config[] r0 = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT < 26) goto L5;
        r0 = (Bitmap.Config[]) Arrays.copyOf(r0, 3);
        r0[r0.length - 1] = j3.d();
    L5:
        d = r0;
        e = r0;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public tf4() {
        this.a = new mf2(1);
        this.b = new hd5(10);
        this.c = new HashMap();
    }

    public static String c(int r2, Bitmap.Config r3) {
        return "[" + r2 + "](" + r3 + ")";
    }

    public final void a(Integer r4, Bitmap r5) {
        NavigableMap r0 = d(r5.getConfig());
        Integer r1 = (Integer) r0.get(r4);
        if (r1 != null) goto L5;
        StringBuilder r2 = new StringBuilder("Tried to decrement empty size, size: ");
        r2.append(r4);
        String r6 = c(e35.v(r5), r5.getConfig());
        r2.append(", removed: ");
        r2.append(r6);
        r2.append(", this: ");
        r2.append(this);
        throw new NullPointerException(r2.toString());
    L5:
        if (r1.intValue() != 1) goto L8;
        r0.remove(r4);
        return;
    L8:
        r0.put(r4, Integer.valueOf(r1.intValue() - 1));
    }

    public final Bitmap b(int r11, int r12, Bitmap.Config r13) {
        int r1 = e35.w(r13);
        int r2 = r1 * (r11 * r12);
        mf2 r0 = this.a;
        xn3 r3 = (xn3) ((ArrayDeque) r0.a).poll();
        if (r3 != null) goto L5;
        r3 = r0.u();
    L5:
        sf4 r4 = (sf4) r3;
        r4.b = r2;
        r4.c = r13;
        if (Build.VERSION.SDK_INT >= 26) goto L8;
    L10:
        int r5 = rf4.a[r13.ordinal()];
        if (r5 != 1) goto L13;
        Bitmap.Config[] r6 = d;
    L23:
        int r7 = r6.length;
        int r8 = 0;
    L24:
        if (r8 >= r7) goto L41;
        Bitmap.Config r9 = r6[r8];
        Integer r10 = (Integer) d(r9).ceilingKey(Integer.valueOf(r2));
        if (r10 == null) goto L40;
        if (r10.intValue() > (r2 * 8)) goto L40;
        if (r10.intValue() != r2) goto L36;
        if (r9 != null) goto L35;
        if (r13 == null) goto L41;
    L35:
        if (r9.equals(r13) == true) goto L41;
    L36:
        r0.k(r4);
        int r14 = r10.intValue();
        xn3 r15 = (xn3) ((ArrayDeque) r0.a).poll();
        if (r15 != null) goto L39;
        r15 = r0.u();
    L39:
        r4 = (sf4) r15;
        r4.b = r14;
        r4.c = r9;
    L40:
        r8 = r8 + 1;
    L41:
        Bitmap r16 = (Bitmap) this.b.h(r4);
        if (r16 == null) goto L44;
        a(Integer.valueOf(r4.b), r16);
        r16.reconfigure(r11, r12, r13);
    L44:
        return r16;
    L13:
        if (r5 != 2) goto L15;
        r6 = f;
        goto L23
    L15:
        if (r5 != 3) goto L17;
        r6 = g;
        goto L23
    L17:
        if (r5 == 4) goto L19;
        r6 = new Bitmap.Config[]{r13};
        goto L23
    L19:
        r6 = h;
        goto L23
    L8:
        if (j3.d().equals(r13) == false) goto L10;
        r6 = e;
        goto L23
    }

    public final NavigableMap d(Bitmap.Config r2) {
        HashMap r1 = this.c;
        NavigableMap r0 = (NavigableMap) r1.get(r2);
        if (r0 != null) goto L6;
        TreeMap r3 = new TreeMap();
        r1.put(r2, r3);
        return r3;
    L6:
        return r0;
    }

    public final void e(Bitmap r5) {
        int r0 = e35.v(r5);
        Bitmap.Config r1 = r5.getConfig();
        mf2 r2 = this.a;
        xn3 r3 = (xn3) ((ArrayDeque) r2.a).poll();
        if (r3 != null) goto L5;
        r3 = r2.u();
    L5:
        sf4 r4 = (sf4) r3;
        r4.b = r0;
        r4.c = r1;
        this.b.k(r4, r5);
        NavigableMap r6 = d(r5.getConfig());
        Integer r7 = (Integer) r6.get(Integer.valueOf(r4.b));
        Integer r8 = Integer.valueOf(r4.b);
        int r9 = 1;
        if (r7 == null) goto L9;
        r9 = 1 + r7.intValue();
    L9:
        r6.put(r8, Integer.valueOf(r9));
    }

    public final String toString() {
        StringBuilder r0 = xa3.i("SizeConfigStrategy{groupedMap=");
        r0.append(this.b);
        r0.append(", sortedSizes=(");
        HashMap r4 = this.c;
        Iterator r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        Map.Entry r2 = (Map.Entry) r1.next();
        r0.append(r2.getKey());
        r0.append('[');
        r0.append(r2.getValue());
        r0.append("], ");
        goto L4
    L7:
        if (r4.isEmpty() == true) goto L9;
        r0.replace(r0.length() - 2, r0.length(), "");
    L9:
        r0.append(")}");
        return r0.toString();
    }
}
