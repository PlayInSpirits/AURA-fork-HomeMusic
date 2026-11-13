.class public abstract Ldefpackage/ix4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/rn;

.field public static final b:Ljava/lang/ThreadLocal;

.field public static final c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/rn;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/rn;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/ix4;->a:Ldefpackage/rn;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldefpackage/ix4;->b:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ldefpackage/ix4;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Ldefpackage/dx4;)V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/ix4;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    sget-object p1, Ldefpackage/ix4;->a:Ldefpackage/rn;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Ldefpackage/dx4;->i()Ldefpackage/dx4;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Ldefpackage/ix4;->b()Ldefpackage/oi;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p0}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-lez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-ge v2, v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    check-cast v3, Ldefpackage/dx4;

    .line 60
    .line 61
    invoke-virtual {v3, p0}, Ldefpackage/dx4;->t(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    if-eqz p1, :cond_2

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-virtual {p1, p0, v0}, Ldefpackage/dx4;->g(Landroid/view/ViewGroup;Z)V

    .line 69
    .line 70
    .line 71
    :cond_2
    const v0, 0x7f0a0637

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    new-instance v0, Ldefpackage/hx4;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p1, v0, Ldefpackage/hx4;->n:Ldefpackage/dx4;

    .line 92
    .line 93
    iput-object p0, v0, Ldefpackage/hx4;->o:Landroid/view/ViewGroup;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void
.end method

.method public static b()Ldefpackage/oi;
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/ix4;->b:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ldefpackage/oi;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    new-instance v1, Ldefpackage/oi;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, v2}, Ldefpackage/yd4;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method
