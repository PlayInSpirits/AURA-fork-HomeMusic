package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ik {
    public final /* synthetic */ int a = 1;
    public final Uri b;
    public final String c;
    public final String d;

    public ik(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.b = data;
        this.c = action;
        this.d = type;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = this.c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = this.d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ik(String str, String str2, Uri uri) {
        this.c = str;
        this.d = str2;
        this.b = uri;
    }
}
