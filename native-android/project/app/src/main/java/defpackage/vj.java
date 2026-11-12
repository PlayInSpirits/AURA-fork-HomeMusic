package defpackage;

import android.content.Context;
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

    public vj(Context context, int i) {
        switch (i) {
            case 2:
                this.n = context.getApplicationContext();
                break;
            default:
                context.getClass();
                this.n = context;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(tb1 tb1Var) {
        String str = tb1Var.n;
        if (str == null || !lw2.j(str)) {
            return kq.a(0, 0, 0, 0);
        }
        String str2 = tb1Var.n;
        String str3 = f35.a;
        str2.getClass();
        switch (str2) {
            case "image/avif":
                break;
            case "image/heic":
            case "image/heif":
                break;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return kq.a(4, 0, 0, 0);
        }
        return kq.a(1, 0, 0, 0);
    }

    @Override // defpackage.sz0
    public void a(bu buVar) {
        n90 n90Var = new n90(0, "EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), n90Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new v6(this, buVar, threadPoolExecutor, 9));
    }

    @Override // defpackage.dk
    public void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        au0.w(this.n).a(gi1.H(arrayList), (List) arrayList.stream().map(new hu3(6)).collect(Collectors.toList()), false);
    }

    @Override // defpackage.lm3
    public void g() {
        Toast.makeText(this.n, R.string.playlist_editor_dialog_action_delete_failure, 0).show();
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        Toast.makeText(this.n, R.string.playlist_editor_dialog_action_delete_success, 0).show();
    }

    public /* synthetic */ vj(Context context, byte b) {
        this.n = context;
    }
}
