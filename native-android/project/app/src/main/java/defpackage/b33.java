package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b33 extends h33 {
    public final /* synthetic */ int r;

    public /* synthetic */ b33(int r1, boolean r2) {
        this.r = r1;
        super(r2);
    }

    @Override // defpackage.h33
    public final Object a(String r1, Bundle r2) {
        switch(this.r) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        r2.getClass();
        r1.getClass();
        return (String) r2.get(r1);
    L6:
        r2.getClass();
        r1.getClass();
        Object r0 = r2.get(r1);
        r0.getClass();
        return (Integer) r0;
    L8:
        r2.getClass();
        r1.getClass();
        Object r3 = r2.get(r1);
        r3.getClass();
        return (Long) r3;
    L10:
        r2.getClass();
        r1.getClass();
        Object r4 = r2.get(r1);
        r4.getClass();
        return (Integer) r4;
    L12:
        r2.getClass();
        r1.getClass();
        Object r5 = r2.get(r1);
        r5.getClass();
        return (Float) r5;
    L14:
        r2.getClass();
        r1.getClass();
        return (Boolean) r2.get(r1);
    }

    @Override // defpackage.h33
    public final String b() {
        switch(this.r) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        return "string";
    L6:
        return "reference";
    L8:
        return "long";
    L10:
        return "integer";
    L12:
        return "float";
    L14:
        return "boolean";
    }

    @Override // defpackage.h33
    public final Object d(String r7) {
        boolean r0 = true;
        switch(this.r) {
            case 0: goto L32;
            case 1: goto L30;
            case 2: goto L24;
            case 3: goto L14;
            case 4: goto L8;
            default: goto L4;
        };
    L4:
        r7.getClass();
        if (r7.equals("null") == true) goto L7;
        return r7;
    L7:
        return null;
    L8:
        r7.getClass();
        if (xm4.k0(r7, "0x", false) == false) goto L11;
        String r6 = r7.substring(2);
        ya4.g(16);
        int r8 = Integer.parseInt(r6, 16);
    L13:
        return Integer.valueOf(r8);
    L11:
        r8 = Integer.parseInt(r7);
        goto L13
    L14:
        r7.getClass();
        if (xm4.e0(r7, "L", false) == false) goto L17;
        String r9 = r7.substring(0, r7.length() - 1);
    L19:
        if (xm4.k0(r7, "0x", false) == false) goto L21;
        String r10 = r9.substring(2);
        ya4.g(16);
        long r11 = Long.parseLong(r10, 16);
    L23:
        return Long.valueOf(r11);
    L21:
        r11 = Long.parseLong(r9);
        goto L23
    L17:
        r9 = r7;
        goto L19
    L24:
        r7.getClass();
        if (xm4.k0(r7, "0x", false) == false) goto L27;
        String r12 = r7.substring(2);
        ya4.g(16);
        int r13 = Integer.parseInt(r12, 16);
    L29:
        return Integer.valueOf(r13);
    L27:
        r13 = Integer.parseInt(r7);
        goto L29
    L30:
        r7.getClass();
        return Float.valueOf(Float.parseFloat(r7));
    L32:
        r7.getClass();
        if (r7.equals("true") == true) goto L42;
        if (r7.equals("false") == false) goto L39;
        r0 = false;
        goto L42
    L39:
        kf2.n("A boolean NavType only accepts \"true\" or \"false\" values.");
        return null;
    L42:
        return Boolean.valueOf(r0);
    }

    @Override // defpackage.h33
    public final void e(Bundle r3, String r4, Object r5) {
        switch(this.r) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        r4.getClass();
        r3.putString(r4, (String) r5);
        return;
    L6:
        int r2 = ((Number) r5).intValue();
        r4.getClass();
        r3.putInt(r4, r2);
        return;
    L8:
        long r0 = ((Number) r5).longValue();
        r4.getClass();
        r3.putLong(r4, r0);
        return;
    L10:
        int r6 = ((Number) r5).intValue();
        r4.getClass();
        r3.putInt(r4, r6);
        return;
    L12:
        float r7 = ((Number) r5).floatValue();
        r4.getClass();
        r3.putFloat(r4, r7);
        return;
    L14:
        boolean r8 = ((Boolean) r5).booleanValue();
        r4.getClass();
        r3.putBoolean(r4, r8);
    }

    @Override // defpackage.h33
    public String f(Object r2) {
        switch(this.r) {
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        String r3 = (String) r2;
        if (r3 == null) goto L9;
        String r1 = Uri.encode(r3);
    L10:
        if (r1 != null) goto L13;
        return "null";
    L13:
        return r1;
    L9:
        r1 = null;
        goto L10
    L5:
        return super.f(r2);
    }
}
