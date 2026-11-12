package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq3 {
    public static final String a = cx.i("ProcessUtils");

    public static final boolean a(Context context, r90 r90Var) {
        String strG;
        Object next;
        context.getClass();
        r90Var.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strG = ne.g();
        } else {
            strG = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, sc5.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strG = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strG = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                cx.f().c(a, "Unable to check ActivityThread for processName", th);
            }
        }
        return h12.c(strG, context.getApplicationInfo().processName);
    }
}
