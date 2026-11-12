.class public abstract Lxr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static volatile a:Z

.field public static volatile b:Lbv3;

.field public static c:Ljava/lang/Thread;

.field public static d:Landroid/content/Context;

.field public static final e:Lrp4;

.field public static final f:Lu6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le90;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le90;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lrp4;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lrp4;-><init>(Lgf1;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lxr1;->e:Lrp4;

    .line 14
    .line 15
    new-instance v0, Lu6;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    invoke-direct {v0, v1}, Lu6;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lxr1;->f:Lu6;

    .line 22
    .line 23
    return-void
.end method

.method public static final declared-synchronized a()V
    .locals 3

    .line 1
    const-class v0, Lxr1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    sput-boolean v1, Lxr1;->a:Z

    .line 6
    .line 7
    sget-object v1, Lxr1;->b:Lbv3;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lbv3;->cancel()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 18
    sput-object v1, Lxr1;->b:Lbv3;

    .line 19
    .line 20
    sget-object v2, Lxr1;->c:Ljava/lang/Thread;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 25
    .line 26
    .line 27
    :cond_1
    sput-object v1, Lxr1;->c:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
.end method
