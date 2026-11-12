package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class je {
    public static final je n;
    public static final je o;
    public static final je p;
    public static final je q;
    public static final je r;
    public static final je s;
    public static final je t;
    public static final /* synthetic */ je[] u;

    static {
        je jeVar = new je("Paragraph", 0);
        n = jeVar;
        je jeVar2 = new je("Span", 1);
        o = jeVar2;
        je jeVar3 = new je("VerbatimTts", 2);
        p = jeVar3;
        je jeVar4 = new je("Url", 3);
        q = jeVar4;
        je jeVar5 = new je("Link", 4);
        r = jeVar5;
        je jeVar6 = new je("Clickable", 5);
        s = jeVar6;
        je jeVar7 = new je("String", 6);
        t = jeVar7;
        u = new je[]{jeVar, jeVar2, jeVar3, jeVar4, jeVar5, jeVar6, jeVar7};
    }

    public static je valueOf(String str) {
        return (je) Enum.valueOf(je.class, str);
    }

    public static je[] values() {
        return (je[]) u.clone();
    }
}
