package defpackage;

import android.app.job.JobScheduler;
import android.view.WindowInsets;
import android.widget.EditText;
import android.window.BackEvent;
import com.google.android.material.search.SearchBar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v22 {
    public static /* bridge */ /* synthetic */ float a(BackEvent r0) {
        return r0.getTouchX();
    }

    public static /* bridge */ /* synthetic */ int b() {
        return WindowInsets.Type.systemOverlays();
    }

    public static /* bridge */ /* synthetic */ int c(BackEvent r0) {
        return r0.getSwipeEdge();
    }

    public static /* bridge */ /* synthetic */ JobScheduler d(JobScheduler r1) {
        return r1.forNamespace("androidx.work.systemjobscheduler");
    }

    public static /* bridge */ /* synthetic */ void e(EditText r1) {
        r1.setIsHandwritingDelegate(true);
    }

    public static /* bridge */ /* synthetic */ void f(SearchBar r0, m74 r1) {
        r0.setHandwritingDelegatorCallback(r1);
    }

    public static /* bridge */ /* synthetic */ float g(BackEvent r0) {
        return r0.getTouchY();
    }

    public static /* bridge */ /* synthetic */ float h(BackEvent r0) {
        return r0.getProgress();
    }
}
