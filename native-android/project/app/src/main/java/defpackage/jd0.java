package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 implements id0, kd0 {
    public final /* synthetic */ int n = 0;
    public ClipData o;
    public int p;
    public int q;
    public Uri r;
    public Bundle s;

    public jd0(jd0 jd0Var) {
        ClipData clipData = jd0Var.o;
        clipData.getClass();
        this.o = clipData;
        int i = jd0Var.p;
        if (i < 0) {
            Locale locale = Locale.US;
            kf2.n("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            kf2.n("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.p = i;
        int i2 = jd0Var.q;
        if ((i2 & 1) == i2) {
            this.q = i2;
            this.r = jd0Var.r;
            this.s = jd0Var.s;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.id0
    public ld0 build() {
        return new ld0(new jd0(this));
    }

    @Override // defpackage.id0
    public void c(Uri uri) {
        this.r = uri;
    }

    @Override // defpackage.kd0
    public ClipData f() {
        return this.o;
    }

    @Override // defpackage.id0
    public void i(int i) {
        this.q = i;
    }

    @Override // defpackage.kd0
    public int r() {
        return this.q;
    }

    @Override // defpackage.id0
    public void setExtras(Bundle bundle) {
        this.s = bundle;
    }

    @Override // defpackage.kd0
    public ContentInfo t() {
        return null;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.n) {
            case 1:
                Uri uri = this.r;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.o.getDescription());
                sb.append(", source=");
                int i = this.p;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.q;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return b11.q(sb, this.s != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kd0
    public int u() {
        return this.p;
    }

    public /* synthetic */ jd0() {
    }
}
