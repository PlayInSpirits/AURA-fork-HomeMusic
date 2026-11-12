package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ik {
    public final /* synthetic */ int a;
    public final Uri b;
    public final String c;
    public final String d;

    public ik(Intent r3) {
        this.a = 1;
        Uri r0 = r3.getData();
        String r1 = r3.getAction();
        String r4 = r3.getType();
        this.b = r0;
        this.c = r1;
        this.d = r4;
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder("NavDeepLinkRequest{");
        Uri r1 = this.b;
        if (r1 == null) goto L9;
        r0.append(" uri=");
        r0.append(String.valueOf(r1));
    L9:
        String r2 = this.c;
        if (r2 == null) goto L12;
        r0.append(" action=");
        r0.append(r2);
    L12:
        String r3 = this.d;
        if (r3 == null) goto L15;
        r0.append(" mimetype=");
        r0.append(r3);
    L15:
        r0.append(" }");
        return r0.toString();
    L5:
        return super.toString();
    }

    public ik(String r2, String r3, Uri r4) {
        this.a = 0;
        this.c = r2;
        this.d = r3;
        this.b = r4;
    }
}
