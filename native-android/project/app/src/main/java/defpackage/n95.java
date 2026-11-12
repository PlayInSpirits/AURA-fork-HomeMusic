package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n95 {
    public static final o95 a;

    static {
        o95 fz0Var;
        try {
            fz0Var = new h45(3, (WebViewProviderFactoryBoundaryInterface) fu.j(WebViewProviderFactoryBoundaryInterface.class, h12.p()));
        } catch (ClassNotFoundException unused) {
            fz0Var = new fz0(25);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            er1.m(e);
            return;
        }
        a = fz0Var;
    }
}
