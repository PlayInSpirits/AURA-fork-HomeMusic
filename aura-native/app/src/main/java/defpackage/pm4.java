package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pm4 implements uw2 {
    public final /* synthetic */ int a;
    public final uw2 b;

    public /* synthetic */ pm4(uw2 uw2Var, int i) {
        this.a = i;
        this.b = uw2Var;
    }

    @Override // defpackage.uw2
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        Uri fromFile;
        int i3 = this.a;
        uw2 uw2Var = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fromFile = null;
                } else if (str.charAt(0) == '/') {
                    fromFile = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
                }
                if (fromFile == null || !uw2Var.a(fromFile)) {
                    return null;
                }
                return uw2Var.b(fromFile, i, i2, db3Var);
            default:
                return uw2Var.b(new qi1((URL) obj), i, i2, db3Var);
        }
    }
}
