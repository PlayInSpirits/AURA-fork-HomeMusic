package defpackage;

import app.homemusic.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uh2 {
    public static final Map a;

    static {
        tv1 tv1Var = new tv1();
        HashMap map = new HashMap();
        map.put(Integer.valueOf(R.color.material_personalized_color_primary), gy0.c(new bi2(24), new bi2(25), new bi2(tv1Var, 26), new yh2(tv1Var, 0)));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary), gy0.c(new ai2(1), new ai2(2), new yh2(tv1Var, 2), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), gy0.c(new ai2(4), new ai2(5), new ai2(tv1Var), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_container), tv1Var.E());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), gy0.c(new ai2(11), new yh2(tv1Var, 4), new yh2(tv1Var, 5), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary), gy0.c(new ai2(24), new ai2(25), new bi2(tv1Var, 26), new yh2(tv1Var, 7)));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), gy0.c(new ai2(22), new ai2(23), new yh2(tv1Var, 6), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), tv1Var.F());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), gy0.c(new bi2(4), new yh2(tv1Var, 11), new yh2(tv1Var, 12), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary), gy0.c(new m7(27), new m7(28), new bi2(tv1Var, 26), new yh2(tv1Var, 1)));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), gy0.c(new ai2(12), new ai2(21), new yh2(tv1Var, 8), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), tv1Var.G());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), gy0.c(new bi2(3), new yh2(tv1Var, 9), new yh2(tv1Var, 10), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_background), gy0.c(new zh2(19), new zh2(20), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_background), gy0.c(new zh2(24), new zh2(25), new zh2(tv1Var), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface), gy0.c(new m7(26), new zh2(11), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface), gy0.c(new bi2(6), new bi2(16), new bi2(tv1Var, 26), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), gy0.c(new ai2(13), new ai2(14), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), gy0.c(new bi2(12), new bi2(13), new bi2(tv1Var, 14), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), gy0.c(new bi2(15), new bi2(17), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), gy0.c(new bi2(0), new bi2(1), new bi2(tv1Var, 2), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), gy0.c(new zh2(29), new ai2(0), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), gy0.c(new zh2(1), new zh2(2), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container), gy0.c(new bi2(10), new bi2(11), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), gy0.c(new zh2(7), new zh2(8), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), gy0.c(new zh2(21), new zh2(23), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), gy0.c(new ai2(26), new ai2(27), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), gy0.c(new ai2(17), new ai2(18), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline), gy0.c(new ai2(28), new ai2(29), new bi2(tv1Var, 26), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), gy0.c(new zh2(27), new zh2(28), new bi2(tv1Var, 26), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error), gy0.c(new bi2(5), new bi2(7), new bi2(tv1Var, 26), new yh2(tv1Var, 13)));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error), gy0.c(new ai2(7), new ai2(8), new yh2(tv1Var, 3), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error_container), tv1Var.x());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), gy0.c(new bi2(18), new bi2(19), new yh2(tv1Var, 14), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_activated), gy0.c(new zh2(5), new zh2(6), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_normal), gy0.c(new zh2(3), new zh2(4), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_highlight), new gy0(new zh2(12), new zh2(12), new zh2(13), new zh2(14), null, new zh2(15), new zh2(16), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), gy0.c(new bi2(8), new bi2(9), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), gy0.c(new bi2(20), new bi2(21), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), gy0.c(new zh2(22), new ai2(3), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), gy0.c(new ai2(9), new ai2(10), null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), gy0.c(new ai2(15), new ai2(16), null, null));
        a = Collections.unmodifiableMap(map);
    }
}
