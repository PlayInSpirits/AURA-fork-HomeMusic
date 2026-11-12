.class public final Lrg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public n:I


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p2, Lsg0;->b:Loz;

    .line 6
    .line 7
    iget-object p2, p2, Loz;->o:Ljava/lang/Class;

    .line 8
    .line 9
    if-eq p0, p2, :cond_0

    .line 10
    .line 11
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object p0, Lsg0;->c:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    new-instance p0, Ljava/util/Date;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 24
    .line 25
    .line 26
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 27
    .line 28
    :cond_0
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 29
    .line 30
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 2
    .line 3
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 2
    .line 3
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 2
    .line 3
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p1, p0, Lrg0;->n:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iput p1, p0, Lrg0;->n:I

    .line 6
    .line 7
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 8
    .line 9
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p1, p0, Lrg0;->n:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Lrg0;->n:I

    .line 6
    .line 7
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 8
    .line 9
    return-void
.end method
