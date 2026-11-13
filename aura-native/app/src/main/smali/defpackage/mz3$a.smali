.class public final Ldefpackage/mz3$a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldefpackage/mz3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final Companion:Ldefpackage/lz3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/lz3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/mz3$a;->Companion:Ldefpackage/lz3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final registerIn(Landroid/app/Activity;)V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/mz3$a;->Companion:Ldefpackage/lz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Ldefpackage/mz3$a;

    .line 10
    .line 11
    invoke-direct {v0}, Ldefpackage/mz3$a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Ldefpackage/ek2;->n(Landroid/app/Activity;Ldefpackage/mz3$a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Ldefpackage/mz3;->o:I

    .line 5
    .line 6
    sget-object p0, Ldefpackage/q92;->ON_CREATE:Ldefpackage/q92;

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/kz3;->a(Landroid/app/Activity;Ldefpackage/q92;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Ldefpackage/mz3;->o:I

    .line 5
    .line 6
    sget-object p0, Ldefpackage/q92;->ON_RESUME:Ldefpackage/q92;

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/kz3;->a(Landroid/app/Activity;Ldefpackage/q92;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Ldefpackage/mz3;->o:I

    .line 5
    .line 6
    sget-object p0, Ldefpackage/q92;->ON_START:Ldefpackage/q92;

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/kz3;->a(Landroid/app/Activity;Ldefpackage/q92;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Ldefpackage/mz3;->o:I

    .line 5
    .line 6
    sget-object p0, Ldefpackage/q92;->ON_DESTROY:Ldefpackage/q92;

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/kz3;->a(Landroid/app/Activity;Ldefpackage/q92;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Ldefpackage/mz3;->o:I

    .line 5
    .line 6
    sget-object p0, Ldefpackage/q92;->ON_PAUSE:Ldefpackage/q92;

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/kz3;->a(Landroid/app/Activity;Ldefpackage/q92;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Ldefpackage/mz3;->o:I

    .line 5
    .line 6
    sget-object p0, Ldefpackage/q92;->ON_STOP:Ldefpackage/q92;

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/kz3;->a(Landroid/app/Activity;Ldefpackage/q92;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
