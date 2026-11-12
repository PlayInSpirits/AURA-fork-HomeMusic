package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj implements dk, sz0, lm3 {
    public final Context n;

    public vj(Context r1, int r2) {
        switch(r2) {
            case 2: goto L5;
            default: goto L3;
        };
    L3:
        r1.getClass();
        this.n = r1;
        return;
    L5:
        this.n = r1.getApplicationContext();
    }

    public static int b(tb1 r5) {
        String r0 = r5.n;
        if (r0 == null) goto L50;
        if (lw2.j(r0) == false) goto L50;
        String r6 = r5.n;
        String r1 = f35.a;
        r6.getClass();
        byte r4 = -1;
        switch(r6.hashCode()) {
            case -1487656890: goto L35;
            case -1487464693: goto L31;
            case -1487464690: goto L27;
            case -1487394660: goto L23;
            case -1487018032: goto L19;
            case -879272239: goto L15;
            case -879258763: goto L11;
            default: goto L38;
        };
    L38:
        switch(r4) {
            case 0: goto L44;
            case 1: goto L41;
            case 2: goto L41;
            case 3: goto L46;
            case 4: goto L46;
            case 5: goto L46;
            case 6: goto L46;
            default: goto L48;
        };
    L41:
        if (Build.VERSION.SDK_INT < 26) goto L48;
    L44:
        if (Build.VERSION.SDK_INT < 34) goto L48;
    L46:
        return kq.a(4, 0, 0, 0);
    L48:
        return kq.a(1, 0, 0, 0);
    L11:
        if (r6.equals("image/png") == false) goto L38;
        r4 = 6;
        goto L38
    L15:
        if (r6.equals("image/bmp") == false) goto L38;
        r4 = 5;
        goto L38
    L19:
        if (r6.equals("image/webp") == false) goto L38;
        r4 = 4;
        goto L38
    L23:
        if (r6.equals("image/jpeg") == false) goto L38;
        r4 = 3;
        goto L38
    L27:
        if (r6.equals("image/heif") == false) goto L38;
        r4 = 2;
        goto L38
    L31:
        if (r6.equals("image/heic") == false) goto L38;
        r4 = 1;
        goto L38
    L35:
        if (r6.equals("image/avif") == false) goto L38;
        r4 = 0;
    L50:
        return kq.a(0, 0, 0, 0);
    }

    @Override // defpackage.sz0
    public void a(bu r9) {
        n90 r7 = new n90(0, "EmojiCompatInitializer");
        LinkedBlockingDeque r6 = new LinkedBlockingDeque();
        ThreadPoolExecutor r0 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, r6, r7);
        r0.allowCoreThreadTimeOut(true);
        r0.execute(new v6(this, r9, r0, 9));
    }

    @Override // defpackage.dk
    public void e(ArrayList r4) {
        if (r4.isEmpty() == true) goto L6;
        au0.w(this.n).a(gi1.H(r4), (List) r4.stream().map(new hu3(6)).collect(Collectors.toList()), false);
        return;
    }

    @Override // defpackage.lm3
    public void g() {
        Toast.makeText(this.n, R.string.playlist_editor_dialog_action_delete_failure, 0).show();
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        Toast.makeText(this.n, R.string.playlist_editor_dialog_action_delete_success, 0).show();
    }

    public /* synthetic */ vj(Context r1, byte r2) {
        this.n = r1;
    }
}
