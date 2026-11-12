package retrofit2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class Platform {
    static final BuiltInFactories builtInFactories = null;

    @Nullable
    static final Executor callbackExecutor = null;
    static final Reflection reflection = null;

    static {
        String r0 = System.getProperty("java.vm.name");
        r0.getClass();
        if (r0.equals("RoboVM") == false) goto L5;
        callbackExecutor = null;
        reflection = new Reflection();
        builtInFactories = new BuiltInFactories();
        return;
    L5:
        if (r0.equals("Dalvik") == true) goto L8;
        callbackExecutor = null;
        reflection = new Reflection.Java8();
        builtInFactories = new BuiltInFactories.Java8();
        return;
    L8:
        callbackExecutor = new AndroidMainExecutor();
        reflection = new Reflection.Android24();
        builtInFactories = new BuiltInFactories.Java8();
    }

    private Platform() {
    }
}
