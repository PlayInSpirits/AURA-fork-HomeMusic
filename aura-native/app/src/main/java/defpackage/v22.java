/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.job.JobScheduler;
import android.view.WindowInsets;
import android.widget.EditText;
import android.window.BackEvent;
import com.google.android.material.search.SearchBar;
import defpackage.m74;

public abstract class v22 {
    public static float a(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static int b() {
        return WindowInsets.Type.systemOverlays();
    }

    public static int c(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static JobScheduler d(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    public static void e(EditText editText) {
        editText.setIsHandwritingDelegate(true);
    }

    public static void f(SearchBar searchBar, m74 m742) {
        searchBar.setHandwritingDelegatorCallback(m742);
    }

    public static float g(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static float h(BackEvent backEvent) {
        return backEvent.getProgress();
    }
}

