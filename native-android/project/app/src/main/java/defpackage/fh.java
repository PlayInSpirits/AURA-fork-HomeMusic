package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh {
    public static LocaleList a(String r0) {
        return LocaleList.forLanguageTags(r0);
    }

    public static void b(TextView r0, LocaleList r1) {
        r0.setTextLocales(r1);
    }
}
