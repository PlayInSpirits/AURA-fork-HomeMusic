package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class vf2 extends hd {
    public final xi4 c;
    public final k03 d;

    public vf2(Application application) {
        super(application);
        this.d = new k03(ud3.k());
        this.c = new xi4(18);
    }

    public static boolean c() {
        int i;
        rq rqVar = new rq(new vs3().a);
        Thread thread = new Thread(rqVar);
        thread.start();
        try {
            thread.join();
            i = rqVar.o;
        } catch (InterruptedException e) {
            e.printStackTrace();
            i = 0;
        }
        return i != 0;
    }

    public final void d(String str) {
        String strE = ud3.E();
        String strConcat = strE == null ? null : "active_music_folder_id_".concat(strE);
        if (strConcat != null) {
            App.b().getClass();
            SharedPreferences.Editor editorEdit = App.c().edit();
            if (str == null) {
                str = "default";
            }
            editorEdit.putString(strConcat, str).apply();
        }
        this.d.k(ud3.k());
    }
}
