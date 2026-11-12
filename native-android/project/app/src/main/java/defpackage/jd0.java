package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 implements id0, kd0 {
    public final /* synthetic */ int n;
    public ClipData o;
    public int p;
    public int q;
    public Uri r;
    public Bundle s;

    public jd0(jd0 r5) {
        this.n = 1;
        ClipData r1 = r5.o;
        r1.getClass();
        this.o = r1;
        int r2 = r5.p;
        if (r2 >= 0) goto L5;
        Locale r4 = Locale.US;
        kf2.n("source is out of range of [0, 5] (too low)");
        throw null;
    L5:
        if (r2 > 5) goto L12;
        this.p = r2;
        int r3 = r5.q;
        if ((r3 & 1) != r3) goto L11;
        this.q = r3;
        this.r = r5.r;
        this.s = r5.s;
        return;
    L11:
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(r3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    L12:
        Locale r6 = Locale.US;
        kf2.n("source is out of range of [0, 5] (too high)");
        throw null;
    }

    @Override // defpackage.id0
    public ld0 build() {
        return new ld0(new jd0(this));
    }

    @Override // defpackage.id0
    public void c(Uri r1) {
        this.r = r1;
    }

    @Override // defpackage.kd0
    public ClipData f() {
        return this.o;
    }

    @Override // defpackage.id0
    public void i(int r1) {
        this.q = r1;
    }

    @Override // defpackage.kd0
    public int r() {
        return this.q;
    }

    @Override // defpackage.id0
    public void setExtras(Bundle r1) {
        this.s = r1;
    }

    @Override // defpackage.kd0
    public ContentInfo t() {
        return null;
    }

    public String toString() {
        switch(this.n) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Uri r0 = this.r;
        StringBuilder r1 = new StringBuilder("ContentInfoCompat{clip=");
        r1.append(this.o.getDescription());
        r1.append(", source=");
        int r2 = this.p;
        if (r2 != 0) goto L9;
        String r3 = "SOURCE_APP";
    L25:
        r1.append(r3);
        r1.append(", flags=");
        int r4 = this.q;
        if ((r4 & 1) == 0) goto L28;
        String r5 = "FLAG_CONVERT_TO_PLAIN_TEXT";
    L29:
        r1.append(r5);
        String r6 = "";
        if (r0 != null) goto L32;
        String r7 = "";
    L33:
        r1.append(r7);
        if (this.s == null) goto L38;
        r6 = ", hasExtras";
    L38:
        return b11.q(r1, r6, "}");
    L32:
        r7 = ", hasLinkUri(" + r0.toString().length() + ")";
        goto L33
    L28:
        r5 = String.valueOf(r4);
        goto L29
    L9:
        if (r2 != 1) goto L11;
        r3 = "SOURCE_CLIPBOARD";
        goto L25
    L11:
        if (r2 != 2) goto L13;
        r3 = "SOURCE_INPUT_METHOD";
        goto L25
    L13:
        if (r2 != 3) goto L15;
        r3 = "SOURCE_DRAG_AND_DROP";
        goto L25
    L15:
        if (r2 != 4) goto L17;
        r3 = "SOURCE_AUTOFILL";
        goto L25
    L17:
        if (r2 == 5) goto L19;
        r3 = String.valueOf(r2);
        goto L25
    L19:
        r3 = "SOURCE_PROCESS_TEXT";
        goto L25
    L5:
        return super.toString();
    }

    @Override // defpackage.kd0
    public int u() {
        return this.p;
    }

    public /* synthetic */ jd0() {
        this.n = 0;
    }
}
